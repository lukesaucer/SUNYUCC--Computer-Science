package numberconverter;

import java.util.InputMismatchException;
import java.util.Scanner;

/** @author Lucas Saucer
 * 	@since 02/14/2021
 * 	@version 1.0 
 *  Java Program to Convert Numbers from Binary, Hex, and Octal */

public class NumberConverter {

	/** Convert from Binary to Decimal 
	 * <p>
	 * 
	 *  @param BinaryNumber a String representing ones and zeros 
	 *	@return Result returns the conversion of a binary number to a decimal number.
	 */
	public static int BinaryToDecimal(String BinaryNumber) {
		int result = 0;
		int power = BinaryNumber.length() - 1;
		int index = 0;
		while (index < BinaryNumber.length())
		   {
		   if (BinaryNumber.charAt(index)=='1')
		      result = result + 1 * (int) (Math.pow(2, power));
		   index++; // look at the next digit
		   power--; // change the power of 2 to next digit
		   }
		
		return result;
	}
	
	/** Convert from Octal to Decimal 
	 * <p>
	 *  @param OctalNumber a String representing a number with digits from 0 to 7 
	 *  @return Result returns the result of the conversion of an octal number to a
	 *  decimal number.
	 */
	
	public static int OctalToDecimal(String OctalNumber) {
		int result = 0;
		int power = OctalNumber.length() - 1;
		int index = 0;
		while (index < OctalNumber.length())
		   {
		   switch (OctalNumber.charAt(index))
		   {
		      //case '0': result = result + 0 * (int) (Math.pow(8, power)); break;
		      case '1': result = result + 1 * (int) (Math.pow(8, power)); break;
		      case '2': result = result + 2 * (int) (Math.pow(8, power)); break;
		      case '3': result = result + 3 * (int) (Math.pow(8, power)); break;
		      case '4': result = result + 4 * (int) (Math.pow(8, power)); break;
		      case '5': result = result + 5 * (int) (Math.pow(8, power)); break;
		      case '6': result = result + 6 * (int) (Math.pow(8, power)); break;
		      case '7': result = result + 7 * (int) (Math.pow(8, power)); break;
		   }
		   index++; // look at the next digit
		   power--; // change the power of 8 to next digit
		   }
		
		return result;
	}
	
	/** Convert from Hex to Decimal 
	 * <p>
	 *  @param HexNumber a String representing a number with digits from 0-9 and A-F 
	 *	@return Returns the result of converting a hex number to a decimal number.
	 */
	public static int HexToDecimal(String HexNumber) {
		int result = 0;
		int power = HexNumber.length() - 1;
		int index = 0;
		HexNumber.toUpperCase();
		
		while (index < HexNumber.length())
		   {
		   switch (HexNumber.charAt(index))
		   {
		      case '1': result = result + 1 * (int) (Math.pow(16, power)); break;
		      case '2': result = result + 2 * (int) (Math.pow(16, power)); break;
		      case '3': result = result + 3 * (int) (Math.pow(16, power)); break;
		      case '4': result = result + 4 * (int) (Math.pow(16, power)); break;
		      case '5': result = result + 5 * (int) (Math.pow(16, power)); break;
		      case '6': result = result + 6 * (int) (Math.pow(16, power)); break;
		      case '7': result = result + 7 * (int) (Math.pow(16, power)); break;
		      case '8': result = result + 8 * (int) (Math.pow(16, power)); break;
		      case '9': result = result + 9 * (int) (Math.pow(16, power)); break;
		      
		      case 'A':
		      case 'a': result = result + 10 * (int) (Math.pow(16, power)); break;
		      case 'B':
		      case 'b': result = result + 11 * (int) (Math.pow(16, power)); break;
		      case 'C':
		      case 'c': result = result + 12 * (int) (Math.pow(16, power)); break;
		      case 'D':
		      case 'd': result = result + 13 * (int) (Math.pow(16, power)); break;
		      case 'E':
		      case 'e': result = result + 14 * (int) (Math.pow(16, power)); break;
		      case 'F':
		      case 'f': result = result + 15 * (int) (Math.pow(16, power)); break;
		   }
		   index++; // look at the next digit
		   power--; // change the power of ? to next digit
		   }
		
		return result;
	}
	
	
	
	/** Convert from Decimal to Binary 
	 * <p>
	 *  @param DecimalNumber an integer we wish to convert to Binary
	 * 	@return Returns the result of converting a decimal number to a
	 *  binary number
	 */
	
