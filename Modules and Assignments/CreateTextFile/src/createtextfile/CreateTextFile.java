package createtextfile;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter; // writing to the file object

public class CreateTextFile {
	
	private static Formatter output; // manages writing to the file

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openFile();
		writeToFile();
		closeFile();
	}

	public static void openFile() {
		
	try {
		output = new Formatter("HelloWorld.txt");
		}
	    catch (SecurityException securityException) {
	    	System.out.println("Write permission denied. Terminating");
	    	System.exit(1);
	    }
	    catch (FileNotFoundException fileNotFoundException) {
	    	System.out.println("Error opening file. Terminating");
	    	System.exit(1);
	    }
	}
	
	public static void writeToFile() {
		output.format("%s%n", "Hello World!");
	}
	
	public static void closeFile() {
	  if (output != null)	
		 output.close();
	  System.out.printf("File Written!");
	}
	
}
