package binarysearchgenericmethod;

/**
 * This class is used to create the comparator used to compare values in the binarySearch method.
 */

import java.util.Comparator;

public class GenericComparator implements Comparator<Object> {

/**
 * {@link compare()} method is used to compare object one to object two.
 * @return returns the value of comparing String object one to String object two.
 */
	
	@Override
	public int compare(Object o1, Object o2) {
		String sO1 = o1.toString();
		String sO2 = o2.toString();
		try {
			double dO1 = Double.parseDouble(sO1);
			double dO2 = Double.parseDouble(sO2);
		return (int) (dO1 - dO2);
		}
		catch (NumberFormatException l) {
			return sO1.compareToIgnoreCase(sO2);
		}
	}

}
