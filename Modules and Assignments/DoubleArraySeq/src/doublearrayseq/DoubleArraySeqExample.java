package doublearrayseq;

public class DoubleArraySeqExample {

	public static void main(String [ ] args)
	{
		DoubleArraySeq sequenceA = new DoubleArraySeq(20);
		DoubleArraySeq sequenceB = new DoubleArraySeq(20);
		DoubleArraySeq sequenceC = new DoubleArraySeq(20);

		// Testing addAfter, addBefore, and start() on sequenceA.  
		sequenceA.addAfter(34.1);
		System.out.println(sequenceA);
		sequenceA.addAfter(2.6);
		System.out.println(sequenceA.toString());
		sequenceA.addAfter(13.5);
		System.out.println(sequenceA.toString());
		
		sequenceA.start();	// at this point it should be {34.1, 2.6, 13.5}
		System.out.println(sequenceA.toString());
		sequenceA.addAfter(7.9);
		System.out.println(sequenceA.toString());
		sequenceA.addAfter(1.0);
		System.out.println(sequenceA.toString());
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Test addAfter() on Sequence A: ");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println(sequenceA.toString()); // should be {15.5, 8.4, 7.5, 99.9, 36.0, 34.1, 7.9, 66.6, 1.0, 2.6, 13.5}
		System.out.println(sequenceA.getCapacity()); // should be 22
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Test addAfter() on Sequence B: ");
		System.out.println(" ");
		System.out.println(" ");
		
		// create two sequences to combine into one.
		sequenceB.addAfter(0.5);
		sequenceB.addAfter(0.8);
		sequenceB.addAfter(1.5);
		sequenceB.addAfter(1.8);
		sequenceB.addAfter(2.5);
		sequenceB.addAfter(2.8);
		System.out.println(sequenceB.toString());
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Test addAfter() on Sequence C: ");
		System.out.println(" ");
		System.out.println(" ");
		
		sequenceC.addAfter(0.1);
		sequenceC.addAfter(0.2);
		sequenceC.addAfter(0.3);
		sequenceC.addAfter(0.4);
		sequenceC.addAfter(0.5);
		sequenceC.addAfter(0.6);
		System.out.println(sequenceC.toString());
		
		//adds sequenceC to the end of sequenceB
		sequenceB.addAll(sequenceC); // should be {0.5, 0.8, 1.5, 1.8, 2.5, 2.8, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6}
		System.out.println(sequenceB.toString());
		System.out.println(sequenceB.getCapacity());
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Test Cantenation(): ");
		System.out.println(" ");
		System.out.println(" ");
		
		DoubleArraySeq combinedSeq = DoubleArraySeq.catenation(sequenceA, sequenceC);
		System.out.println(combinedSeq.toString()); // combines sequenceA with sequenceC above
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Test removeCurrent() on Sequence A: ");
		System.out.println(" ");
		System.out.println(" ");
		
		sequenceA.removeCurrent(null, 2); // sequenceA's currentIndex should be 5 at this point.  data[5] = 34.1
		
		System.out.println(sequenceA.toString()); // should be {15.5, 8.4, 7.5, 99.9, 36.0, 7.9, 66.6, 1.0, 2.6, 13.5}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Test removeCurrent() on Sequence C: ");
		System.out.println(" ");
		System.out.println(" ");
		
		sequenceA.removeCurrent(null, 2); // sequenceC's currentIndex should be 5, which is the last element (0.6).
		System.out.println(sequenceC.toString()); // should be {0.1, 0.2, 0.3, 0.4, 0.5}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Test trimToSize(): ");
		System.out.println(" ");
		System.out.println(" ");
		
		
		sequenceB.addAfter(3.3);
		System.out.println(sequenceB.size());
		System.out.println(sequenceB.toString());
		System.out.println(sequenceB.getCapacity());
		
		sequenceB.trimToSize();
		System.out.println(sequenceB.getCapacity());
		System.out.println(sequenceB.toString());
	}

}
