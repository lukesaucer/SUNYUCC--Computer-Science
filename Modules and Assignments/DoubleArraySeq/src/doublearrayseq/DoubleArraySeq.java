package doublearrayseq;

/**
 * @author Lucas Saucer
 * @since 09/19/2021
 * @version 1.0
 * 
 * I took a shot at the remove method for removing the current index. I tried two solutions that I was able to walkthrough online.
 * I ran into problems with the method though on having to pass two parameters in the test code example. I wasn't able to
 * figure out what parameter to pass as the array and leaving it null would cause the first condition within the IF STATEMENT to
 * execute.
 */

/******************************************************************************
* This class is a homework assignment;
* A DoubleArraySeq is a collection of double numbers.
* The sequence can have a special "current element," which is specified and 
* accessed through four methods that are not available in the sequence class 
* (start, getCurrent, advance and isCurrent).
*
* @note
*   (1) The capacity of one a sequence can change after it's created, but
*   the maximum capacity is limited by the amount of free memory on the 
*   machine. The constructor, addAfter, 
*   addBefore, clone, 
*   and concatenation will result in an
*   OutOfMemoryError when free memory is exhausted.
*   <p>
*   (2) A sequence's capacity cannot exceed the maximum integer 2,147,483,647
*   (Integer.MAX_VALUE). Any attempt to create a larger capacity
*   results in a failure due to an arithmetic overflow. 
*
* @note
*   This file contains only blank implementations ("stubs")
*   because this is a Programming Project for my students.
*
* @see
*   <A HREF="../../../../edu/colorado/collections/DoubleArraySeq.java">
*   Java Source Code for this class
*   (www.cs.colorado.edu/~main/edu/colorado/collections/DoubleArraySeq.java)
*   </A>
*
* @version
*   March 5, 2002
******************************************************************************/
public class DoubleArraySeq implements Cloneable
{
   // Invariant of the DoubleArraySeq class:
   //   1. The number of elements in the sequences is in the instance variable 
   //      manyItems.
   //   2. For an empty sequence (with no elements), we do not care what is 
   //      stored in any of data; for a non-empty sequence, the elements of the
   //      sequence are stored in data[0] through data[manyItems-1], and we
   //      don�t care what�s in the rest of data.
   //   3. If there is a current element, then it lies in data[currentIndex];
   //      if there is no current element, then currentIndex equals manyItems. 
   private double[] data;
   private int manyItems;
   private double currentIndex;
   
   /**
   * Initialize an empty sequence with an initial capacity of 10.  Note that
   * the addAfter and addBefore methods work
   * efficiently (without needing more memory) until this capacity is reached.
   * @param - none
   * @postcondition
   *   This sequence is empty and has an initial capacity of 10.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for: 
   *   new double[10].
   **/   
   public DoubleArraySeq( )
   {
	   try {
	   
	   final int INITIAL_CAPACITY = 10;
	   double manyItems = 1;
	   double[] data = new double[INITIAL_CAPACITY];
	   double currentIndex = -1;
	   }
	   catch (OutOfMemoryError e) {
		   System.out.print("You must call the ensureCapacity() method in order to create sufficient memory for the array");
	   }
     
   }


