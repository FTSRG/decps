package hu.bme.mit.inf.cps.rdf;

import hu.bme.mit.inf.cps.ApplicationInstance;

import java.util.List;

import javax.xml.ws.ServiceMode;

import org.junit.Before;
import org.junit.Test;
import org.openrdf.query.Binding;
import org.openrdf.query.BindingSet;
import org.openrdf.query.QueryEvaluationException;
import org.openrdf.query.QueryLanguage;
import org.openrdf.query.TupleQuery;
import org.openrdf.query.TupleQueryResult;
import org.openrdf.query.Update;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.sparql.SPARQLRepository;

public class RdfConnectionTest {

	private SPARQLRepository repo;
	private RepositoryConnection connection;

	@Before
	public void setup() throws Exception {
		repo = new SPARQLRepository("http://localhost:5820/sisro/query");
		repo.setUsernameAndPassword("cps-ro", "v3LCWo5k");
		repo.initialize();
		connection = repo.getConnection();		
	}
	
	public void done() throws Exception {
		connection.close();
	}
	
	@Test
	public void insertApp() throws Exception {
		Update update = connection.prepareUpdate(QueryLanguage.SPARQL, 
				"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
				"PREFIX dedo: <http://purl.org/net/sisr/owl/dedo#>" + 
				"PREFIX ado: <http://purl.org/net/sisr/owl/application#>" + 
				"PREFIX : <http://localhost:5820/sisro/data#>" + 
				"" + 
				"# Inserting the application into the store" + 
				"INSERT DATA" + 
				"{ " + 
				":"+ "MyId" +" rdf:type dedo:Software , dedo:Info , ado:Application ;" + 
				"	rdf:type owl:NamedIndividual ;" + 
				"	ado:execution-zip-url \"" +"asd"+ "\"^^xsd:string ;" + 
				"	ado:execution-main-exe \"" +"asd"+ "\"^^xsd:string ;" + 
				"	ado:execution-exe-type \"" +"asd"+ "\"^^xsd:string ;" + 
				"	ado:execution-cmd-args \"\"^^xsd:string ;" + 
				"	ado:execution-db-url \"" + "asd" +"\"^^xsd:string ;" + 
				"	ado:execution-db-user \""+"asd"+"\"^^xsd:string ;" + 
				"	ado:execution-db-password \""+"asd"+"\"^^xsd:string ;" + 
				"	dedo:product-info-name \"Runtastic\"^^xsd:string ;" + 
				"	dedo:product-info-vendor \"Runtastic Inc.\"^^xsd:string ;" + 
				"	dedo:product-info-version \"1.0\"^^xsd:string .	" + 
				"}");
		update.execute();
		done();
		
	}
	
	
	@Test
	public void test() throws Exception {
		
		TupleQuery query = connection.prepareTupleQuery(QueryLanguage.SPARQL, "SELECT ?app ?dev {  ?app <http://purl.org/net/sisr/owl/application#runsOn> ?dev }");
		TupleQueryResult evaluate = query.evaluate();
		
		printResult(evaluate);		
	}


	@Test
	public void askDevices() throws Exception {
		TupleQuery query = connection.prepareTupleQuery(QueryLanguage.SPARQL, 
				"select ?name ?ip ?cpu ?hdd ?ram" + 
				"{" + 
				"  ?device rdf:type <http://purl.org/net/sisr/owl/dedo#Device> ." + 
				"  ?device <http://purl.org/net/sisr/owl/dedo#device-type> ?name ." + 
				"  ?device <http://purl.org/net/sisr/owl/dedo#software-property-ip-address> ?ip ." + 
				"  ?hw <http://purl.org/net/sisr/owl/dedo#isPartOf> ?device ." + 
				"" + 
				"  ?hw_cpu <http://purl.org/net/sisr/owl/dedo#isPartOf> ?hw ." + 
				"  ?hw_cpu rdf:type <http://purl.org/net/sisr/owl/dedo#CPU> ." + 
				"  ?hw_cpu <http://purl.org/net/sisr/owl/dedo#cpu-computing-power> ?cpu ." + 
				"  ?hw_ram <http://purl.org/net/sisr/owl/dedo#isPartOf> ?hw ." + 
				"  ?hw_ram rdf:type <http://purl.org/net/sisr/owl/dedo#OperationalMemory> ." + 
				"  ?hw_ram <http://purl.org/net/sisr/owl/dedo#operational-memory-capacity> ?ram ." + 
				"  ?hw_hdd <http://purl.org/net/sisr/owl/dedo#isPartOf> ?hw ." + 
				"  ?hw_hdd rdf:type <http://purl.org/net/sisr/owl/dedo#Storage> ." + 
				"  ?hw_hdd <http://purl.org/net/sisr/owl/dedo#storage-capacity> ?hdd" + 
				"  " + 
				"}");
		
		TupleQueryResult evaluate = query.evaluate();
		printResult(evaluate);		
	}

	private void printResult(TupleQueryResult evaluate)
			throws QueryEvaluationException {
		List<String> bindingNames = evaluate.getBindingNames();
		while (evaluate.hasNext()) {
			BindingSet set = evaluate.next();
			for(String bName : bindingNames) {
				Binding binding = set.getBinding(bName);
				System.out.print("\t" + binding.getValue().stringValue());
			}
			System.out.println();
		}
	}
}