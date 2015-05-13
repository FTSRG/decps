package hu.bme.mit.inf.cps.rdf;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.rdf.model.Application;
import hu.bme.mit.inf.cps.rdf.model.AvailableCpu;
import hu.bme.mit.inf.cps.rdf.model.AvailableHdd;
import hu.bme.mit.inf.cps.rdf.model.AvailableRam;
import hu.bme.mit.inf.cps.rdf.model.Device;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.openrdf.model.ValueFactory;
import org.openrdf.query.BindingSet;
import org.openrdf.query.BooleanQuery;
import org.openrdf.query.MalformedQueryException;
import org.openrdf.query.QueryEvaluationException;
import org.openrdf.query.QueryLanguage;
import org.openrdf.query.TupleQuery;
import org.openrdf.query.TupleQueryResult;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.sparql.SPARQLRepository;
import org.slf4j.LoggerFactory;

public class RdfConnection {

	private static final String NAME = "name";
	private static final String IP = "deviceId";
	private static final String CPU = "cpu";
	private static final String HDD = "hdd";
	private static final String RAM = "ram";
	private static final String HW_CPU = "hw_cpu";
	private static final String HW_HDD = "hw_hdd";
	private static final String HW_RAM = "hw_ram";

	private static final String AVAILABLE_CPU = "cpuAvailable";
	private static final String AVAILABLE_HDD = "storageAvailable";
	private static final String AVAILABLE_RAM = "memoryAvailable";

	private static final String PWD = "9sliVU8E";
	private static final String USER = "cps-rw";
	private static final String RDF_URL = "http://localhost:5820/sisro/query";

	private static final String PREFIX = "http://localhost:5820/sisro/data#";

	public static final String INSERT_APP_TEMPLATE = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\n" + 
			"PREFIX dedo: <http://purl.org/net/sisr/owl/dedo#>\r\n" + 
			"PREFIX ado: <http://purl.org/net/sisr/owl/application#>\r\n" + 
			"PREFIX : <http://localhost:5820/sisro/data#>\r\n" + 
			"\r\n" + 
			"# Inserting the application into the store\r\n" + 
			"INSERT DATA\r\n" + 
			"{ \r\n" + 
			":APPID rdf:type dedo:Software , dedo:Info , ado:Application ;\r\n" + 
			"	rdf:type owl:NamedIndividual ;\r\n" + 
			"	dedo:product-info-name \"APPNAME\"^^xsd:string ;\r\n" + 
			"	dedo:product-info-vendor \"APPVENDOR\"^^xsd:string ;\r\n" + 
			"	dedo:product-info-version \"APPVERSION\"^^xsd:string .	\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"";
	
	public static final String RUNS_ON_DEVICE_TEMPLATE = "SELECT ?app ?dev {\r\n" + 
			"  ?app <http://purl.org/net/sisr/owl/application#runsOn> ?dev\r\n" + 
			"}";
	
	public static final String START_APP_ON_DEVICE_TEMPLATE = "PREFIX ado: <http://purl.org/net/sisr/owl/application#>\r\n" + 
			"PREFIX : <http://localhost:5820/sisro/data#>\r\n" + 
			"\r\n" + 
			"# Starting up the application on the device\r\n" + 
			"INSERT DATA\r\n" + 
			"{ \r\n" + 
			"	:APPID ado:runsOn  :DEVICEID .\r\n" + 
			"}";
	public static final String STOP_APP_ON_DEVICE_TEMPLATE = "PREFIX ado: <http://purl.org/net/sisr/owl/application#>\r\n" + 
			"PREFIX : <http://localhost:5820/sisro/data#>\r\n" + 
			"\r\n" + 
			"# Shutting down the application on the device\r\n" + 
			"DELETE WHERE { <http://localhost:5820/sisro/data#:APPID> <http://purl.org/net/sisr/owl/application#runsOn> ?device . }\r\n";