   /**
   * Initialize an empty sequence with a specified initial capacity. Note that
   * the addAfter and addBefore methods work
   * efficiently (without needing more memory) until this capacity is reached.
   * @param initialCapacity
   *   the initial capacity of this sequence
   * @precondition
   *   initialCapacity is non-negative.
   * @postcondition
   *   This sequence is empty and has the given initial capacity.
   * @exception IllegalArgumentException
   *   Indicates that initialCapacity is negative.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for: 
   *   new double[initialCapacity].
   **/   
   public DoubleArraySeq(int initialCapacity)
   {
	   try {
	   if (initialCapacity < 0)
		   throw new IllegalArgumentException
		   ("The initialCapacity is negative: " + initialCapacity);
	   data = new double[initialCapacity];
	   manyItems = 0;
	   currentIndex = -1;
	   }  catch (OutOfMemoryError e) {
		   System.out.print("You must call the ensureCapacity() method in order to create sufficient memory for the array");
	   } catch (IllegalArgumentException e) {
		   System.out.print("The array's initial capacity can not be less than zero.");
	   }
   }
        
 
   /**
   * Add a new element to this sequence, after the current element. 
   * If the new element would take this sequence beyond its current capacity,
   * then the capacity is increased before adding the new element.
   * @param element
   *   the new element that is being added
   * @postcondition
   *   A new copy of the element has been added to this sequence. If there was
   *   a current element, then the new element is placed after the current
   *   element. If there was no current element, then the new element is placed
   *   at the end of the sequence. In all cases, the new element becomes the
   *   new current element of this sequence. 
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for increasing the sequence's capacity.
   * @note
   *   An attempt to increase the capacity beyond
   *   Integer.MAX_VALUE will cause the sequence to fail with an
   *   arithmetic overflow.
   **/
   public void addAfter(double element)
   {
	   try {
	  // Scenario 1 - currentIndex is last item
      if (currentIndex == manyItems - 1)
      {
    	  ensureCapacity((manyItems+1)*2);
          data[(int) (currentIndex + 1)] = element;
          manyItems++;
          currentIndex++;
      }
      
      
      // Scenario 2 - Sequence is empty
      
      else if (manyItems == 0)
      {
    	  data[0] = element;
    	  manyItems++; 
    	  currentIndex = 0;
    	  currentIndex++;
    
      } 
      // Scenario 3 - currentIndex is the first item
      else if (currentIndex == 0) {
    	  
    	  
    	  data[manyItems] = element;
    	  manyItems++;
    	  currentIndex++;
      }
      
      else {
    	  data[manyItems] = element;
          manyItems++;
          currentIndex = manyItems - 1;
         
      }
      
   
   }  catch (OutOfMemoryError e) {
	   System.out.print("You must call the ensureCapacity() method in order to create sufficient memory for the array");
   }
}

   /**
   * Add a new element to this sequence, before the current element. 
   * If the new element would take this sequence beyond its current capacity,
   * then the capacity is increased before adding the new element.
   * @param element
   *   the new element that is being added
   * @postcondition
   *   A new copy of the element has been added to this sequence. If there was
   *   a current element, then the new element is placed before the current
   *   element. If there was no current element, then the new element is placed
   *   at the start of the sequence. In all cases, the new element becomes the
   *   new current element of this sequence. 
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for increasing the sequence's capacity.
   * @note
   *   An attempt to increase the capacity beyond
   *   Integer.MAX_VALUE will cause the sequence to fail with an
   *   arithmetic overflow.
   **/
   public void addBefore(double element)
   {
	  try {
	  // Scenario 1 - currentIndex is last item
      if (currentIndex == manyItems - 1)
      {
    	  ensureCapacity((manyItems+1)*2);
          data[(int) (currentIndex - 1)] = element;
          manyItems++;
      }
      
      
      // Scenario 2 - Sequence is empty
      
      if (manyItems == 0)
      {
    	  data[0] = element;
    	  manyItems++; 
    	  currentIndex = 0; 
      }
      
      else {
    	  data[(int) (currentIndex - 1)] = element;
          manyItems++;
      }
 }
      catch (OutOfMemoryError e) {
		   System.out.print("You must call the ensureCapacity() method in order to create sufficient memory for the array");
	   }
      
   }
   
   
   /**
   * Place the contents of another sequence at the end of this sequence.
   * @param addend
   *   a sequence whose contents will be placed at the end of this sequence
   * @precondition
   *   The parameter, addend, is not null. 
   * @postcondition
   *   The elements from addend have been placed at the end of 
   *   this sequence. The current element of this sequence remains where it 
   *   was, and the addend is also unchanged.
   * @exception NullPointerException
   *   Indicates that addend is null. 
   * @exception OutOfMemoryError
   *   Indicates insufficient memory to increase the size of this sequence.
   * @note
   *   An attempt to increase the capacity beyond
   *   Integer.MAX_VALUE will cause an arithmetic overflow
   *   that will cause the sequence to fail.
   **/
   public void addAll(DoubleArraySeq addend)
   {
	  try {
      ensureCapacity(manyItems + addend.manyItems);
      
      System.arraycopy(addend.data, 0, data, manyItems, addend.manyItems);
      manyItems += addend.manyItems;
	  }  catch (OutOfMemoryError e) {
		   System.out.print("You must call the ensureCapacity() method in order to create sufficient memory for the array");
	  }	 catch (NullPointerException e) {
		  System.out.print("The sequence to be added is empty.");
		  
	  }
	  
   }
   
   
   /**
   * Move forward, so that the current element is now the next element in
   * this sequence.
   * @param - none
   * @precondition
   *   isCurrent() returns true. 
   * @postcondition
   *   If the current element was already the end element of this sequence 
   *   (with nothing after it), then there is no longer any current element. 
   *   Otherwise, the new element is the element immediately after the 
   *   original current element.
   * @exception IllegalStateException
   *   Indicates that there is no current element, so 
   *   advance may not be called.
   **/
   public void advance( )
   {
	   try {
	   if (currentIndex < manyItems - 1)
		   currentIndex++;
	   else {
		   ensureCapacity((manyItems+1)*2);
		   currentIndex++;   
	   		} 
	   } catch (IllegalStateException e) {
		   System.out.print("There is no current element in the array to be advanced");
	   }
	 
  }
   
