package addressbook;

import java.io.*;
import java.lang.*;
import java.nio.file.*;
import java.util.Scanner;

public class ReadAddressBook {
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
		String data = input.nextLine();
		System.out.printf("%s%n", data);
	}
	
	
	
	
	
	public static void closeFile() {
		 if (input != null)	
			 input.close();
	}
}
