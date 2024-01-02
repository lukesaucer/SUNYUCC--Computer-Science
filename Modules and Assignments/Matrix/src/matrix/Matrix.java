package matrix;

import java.util.concurrent.*;

/**
 * This program takes two arrays and multiplies the same index of each array together concurrently.
 * Once multiplication has finished, the results are then added together and printed out in a statement.
 * <p>
 * @author lukesaucer
 * @since 05/02/2021
 * @version 1.0
 */

public class Matrix {

/**
 * @result is used to store the multiplication result of index (i) in array by index (i) in a second array. 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 4, 5, 1, 8, 10, 15, 1, 6, 8};
		int[] b = {2, 7, 5, 4, 8, 12, 13, 1, 7, 8};
		
// 		multiply these two matricies
//		int result = a[0] * b[0] + a[1] * b[1] + a[2] * b[2] + a[3] * b[3] + a[4] * b[4] + a[5] * b[5]
//				+ a[6] * b[6] + a[7] * b[7] + a[8] * b[8] + a[9] * b[9];
		int result = 0;
		for (int i = 0; i < a.length; i++)
			result = result + a[i] * b[i];
		System.out.printf("Result %d%n", result);
		
		// create 10 Mult objects to run as threads
		Mult m1 = new Mult(a[0],b[0]);
		Mult m2 = new Mult(a[1],b[1]);
		Mult m3 = new Mult(a[2],b[2]);
		Mult m4 = new Mult(a[3],b[3]);
		Mult m5 = new Mult(a[4],b[4]);
		Mult m6 = new Mult(a[5],b[5]);
		Mult m7 = new Mult(a[6],b[6]);
		Mult m8 = new Mult(a[7],b[7]);
		Mult m9 = new Mult(a[8],b[8]);
		Mult m10 = new Mult(a[9],b[9]);
		
		// you do the rest here
		
		// creates a thread pool
		ExecutorService executorService = Executors.newCachedThreadPool();
				
		executorService.execute(m1);
		executorService.execute(m2);
		executorService.execute(m3);
		executorService.execute(m4);
		executorService.execute(m5);
		executorService.execute(m6);
		executorService.execute(m7);
		executorService.execute(m8);
		executorService.execute(m9);
		executorService.execute(m10);
		// you do the rest here
		
		// when threads finish we have all the results
		// now add them together to produce the final answer
		result = m1.getResult() + m2.getResult() + m3.getResult() + m4.getResult()
		+ m5.getResult() + m6.getResult() + m7.getResult() + m8.getResult()
		+ m9.getResult() + m10.getResult();// + you do the rest
		
		executorService.shutdown();
		
		try
		{
			boolean tasksEnded = executorService.awaitTermination(1, TimeUnit.SECONDS);
			
			if (tasksEnded) {
				System.out.printf("%nResult of Multiplying Both Matrices Together:%n");
				System.out.println(result);
			}
			else
				System.out.println("Timed out while waiting for tasks to finish.");
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
