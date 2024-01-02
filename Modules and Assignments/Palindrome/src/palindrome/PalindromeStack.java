package palindrome;
import java.util.Scanner;

public class PalindromeStack {
	
	public static void Main(String[] args) {
		
		GenericStack<String> palindromeStack = new GenericStack<String>();
		Scanner Input = new Scanner(System.in); 
		
		System.out.println("Enter Word: ");
		String palindrome = Input.nextLine();
		
			for(int i = 0, n = palindrome.length() ; i < n ; i++) {  
			    char c = palindrome.charAt(i);
			    palindromeStack.push(c);
		}
			
		System.out.println("Output Word: ");
		
			for(int i = 0, n = palindromeStack.size() ; i < n ; i++) { 
			
				char c = palindrome.charAt(i);
				palindromeStack.pop();
			    System.out.print(c);
		}
		Input.close();	
	}
}
