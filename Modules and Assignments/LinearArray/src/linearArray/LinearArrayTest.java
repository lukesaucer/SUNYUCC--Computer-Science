package linearArray;

import java.util.Scanner;

public class LinearArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//create the array and output it
		LinearArray searchArray = new LinearArray(10);
		System.out.println(searchArray + "\n");
		
		System.out.print("Enter a value to search: ");
		int searchInt = input.nextInt();
		
		int position = searchArray.linearSearch(searchInt);
		
		if (position == -1)
		   System.out.println("Item not found!");
		else
		   System.out.printf("%d was found at index %d%n",
				   searchInt,position);
		
		System.out.println("Now Sorting!");
		searchArray.sort();
		System.out.println(searchArray + "\n");
		System.out.printf("Number of Steps %d%n", searchArray.getNumSteps());
		
		
	} 

}
