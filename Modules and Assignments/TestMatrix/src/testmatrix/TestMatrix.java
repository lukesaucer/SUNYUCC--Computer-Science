package testmatrix;

import java.util.concurrent.*;

/**
 * This program concurrently multiples three two-dimensional matrices and prints the results
 * to the console. The first set of results is the multiplication being performed serially,
 * while the second set is the multiplication being performed concurrently.
 * <p>
 * @author Lucas Saucer
 * @since 05/07/2021
 * @version 1.0
 */


public class TestMatrix {

	public static void main(String[] args) {
		
		//number of rows and columns in the matrix
		int n = 2;
		
		int[][] a={{1,2},{3,4}}; 
		int[][] b={{5,6},{7,8}};
		int[][] c={{0,0},{0,0}};
		
		// Perform Matrix Multiplication Serially
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				for (int k = 0; k < n; k++)
					c[i][j] = c[i][j] + a[i][k] * b[k][j];

		// display result
		for (int i=0; i < n; i++)
			for (int j=0; j < n; j++)
				System.out.printf("%d ",c[i][j]);
		
		System.out.println();

		
		
		
		
		
		
		// reset results
		c[0][0] = 0;
		c[0][1] = 0;
		c[1][0] = 0;
		c[1][1] = 0;

		// perform matrix multiplication for c[0][0] using concurrency
		int product1 = 0;
		int product2 = 0;
		Multiply task1 = new Multiply(a[0][0],b[0][0],product1);
		Multiply task2 = new Multiply(a[0][1],b[1][0],product2);
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		Future <Integer> producta  = executorService.submit(task1);
		Future <Integer> productb = executorService.submit(task2);
		
		// add together results computed concurrently
		try {
			c[0][0] = producta.get() + productb.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	
		System.out.printf("%d ",c[0][0]);
		
		

		
		// MODIFY THE CODE BELOW FOR CONCURRENCY

		
		
//		perform matrix multiplication for c[0][1]
		
//		product1 = a[0][0] * b[0][1];
//		product2 = a[0][1] * b[1][1];
//		c[0][1] = product1 + product2;
//		System.out.printf("%d ",c[0][1]);
		
		int product3 = 0;
		int product4 = 0;
		Multiply task3 = new Multiply(a[0][0],b[0][1],product3);
		Multiply task4 = new Multiply(a[0][1],b[1][1],product4);
	

		Future <Integer> productc  = executorService.submit(task3);
		Future <Integer> productd = executorService.submit(task4);
		
		// add together results computed concurrently
		try {
			c[0][1] = productc.get() + productd.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	
		System.out.printf("%d ",c[0][1]);

		
		
//		perform matrix multiplication for c[1][0]
//				
//		product1 = a[1][0] * b[0][0];
//		product2 = a[1][1] * b[1][0];
//		c[1][0] = product1 + product2;
//		System.out.printf("%d ",c[1][0]);
		
		
		int product5 = 0;
		int product6 = 0;
		Multiply task5 = new Multiply(a[1][0],b[0][0],product5);
		Multiply task6 = new Multiply(a[1][1],b[1][0],product6);
	

		Future <Integer> producte  = executorService.submit(task5);
		Future <Integer> productf = executorService.submit(task6);
		
		// add together results computed concurrently
		try {
			c[1][0] = producte.get() + productf.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	
		System.out.printf("%d ",c[1][0]);

		
		
//		perform matrix multiplication for c[1][1]
//		
//		product1 = a[1][0] * b[0][1];
//		product2 = a[1][1] * b[1][1];
//		c[1][1] = product1 + product2;	
//		System.out.printf("%d \n",c[1][1]);
		
		int product7 = 0;
		int product8 = 0;
		Multiply task7 = new Multiply(a[1][0],b[0][1],product7);
		Multiply task8 = new Multiply(a[1][1],b[1][1],product8);
	

		Future <Integer> productg  = executorService.submit(task7);
		Future <Integer> producth = executorService.submit(task8);
		
		// add together results computed concurrently
		try {
			c[1][1] = productg.get() + producth.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	
		System.out.printf("%d ",c[1][1]);
		
		
	}
}
