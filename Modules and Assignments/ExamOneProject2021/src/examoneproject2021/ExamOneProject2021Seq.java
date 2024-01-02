package examoneproject2021;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lucas Saucere
 * @since 10/5/2021
 * @version 1.0
 * 
 * This program takes an array of integers and converts it to a list. It then passes that list to the LinkedList
 * constructor and iterates over each element in the array and prints them to the console. It then prints the
 * linked list in ascending order, then reverses the linked list and prints it in descending order. My first attempt
 * was commented out below as well as a few sections in the node class. I then discovered from tutorialspoint.com that you can import
 * collections classes that have built in methods for Arrays, Collections, Iterator, LinkedList and List in order to 
 * complete what is required for the assignment with much less and more simple lines of code.
 */

public class ExamOneProject2021Seq {

	public static void main(String[] args) {
		Integer arrayOne[] = {10,15,35,67,89,101};
/**
 * @param list
 * 		Is used to store the converted array as a list.
 * {@link asList()}
 * 		Method from java.util.Arrays class is used to convert the user-inputted array to a list.
 */
		List<Integer> list= Arrays.asList(arrayOne);
		
/**
 * @param linkedList
 * 		Is used in the LinkedList constructor from java.util.LinkedList to store the variable
 * 		list and convert it to a Linked List.
 */
		LinkedList<Integer> linkedList = new LinkedList<Integer>(list);
/**
 * @param iterator
 * 		Is used to iterate through linkedList and print each element within the list to
 * 		the console.	
 */
		  Iterator<Integer> iterator = linkedList.iterator();
	        while (iterator.hasNext()) {
	            // Print element to console
	            System.out.println((Integer) iterator.next());
	        }
	
	            System.out.println();
	            System.out.println("LinkedList In Order:");
	            System.out.print(linkedList);
	            System.out.println();
	            System.out.println();
	            System.out.println("LinkedList In Reverse:");
/**
 * {@link reverse()}
 * 		Method from java.util.Collections that allows you to reverse the order of a
 * 		Linked List from ascending to descending.    
 */
	            Collections.reverse(linkedList);
	            System.out.print(linkedList);
	            System.out.println();
	            System.out.println();

// First attempt before understanding that you could implement the java.util imports for the assignment
//	            
//	           	ExamOneProject2021Node<Integer> head;	
//	           	public void addNode(E data) {
//	           		ExamOneProject2021Node<Integer> newNode = new ExamOneProject2021Node<E>(data);    		
//	            	if (head == null) {
//	            		head = newNode;
//	           			tail = newNode;
//	           		}
//	           		else {
//	           			tail.link = newNode;
//	           			tail = newNode;
//	           		}
//	            	}
//	            public void print() {
//	            	ExamOneProject2021Node<Integer> cursor = head;
//	            	if (head == null) {
//	           			System.out.println("There is nothing in the list.");
//	           			return;
//	           		}
//	          			while(cursor.getLink() != null) {
//	           		    System.out.println(cursor.getData() + " ");
//	           		    cursor = cursor.getLink();	
//	           		    	}
//	           		    }	
//	  	    public static void main(String[] args) {
//	  	    Integer arrayOne[] = {10,15,35,67,89,101};	      
//	  	    ExamOneProject2021Seq linkedList2 = new ExamOneProject2021Seq();
//      	    <Integer> linkedList2.addNodeAfter(10);
//      	    linkedList2.print();
//      	    }
	     }
	}
		
	            
	