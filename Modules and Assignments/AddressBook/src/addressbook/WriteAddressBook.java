package addressbook;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WriteAddressBook {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book!");
		
		try (Formatter output = new Formatter("addressbook.txt")) {
			Scanner input = new Scanner(System.in);
			System.out.printf("%s%n%s%n" , "Enter Last Name, First Name, Phone Number and Email Address", "Enter 'EOF' to End Input");
		
		while (input.hasNext()) {
			try {
				output.format("%s %s %s %s%n", input.next(), input.next(), input.next(), input.next());
			}
			
			catch (NoSuchElementException elementException) {
				System.err.println("Invalid input. Please try again.");
				input.nextLine();
			}
			
		}
		input.close();
		}
		catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
			e.printStackTrace();
		}
		
	}
	

}
