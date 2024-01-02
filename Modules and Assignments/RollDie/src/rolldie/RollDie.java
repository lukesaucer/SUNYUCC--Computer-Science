package rolldie;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom();
		int[] frequency = new int[7];
		
		for (int roll = 1; roll <= 60000000; roll++) {
			int dieRoll = 1 + randomNumbers.nextInt(6);		
			++frequency[dieRoll];
		}
		System.out.println();
		for (int face=1; face < frequency.length; face++)	{
			System.out.printf("%4d%10d%n", face, frequency[face]);
		}
	}

}