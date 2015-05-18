package hu.bme.mit.inf.cps.sql;

import hu.bme.mit.inf.cps.sql.model.ApplicationTypeSql;
import hu.bme.mit.inf.cps.sql.model.RequestRequirementSql;
import hu.bme.mit.inf.cps.sql.model.RequestSql;
import hu.bme.mit.inf.cps.sql.model.RequirementSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class SqlConnection {

	private static final String NAME = "name";
	private static final String EXE = "exeFileUrl";
	private static final String TYPE = "exeFileType";
	private static final String ZIP = "zipFileUrl";
	private static final String ARGS = "args";
	
	private static final String HOST = "host";
	private static final String CPU = "required_cpu";
	private static final String HDD = "required_hdd";
	private static final String RAM = "required_memory";
	private static final String COUNT = "count";
	private static final String ID = "id";
	private static final String REQ = "req";
	
	private static final String DB_NAME = "db_name";
	private static final String USERNAME = "user";
	private static final String PASSWORD = "password";
	
	
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	  
	private void initialize() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager.getConnection("jdbc:mysql://" + "localhost", "cps", "cps");
		statement = connect.createStatement();
	}
	
	public Collection<ApplicationTypeSql> askApplicationTypes() throws Exception {
		initialize();		
		resultSet = statement.executeQuery("select * from cps.applicationtype");		
		Collection<ApplicationTypeSql> ret = new ArrayList<ApplicationTypeSql>();
		while (resultSet.next()) {
			ApplicationTypeSql applicationTypeSql = new ApplicationTypeSql();
			applicationTypeSql.id = (resultSet.getString(SqlConnection.ID));
			applicationTypeSql.name = (resultSet.getString(SqlConnection.NAME));
			applicationTypeSql.exeFileUrl = (resultSet.getString(SqlConnection.EXE));
			applicationTypeSql.exeFileType = (resultSet.getString(SqlConnection.TYPE));
			applicationTypeSql.zipFileUrl = (resultSet.getString(SqlConnection.ZIP));
			ret.add(applicationTypeSql);
		}
		done();
		return ret;
	}
	
	public Collection<RequirementSql> askRequirements(String id) throws Exception {
		initialize();		
		resultSet = statement.executeQuery("select * from cps.requirement where app = '" + id + "'");
		Collection<RequirementSql> ret = new ArrayList<RequirementSql>();
		while(resultSet.next()) {
			RequirementSql requirementSql = new RequirementSql();
			requirementSql.host = ((resultSet.getString(SqlConnection.HOST)));
			requirementSql.cpu = ((int)(resultSet.getFloat(SqlConnection.CPU)));
			requirementSql.hdd = ((int)(resultSet.getFloat(SqlConnection.HDD)));
			requirementSql.ram = ((int)(resultSet.getFloat(SqlConnection.RAM)));
			ret.add(requirementSql);
		}
		done();
		return ret;
	}
	
	public Collection<RequestRequirementSql> askRequestRequirements(String id) throws Exception {
		initialize();		
		resultSet = statement.executeQuery("select * from cps.request where app = '" + id + "'");		
		Collection<RequestRequirementSql> ret = new ArrayList<RequestRequirementSql>();
		while(resultSet.next()) {
			RequestRequirementSql requestSql = new RequestRequirementSql();
			requestSql.id = resultSet.getInt(SqlConnection.ID);
			requestSql.req = resultSet.getInt(SqlConnection.REQ);
			requestSql.count = (resultSet.getInt(SqlConnection.COUNT));
			requestSql.args = resultSet.getString(SqlConnection.ARGS);
			ret.add(requestSql);
		}
		done();
		return ret;
	}
	
	private void done() throws Exception {
		connect.close();
	}

	public Collection<RequestSql> askRequests() throws Exception {
		initialize();
		resultSet = statement.executeQuery("select * from cps.req_wrapper");		
		Collection<RequestSql> ret = new ArrayList<RequestSql>();
		while(resultSet.next()) {
			RequestSql requestSql = new RequestSql();			
			requestSql.id = (resultSet.getInt(SqlConnection.ID));
			requestSql.db_name = (resultSet.getString(SqlConnection.DB_NAME));
			requestSql.username = (resultSet.getString(SqlConnection.USERNAME));
			requestSql.password = (resultSet.getString(SqlConnection.PASSWORD));
			ret.add(requestSql);
		}
		done();
		return ret;
	}
}
