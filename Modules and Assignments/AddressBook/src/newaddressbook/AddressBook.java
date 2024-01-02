package newaddressbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @author 	Luke Saucer & Steve Cina
 * @since	03/01/2021
 * @version 2.0
 * <p>
 * 		This was my second attempt at the program. The first version that I created was
 * spread across three separate files, one for WriteAddressBook, one for ReadAddressBook
 * and one for SearchAddressBook. I had a very difficult time with the assignment and
 * sought out the help of Steve Cina. Although I recognize parts of this current version from
 * when I had attempted it on my own, most of what you see here was done under the guidance
 * of Steve Cina.
 */

public class AddressBook {
private static Scanner fileIn;
private static Formatter fileOut;
private static final String FILENAME = "contacts.txt";
	
	public static void main(String[] args) {
		openFileForWrite();
		writeFile();
		closeFileForWrite();
		openFileForRead();
		readFileForRead();
		closeFileForRead();
	}

/**
 * 	Use the {@link #openFileForWrite()} method to open the .txt file.
 */
	
public static void openFileForWrite() {
	try {
		fileOut = new Formatter(FILENAME);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

/**
 * 	Use the {@link #writeFile()} method to write information to the .txt file.
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
		fileOut.format("%s %s %s %s%n", inputArray[0], inputArray[1], inputArray[2], inputArray[3]);
	}
}

/**
 * Use the {@link #closeFileForWrite()} method to close the .txt file.
 */

public static void closeFileForWrite() {
	fileOut.close();
}

/**
 * Use the {@link #openFileForRead()} method to open the file in order to read it.
 */

public static void openFileForRead() {
	try {
		fileIn = new Scanner(new File(FILENAME));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

/**
 * Use the {@link #readFileForRead()} method to read the desired .txt file.
 * Allows the user to search for a string within the .txt file.
 * <p>
 * @return Returns the line of the text file that contains part of the
 * contact info that is searched for within the search query. Returns the value
 * as type string.
 */

public static void readFileForRead() {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Search Query");
	String userInput = input.nextLine();
	
	while (fileIn.hasNextLine()) {
		String nextLine = fileIn.nextLine();
		if (nextLine.contains(userInput)) {
			System.out.println(nextLine);
		}
	}
}

/**
 * Use the {@link #closeFileForRead()} method to close the .txt file.
 */

public static void closeFileForRead() {
	fileIn.close();
}
}
