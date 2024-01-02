package binarysearchgenericmethod;

/**
 * This java program uses a binary search method and uses generic methods in order
 * to search for a user-inputed value to search three pre-determined arrays of types
 * Integer, Double and String.
 * <p>
 * I ended up having trouble with the comparator on this assignment and needed to ask
 * for the help of Steve Cina in creating the comparator. He created the GenericComparator
 * Java class for me and helped to implement it into my binarySearch method.
 * <p>
 * @author Lucas Saucer & Steve Cina
 * @since 04/18/2021
 * @version 1.0
 * 
 */

import java.util.*;

		
public class BinarySearchGenericMethod<T extends Comparable<T>> {
	
	private static GenericComparator GC = new GenericComparator();
/**
 * {@link binarySearch()} is a method that is used to conduct a binary search on the three arrays
 * provided.	
 * @param <T> Used to create a generic method where the method can be used to search an array of
 * any type as well as a key of any type.
 * @param array is used to conduct the binarySearch method on the user inputed array.
 * @param key is the value that the user searches the array for.
 * @return returns a -1 if the value is not listed and returns the index of where the key value is
 * located within the predetermined arrays.
 */
	public static <T> int binarySearch(T[] array, T key) {
	    int low = 0;
	    int high = array.length;
	    

	    while (true) {
	    	
	        int mid = (low + high) / 2;
	        int cmp = GC.compare(array[mid], key);
	        if ((high - low <= 1) && (cmp != 0)) return -1;
	        if (cmp == 0) {
	            return mid;
	        } else if (cmp > 0) {
	            high = mid;
	        } else {
	            low = mid;
	        }
	    }
	} 
		
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		Integer[] integerArray = {1, 2, 3, 4, 5, 6};
		
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		String[] stringArray = {"A", "B", "C", "D", "E"};
		
		
		
		System.out.printf("Which list to search?%n%n");
		System.out.println("1) Integer");
		System.out.println("2) Double");
		System.out.printf("3) String%n%n");
		
		String userListInput = input.next();
		
		System.out.printf("%nEnter Value: ");
		String key = input.next();
		
		int index = 0;
		
		if (userListInput.equals("1")) {
			index = binarySearch(integerArray, key);
		}
		else if (userListInput.equals("2")) {
			index = binarySearch(doubleArray, key);
		}
		else if (userListInput.equals("3")) {
			index = binarySearch(stringArray, key);
		}
		System.out.println("Key was found at index: " + index);
	}
}