   /**
   * Generate a copy of this sequence.
   * @param - none
   * @return
   *   The return value is a copy of this sequence. Subsequent changes to the
   *   copy will not affect the original, nor vice versa.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for creating the clone.
   **/ 
   public DoubleArraySeq clone( )
   {  // Clone a DoubleArraySeq object.
      DoubleArraySeq answer;
      
      try
      {
         answer = (DoubleArraySeq) super.clone( );
      } 
      
      catch (CloneNotSupportedException e)
      {  // This exception should not occur. But if it does, it would probably
         // indicate a programming error that made super.clone unavailable.
         // The most common error would be forgetting the "Implements Cloneable"
         // clause at the start of this class.
         throw new RuntimeException
         ("This class does not implement Cloneable");
      }
      
      answer.data = data.clone( );
      
      return answer;
      
   }
   
   

   /**
   * Create a new sequence that contains all the elements from one sequence
   * followed by another.
   * @param s1
   *   the first of two sequences
   * @param s2
   *   the second of two sequences
   * @precondition
   *   Neither s1 nor s2 is null.
   * @return
   *   a new sequence that has the elements of s1 followed by the
   *   elements of s2 (with no current element)
   * @exception NullPointerException.
   *   Indicates that one of the arguments is null.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for the new sequence.
   * @note
   *   An attempt to create a sequence with a capacity beyond
   *   Integer.MAX_VALUE will cause an arithmetic overflow
   *   that will cause the sequence to fail.
   **/   
   public static DoubleArraySeq catenation(DoubleArraySeq s1, DoubleArraySeq s2)
   {
	   	  
		   if (s1 == null || s2 == null) {
			   throw (new NullPointerException());
		   } else {
		   
		 
			 
	   // If either s1 or s2 is null, then a NullPointerException is thrown. 
	   // In the case that the total number of items is beyond
	   // Integer.MAX_VALUE, there will be an arithmetic overflow and
	   // the bag will fail.   
	   DoubleArraySeq answer = new DoubleArraySeq(s1.getCapacity( ) + s2.getCapacity( ));
	 
	   try {
	   System.arraycopy(s1.data, 0, answer.data, 0, s1.manyItems);
	   System.arraycopy(s2.data, 0, answer.data, s1.manyItems, s2.manyItems);
	   answer.manyItems = s1.manyItems + s2.manyItems;
	   } catch (OutOfMemoryError e) {
		   System.out.print("You must call the ensureCapacity() method in order to create sufficient memory for the array");
	   }
	 
	   return answer; 
	   }
   }
   



   /**
   * Change the current capacity of this sequence.
   * @param minimumCapacity
   *   the new capacity for this sequence
   * @postcondition
   *   This sequence's capacity has been changed to at least minimumCapacity.
   *   If the capacity was already at or greater than minimumCapacity,
   *   then the capacity is left unchanged.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for: new int[minimumCapacity].
   **/
   public void ensureCapacity(int minimumCapacity)
   {
      double[] biggerArray;
      try {
    	 
      
      if (data.length < minimumCapacity)
      {
    	  biggerArray = new double[minimumCapacity];
    	  System.arraycopy(data, 0, biggerArray, 0, manyItems);
    	  data = biggerArray;
      } 
      } catch (OutOfMemoryError e) {
		   System.out.print("You must call the ensureCapacity() method in order to create sufficient memory for the array");
	  }
   }
  
   
   /**
   * Accessor method to get the current capacity of this sequence. 
   * The add method works efficiently (without needing
   * more memory) until this capacity is reached.
   * @param - none
   * @return
   *   the current capacity of this sequence
   **/
   public int getCapacity( )
   {
      return data.length;
   }


