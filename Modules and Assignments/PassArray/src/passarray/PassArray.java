package passarray;

public class PassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};
		
		for (int value : array)
			System.out.printf("%d ", value);
		System.out.println();
		
		modifyArray(array); // pass by reference array is modified
		
		for (int value : array)
			System.out.printf("%d ", value);
		System.out.println();
		int x = 2;
		int y = 3;
		System.out.printf("x= %d%n", x);
		System.out.printf("y= %d%n", y);
		int result = sum(x,y); // pass by value x and y are not modified
		System.out.printf("sum= %d%n", result);
		System.out.printf("x= %d%n", x);
		System.out.printf("y= %d%n", y);
	}
	
	public static int sum(int x, int y) { // pass by value
		x++;
		y++;
		return x + y;
	}
	
	public static void modifyArray(int[] array2) { // pass by reference
		for (int counter=0; counter < array2.length; counter++) {
			array2[counter] *= 2;
		}
	}

}