package addressbook;

import java.io.*;
import java.lang.*;
import java.nio.file.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SearchAddressBook {
	
	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openFile();
		readFromFile();
		closeFile();
	}

	
	
	public static void openFile() {
		try {
		  input = new Scanner(Paths.get("addressbook.txt"));
		}
		catch (IOException ioException) {
			System.out.println("Error opening file");
			System.exit(1);
		}
	}
	
	
	public static void readFromFile() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter last name to search: ");
		String searchInquiry = input.next();
		
		
	try { {
			String data = input.nextLine();
			System.out.printf("%s%n", data);
			if (data.equalsIgnoreCase(searchInquiry))
				System.out.printf("%n%s%n", data);
		}
	}
	
	catch (NoSuchElementException elementException) {
		System.err.println("Invalid input. Please try again.");
		input.nextLine();
	}	
}

	
	
	
	
	public static void closeFile() {
		 if (input != null)	
			 input.close();
	}
}























