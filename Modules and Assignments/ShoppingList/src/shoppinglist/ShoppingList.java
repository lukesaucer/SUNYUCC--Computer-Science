package shoppinglist;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This program presents the user with a shopping list which they can add items to.
 * Once the user has finished adding items to the shopping list, they can then remove
 * items from the shopping list once these items have been obtained or are no longer
 * needed on the list.
 * <p>
 * @author	lukesaucer
 * @since	03/21/21
 * @version 1.0
 */

public class ShoppingList {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to My Shopping List ");
		

		List<String> list = new ArrayList<String>();
		/**
		 * @param listInput holds the information that is passed from the scanner
		 * after the user is asked to enter an item onto the list.
		 * @param upperCaseListInput converts listInput into an upper-case format.
		 * <p>
		 * The {@link #add()} method adds the passed user input in an upper-case format
		 * to the shopping list named 'list'.
		 *
		 */
		while (true) {
			System.out.println("Please enter an item: ");
			String listInput = input.nextLine();
			String upperCaseListInput = listInput.toUpperCase();
			list.add(upperCaseListInput);
			
			
			System.out.println("Enter Another Item Y/N: ");
			String proceedInput = input.nextLine();
		
		if (proceedInput.equalsIgnoreCase("Y")) {
			continue;
		}
		if (proceedInput.equalsIgnoreCase("N")) {
			break;
		}
		else {
			System.out.println("Invalid input, please try again.");
		}
		
		
	}
		
		/**
		 * @param uniqueNameSet takes the list and converts it into an interface of
		 * type Set to remove possible duplicates from the original list.
		 * @param uniqueList takes the Set named uniqueNameSet and converts it back into
		 * an interface of type List so that the .remove() method may be called on it later
		 * on in the code.
		 */
		
		Set<String> uniqueNameSet = new HashSet<>(list);
		List<String> uniqueList = new ArrayList<>(uniqueNameSet);
		
		
		while (true) {
			System.out.println("Here is your Shopping List: ");
			
			
			for (int count = 0; count < uniqueList.size(); count++) {
				System.out.printf("%n%s ", uniqueList.get(count));
			}
			
			/**
			 * @param removeInput takes the user input that the user would like to
			 * have removed from the shopping list.
			 * @param upperCaseRemoveInput converts the removeInput into an upper-case
			 * format.
			 * <p>
			 * The {@link #contains()} method will search the uniqueList List for the
			 * item that the user inputed that they would like removed from the Shopping List.
			 * This method only searches for the requested input, it does not remove it.
			 * <p>
			 * The {@link #remove()} method will remove the input that the user would like removed
			 * from the Shopping List
			 * <p>
			 * The {@link #isEmpty()} method will return a line of code telling a user that the shopping
			 * list is empty if the user tries to remove another item from the list
			 * when there is no item to be removed from the list.
			 */
			System.out.printf("%n%nEnter an item to remove from the list: ");
			String removeInput = input.nextLine();
			String upperCaseRemoveInput = removeInput.toUpperCase();
			
			if (uniqueList.contains(upperCaseRemoveInput)) {
				uniqueList.remove(upperCaseRemoveInput);
				System.out.printf("%n%s has been removed.%n", upperCaseRemoveInput);
				continue;
			}
			
			if (uniqueList.isEmpty()) {
				System.out.println("There is nothing on your shopping list!");
				break;
			}
		
		}
	}
}
		
	
		
		


