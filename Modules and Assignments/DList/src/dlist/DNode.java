package dlist;

// Doubly Linked List Example

public class DNode {
	private int data;
	DNode prev; // points to the previous node in the DList
	DNode next; // points to the next node in the DList
	
	DNode(int d) { data = d; } 
	
	public DNode(int data, DNode prev, DNode next) {
		this.setData(data);
		this.prev = prev;
		this.next = next;
	}

	
	public DNode getPrev() {
		return this.prev;
	}
	
	public void setPrev(DNode prev) {
		this.prev = prev;
	}
	
	public void setNext(DNode next) {
		this.next = next;
	}
	
	public DNode getNext() {
		return this.next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}