	package testmatrix;

	import java.util.concurrent.Callable;

	/**
	 * This program concurrently multiples three two-dimensional matrices and prints the results
	 * to the console. The first set of results is the multiplication being performed serially,
	 * while the second set is the multiplication being performed concurrently.
	 * <p>
	 * @author Lucas Saucer
	 * @since 05/07/2021
	 * @version 1.0
	 */
	
	// Thread to calculate the product of two integers

	public class Multiply implements Callable<Integer>{

		private final int a;
		private final int b;
	/**
	 * {@link Multiply()} method is used to multiply two matrices together and store the result of the
	 * multiplication in a single variable.
	 * <p>
	 * @param a stores Matrix A
	 * @param b stores Matrix B
	 * @param result stores the result of multiplying Matrix A by Matrix B
	 */
		public Multiply(int a, int b, int result)
		{
			this.a = a;
			this.b = b;
		}
		
		@Override
		public Integer call() throws Exception {
			return a*b;
		}
		
	}
