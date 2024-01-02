package sqladdressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLAdressBook {
	private static final String url = "jdbc:mysql://localhost:3306/test";
	private static final String user = "root";
	private static final String password = "password";


	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;

	public static void main(String args[]) {
		String query = "select count(*) from addressBook";

		try {
		// opening database connection to MySQL server
		connection = DriverManager.getConnection(url, user, password);

		// getting Statement object to execute query
		statement = connection.createStatement();

		// executing SELECT query
		resultSet = statement.executeQuery(query);
		
			while (resultSet.next()) {
				int count = resultSet.getInt(1);
				System.out.println("Total number of contacts in the table : " + count);
				}
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
			} finally {
			
			try { connection.close(); } catch(SQLException se) { /*can't do anything */ }
			try { statement.close(); } catch(SQLException se) { /*can't do anything */ }
			try { resultSet.close(); } catch(SQLException se) { /*can't do anything */ }
			}
	}
}