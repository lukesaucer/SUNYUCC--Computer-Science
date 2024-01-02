package isbalanced;

/**
 * @author Lucas Saucer
 * @since 10/18/2021
 * @version 1.0
 * 
 * This program takes a mathematical expression and returns if the equation is a balanced
 * equation or an unbalanced equation.
 */

import java.util.Scanner;

public class isBalanced {
	
public static boolean isBalanced(String expression) {
	final char LEFT_NORMAL = '(';
	final char RIGHT_NORMAL = ')';
	final char LEFT_CURLY = '{';
	final char RIGHT_CURLY = '}';
	final char LEFT_SQUARE = '[';
	final char RIGHT_SQUARE = ']';
/**
 * @param store
 * 		Is used to store characters from the user-inputted expression into a stack data structure.
 * 
 * @param i
 * 		Used to iterate through the user-inputted expression and check each character at the
 * index.
 * 
 * @param failed
 * 		Boolean variable used to determine if the expression returns true or false, determining
 * if the equation is balanced or unbalanced.
 * 
 * @return
 * 		Returns the result of the boolean expression which tests for if the user-inputted expression
 * is balanced or unbalanced.
 * 
 * {@link push() method}
 * 		Is used to push each individual character from the expression onto a stack.
 * 
 * {@link pop() method)
 * 		Is used to pop each individual character off of the stack in order to check
 * each character and compare it to one of the pre-defined characters to determine
 * if the character in the stack matches one of the operations.
 */
	Stack<Character> store = new Stack<Character>();
	int i;
	boolean failed = false; 
	
	for (i = 0; !failed && (i < expression.length()); i++) {
		switch (expression.charAt(i)) {
			case LEFT_NORMAL:
			case LEFT_CURLY:
			case LEFT_SQUARE:
				store.push(expression.charAt(i));
				break;
			case RIGHT_NORMAL:
				if (store.isEmpty() || ((char)store.pop() != LEFT_NORMAL))
					failed = true;
				break;
			case RIGHT_CURLY:
				if (store.isEmpty() || ((char)store.pop() != LEFT_CURLY))
					failed = true;
				break;
			case RIGHT_SQUARE:
				if (store.isEmpty() || ((char)store.pop() != LEFT_SQUARE))
					failed = true;
				break;
		}
	}
	return (store.isEmpty() &&!failed);
	}



public static void main(String[] args) {
	
		Scanner Input = new Scanner(System.in); 
		System.out.println("Input an expression: ");
		String expression = Input.nextLine();
		
		if (isBalanced(expression)) {
			System.out.println("Expression Is Balanced");
		}else {
			System.out.println("Error: Expression Is Not Balanced");
		}
	}		
}
	

