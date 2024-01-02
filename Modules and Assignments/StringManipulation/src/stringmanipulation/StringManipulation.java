package stringmanipulation;

import java.util.Scanner;

/**
 * Program is incomplete, see lines 80 and 89.
 * <p>
 * This is a program that can be used to return information
 * on strings. This program returns the number of words in a
 * sentence, the number of occurrences of a user requested letter in
 * that sentence, and the number of times that the user requested letter
 * appears in each word within a sentence.
 * <p> 
 * @author lukesaucer
 * @since 02/21/21
 * @version 1.0
 */

public class StringManipulation {

	/**
	 * @int count - Used to count the amount of times a character occurs
	 * in a word within the user supplied sentence.
	 * <p>
	 * @int wordCount - Used to count the amount of words within the
	 * user supplied sentence.
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int wordCount = 0;
		int individualWordCount = 0;
		
		
		/**
		 * @String sentence - Returns the sentence that is inputed by the 
		 * user when asked.
		 * <p>
		 * @String words - Stores each individual word within the sentence into 
		 * an array that is supplied by user by invoking the .split() method
		 * on the sentence with the space between the words being used as the delimiter.
		 * <p>
		 * @String character - Returns the letter that is supplied by the user.
		 */
		
		System.out.println("Please enter a sentence:  ");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		System.out.println("Please enter a letter: ");
		String character = input.next();
		
		/**
		 * @for Loops through the sentence supplied by the user to check
		 * if each character in the sentence is equal to the letter supplied
		 * by the user.
		 */
		
		for (int i=0; i < sentence.length(); i++) {
			if (sentence.substring(i, i+1).equalsIgnoreCase(character))
				count++;
		}
		
		/**
		 * @for Loops through the sentence supplied by the user to tally and
		 * determine the amount of words within the sentence.
		 */
		
		for (int i=0; i < words.length; i++) {
			wordCount++;
		}
		
		
	
		System.out.printf("%nTotal number of words in sentence: %d%n%n", wordCount);
		System.out.printf("Total number of occurrences of the letter '%s': %d %n%n", character.toUpperCase(), count);
		System.out.printf("Total number of occurrences of the letter '%s' in each word: %n%n", character.toUpperCase());
		
		/**
		 * This is where I had trouble trying to get each character within the word to
		 * print alongside the word itself. I was not able to complete the assignment
		 * within the allotted time.
		 * <p>
		 * @for Loops through each individual word within the user supplied sentence
		 * and prints each word along with the corresponding amount of times that the
		 * user supplied character appears in each individual word.
		 */
		
		for (String word : words) {
			if (word.substring(0).equalsIgnoreCase(character))
				individualWordCount++;
			System.out.printf("%-20s%15d%n", word.toUpperCase(), individualWordCount);
			
		}
		
		
		// Seperate failed attempt
		//	for (int i=0; i < words.length; i++) {
		//		if (words.toString().substring(0).equalsIgnoreCase(character))
		//			individualWordCount++;
		//		System.out.printf("%-20s%15d%n", words[i].toUpperCase(), individualWordCount);
			
		// }
		
		input.close();

	}
}
	

