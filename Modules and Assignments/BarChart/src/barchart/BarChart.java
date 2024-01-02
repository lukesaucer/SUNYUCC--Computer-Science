package barchart;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array of total grades in each range
		int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
		
		System.out.println("Grade Disribution");
		
		// for each grade total in the array
		for (int counter = 0; counter < array.length; counter++) {
			if (counter == 10) // range is 100
			   System.out.printf("%5d: ", 100);
			else
			   System.out.printf("%02d-%02d: ",counter *10, counter * 10 + 9);
			// print out the # of stars for this total
			for (int stars = 0; stars < array[counter]; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}