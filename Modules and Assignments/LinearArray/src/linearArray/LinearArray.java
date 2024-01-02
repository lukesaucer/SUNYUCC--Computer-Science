package linearArray;

import java.util.Random;
import java.util.Arrays;

public class LinearArray {
	
	private int[] data; // array of values
	private static final Random generator = new Random();
	private int numSteps;
	
	public LinearArray(int size) {
		data = new int[size];
		
		for (int i=0; i<size; i++)
			data[i] = 10 + generator.nextInt(90);
		
		setNumSteps(0);
	}
	
	public int linearSearch(int searchKey) {
		for (int index = 0; index < data.length; index++)
			for (int index2 = 0; index2 < data.length; index2++)
			   if (data[index] == searchKey)
			      return index;
		return -1;
	}
	
	public void sort() {
		int smallest; // index of the smallest
		
		// first loop n times
		for (int i = 0; i < data.length; i++) {
			smallest = i;
			// 2nd loop n-1 times
			for (int index = i + 1; index < data.length; index ++) {
				setNumSteps(getNumSteps() + 1);
				if (data[index] < data[smallest])
				   smallest = index;
			}
			// smallest is the index of smallest value
			// swap smallest with index i
			swap(i, smallest);
			
		}
	}
	
	public void swap(int first, int second) {
		int temp = data[first];
		data[first] = data[second];
		data[second] = temp;
	}
	
	public String toString()
	{
		return Arrays.toString(data);
	}

	public int getNumSteps() {
		return numSteps;
	}

	public void setNumSteps(int numSteps) {
		this.numSteps = numSteps;
	}

}