	public static final String ASK_DEVICE_TEMPLATE = "PREFIX soo: <http://purl.org/net/sisr/owl/observation#>\r\n" + 
			"PREFIX tio: <http://purl.org/net/sisr/owl/time#>\r\n" + 
			"PREFIX dedo: <http://purl.org/net/sisr/owl/dedo#> \r\n" + 
			"\r\n" + 
			"SELECT ?deviceId ?name ?hdd ?cpu ?ram ?maxtime ?memoryAvailable ?storageAvailable ?cpuAvailable\r\n" + 
			"WHERE {\r\n" + 
			"  ?deviceId <http://purl.org/net/sisr/owl/dedo#device-type> ?name .\r\n" + 
			"  ?hw <http://purl.org/net/sisr/owl/dedo#isPartOf> ?device .\r\n" + 
			"  ?hw_cpu <http://purl.org/net/sisr/owl/dedo#isPartOf> ?hw .\r\n" + 
			"  ?hw_cpu rdf:type <http://purl.org/net/sisr/owl/dedo#CPU> .\r\n" + 
			"  ?hw_cpu <http://purl.org/net/sisr/owl/dedo#cpu-computing-power> ?cpu .\r\n" + 
			"  ?hw_ram <http://purl.org/net/sisr/owl/dedo#isPartOf> ?hw .\r\n" + 
			"  ?hw_ram rdf:type <http://purl.org/net/sisr/owl/dedo#OperationalMemory> .\r\n" + 
			"  ?hw_ram <http://purl.org/net/sisr/owl/dedo#operational-memory-capacity> ?ram .\r\n" + 
			"  ?hw_hdd <http://purl.org/net/sisr/owl/dedo#isPartOf> ?hw .\r\n" + 
			"  ?hw_hdd rdf:type <http://purl.org/net/sisr/owl/dedo#Storage> .\r\n" + 
			"  ?hw_hdd <http://purl.org/net/sisr/owl/dedo#storage-capacity> ?hdd\r\n" + 
			"  {\r\n" + 
			"    SELECT ?deviceId (MAX(?time) AS ?maxtime)\r\n" + 
			"    WHERE {\r\n" + 
			"      ?obs rdf:type soo:Observation ;\r\n" + 
			"         soo:hasProcedure ?deviceId ;\r\n" + 
			"         soo:hasResultTime ?timeInstant .\r\n" + 
			"      ?timeInstant tio:time-position ?time\r\n" + 
			"    } GROUP BY ?deviceId\r\n" + 
			"  }\r\n" + 
			"  ?maxtimeInstant tio:time-position ?maxtime .\r\n" + 
			"  ?obsMemory rdf:type soo:Observation ;\r\n" + 
			"     soo:hasProcedure ?deviceId ;\r\n" + 
			"     soo:hasResultTime ?maxtimeInstant ;\r\n" + 
			"     soo:hasObservedProperty dedo:operational-memory-capacity-available ;\r\n" + 
			"     soo:result-value ?memoryAvailable .\r\n" + 
			"  ?obsStorage rdf:type soo:Observation ;\r\n" + 
			"     soo:hasProcedure ?deviceId ;\r\n" + 
			"     soo:hasResultTime ?maxtimeInstant ;\r\n" + 
			"     soo:hasObservedProperty dedo:storage-capacity-available ;\r\n" + 
			"     soo:result-value ?storageAvailable .\r\n" + 
			"  ?obsCpu rdf:type soo:Observation ;\r\n" + 
			"     soo:hasProcedure ?deviceId ;\r\n" + 
			"     soo:hasResultTime ?maxtimeInstant ;\r\n" + 
			"     soo:hasObservedProperty dedo:cpu-computing-power-available ;\r\n" + 
			"     soo:result-value ?cpuAvailable .\r\n" + 
			"}";
	
	private SPARQLRepository repo;
	private RepositoryConnection conn;
	private ValueFactory factory;

	public RdfConnection() throws RepositoryException {
		LoggerFactory.getLogger(getClass());
		repo = new SPARQLRepository(RDF_URL);
		repo.setUsernameAndPassword(USER, PWD);
		repo.initialize();
		factory = repo.getValueFactory();
	}

	private void initialize() throws Exception {
		conn = repo.getConnection();

	}

	private void done() throws Exception {
		conn.close();
	}

	public Collection<Device> askDevices() throws Exception {
		initialize();
		TupleQuery query = conn
				.prepareTupleQuery(
						QueryLanguage.SPARQL,
						ASK_DEVICE_TEMPLATE);

		TupleQueryResult evaluate = query.evaluate();
		Collection<Device> ret = new ArrayList<Device>();
		while (evaluate.hasNext()) {
			BindingSet device = evaluate.next();
			Device d = new Device();
			d.ip = device.getBinding(RdfConnection.IP).getValue().stringValue()
					.replace(PREFIX, "");
			d.name = device.getBinding(RdfConnection.NAME).getValue()
					.stringValue();
			d.hdd = device.getBinding(RdfConnection.HDD).getValue()
					.stringValue();
			d.cpu = device.getBinding(RdfConnection.CPU).getValue()
					.stringValue();
			d.ram = device.getBinding(RdfConnection.RAM).getValue()
					.stringValue();
			d.ahdd =
					(int) Double.parseDouble(device.getBinding(RdfConnection.AVAILABLE_HDD).getValue().stringValue());
			d.acpu =
					calculateAvailable(device, RdfConnection.AVAILABLE_CPU, d.cpu);
			d.aram =
					(int) Double.parseDouble(device.getBinding(RdfConnection.AVAILABLE_RAM).getValue().stringValue());
			ret.add(d);
		}
		done();

		return ret;
	}

