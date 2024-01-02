package database;

/**
 * This program allows a Java IDE to communicate with a mySQL Server and access a table within
 * the database with the name of AddressBook.
 * <p>
 * I created this program after downloading mySQL and the mySQL Workbench IDE. I created the original
 * table within the mySQL Workbench IDE and then plugged the information into this program. I relied
 * on using videos by Steven Byrne for this project in implementing different methods within
 * the Java IDE to communicate with the mySQL server. I also received help from Steve Cina in troubleshooting the
 * code and he helped me with printing the table to the console.
 * <p>
 * Looking back on this assignment, there are many improvements that I could have done to the code. These improvements
 * include creating a menu that would allow the user to decide on what method they would like to perform. These tasks
 * could be deleting entries, posting entries, and searching the address book (the method currently does not work).
 * These functions are currently able to be edited from inside the code, but it would have been nice to have had
 * those options available in the console and controlled by the user with a menu that would allow access to each
 * function (Press 1 for ..., Press 2 for ..., etc.). Over the summer I may continue to edit the program in order to
 * gain more experience and practice with programming in Java and mySQL.
 * <p>
 * @author Lucas Saucer
 * @since 04/18/21
 * @version 1.0
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getConnection();
//		createTable();
//		post();
//		deleteEntry();
//		updateEntry();		
		showAddressBook();
//		searchAddressBook();
		
	}
	
/**
 * {@link getConnection()} method is used to establish the connection to the local mySQL server
 * that holds the AddressBook
 * <p>
 * @param url is the url of the local mySQL server.
 * @param username is the username for the local mySQL server.
 * @param password is the password for the local mySQL server.
 * @return returns the object connection which uses the DriverManager to establish the connection
 * to the mySQL server.
 * <p>
 * @throws Exception
 */
	
	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/database";
			String username = "root";
			String password = "password";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (Exception  e){System.out.println(e);}
		
		return null;	
	}
	
/**
 * {@link createTable()} method is used to create a table named AddressBook in the database if the table
 * is not already present. Within the table, each row is constructed with the values of ID (INT), Name (TINYTEXT), 
 * Phone Number (TINYTEXT), Address (TINYTEXT) and Email Address (TINYTEXT).
 * <p>
 * @throws Exception
 */
	
	public static void createTable() throws Exception {
		try {
			Connection conn = getConnection();
			PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS "
					+ "AddressBook (id int NOT NULL AUTO_INCREMENT, Name tinytext, Phone_Number tinytext, Address tinytext, Email tinytext, PRIMARY KEY(id)");

			create.execute();	
		} catch 
			(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Function complete.");
			}
	}
	
/**
 * {@link post()} method is used to post new contacts into the AddressBook by using the 'INSERT INTO'
 * keyword, followed by the AddressBook and the parameters to be added to by using the 'VALUES'
 * keyword. The values are then added into the database.
 * <p>
 * @throws Exception
 */
	
	public static void post() throws Exception {

		try {
			
			Connection connection = getConnection();
			Statement statement = connection.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			statement.execute("INSERT INTO AddressBook (Name, Phone_Number, Address, Email) VALUES ('Molly Saucer', '333-333-3333', '444 Cornfield Denver, Iowa', 'mollysaucer@my.sunyulster.edu')");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed.");
		}
	}

/**
 * {@link get()} method is used to get the values listed within the columns of the AddressBook
 * and print them within the console of the Java IDE so that the information can be displayed.
 * <p>
 * @return returns the ArrayList which contains the values that are contained within the columns
 * of the AddressBook table.
 * <p>
 * @throws Exception
 */
	
	public static ArrayList<String> get() throws Exception {
		try {
			Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement("SELECT * FROM AddressBook");
		
			ResultSet result = statement.executeQuery();
			
			ArrayList<String> array = new ArrayList<String>();
			while(result.next()) {
				System.out.print(result.getString("ID"));
				System.out.print(" ");
				System.out.print(result.getString("Name"));
				System.out.print(" ");
				System.out.print(result.getString("Phone_Number"));
				System.out.print(" ");
				System.out.print(result.getString("Address"));
				System.out.print(" ");
				System.out.print(result.getString("Email"));
				System.out.print(" ");
			
			array.add(result.getString("ID"));
			array.add(result.getString("Name"));
			array.add(result.getString("Phone_Number"));
			array.add(result.getString("Address"));
			array.add(result.getString("Email"));
		}
		System.out.println("All records have been selected.");
		return array;
		
	}catch(Exception e) {System.out.println(e);}
	
		return null;
	}
	
/**
 * {@link deleteEntry()} method is used to delete an entry within the mySQL table AddressBook.
 * @throws Exception
 */
	
	public static void deleteEntry() throws Exception {
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			statement.execute("DELETE FROM AddressBook WHERE name = 'Molly Saucer' LIMIT 1");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Delete Completed.");
		}
	}
	
/**
 * {@link updateEntry()} method allows the user to update a field within the table AddressBook to a specified value.
 */
	
	public static void updateEntry() {
	try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			statement.execute("UPDATE AddressBook SET NAME = 'Molly Saucer' WHERE id = '6'");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Update Completed.");
		}
	}

	
// Method currently does not work, I wanted to try and create a search method that did not rely on
// string concatenation.
	
//	public static void searchAddressBook() throws Exception {
//		try {
//			Connection connection = getConnection();
//			Statement statement = connection.createStatement(
//					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//			System.out.println(" ");
//			System.out.println("What name would you like to search for?");
//			System.out.println(" ");
//			Scanner input = new Scanner(System.in);
//			String searchTermOne = input.nextLine();
//			
//			String search = "SELECT name FROM AddressBook WHERE name = searchTermOne";
//			PreparedStatement preparedStatement = connection.prepareStatement("SELECT name FROM AddressBook WHERE name = ");
//			
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("Search Completed.");
//		}
//	}
	
/**
 * {@link showAddressBook()} method is used to show the mySQL AddressBook table.
 * @throws Exception
 */
	
	public static void showAddressBook() throws Exception {
		Connection conn = getConnection();
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM AddressBook");
		ResultSetMetaData rsmd = rs.getMetaData();
		while (rs.next()) {
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.printf("%-40s\t", rs.getObject(i));
			}
		System.out.println();
		}
	}
}

