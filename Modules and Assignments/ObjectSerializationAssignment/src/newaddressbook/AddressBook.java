package newaddressbook;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * I believe that I incorrectly submitted the same assignment in assignment #5 as the assignment for assignment #6.
 * I believe this is the assignment that should have been submitted.
 * <p>
 * Program creates an address book that asks users to input a first name,
 * last name, phone number and email address for each contact within
 * the address book. The program then writes the input to a .ser file, closes the
 * .ser file, then re-opens the .ser and reads the contents of the file back before
 * closing the file once again.
 * <p>
 * @author lukesaucer
 * @since 03/07/2021
 * @version 1.0
 */


public class AddressBook {

	private static ObjectOutputStream output;
	private static ObjectInputStream input;
	
	
	public static void main(String[] args) {
		openFileForWrite();
		writeFile();
		closeFileForWrite();
		openFileForRead();
		readFileForRead();
		closeFileForRead();
	}

	/**
	 * 	Use the {@link #openFileForWrite()} method to open the .ser file.
	 */
	
public static void openFileForWrite() {
	try {
		output = new ObjectOutputStream(
				Files.newOutputStream(Paths.get("AddressBook.ser")));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.printf("Unable to open file%n");
		System.exit(1);
	}
}

/**
 * 	Use the {@link #writeFile()} method to write information to the .ser file.
 */

public static void writeFile() {

	while (true) {
		System.out.printf("%s%n%s%n" , "Enter Last Name, First Name, Phone Number and Email Address", "Enter 'EOF' to End Input");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		if (userInput.equalsIgnoreCase("EOF")) {
			break;
		}
		String[] inputArray = userInput.split(" ");
		if (inputArray.length != 4) {
			System.out.println("Invalid Input");
			continue;
		}
		try {
			output.writeObject(userInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error writing to the file");
		}
	}
	
}

/**
 * Use the {@link #closeFileForWrite()} method to close the .ser file.
 */

public static void closeFileForWrite() {
	try {
		output.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

/**
 * Use the {@link #openFileForRead()} method to open the .ser file in order to read it.
 */

public static void openFileForRead() {
	try {
		input = new ObjectInputStream(
				Files.newInputStream(Paths.get("AddressBook.ser")));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
}

/**
 * Use the {@link #readFileForRead()} method to read the desired .ser file.
 **/

public static void readFileForRead() {
	try {
		while (true) {
		String read = (String) input.readObject();
		System.out.printf("%s%n", read);
	} } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block		
	}
	
}

/**
 * Use the {@link #closeFileForRead()} method to close the .ser file.
 */

public static void closeFileForRead() {
	try {
		input.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}



}
