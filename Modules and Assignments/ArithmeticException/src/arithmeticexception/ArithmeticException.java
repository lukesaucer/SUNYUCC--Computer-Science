package arithmeticexception;

/**
 * @author john sheehan
 * @since 2-2-21
 * @verion 1.0
 */

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *  Example of divide by zero exception handling
 *
 */
public class ArithmeticException {

	/**
	 * returns the result of dividing numerator by denominator
	 * @param numerator numerator of operation
	 * @param denominator denominator of operation
	 * @return
	 */
	public static int quotient(int numerator, int denominator)
	throws CustomMathException
	{
		if (numerator < 5)
		{
			CustomMathException customException = new CustomMathException();
			throw customException;
		}
		return numerator / denominator; 
	}
	
	/**
	 * Prompts the user for two integers and divides them
	 * @param args not used
	 */
	public static void main(String[] args) throws CustomMathException {
		// TODO Auto-generated method stub
		boolean continueLoop = true;
		do {
			try 
			{ // check if an exception occrurs anywhere here
				Scanner scanner = new Scanner(System.in);
				System.out.print("Please enter an integer numerator: ");
				int numerator = scanner.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = scanner.nextInt();
		
				int result = quotient(numerator, denominator);
				System.out.printf("Result of %d divided by %d is %d%n",
						numerator,denominator,result);
				continueLoop = false;
			}
			catch (InputMismatchException inputMismatchException) {
				//System.err.printf("%nException: %s%n", inputMismatchException);
				System.out.printf("You must enter integers.  Please try again%n%n");
			}
			catch (CustomMathException customMathException) {
				//System.err.printf("%nException: %s%n", inputMismatchException);
				System.out.printf("Numerator is too small.  Please try again%n%n");
			}
		} while (continueLoop);
	}
}