   /**
   * Accessor method to get the current element of this sequence. 
   * @param - none
   * @precondition
   *   isCurrent() returns true.
   * @return
   *   the current element of this sequence
   * @exception IllegalStateException
   *   Indicates that there is no current element, so 
   *   getCurrent may not be called.
   **/
   public double getCurrent( )
   {
	   
	   double value = 0;

	   if (isCurrent()) {
		   value = data[(int) currentIndex];
		   return value;
	   }
	   else {
		throw (new IllegalStateException()); 
	   }
	   
   }


   /**
   * Accessor method to determine whether this sequence has a specified 
   * current element that can be retrieved with the 
   * getCurrent method. 
   * @param - none
   * @return
   *   true (there is a current element) or false (there is no current element at the moment)
   **/
   
   public boolean isCurrent( )
   {
	   if (currentIndex == -1) { 
	   return false;
	   }
	   else {
		   return true;
	   }
   }
      
   /**
   * Remove the current element from this sequence.
   * @param - none
 * @return 
   * @precondition
   *   isCurrent() returns true.
   * @postcondition
   *   The current element has been removed from this sequence, and the 
   *   following element (if there is one) is now the new current element. 
   *   If there was no following element, then there is now no current 
   *   element.
   * @exception IllegalStateException
   *   Indicates that there is no current element, so 
   *   removeCurrent may not be called. 
   **/
   public double[] removeCurrent(double [] data, double currentIndex)
//   {
//	try {	   
//		if (data == null || manyItems == 0 || currentIndex == -1) {
//		return data;
//		
//	} else {
//	
//			double[] copyArray = new double[data.length - 1];
//			
//			System.arraycopy(data, 0, copyArray, 0, (int) currentIndex);
//			System.arraycopy(data, (int) currentIndex + 1, copyArray, (int) currentIndex, (int) ((int) data.length - currentIndex - 1));
//			
//			data = copyArray;
//		}
//		
//		} catch (IllegalStateException e) {
//			System.out.print("There is no current element in the array.");
//		}
//	
//		return data;
//   }
//   
   {
	   try {
	   if (data == null || currentIndex < 0 || currentIndex >= data.length) {
		   return data;
	   } else {
	   
	   double[] copyArray = new double[data.length -1];
	   for (int i = 0, k = 0; i < data.length; i++) {
		   if (i == currentIndex) {
			   continue;
		   }
		   copyArray[k++] = data[i];
		   data = copyArray;
	   }
	 }
	   
   } catch (IllegalStateException e) {
	   System.out.print("There is no current element in the array.");
   }
	   return data;
 }
   
   /**
   * Determine the number of elements in this sequence.
   * @param - none
   * @return
   *   the number of elements in this sequence
   **/ 
   public int size( )
   {
      return manyItems;
   }
   
   
   /**
   * Set the current element at the front of this sequence.
   * @param - none
   * @postcondition
   *   The front element of this sequence is now the current element (but 
   *   if this sequence has no elements at all, then there is no current 
   *   element).
   **/ 
   public void start( )
   {
	  if (manyItems > 0);
      	currentIndex = 0;
   }
   
   
   /**
   * Reduce the current capacity of this sequence to its actual size (i.e., the
   * number of elements it contains).
   * @param - none
   * @postcondition
   *   This sequence's capacity has been changed to its current size.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for altering the capacity. 
   **/
   public void trimToSize( )
   {
      double[ ] trimmedArray;
      
      if (data.length != manyItems)
      {
         trimmedArray = new double[manyItems];
         System.arraycopy(data, 0, trimmedArray, 0, manyItems);
         data = trimmedArray;
      }  else {
  		throw (new OutOfMemoryError()); 
  		
	   }
   }
   
   public String toString() {
	   String result ="";
	   for (int i = 0; i < manyItems; i++)
		   result = result + data[i] + ", ";
			   return result;
   }
   
}
           