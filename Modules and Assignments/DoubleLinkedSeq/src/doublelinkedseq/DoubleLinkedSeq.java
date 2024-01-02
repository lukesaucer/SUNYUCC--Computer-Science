package doublelinkedseq;

import java.util.ArrayList;

/**
 * @author - Lucas Saucer
 * @since - 10/01/2021
 * @version - 1.0
 * 
 */

/******************************************************************************
* This class is a homework assignment;
* A <CODE>DoubleLinkedSeq</CODE> is a collection of <CODE>double</CODE> numbers.
* The sequence can have a special "current element," which is specified and 
* accessed through four methods that are not available in the sequence class 
* (start, getCurrent, advance and isCurrent).
*
* <b>Limitations:</b>
*   Beyond <CODE>Int.MAX_VALUE</CODE> elements, the <CODE>size</CODE> method
*   does not work.
*
* <b>Note:</b>
*   This file contains only blank implementations ("stubs")
*   because this is a Programming Project for my students.
*
* @version Feb 10, 2016
******************************************************************************/
public class DoubleLinkedSeq implements Cloneable
{
	private DoubleNode head;
	private DoubleNode tail;
	private DoubleNode cursor;
	private DoubleNode precursor;
	private int manyNodes; 
	private DoubleNode current;


/**
* Initialize an empty sequence.
* <b>Postcondition:</b>
*   This sequence is empty.
**/   
public DoubleLinkedSeq( )
{
   head = null;
   tail = null;
   cursor = null;
   manyNodes = 0;
}
 

/**
* Add a new element to this sequence, after the current element. 
* @param element
*   the new element that is being added
* <b>Postcondition:</b>
*   A new copy of the element has been added to this sequence. If there was
*   a current element, then the new element is placed after the current
*   element. If there was no current element, then the new element is placed
*   at the end of the sequence. In all cases, the new element becomes the
*   new current element of this sequence. 
* @exception OutOfMemoryError
*   Indicates insufficient memory for a new node.
**/
public void addAfter(double element)
{
   // Scenario 1 - No current element
	if (cursor == null) {
		head = new DoubleNode(element, head);
		cursor = head;
		tail = head;
		
	} else /* list is not empty */
		{
			DoubleNode node = new DoubleNode(element, cursor.getLink());
			cursor = node;
			cursor.setLink(node);
			if(cursor.getLink() == null)
				tail = cursor;
		}
	manyNodes++;
}	


/**
* Add a new element to this sequence, before the current element. 
* @param element
*   the new element that is being added
* <b>Postcondition:</b>
*   A new copy of the element has been added to this sequence. If there was
*   a current element, then the new element is placed before the current
*   element. If there was no current element, then the new element is placed
*   at the start of the sequence. In all cases, the new element becomes the
*   new current element of this sequence. 
* @exception OutOfMemoryError
*   Indicates insufficient memory for a new node.
**/

public DoubleNode addFirst(double element) {
	DoubleNode node = new DoubleNode(element, head);
	if (head == null)
		this.tail = node;
	this.head = node;
	return node;
}

public void addBefore(double element)
{
	DoubleNode cursor = head;
	DoubleNode precursor = null;
	while (cursor != null) {
		if (cursor.getData() == element)
			if (precursor == null)
				addFirst(element);
		else
			precursor.addNodeAfter(element);
		precursor = cursor;
		cursor = cursor.getLink();
	}
	
}


/**
* Place the contents of another sequence at the end of this sequence.
* @param addend
*   a sequence whose contents will be placed at the end of this sequence
* <b>Precondition:</b>
*   The parameter, <CODE>addend</CODE>, is not null. 
* <b>Postcondition:</b>
*   The elements from <CODE>addend</CODE> have been placed at the end of 
*   this sequence. The current element of this sequence remains where it 
*   was, and the <CODE>addend</CODE> is also unchanged.
* @exception NullPointerException
*   Indicates that <CODE>addend</CODE> is null. 
* @exception OutOfMemoryError
*   Indicates insufficient memory to increase the size of this sequence.
**/
public void addAll(DoubleLinkedSeq addend)
{
  DoubleNode[ ] copyInfo;
      
      // The precondition indicates that addend is not null. If it is null,
      // then a NullPointerException is thrown here.
      if (addend.manyNodes > 0)
      {
         copyInfo = DoubleNode.listCopyWithTail(addend.head);
         copyInfo[1].setLink(head); // Link the tail of copy to my own head... 
         head = copyInfo[0];        // and set my own head to the head of the copy.
         manyNodes += addend.manyNodes;
      }
}   


/**
* Move forward, so that the current element is now the next element in
* this sequence.
* <b>Precondition:</b>
*   <CODE>isCurrent()</CODE> returns true. 
* <b>Postcondition:</b>
*   If the current element was already the end element of this sequence 
*   (with nothing after it), then there is no longer any current element. 
*   Otherwise, the new element is the element immediately after the 
*   original current element.
* @exception IllegalStateException
*   Indicates that there is no current element, so 
*   <CODE>advance</CODE> may not be called.
**/
public void advance( )
{
	if (cursor != null) {
		precursor = cursor;
		cursor = cursor.getLink();
	}
		
}


/**
* Generate a copy of this sequence.
* @return
*   The return value is a copy of this sequence. Subsequent changes to the
*   copy will not affect the original, nor vice versa. Note that the return
*   value must be type cast to a <CODE>DoubleLinkedSeq</CODE> before it can be used.
* @exception OutOfMemoryError
*   Indicates insufficient memory for creating the clone.
**/ 
public Object clone( )
{   
	DoubleLinkedSeq answer;

try
{
   answer = (DoubleLinkedSeq) super.clone( );
}
catch (CloneNotSupportedException e)
{  // This exception should not occur. But if it does, it would probably
   // indicate a programming error that made super.clone unavailable.
   // The most common error would be forgetting the "Implements Cloneable"
   // clause at the start of this class.
   throw new RuntimeException
   ("This class does not implement Cloneable");
}

return answer;
}


/**
* Create a new sequence that contains all the elements from one sequence
* followed by another.
* @param s1
*   the first of two sequences
* @param s2
*   the second of two sequences
* <b>Precondition:</b>
*   Neither s1 nor s2 is null.
* @return
*   a new sequence that has the elements of <CODE>s1</CODE> followed by the
*   elements of <CODE>s2</CODE> (with no current element)
* @exception NullPointerException
*   Indicates that one of the arguments is null.
* @exception OutOfMemoryError
*   Indicates insufficient memory for the new sequence.
**/   



//public static DoubleLinkedSeq catenation(DoubleLinkedSeq s1, DoubleLinkedSeq s2)
//{
//	if (s1 == null)
//		return s2;
//	else if (s2 == null)
//		return s1;
//	else {
//	    ArrayList catenation = new ArrayList();
//	    
//	    for (List<T> l: lists) {
//	        result.addAll(l);
//	    }
//	 
//	    return result;
//	}
//	
//}


/**
* Accessor method to get the current element of this sequence. 
* <b>Precondition:</b>
*   <CODE>isCurrent()</CODE> returns true.
* @return
*   the current capacity of this sequence
* @exception IllegalStateException
*   Indicates that there is no current element, so 
*   <CODE>getCurrent</CODE> may not be called.
**/
public double getCurrent( )
{
	if(cursor != null)
		return cursor.getData();
	else
		throw(new IllegalStateException());
}


/**
* Accessor method to determine whether this sequence has a specified 
* current element that can be retrieved with the 
* <CODE>getCurrent</CODE> method. 
* @return
*   true (there is a current element) or false (there is no current element at the moment)
**/
public double isCurrent( )
{
   // Student will replace this return statement with their own code:
   return 0;
}
           
/**
* Remove the current element from this sequence.
* <b>Precondition:</b>
*   <CODE>isCurrent()</CODE> returns true.
* <b>Postcondition:</b>
*   The current element has been removed from this sequence, and the 
*   following element (if there is one) is now the new current element. 
*   If there was no following element, then there is now no current 
*   element.
* @exception IllegalStateException
*   Indicates that there is no current element, so 
*   <CODE>removeCurrent</CODE> may not be called. 
**/
public void removeCurrent(double current)
{
	// Store head node
    DoubleNode temporaryHead = head;
    DoubleNode	previousHead = null;


    // If head node itself holds the key to be deleted
    if (temporaryHead != null && temporaryHead.getData() == current) {
        head = temporaryHead.getLink(); // Changed head
        return;
    }

    // Search for the key to be deleted, keep track of
    // the previous node as we need to change temp.next
    while (temporaryHead != null && temporaryHead.getData() != current) {
    	previousHead = temporaryHead;
        temporaryHead = temporaryHead.getLink();
    }

    // If key was not present in linked list
    if (temporaryHead == null)
        return;

    // Unlink the node from linked list
    previousHead.setLink(temporaryHead.getLink());
}

              

/**
* Determine the number of elements in this sequence.
* @return
*   the number of elements in this sequence
**/ 
public int size( )
{
 
   return manyNodes;
}


/**
* Set the current element at the front of this sequence.
* <b>Postcondition:</b>
*   The front element of this sequence is now the current element (but 
*   if this sequence has no elements at all, then there is no current 
*   element).
**/ 
public void start( )
{
	if (head != null)
	cursor = head;
}

}