package primenumbers;

// Assignment #5 - Lucas Saucer

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a number: ");
			int n = input.nextInt();
			double squareRoot = Math.sqrt(n);
			String test = "is a prime number. %n";
			
		int x = 2;
		
		
		// Originally I had a problem with this statement as I was trying to use an If...Else Statement but I corrected it upon walking through the example shown in class.
		
		
		while (x <= squareRoot) {
			if (n % x == 0) {
				test = "is not a prime number. %n";
		
			}
			x++;
		}
		System.out.printf("%d " + test, n);

		input.close();
	
	}
}
