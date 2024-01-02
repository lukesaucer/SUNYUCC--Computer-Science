package Sum;

import java.util.Scanner;  // use Scanner for keyboard input

public class Sum {
	
	//The program starts here

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter interger1: ");
		int number1 = input.nextInt(); // prompt the user for int
		System.out.print("Enter interger2: ");
		int number2 = input.nextInt();
		int sum = number1 + number2;
		System.out.printf("Sum = %d%n", sum);

		if (number1 > number2)
			System.out.printf("%d is larger%n",number1);
		else
			if (number1 < number2)
			System.out.printf("%d is smaller%n",number1);
			else 
				System.out.printf("%d and %d are equal", number1, number2);
		
		input.close();
	}

}
