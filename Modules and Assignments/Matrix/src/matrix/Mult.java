package matrix;

/**
 * This class creates the multiplication method which is used to multiply the index of one array
 * with the index of the other listed array in the Matrix class.
 * <p>
 * @author lukesaucer
 * @since 05/02/2021
 * @version 1.0
 */

import java.lang.Runnable;

public class Mult implements Runnable {

	
	private int a; 
	private int b;
	private int result;

/**
 * {@link Mult()} method is used to multiply one index in an array by another index in another array within the Matrix class.
 * 	<p>
 * @param a is used to represent an index of an array in the Matrix class to be multiplied.
 * @param b is used to represent an index of an array in the Matrix class to be multiplied.
 * @return returns the result of multiplying one index by another index of two different arrays in the Matrix class.
 */
	
	public Mult(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void run() {
		Multiply();
	}
	public void Multiply() {
		result = a*b;
	}
	public int getResult() {
		return result;
	}
}