package arrayexception;

import java.util.Scanner;
import java.util.InputMismatchException;


/** Computer Science II Programming Assignment #2
 * 
 * @author Lucas Saucer
 * @since 02-07-2021
 * @version 3.0
 *
 * The following code example will prompt the user to enter 10 integers into an array
 * It will then ask the user to input either
 * 1) Index (0-9) Return the value stored at this index
 * 2) Value (int) Searches the array all occurrences of the value if found
 * 
 * Modify this program to include exception handling for the following exceptions
 * 1) If the user enters an invalid index, display an appropriate error message
 *    Use try and catch for the ArrayIndexOutOfBoundsException
 *  
 * 2) If the user enters an invalid input (i.e. "Hello" instead of an integer)
 *    Use try and catch for the InputMismatchException
 *    
 * 3) EXTRA CREDIT 20%:
 *    If the number entered to search the array is not found, generate a custom
 *    NumberNotFound exception
 */



public class ArrayException {
	
/**
 * @throws CustomMathException
 */
	
	public static void main(String[]args) throws CustomMathException {
			
		Scanner input = new Scanner(System.in);
		
/**
 * Create an array to search.
 * @array array
 * @int response
 * @int index
 * @int value
 */
		int[] array = new int[10];
		
		int response;
		int index;
		int value;
		
/** 
 * Prompt the user to input 10 integers and store them in the array.
 */
		System.out.println("Enter 10 integers");
			
		for (int i = 0; i < array.length; i++) 
			{
				System.out.printf("Enter an integer for index# %d: ", i);
				array[i] = input.nextInt();
			}
			
/**
 *  Prompt the user to choose between searching by value or searching by index.
 */
		
		System.out.printf("%n1)Search by index \n2)Search by value\n");
		response = input.nextInt();
			
		boolean continueLoop = true;
		//Search by index
		if (response == 1)
			
			do {
				try
				{
/**
 * User inputs index.
 * <p>
 * @param index - Index is used to store the user's input from the keyboard.
 * Integer at index is then printed.
 */
					System.out.printf("Enter an Index: ");
					index = input.nextInt();
				
				
					System.out.printf("Integer at index %d: %d", index, array[index]);
					continueLoop = false;
				}
				
/**
 * 
 * @exception inputMismatchException
 * @exception arrayIndexOutOfBoundsException
 * <p>
 * Unfortunately at this point I could not figure out
 * how to break out of the loop and allow the user
 * to enter in a new index of type integer.
 * Without the "break" command, an infinite loop was created.
 * However, in the ArrayIndexOutOfBoundsException, the code allows the
 * user to input another index. I do not understand why that exists for
 * that exception but not the other.				
 */
				catch (InputMismatchException inputMismatchException) {
					System.out.println("Please enter an index of type integer.");
					input.next();
				}
				
				catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
					System.out.println("Index out of bounds. Please try again.");
					input.next();
				} 
				
			} while (continueLoop);

		
		
/**
 * Allows the user to search the area by value.
 * <p>
 * Unfortunately I was not able to figure out how to print text for
 * the CustomMathException. I am unsure as to if I needed to do it in the
 * class file for CustomMathException or if I needed to do it up at the top
 * where the exception is thrown. I attempted to use class resources as well as
 * other online resources but was unsuccessful. If this could be shown in class
 * it would be appreciated. Thank you. 		
 */

		boolean continueLoop2 = true;
		if (response == 2) 
			do {
				System.out.printf("%nEnter a value: ");
				value = input.nextInt();

				for (int i = 0; i < array.length; i++) {

					if (array[i] == value) {
						System.out.printf("%nValue %d is found at index %d", value, i);
						}
					}
			}
			while (continueLoop2);	
		input.close();
			}
}