	public static String DecimalToBinary (int DecimalNumber) {
		String result = "";
		
		// Calculate Largest Positional Value
		int position = 1000000; // arbitary assumption
		//int index = 0;
		while (DecimalNumber / Math.pow(2, position) < 1) {
			position--;
		}
		
		while (position>=0)
			{
			if ( DecimalNumber / (int) Math.pow(2, position)==1)
			   result = result + "1";
			else
			   result = result + "0";
			DecimalNumber = DecimalNumber % (int) Math.pow(2, position);
			position--;
			}
		
		return result;
	}
	
	
	/** Convert from Decimal to Octal
	 * <p>
	 * I found this solution on https://www.javatpoint.com/java-decimal-to-octal
	 * I reworked the solution to allow myself to use it with converting decimal 
	 * to hexadecimal as well.
	 * <p>
	 * @param DecimalNumber is a number that we wish to convert to an Octal Number.
	 * @return Result returns the conversion of a decimal number to an octal number.
	 */
	
	public static String DecimalToOctal (int DecimalNumber) {
		String result = "";
		int remainder = 0;
		
	
		    char octalchars[]={'0','1','2','3','4','5','6','7'};  
 
		    while (DecimalNumber > 0)  
		    {  
		       remainder = DecimalNumber % 8;   
		       result = octalchars[remainder] + result;   
		       DecimalNumber = DecimalNumber / 8;  
		    }  
		    return result;  
	}
	
	
	/** Convert from Decimal to Hexadecimal
	 * 	<p>
	 *  @param DecimalNumber is a number that we wish to convert to a Hex number.
	 *  @return Result returns the conversion of a decimal number to a hex number.
	 */
	
	public static String DecimalToHexdecimal (int DecimalNumber) {
		String result = "";
		int remainder = 0;
		
		char hexchars[]= {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		while (DecimalNumber > 0)
		{
			remainder =  DecimalNumber % 16;
			result = hexchars[remainder] + result;
			DecimalNumber = DecimalNumber / 16;
			
		}
		return result;
	}

	
	
	/**
	 * Main initiates the program and asks the user for a type
	 * of number to convert. It then converts the number inputed
	 * by the user to a number in decimal.
	 * <p>
	 * @switch Is a control statement that allows the user to choose from a menu
	 * which type of number they would like to convert.
	 * @catch InputMismatchException is thrown to help ensure that the user enters a value
	 * of type integer from the menu.
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
		System.out.println("Enter Type of Number to Convert:\r\n" + 
				"1) Binary\r\n" + 
				"2) Octal\r\n" + 
				"3) Decimal\r\n" + 
				"4) Hexadecimal\r\n" + 
				"");
		int choice = input.nextInt();
		
		switch(choice) {
		case 1: // Convert from Binary
		   System.out.print("Enter Binary Number: ");
		   String binaryNumber = input.next();
		   System.out.printf("%s converted is: %n%n%s Octal %n%n%s Decimal %n%n%s Hex", binaryNumber, DecimalToOctal(BinaryToDecimal(binaryNumber)), BinaryToDecimal(binaryNumber), DecimalToHexdecimal(BinaryToDecimal(binaryNumber)));
		   break;
		case 2: // Covert from Octal 
			System.out.print("Enter Octal Number: ");
			String octalNumber = input.next();
			System.out.printf("%s converted is: %n%n%s Binary %n%n%s Decimal %n%n%s Hex", octalNumber, DecimalToBinary(OctalToDecimal(octalNumber)), OctalToDecimal(octalNumber), DecimalToHexdecimal(OctalToDecimal(octalNumber)));
			break;
		case 3: // convert from Decimal
			System.out.print("Enter Decimal Number: ");
			int decimalNumber = input.nextInt();
			System.out.printf("%s converted is: %n%n%s Binary %n%n%s Octal %n%n%s Hex", decimalNumber, DecimalToBinary(decimalNumber), DecimalToOctal(decimalNumber), DecimalToHexdecimal(decimalNumber));
			break;
		case 4: // Convert from Hexdecimal
			System.out.print("Enter Hexidecimal Number: ");
			String hexNumber = input.next();
			System.out.printf("%s converted is: %n%n%s Binary %n%n%s Decimal %n%n%s Octal", hexNumber, DecimalToBinary(HexToDecimal(hexNumber)), HexToDecimal(hexNumber), DecimalToOctal(HexToDecimal(hexNumber)));
			break;
			}
		}
	catch (InputMismatchException inputMismatchException) {
		System.out.println("Please enter a value of type integer.");
		}
	input.close();
	}

}


