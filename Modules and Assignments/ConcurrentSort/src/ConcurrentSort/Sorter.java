package ConcurrentSort;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class Sorter extends RecursiveAction
{
   double[] data;
   int loIndex, hiIndex;
   int manyThreads;

   public Sorter(double[] data, int loIndex, int hiIndex)
   {
      // Check that the indices are valid:
      if (0 > loIndex || loIndex > hiIndex || hiIndex > data.length)
         throw new ArrayIndexOutOfBoundsException("Illegal indices");

      // Copy the parameters to the instance variables:
       this.data = data;
       this.loIndex = loIndex;
       this.hiIndex = hiIndex;
   }

   public void compute( )
   {
      int midIndex;

      if (hiIndex - loIndex > 20000)
      {
	 midIndex = (loIndex + hiIndex)/2;
         invokeAll(
		   new Sorter(data, loIndex, midIndex),
		   new Sorter(data, midIndex, hiIndex)
	 );
         merge(data, loIndex, midIndex, hiIndex);           
      }
      else
      {
         Arrays.sort(data, loIndex, hiIndex);
      }
   }

   private static void merge(double[ ] data, int loIndex, int midIndex, int hiIndex)
   {
      double[ ] temp = new double[hiIndex-loIndex]; // Allocate the temporary array
      int copied  = 0; // Number of elements copied from data to temp
      int index1 = loIndex;  // Copy from here in the first half of data
      int index2 = midIndex; // Copy from here in the second half of data
      int i;           // Array index to copy from temp back into data

      // Merge elements, copying from two halves of data to the temporary array.
      while ((index1 < midIndex) && (index2 < hiIndex))
      {
         if (data[index1] < data[index2])
            temp[copied++] = data[index1++];
         else
            temp[copied++] = data[index2++];
      }

      // Copy any remaining entries in the left subarray.
      while (index1 < midIndex)
         temp[copied++] = data[index1++];

      // Copy from most of temp back to the data array.
      for (i = 0; i < copied; i++)
         data[loIndex + i] = temp[i];
   }

   public static void concurrentSort
   (double[] data, int loIndex, int hiIndex, int manyThreads)
   {
      Sorter worker = new Sorter(data, loIndex, hiIndex);
      ForkJoinPool pool = new ForkJoinPool( );
      pool.invoke(worker);
   }
}
