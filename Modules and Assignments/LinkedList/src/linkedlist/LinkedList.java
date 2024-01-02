/**
 * @author Lucas Saucer - Assignment #6
 * @since 09/23/2021
 * @version 1.0
 * 
 * I have had a hard time on trying to do the removeNodeBefore() method. I currently have a removeNode() method that removes a selected node as well as a deleteNode() method, that deletes a node
 * based on the value it contains. I attempted to try and figure out how to remove the node before by trying to delete the precursor to the current position but was unable to get it to work. It is
 * commented out in the code below. If you have any idea please let me know. Maybe I should try iterating through the list with a loop?
 */


package linkedlist;

public class LinkedList {
	private IntNode head;
	private IntNode tail;
	
	
	// Constructor - Creates a blank list
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	
	// Getters and Setters
	public IntNode getHead() {
		return head;
	}
	public void setHead(IntNode head) {
		this.head = head;
	}
	public IntNode getTail() {
		return tail;
	}
	public void setTail(IntNode tail) {
		this.tail = tail;
	}
	

	// Adds a node to the front of the list
	public IntNode addFirst(int element) {
		IntNode node = new IntNode(element, head);
		if (head == null)
			this.tail = node;
		this.head = node;
		return node;
	}
	
	// Add a new node containing element before the current node.
	public void addBefore(int value, int element) {
			IntNode cursor = head;
			IntNode precursor = null;
			while (cursor != null) {
				if (cursor.getData() == value)
					if (precursor == null)
						addFirst(element);
				else
					precursor.addNodeAfter(element);
				precursor = cursor;
				cursor = cursor.getLink();
			}
		}
	
	public void deleteNode(int key)
    {
        // Store head node
        IntNode temporaryHead = head;
        IntNode	previousHead = null;
 
        // If head node itself holds the key to be deleted
        if (temporaryHead != null && temporaryHead.getData() == key) {
            head = temporaryHead.getLink(); // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temporaryHead != null && temporaryHead.getData() != key) {
        	previousHead = temporaryHead;
            temporaryHead = temporaryHead.getLink();
        }
 
        // If key was not present in linked list
        if (temporaryHead == null)
            return;
 
        // Unlink the node from linked list
        previousHead.setLink(temporaryHead.getLink());
       
    }
 
	public void removeNode(int position)
	    {
	        // If linked list is empty
	        if (head == null)
	            return;
	 
	        // Store head node
	        IntNode temporaryHead = head;
	 
	        // If head needs to be removed
	        if (position == 0)
	        {
	            head = temporaryHead.getLink();   // Change head
	            return;
	        }
	 
	        // Find previous node of the node to be deleted
	        for (int i = 0; temporaryHead != null && i < position - 1; i++)
	            temporaryHead = temporaryHead.getLink();
	 
	        // If position is more than number of nodes
	        if (temporaryHead == null || temporaryHead.getLink() == null)
	            return;
	 
	        // Node next is the node to be deleted
	        // Store pointer to the next of node to be deleted
	
	        IntNode next = temporaryHead.getLink();
	       
	        temporaryHead.setLink(next.getLink());
}
	
//		public void removeNodeBefore(IntNode position) {
//			IntNode cursor = head;
//			IntNode precursor = null;
//			while (cursor != null) {
//				if (cursor == position)
//					if (precursor == null)
//						removeNode(position);
//					else if (precursor != null)
//						removeNodeBefore(precursor); // precursor.removeNode(position); 
//				precursor = cursor;
//				cursor = cursor.getLink();
//			}
//		}
		 
	 
	public void removeHead() {
		if (head != null)
		head = head.getLink();
	}
	
	
	public String toString() {
		String result = "";
		IntNode cursor = head;
		while (cursor!=null) {
			if (result.equals(""))
			result = result + cursor.getData();
		else
			result = result + "-->" + cursor.getData();
			cursor = cursor.getLink();
		}
		return result;
	}
	
}
