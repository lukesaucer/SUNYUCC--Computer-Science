package time;

/**
 * 	Java class creates two objects of class time
 * 	<p>
 * 	Creates two time objects, currentTime1 and currentTime2
 * 	and displays them
 * 	</p>
 *	@author	lukesaucer
 *	@since	1-28-21
 *	@version 1.0
 *  */

public class TimeTest {
	
	/**
	 * main creates the time objects
	 * @param args not used
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time thisTime1 = new Time();
		System.out.printf("Current Time: %s%n", thisTime1);
		Time thisTime2 =  new Time(11,15,20);
		System.out.printf("New Time: %s", thisTime2);
		
	}

}
