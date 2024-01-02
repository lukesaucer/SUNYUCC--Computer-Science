package genericlinkedlist;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<String> head;
		Node<String> middle;
		Node<String> tail;
		
		tail = new Node<String>("Larry", null);
		middle = new Node<String>("Curly", tail);
		head = new Node<String>("Moe", middle);
		
		Node<String> cursor = head;
		while(cursor != null) {
			System.out.println(cursor);
			cursor = cursor.getLink();
		}

	}
}
