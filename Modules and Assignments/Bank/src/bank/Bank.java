package bank;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Bank {
	
	private static ObjectOutputStream output;
	private static ObjectInputStream input;
	
	public static void main(String[] args) {
		openFile();
		addRecords();
		closeFile();
		openFileForRead();
		readRecords();
		closeFileForRead();
	}
	
	public static void openFile() {
		try {
			output = new ObjectOutputStream(
					Files.newOutputStream(Paths.get("Bank.ser")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.printf("Unable to open file%n");
			System.exit(1);
		}
	} // end OpenFile
	
	public static void addRecords()
	{
		Account john = new Account(12345,"John","Doe",50.0);
		Account sue = new Account(11343,"Sue","Doe",550.0);
		try {
			output.writeObject(john);
			output.writeObject(sue);
		} catch (IOException e) {
			System.out.println("Error Writing to the file");
			System.exit(1);
		} // writes John's Account Info to the File
	}
	
	public static void closeFile() {
		try {
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void openFileForRead() {
		try {
			input = new ObjectInputStream(
				Files.newInputStream(Paths.get("Bank.ser")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readRecords() {
		try {
			Account john = (Account) input.readObject();
			
			System.out.println("John's Record:");
			System.out.printf("Name: %s %s",
					john.getFirstName(), john.getLastName());
			System.out.println();
			Account sue = (Account) input.readObject();
			
			System.out.println("Sue's Record:");
			System.out.printf("Name: %s %s",
					sue.getFirstName(), sue.getLastName());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void closeFileForRead() {
		try {
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
