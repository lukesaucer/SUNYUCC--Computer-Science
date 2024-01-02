package classaverage;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int total = 0; // sum of all grades
		int counter = 1; // count of number of grades
		
		
		// Sentinel Controlled Iteration
		
		// System.out.print("Enter a grade: or -1 to quit");
		// int grade = input.nextInt();
		// while (grade =! -1){
		
		// 	total = total + grade;      
		// 	counter++; 
		//  System.out.print("Enter a grade: or -1 to quit ");
		//  grade = input.nextInt();
		
		// System.out.printf("Value of Counter: %d%n", counter);
		// System.out.printf("Total of all grades %d%n", total);
		//  counter--; 
		//  if (counter != 0) {
		// 	int average = total / counter;
		//  System.out.printf("Class Average %d%n", average);
		//  }
		// else 
		//	System.out.println("No grades were entered");
		
		
		
		
	// }
		while (counter <=10 ) {
			System.out.print("Enter a grade: ");
			int grade = input.nextInt(); // user enters a grade
			total = total + grade;       // keep a total of all grades
			counter++;                  // add one to the counter
		}
		System.out.printf("Value of Counter: %d%n", counter);
		System.out.printf("Total of all grades %d%n", total);
		int average = total / 10;
		System.out.printf("Class Average %d%n", average);
	}

}
