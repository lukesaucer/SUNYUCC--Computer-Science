package hashexample;

/**
 * @author Lucas Saucer
 * @since 11/16/2021
 * @version 1.0
 * 
 * This program creates a phonebook using a hashtable and retrieves each entry as a key-value
 * pair as requested by the user.
 * 
 */


import java.util.Scanner;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/**
 * @param phonebook
 * 		- Creates a hashtable to store each phonebook entry as a key-value pair.
 */
		
		Hashtable<String, String> phonebook = new Hashtable<String, String>(811);
/**
 * {@link put()}
 * 		- Method used to create and store a key-value pair as an entry within the hashtable.
 */
		phonebook.put("John", "111-222-3333");
		phonebook.put("Joe", "222-333-4444");
		phonebook.put("Calen", "555-666-7777");
		phonebook.put("Luke", "888-999-0000");
		
		Enumeration<String> enumeration = phonebook.keys();
		
		Scanner input = new Scanner(System.in);
		
		
/**
 * @param userInput
 * 		- Used to store the user-inputed key to search for within the hashtable.
 */
		System.out.println("Please enter a name to search for in the Phonebook.");
		System.out.println("Press 'L' to view all possible entries.");
		String userInput = input.nextLine();
		System.out.println();
		
/**
 * {@link get()}
 * 		- Method used to retrieve an entry within the phonebook hashtable by entering the 'key'
 * of the entry and returning the 'value' that is paired with the key in a key-value pair.
 * 
 * Switch statements is used to return each user-inputted key with it's matching value pair.
 */
		
		switch (userInput) {
			case "John":
				String number = phonebook.get("John");
				System.out.printf("John's Number is %s%n", number);
				break;
			case "Joe":
				String number2 = phonebook.get("Joe");
				System.out.printf("Joe's Number is %s%n", number2);
				break;
			case "Calen":
				String number3 = phonebook.get("Calen");
				System.out.printf("Calen's Number is %s%n", number3);
				break;
			case "Luke":
				String number4 = phonebook.get("Luke");
				System.out.printf("Luke's Number is %s%n", number4);
				break;
			case "L":
				while(enumeration.hasMoreElements()) {
					 
					String allNameKeys = enumeration.nextElement();
		            System.out.println("Name: "  + allNameKeys);
			}
		}
	}
}