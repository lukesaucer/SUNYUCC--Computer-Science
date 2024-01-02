package tester;

// Exam One Program - Lucas Saucer

import java.util.Scanner;

public class TesterTest {
	
	public static void main(String[] args) {
		
		int sum = 0;
			
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer or -1 to quit:");
		int integer = input.nextInt();
		
		while (integer != -1) {
				
				if (integer > sum) {
					System.out.printf("%d is greater than Sum %d\n",integer, sum);
				}
					else
						if (integer < sum) {
							System.out.printf("%d is less than Sum %d\n",integer, sum);
						}
						else
							if (integer == sum) {
								System.out.printf("%d is the same as Sum %d\n",integer, sum);
							}
				sum += integer;
				System.out.print("Enter an integer or -1 to quit:");
				integer = input.nextInt();
				
				
		}
			System.out.printf("The final sum is %d", sum);
			input.close();
	}
}

