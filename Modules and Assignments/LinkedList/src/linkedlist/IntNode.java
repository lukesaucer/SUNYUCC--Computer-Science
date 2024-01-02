package linkedlist;

public class IntNode {

	private int data;
	private IntNode link;
	
	
	// Constructor
	public IntNode(int data, IntNode link) {
		this.data = data;
		this.link = link;
	}
	
	public void addNodeAfter(int element) {
		link = new IntNode(element, link);
	}
	
	public void removeNodeAfter()   
	{
	  link = link.link;
	}
	// Getters and Setters
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public IntNode getLink() {
		return link;
	}
	public void setLink(IntNode link) {
		this.link = link;
	}

//	public void removeNode(int position) {
//		IntNode cursor = link;
//		IntNode precursor = null;
//		while (cursor != null) {
//			if (cursor.getData() == position)
//				if (precursor == null)
//					removeNode(position);
//			else
//			precursor.removeNode(position);
//			precursor = cursor;
//			cursor = cursor.getLink();
//		}
//	}
	
	
}
