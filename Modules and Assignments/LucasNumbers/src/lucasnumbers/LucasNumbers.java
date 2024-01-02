package lucasnumbers;

/**
 * This program uses the Lucas number sequence named after mathematician Fracois Edouard 
 * Anatole Lucas and prints the first thirty numbers within the sequence.
 * <p>
 * @author Lucas Saucer
 * @since 04/11/2021
 * @version 1.0
 *
 */


public class LucasNumbers {

/**
 * {@link CalculateLucasNumbers()} method is used to perform the Lucas number sequence on 
 * a predetermined and preprogrammed number.
 * @param n is the number that the method calculates the Lucas number sequence on.
 * @return returns 2 if n is equal to 0.
 * @return returns 1 if n is equal to 1.
 * @return recursively calls the CalculateLucasNumbers method on the predetermined and preprogrammed
 * number n. The first recursive call calls the method on (n - 1) and the second recursive call 
 * calls the method on (n - 2). The two method calls are then added together and the result is returned.
 * 
 */
	public static long CalculateLucasNumbers(long n) {
	      if (n == 0)
	         return 2;
	      if (n == 1)
	    	  return 1;
	      else
	         return CalculateLucasNumbers(n - 1) + CalculateLucasNumbers(n - 2);
	   }
	
	   public static void main(String[] args) {
		   
		   {
		        int n = 29;
		       
		        System.out.print("The first 30 numbers in the Lucas Number Sequence are: ");
		        
		        for (int i = 0; i < n; i++) {
		  
		            System.out.print(CalculateLucasNumbers(i) + ", ");
		        }
		        
		        System.out.print(CalculateLucasNumbers(30));
		}
	}
}