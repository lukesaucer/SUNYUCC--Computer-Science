package classaverage;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int total = 0;   // sum of all the grades
		int counter = 1; // count of number of grades
		
		//System.out.print("Enter a grade or -1 to quit: ");
		//int grade = input.nextInt();  // user enters a grade
		
		int grade;
		
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;
		
		do
		 {             // repeat ? times
			System.out.print("Enter a grade or -1 to quit: ");
			grade = input.nextInt();  // user enters a grade
			if (grade!=-1) {
				total = total + grade;        // keep a total of all grades
				counter++;
				// Keep track of As, Bs, Cs, Ds and Fs
				switch (grade / 10)
				{
					case 9:  // it's a 90 or higher
					case 10: // it's 100
						aCount++;
						break;
					case 8:
						bCount++;
						break;
					case 7:
						cCount++;
						break;
					case 6:
						dCount++;
						break;
					default:
						fCount++;
						break; // technically optional but use it anyway!
				}
				
			}
			// add one to the counter
			//System.out.print("Enter a grade or -1 to quit: ");
			//grade = input.nextInt();  // user enters a grade
		} while (grade != -1);
		
		counter--; // subtract one from counter
		System.out.printf("Value of Counter: %d%n", counter);
		System.out.printf("Total of all grades: %d%n", total);
		
		if (counter!=0) {
		   int average = total / counter;
		   System.out.printf("Class Average %d%n", average);
		}
		else
		   System.out.println("No grades were entered");
		
		System.out.printf("Number of As: %d%n", aCount);
		System.out.printf("Number of Bs: %d%n", bCount);
		System.out.printf("Number of Cs: %d%n", cCount);
		System.out.printf("Number of Ds: %d%n", dCount);
		System.out.printf("Number of Fs: %d%n", fCount);
		
	}

}
