package searchcomparison;

import java.util.Scanner;

/**
 * This program asks the user to enter an integer and then searches for the integer within an
 * array containing integers from 1-100. The program searches for the user-inputted number using two
 * different search methods. A linear search method (linearSearch()) and a binary search method (binarySearch())..
 * <p>
 * @author Lucas Saucer
 * @since 04/04/2021
 * @version 1.0
 */

public class SearchComparison {

	static Scanner input = new Scanner(System.in);

/**
 * @param searchKey is the user-inputed integer that the user would like to search the array for.
 * @param first is the first index within the array.
 * @param last is the last index within the array.
 */
	int searchKey;
	static int first;
	static int last;
	
/**
 * {@link linearSearch()} searches the array (arr1) for the user-inputed search key using a
 * linear search method.
 * @return returns the index of the user-inputed integer within the array.
 * @return returns -1 if a value is inputed that is outside of the values contained within the array.
 */
	
	public static int linearSearch(int[] arr1, int searchKey){    
        for (int i = 0; i < arr1.length; i++){    
            if (arr1[i] == searchKey) {    
                return i + 1;    
            }    
        }    
        return -1;    
    }    
	
	/**
	 * {@link binarySearch()} searches the array (arr1) for the user-inputed search key using a
	 * binary search method.
	 * @return returns the counter for each time the while loop is completed.
	 */
	
	public static int binarySearch(int arr1[], int first, int last, int searchKey) {  
		   int mid = (first + last)/2; 
		   int counter = 0;
		   
		   while( first <= last ){  
		      if ( arr1[mid] < searchKey ){  
		        first = mid + 1;     
		      } else if (arr1[mid] == searchKey ){  
		//        System.out.println("Element is found at index: " + mid);
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;
		      counter++;
		   }  
		   if ( first > last ){  
		      System.out.println("Integer is not in the data set.");
		   	}
		   return counter + 1;
		 }  
	

	
	public static void main(String[] args) {
		
		int [] arr1 = new int [100];
		for (int a = 0; a < arr1.length; a++) {
		    arr1[a] = a + 1;
		}
		int last = arr1.length - 1;
		
		System.out.println("Enter an Integer: ");
		int searchKey = input.nextInt();
		 
		System.out.printf("Linear Search Number of Steps: %d%n", linearSearch(arr1, searchKey));

		System.out.printf("Binary Search Number of Steps: %d%n", binarySearch(arr1, 0, last, searchKey));
	}
}
