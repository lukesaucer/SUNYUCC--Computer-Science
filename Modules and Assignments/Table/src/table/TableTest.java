package table;

public class TableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table table = new Table(500);
		
		table.put("John", "111-222-3333");
		table.put("Joe", "111-222-3333");
		
		String ssNum = (String) table.get("John");
		System.out.printf("John's SSNum: %s%n",  ssNum);
	}

}
