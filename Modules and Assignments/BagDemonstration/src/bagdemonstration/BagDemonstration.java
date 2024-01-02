/**
 * @author  Lucas Saucer
 * @since   September 12, 2021
 * @version 1.0
 */



package bagdemonstration;

import java.util.Scanner;

public class BagDemonstration {

	private static Scanner stdin = new Scanner(System.in);
	
	public static void main(String[] args) {
		IntArrayBag ages = new IntArrayBag();
		getAges(ages);
		checkAges(ages);
		System.out.println("May your family live long and prosper.");
	}
	
	public static void getAges(IntArrayBag ages)
	
	{
		int userInput;
		
		System.out.println("Type the ages of your family members.");
		System.out.println("Type a negative number at the end and press return.");
		userInput = stdin.nextInt();
		while (userInput >= 0)
		{
			ages.add(userInput);
			userInput = stdin.nextInt();
		}
	}
	
	public static void checkAges(IntArrayBag ages)
	
	{
		int userInput;
		
		System.out.print("Type those ages again. ");
		System.out.println("Press return after each age.");
		while (ages.size() > 0)
		{
			System.out.print("Next age: ");
			userInput = stdin.nextInt();
			if (ages.countOccurrences(userInput) == 0)
				System.out.println("No, that age does not occur!");
			else
			{
				System.out.println("Yes, I've got that age and will remove it.");
				ages.remove(userInput);
			}
		}
	}
}
