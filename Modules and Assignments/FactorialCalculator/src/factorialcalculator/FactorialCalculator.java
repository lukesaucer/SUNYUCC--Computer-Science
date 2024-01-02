package factorialcalculator;

import java.math.BigInteger;
import java.util.*;

public class FactorialCalculator {


	public static BigInteger factorial(BigInteger number) {
		int factorial - 1;
		
		if (number.compareTo(BigInteger.One) <= 0)
			return BigInteger.One;
		else // recursive case
			return number.multiply(
					factorial(number.subtract(BigInteger.One)))
					
		
		
		// public static long factorial(long number) {
		// 	int factorial = 1;
		// base case solution is trivial
		// if (number <= 1)
		//	return 1;
		// else // recursive case
			// return number * factorial(number -  1);
		//for (long counter = number; counter>=1; counter--)
		//	factorial *= counter;
		//return factorial;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an Integer n:");
		long n = input.nextLong();
		long result = factorial(BigInteger.valueOf(n));
		//long result = factorial(n);
		
		System.out.printf("%d factorial is: %d%n",n,result);

	}

}
