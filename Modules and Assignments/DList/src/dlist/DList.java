package dlist;

/**
 * @author Lucas Saucer
 * @since 9/28/2021
 * @version 1.0
 * 
 * This program creates a doubly linked list (DLL) and creates methods for adding nodes to the head, tail and at a specified point within the DLL.
 * This program also contains methods for finding nodes and deleting nodes from the DLL.
 */


public class DList {
	DNode head;
	DNode tail;
	int size; // how many nodes in the list
	
	public DList() {
		head = null;
		tail = null;
		size = 0;
	}
/**
 * {@link addAfter()} - Method used to add a node after a specified node.
 * @param node - Specified node to add new node after.
 * @param data - Date for the new node to contain.
 */
	/* Add a new node after the specified node */
	public void addAfter(DNode node, int data) {
		DNode newNode = new DNode(data,node,node.getNext());
		//newNode.setNext(node.getNext());
		//newNode.setPrev(node);
		node.getNext().setPrev(newNode);
		node.setNext(newNode);
	}
	
	/**
	 * {@link addTail()} - Adds a new node to the tail of the DList.
	 * @param data - Contains the data to be added to the new node.
	 * @return - Returns the new node.
	 * 
	 */
	
	public DNode addToTail(int data) {
		/* case 1: List is empty */
		if (head==null) {
			DNode node = new DNode(data,null,null);
			head = node;
			tail = node;
			size++;
			return node;
		}
		else // list is not empty
		{
			DNode node = new DNode(data,tail,null);
			DNode previousNode = tail;
			previousNode.setNext(node);
			tail = node;
			return node;
		}
	}

	
/**
 * {@link addToHead()} - Method to add a new node as the head of the DLL.
 * @param data - Data that the new node will contain.
 * @return - Returns the new node as the new head of the DLL.
 */
	
	
	public DNode addToHead(int data) {
		/* case 1: List is empty */
		if (head==null) {
			DNode node = new DNode(data,null,null);
			head = node;
			tail = node;
			size++;
			return node;
		}
		else // list is not empty
		{
			DNode node = new DNode(data,null,head);
			DNode nextNode = tail;
			nextNode.setPrev(node);
			head = node;
			return node;
		}
	}
	
	/**
	 * {@link findNode()} - Finds a specified node within the DLL.
	 * @param prev - the previous Node within the DLL.
	 * @param d - data that the specified node contains.
	 * @return current - the current selected node within the DLL.
	 */
	
	public DNode findNode(DNode prev, int d) {
	    DNode current = prev; // current is the cursor
	    while (current != null && current.getData() != d) // while is not what I'm
	                                                      // looking for
	        current = current.getNext();
	    return current;
	}
	
	/**
	 * {@link deleteNode()} - Deletes a node containing the specified data within the DLL.
	 * @param d - data that the Node to be deleted contains.
	 * @return - the new head of the DLL.
	 */
	
	public DNode deleteNode(int d) {

	    DNode current = findNode(head, d); // This finds Node

	    // a node with data d doesn't exist
	    if (current == null) {
	        return null;
	    }

	    // get the next and previous node
	    DNode previous = current.prev;
	    DNode next = current.next;

	    // current node is head
	    if (previous == null) {
	        this.head = current.next;
	        this.head.prev = null;
	    }

	    // current node is tail
	    if (next == null) {
	        this.tail = current.prev;
	        this.tail.next = null;
	    }

	    if (previous != null || next != null) {
	        DNode temp = current.prev;
	        temp.next = current.next;
	        temp = current.next;
	        temp.prev = current.prev;
	    }

	    return current;
	}
}

