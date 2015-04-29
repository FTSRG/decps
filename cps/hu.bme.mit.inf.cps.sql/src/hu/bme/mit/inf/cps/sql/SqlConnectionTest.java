package hu.bme.mit.inf.cps.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class SqlConnectionTest {

	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	@Test
	public void askApplicationTypes() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager.getConnection("jdbc:mysql://localhost", "cps", "cps");
		statement = connect.createStatement();
		resultSet = statement.executeQuery("select * from CPS.APPLICATIONTYPE");
		
		writeResultSet(resultSet);
	}

	private void writeResultSet(ResultSet resultSet) throws SQLException {

		while (resultSet.next()) {

			String id = resultSet.getString("id");
			String user = resultSet.getString("name");
			String website = resultSet.getString("exeFileUrl");
			String summary = resultSet.getString("exeFileType");
			String date = resultSet.getString("zipFileUrl");
			System.out.println("Id: " + id);
			System.out.println("User: " + user);
			System.out.println("Website: " + website);
			System.out.println("Summary: " + summary);
			System.out.println("Date: " + date);
		}
	}
}
