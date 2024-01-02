package palindromestack;

/**
 * @author Lucas Saucer
 * @since 10/18/2021
 * @version 1.0
 * 
 * This assignment takes a user-inputted word and outputs it in reverse to create
 * a "palindrome".
 */

import java.util.Scanner;

public class PalindromeStack {
	
	public static void main(String[] args) {
		
		Stack<String> palindromeStack = new Stack<String>();
		Scanner Input = new Scanner(System.in); 
/**
 * @param	palindrome
 * 		Is a string that is used to store a user-inputted string that will eventually
 * be printed in reverse order.
 * 
 * {@link push() method} 
 * 		"Pushes" the character obtained through iterating through the palindrome string with
 * a for-loop into the stack.
 * 
 * {@link pop() method}
 * 		"Pops" the character from the top of the stack into the output word message in the console.
 * 
 */
		System.out.println("Enter Word: ");
		String palindrome = Input.nextLine();
		
			for(int i = 0, n = palindrome.length() ; i < n ; i++) {  
			    char c = palindrome.charAt(i);
			    palindromeStack.push(c);
		}
			
		System.out.println("Output Word: ");
		
			for(int i = 0, n = palindromeStack.size() ; i < n ; i++) { 
				System.out.print(palindromeStack.pop());
			    
		}
			
		Input.close();	
	}
}
