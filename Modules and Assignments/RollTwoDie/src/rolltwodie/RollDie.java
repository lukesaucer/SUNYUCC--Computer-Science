package rolltwodie;

// Assignment #6 - Lucas Saucer

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
		int[] roll = new int[13];
		
		
		for (int iRoll = 1; iRoll <= 36000000; iRoll++) {
			int iDieRoll = ((1 + randomNumbers.nextInt(6)) + (1 + randomNumbers.nextInt(6)));
			++roll[iDieRoll];
		
		}
		
		double sum = 0; // total of all the totals
		
		// calculates the sum
		for (int i=2; i<roll.length; i++) 
			sum = sum + roll[i];
	
		
		System.out.printf("%n%s\t%s\t%s%n", "Total", "# Of Times Rolled", "% Of Times Rolled");
		System.out.println();
		for (int i=2; i < roll.length; i++)	{
			System.out.printf("%2d%18d%22.02f%n", i, roll[i], (roll[i] * 100 / sum));
		}
	}
}