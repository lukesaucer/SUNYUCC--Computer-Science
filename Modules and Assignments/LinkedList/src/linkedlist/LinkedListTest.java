package linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an empty linked list
		// with head and tail set to null
		
		LinkedList list = new LinkedList();
		IntNode node1 = list.addFirst(5);
		System.out.println(list);
		IntNode node2 = list.addFirst(10);
		System.out.println(list);
		IntNode node3 = list.addFirst(15);
		System.out.println(list);
		node3.addNodeAfter(42);
		System.out.println(list);
		list.deleteNode(42);
		System.out.println(list);
		list.removeNode(1);
		System.out.println(list);		
		list.removeHead();
		System.out.println(list);
	}

}