	private int calculateAvailable(BindingSet device, String value, String hdd) {
		int percentage = (int) Double.parseDouble(device.getBinding(value).getValue().stringValue());
		return (int) (Double.parseDouble(hdd) * percentage / 100.0);
	}

	public String hostTypes() throws Exception {
		initialize();
		TupleQuery query = conn
				.prepareTupleQuery(
						QueryLanguage.SPARQL,
						"select ?name"
								+ "{"
								+ "  ?device rdf:type <http://purl.org/net/sisr/owl/dedo#Device> ."
								+ "  ?device <http://purl.org/net/sisr/owl/dedo#device-type> ?name"
								+ "}");

		TupleQueryResult evaluate = query.evaluate();
		String ret = "";
		while (evaluate.hasNext()) {
			BindingSet next = evaluate.next();
			if (!ret.equals(""))
				ret += ";";
			ret += next.getBinding("name").getValue().stringValue();
		}
		done();
		return ret;
	}

	public void insertApp(ApplicationInstance app) throws Exception {
		insertApp(app.getId(), app.getType().getId(), "Vendor", "Version");
	}

	public Collection<Application> askApplications() throws Exception {
		initialize();
		Collection<Application> ret = new ArrayList<Application>();
		TupleQuery query = conn
				.prepareTupleQuery(
						QueryLanguage.SPARQL,
						"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
								+ "PREFIX dedo: <http://purl.org/net/sisr/owl/dedo#>"
								+ "PREFIX ado: <http://purl.org/net/sisr/owl/application#>"
								+ "PREFIX : <http://localhost:5820/sisro/data#>"
								+ "" + "select ?sw" + "{"
								+ "	?sw rdf:type dedo:Software ."
//								+ "    ?sw ado:execution-db-url ?db ."
//								+ "    ?sw ado:execution-db-user ?usr ."
//								+ "    ?sw ado:execution-db-password ?pwd"
								+ "}");

		TupleQueryResult evaluate = query.evaluate();
		while (evaluate.hasNext()) {
			BindingSet next = evaluate.next();
			Application app = new Application();
			app.id = next.getBinding("sw").getValue().stringValue().replace(RDF_URL, "");
//			app.dbName = next.getBinding("db").getValue().stringValue();
//			app.password = next.getBinding("pwd").getValue().stringValue();
//			app.username = next.getBinding("usr").getValue().stringValue();
			ret.add(app);
		}

		done();
		return ret;
	}

	public boolean stopAppOnDevice(String appId) throws Exception {
		String query = STOP_APP_ON_DEVICE_TEMPLATE.replaceAll("APPID", appId);
		return sendQuery(query);
	}

	public boolean insertApp(String id, String name, String vendor,
			String version) {
		String query = INSERT_APP_TEMPLATE.replaceAll("APPID", id)
				.replaceAll("APPNAME", name).replaceAll("APPVENDOR", vendor)
				.replaceAll("APPVERSION", version);

		return sendQuery(query);
	}

	public boolean startAppOnDevice(String appId, String deviceId) {
		String query = START_APP_ON_DEVICE_TEMPLATE.replaceAll("APPID", appId)
				.replaceAll("DEVICEID", deviceId);

		return sendQuery(query);
	}
	
	public Map<String, String> askAllocation() throws Exception {
		HashMap<String, String> ret = new HashMap<String,String>();
		
		initialize();
		TupleQuery query = conn
				.prepareTupleQuery(
						QueryLanguage.SPARQL,
							RUNS_ON_DEVICE_TEMPLATE);
		
		TupleQueryResult evaluate = query.evaluate();
		while (evaluate.hasNext()) {
			BindingSet next = evaluate.next();
			String app = next.getBinding("app").getValue().stringValue().replace(PREFIX, "");
			String dev = next.getBinding("dev").getValue().stringValue().replace(PREFIX, "");
			ret.put(app, dev);
		}
		
		done();
		return ret;
	}

	public boolean sendQuery(String query) {
		try {
			System.out.println(query);
			return sendBooleanQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean sendBooleanQuery(String query) throws RepositoryException,
			MalformedQueryException, QueryEvaluationException {
		RepositoryConnection conn = repo.getConnection();
		try {
			BooleanQuery q = conn.prepareBooleanQuery(QueryLanguage.SPARQL,
					query);
			return q.evaluate();
		} finally {
			conn.close();
		}
	}
}
