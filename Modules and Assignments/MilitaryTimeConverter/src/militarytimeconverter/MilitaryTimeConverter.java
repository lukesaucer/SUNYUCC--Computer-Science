package militarytimeconverter;

import java.util.InputMismatchException;

/**
 * This program converts the hour inputed from a 24-hour military time system to a standard 12-hour time system.
 * 
 * @author Lucas Saucer
 * @version 1.0
 * @since August 28, 2021
 * 
 */

import java.util.Scanner;

public class MilitaryTimeConverter {
	
	/**
	 * 
	 *	@Parameters:
	 *         militaryTime – an integer representing # of Hours (0 to 23) that is user inputed.
	 *	@Precondition:
	 *         militaryTime >=0, militaryTime <=23.
	 *	@Returns:
	 *         An integer representing the # of Hours (1 to 12) in standard Time with a AM or PM designation.
	 *	@Throws: 
	 *		   IllegalArgumentException - Checks to make sure that the user inputed militaryTime is not less than 0 or greater than 23.
	 *		   InputMismatchException - Throws an error in the event that the user does not enter a valid value to search for (example: a string).
	 */
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	try {
			System.out.println("Enter Military Time: ");
			int militaryTime = input.nextInt();
			
			if (militaryTime < 0 || militaryTime > 23) {
				throw new IllegalArgumentException ("Invalid Input, Please Try Again");
			} 
			
			System.out.println(" ");
			System.out.println("Standard Time: ");
			convertTime(militaryTime);
	} catch (InputMismatchException e) {
		System.out.println("Invalid Input, Please Try Again");
		}
	input.close();
	}
				public static String convertTime(int militaryTime) {
					
					switch (militaryTime) {
							case 0:
								System.out.println("12 AM");
								return "12 AM";
								
							case 1:
								System.out.println("1 AM");
								return "1 AM";
								
							case 2:
								System.out.println("2 AM");
								return "2 AM";
								
							case 3:
								System.out.println("3 AM");
								return "3 AM";
								
							case 4:
								System.out.println("4 AM");
								return "4 AM";
								
							case 5:
								System.out.println("5 AM");
								return "5 AM";
								
							case 6:
								System.out.println("6 AM");
								return "6 AM";
								
							case 7:
								System.out.println("7 AM");
								return "7 AM";
								
							case 8:
								System.out.println("8 AM");
								return "8 AM";
								
							case 9:
								System.out.println("9 AM");
								return "9 AM";
								
							case 10:
								System.out.println("10 AM");
								return "10 AM";
								
							case 11:
								System.out.println("11 AM");
								return "11 AM";
								
							case 12:
								System.out.println("12 PM");
								return "12 PM";
								
							case 13:
								System.out.println("1 PM");
								return "1 PM";
							
							case 14:
								System.out.println("2 PM");
								return "2 PM";
								
							case 15:
								System.out.println("3 PM");
								return "3 PM";
								
							case 16:
								System.out.println("4 PM");
								return "4 PM";
							
							case 17:
								System.out.println("5 PM");
								return "5 PM";
								
							case 18:
								System.out.println("6 PM");
								return "6 PM";
								
							case 19:
								System.out.println("7 PM");
								return "7 PM";
								
							case 20:
								System.out.println("8 PM");
								return "8 PM";
								
							case 21:
								System.out.println("9 PM");
								return "9 PM";
								
							case 22:
								System.out.println("10 PM");
								return "10 PM";
								
							case 23:
								System.out.println("11 PM");
								return "11 PM";
								
							default:
								System.out.println("Input Error, Please Try Again");
								}
					return null;
							}
}
	
						
				
		