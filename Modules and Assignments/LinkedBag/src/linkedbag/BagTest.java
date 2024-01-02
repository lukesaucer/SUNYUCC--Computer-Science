package linkedbag;

public class BagTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntLinkedBag bag = new IntLinkedBag();
		bag.add(5);
		bag.add(10);
		bag.add(15);
		int item = bag.grab();
		System.out.printf("Item is: %d%n", item);
		bag.remove(15);
	}
 
}
