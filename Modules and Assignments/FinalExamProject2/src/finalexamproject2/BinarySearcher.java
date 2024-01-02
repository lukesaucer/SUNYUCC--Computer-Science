package finalexamproject2;

/**
 * @author - Lucas Saucer
 * @since 12/08/2021
 * @version 1.0
 * 
 * This program uses a binary search method to search a pre-sorted array and prints
 * to the console whether that number was found in the array (Using a predefined range
 * of integers 0-16). If the number was found in the array it prints at what index
 * it was found at within the console.
 */

import java.util.Arrays;

//File: BinarySearcher.java
//A Java application to illustrate the binary search of an array.
//Additional javadoc documentation is available at
//http://www.cs.colorado.edu/~main/docs/BinarySearcher.html

/******************************************************************************
* The <CODE>BinarySearcher</CODE> Java application runs a small test on the 
* <CODE>search</CODE> method from Chapter 11 (using a binary search to
* find a specified number in an array).
*
* <p><dt><b>Java Source Code for this class:</b><dd>
*   <A HREF="../applications/BinarySearcher.java">
*   http://www.cs.colorado.edu/~main/applications/SimpleSearcher.java
*   </A>
*
* @author Michael Main 
*   <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
*
* @version
*   Jun 12, 1998
******************************************************************************/
public class BinarySearcher
{

/**
* The main method prints a table of test results, searching for numbers
* in an array that contains 2, 4, 6, 8, 10, 12, and 14.
* The <CODE>String</CODE> arguments (<CODE>args</CODE>) are not used 
* in this implementation.
**/
public static void main(String[ ] args)
{
   final int[ ] DATA = { 2, 4, 6, 8, 10, 12, 14 };
   final int[ ] EMPTY = new int[0];
   final int MINIMUM = 0;
   final int MAXIMUM = 16;
   int last = DATA.length;
   
   int target;
   
   System.out.println("Searching for numbers in an array.");
   for (target = MINIMUM; target <= MAXIMUM; target++)
   {
	   System.out.println();
       System.out.print("Is " + target + " in the array? ");
       if (search(DATA, 0, last, target ) == -1)
    	      System.out.print("No.");
    	   else
    	      System.out.print("Yes, at index [" + findIndex(DATA, target) + "].");
   }
   
   System.out.println();
   System.out.println();
   System.out.print("Searching for 0 in an empty array: ");
   if (search(EMPTY, 0, 0, 0) == -1)
      System.out.println(" Not found.");
   else
      System.out.println(" Found!");

   System.out.println("End of searching.");
}

     
/**
* Search part of a sorted array for a specified target.
* @param <CODE>a</CODE> 
*   the array to search
* @param <CODE>first</CODE>
*   the first index of the part of the array to search
* @param <CODE>size</CODE>
*   the number of elements to search, starting at 
*   <CODE>a[first]</CODE>
* @param <CODE>target</CODE>
*   the element to search for
* <dt><b>Precondition:</b><dd>
*   If <CODE>size > 0</CODE>, then <CODE>first</CODE> through 
*   <CODE>first+size-1</CODE> must be valid indexes for the array <CODE>a</CODE>.
*   Also, starting at </CODE>a[first]</CODE>, the next <CODE>size</CODE> 
*   elements are sorted in increasing order from small to large.
* @return
*   If <CODE>target</CODE> appears in the array segment starting at 
*   </CODE>a[first]</CODE> and containing <CODE>size</CODE> elements,
*   then the return value is the index of a location that
*   contains <CODE>target</CODE>; otherwise the return value is -1.
* @exception ArrayIndexOutOfBounds Exception
*   Indicates that some index in the range <CODE>first</CODE>
*   through <CODE>first+size-1</CODE> is outside the range of
*   valid indexes for the array <CODE>a</CODE>.
**/
public static int search(int[ ] a, int first, int size, int target)
{
   int middle;

   if (size <= 0)
      return -1;
   else
   {
      middle = first + size/2;
      if (target == a[middle])
         return middle;
      else if (target < a[middle])
         // The target is less than a[middle], so search before the middle.
         return search(a, first, size/2, target);
      else 
         // The target must be greater than a[middle], so search after the middle.
         return search(a, middle+1, (size-1)/2, target);
   } 
}

public static int findIndex(int arr[], int t)
{
    int index = Arrays.binarySearch(arr, t);
    return (index < 0) ? -1 : index;
}

}
