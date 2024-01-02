 /* Data Structures Lab Exercise #3 */
package findthebugs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * This program takes an array and prints out the index at which a user inputed number is located at.
 * 
 * 
 * @since 09/05/2021
 * @author Lucas Saucer
 * @version 1.0
 */


/*
 * Bugs within the Assignment
 * 
 * Bug #1
 * 		The code is out of order and needs to be rearranged in order to follow a logical sequence of instructions. I moved parts of the program around in order
 * 		to enhance the readability of the code. This includes putting the printArray method ahead of the main method as well as asking for an integer to be found within
 * 		the array before the entire array is printed.
 * 
 * Bug #2
 * 		I had to change the type of the array to Long instead of Int in order for my solution to work, although I am not sure as to why it had to be a long instead of an int.
 * 
 * Bug #3
 * 		The for loop needs to run the length of the array, not just to the 13th index.
 * 
 * Bug #4
 * 		The "System.out.print(array[i] + " ")" needs to be included within the for loop. 
 * 
 * Bug #5
 * 		In order for my solution to work I just deleted the "if(i != 0)" condition within the for loop.
 * 
 * Bug #6
 * 		Wrote in code for if the index is not located within the array.
 *
 * Bug #7
 * 		Wrote in code to print for duplicates located within the array.
 * 
 * Bug #8
 * 		Wrote in code to ask the user to only enter a number in the event that a string was entered.
 * 
 * Bug #9
 * 		Need to close the scanner.
 */


/**
 * 
 *	@Parameters:
 *         number - User inputed value to search the sorted array for.
 *         indexes - A list used to store the indexes of duplicate values within the array.
 *         index - The index where the user inputed value (int variable named number) is located.
 *	@Precondition:
 *         number must be of type int.
 *	@Returns:
 *         The index of a user-inputted value from a sorted array.
 *  @Throws:
 *  	   InputMismatchException e - Throws an error in the event that the user does not enter a valid value to search for (example: a string).
 */


public class FindTheBugs {
	
	private static void printArray(String message, long[] array) {
		System.out.println(message + ": [length: " + array.length + "]");
	}
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		try {
		System.out.println("Enter an integer to find: ");							// Bug #1
		int number = input.nextInt();
		System.out.println();
		
		
		long[] array = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4, 20, 60, 2, 1, 3, -7};	// Bug #2
		Arrays.sort(array);
		printArray("Sorted array", array);
			for (int i = 0; i < array.length; i++) {								// Bug #3
				System.out.print(array[i] + " "); 									// Bug #4
			}																		// Bug #5

		System.out.println();
		System.out.println();
	
	
		List<Integer> indexes = new ArrayList<Integer>();
        int index = Arrays.binarySearch(array, number);  
	        if (index < 0) 															// Bug #6
	            System.out.println("Element is not found within the array");  
	        else  
				for (int i = 0; i < array.length; i++) {
					if(array[i] == number) {
						indexes.add(i);
					}
				}
				
				if(array.length > 0){
					System.out.println();
					System.out.println("The number " + number + " was located at index " + indexes);	
				}																	// Bug #7
		} catch (InputMismatchException e) {										// Bug #8
			System.out.println("Please enter a number.");				
		}
				input.close();														// Bug #9												
	}

}
	