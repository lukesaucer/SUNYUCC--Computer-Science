package dlist;

public class DListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DList dlist = new DList(); // create an empty DList
		dlist.addToTail(5);
		printList(dlist.head);
		dlist.addToTail(10);
		printList(dlist.head);
		DNode node = dlist.addToTail(15);
		printList(dlist.head);
		dlist.addToTail(20);
		dlist.addAfter(node, 12);
		printList(dlist.head);
		System.out.println();
		
		dlist.addToHead(7);
		printList(dlist.head);
		System.out.println();
		System.out.println();
		System.out.println();
		dlist.deleteNode(12);
		//printListBackwards(dlist.tail);
		printList(dlist.head);
	}
	
	public static void printList(DNode node) {
	// traverse list from head to tail
	for (DNode cursor = node;cursor!=null;cursor=cursor.getNext()) {
		System.out.printf("%d ", cursor.getData());
		}
	System.out.println();
	}
	
	public static void printListBackwards(DNode node) {
		// traverse list from tail to head
		for (DNode cursor = node;cursor!=null;cursor=cursor.getPrev()) {
			System.out.printf("%d ", cursor.getData());
			}
		System.out.println();
		}

}