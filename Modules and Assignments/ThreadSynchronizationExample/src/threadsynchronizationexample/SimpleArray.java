package threadsynchronizationexample;

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray {

	private static final SecureRandom generator = new SecureRandom();
	private int[] array;
	private int writeIndex = 0; // shared index
	
	public SimpleArray(int size) {
		array = new int[size];
	}
			
	public synchronized void add(int value) {
		int position = writeIndex;
		
		try {
			Thread.sleep(generator.nextInt(500));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		array[position] = value;
		
		System.out.printf("%s wrote %2d to element %d%n",
				Thread.currentThread().getName(), value, position);
		++writeIndex; 
		System.out.printf("Next write index: %d%n", writeIndex);
		
	}
	
	public String toString() {
		return Arrays.toString(array);
	}
	
}
