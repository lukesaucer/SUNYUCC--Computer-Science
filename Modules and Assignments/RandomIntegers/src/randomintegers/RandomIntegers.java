package randomintegers;

import java.security.SecureRandom;

public class RandomIntegers {
	
	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		
		int NumberOfOnes = 0;
		int NumberOfTwos = 0;
		int NumberOfThrees = 0;
		int NumberOfFours = 0;
		int NumberOfFives = 0;
		int NumberOfSixes = 0;
		
		for (int counter = 1; counter <= 20; counter++) {
		// random number from 1-6
		// Roll the dice
		int face = 1 + randomNumbers.nextInt(6);
		switch(face) {
		case 1: NumberOfOnes++;
		break;
		case 2: NumberOfTwos++;
		break;
		case 3: NumberOfThrees++;
		break;
		case 4: NumberOfFours++;
		break;
		case 5: NumberOfFives++;
		break;
		case 6: NumberOfSixes++;
		break;
		}
		
		System.out.printf("%d ", face);
	}
		System.out.printf("%nNumberOfOnes: %d%n", NumberOfOnes);
		System.out.printf("NumberOfTwos: %d%n", NumberOfTwos);
		System.out.printf("NumberOfThrees: %d%n", NumberOfThrees);
		System.out.printf("NumberOfFours: %d%n", NumberOfFours);
		System.out.printf("NumberOfFives: %d%n", NumberOfFives);
		System.out.printf("NumberOfSixes: %d%n", NumberOfSixes);
	}
	
}
