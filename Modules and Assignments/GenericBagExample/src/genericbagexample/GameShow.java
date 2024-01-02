package genericbagexample;

/**
 * 
 * @author Lucas Saucer
 * @since 10/3/2021
 * @version 1.0
 * 
 * Program creates two bags, one for a dollar prize amount and one for contestants. It then uses the grab method to draw the names from
 * the bag and uses the remove method to remove the prize amount and the contestant from the bag after they have been drawn from the bag.
 */

public class GameShow {

	public static void main(String[] args) {
		
		ArrayBag<String> sbag = new ArrayBag<String>();
		ArrayBag<Integer> ibag = new ArrayBag<Integer>();
		
		sbag.add("Luke");
		sbag.add("Joe");
		sbag.add("John");
		sbag.add("Steve");
		sbag.add("Lou");
		
		ibag.add(100);
		ibag.add(10000);
		ibag.add(0);
		ibag.add(10);
		ibag.add(1);
		
		String name1 = (String) sbag.grab();
		Integer prize1 = (Integer) ibag.grab();
		sbag.remove(name1);
		ibag.remove(prize1);
		
		System.out.printf("%s has won %d%n", name1, prize1);
		
		String name2 = (String) sbag.grab();
		Integer prize2 = (Integer) ibag.grab();
		sbag.remove(name2);
		ibag.remove(prize2);
		
		System.out.printf("%s has won %d%n", name2, prize2);
		
		String name3 = (String) sbag.grab();
		Integer prize3 = (Integer) ibag.grab();
		sbag.remove(name3);
		ibag.remove(prize3);
		
		System.out.printf("%s has won %d%n", name3, prize3);
		
		String name4 = (String) sbag.grab();
		Integer prize4 = (Integer) ibag.grab();
		sbag.remove(name4);
		ibag.remove(prize4);
		
		System.out.printf("%s has won %d%n", name4, prize4);
		
		String name5 = (String) sbag.grab();
		Integer prize5 = (Integer) ibag.grab();
		sbag.remove(name5);
		ibag.remove(prize5);
		
		System.out.printf("%s has won %d%n", name5, prize5);
	}
	
}
