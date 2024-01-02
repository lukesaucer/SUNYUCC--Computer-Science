package time;

/**
 * 	Java class representing time
 * 	<p>
 * 	Java class to represent 24-hour time representing ints
 * 	for hours, minutes and seconds
 * 	</p>
 *	@author	lukesaucer
 *	@since	1-28-21
 *	@version 1.0
 *  */

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	/**
	 * 	Time constructor to initialize the clock
	 */
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	/**
	 * Time constructor sets the clock base on inputs
	 * @param hour hours to set in 0 - 23
	 * @param minute minutes to set in 0 - 59
	 * @param second second to set in 0 - 59
	 */
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	/**
	 * Returns the current hours in the clock
	 * @return int representing the hours
	 */
	
	public int getHour() {
		return hour;
	}
	
	/**
	 * Sets the hours as input 0 - 23
	 * @param hour int representing the hour 0 - 23
	 */
	
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	/**
	 * Returns a string in friendly time format
	 */
	
	public String toString() {
		return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());	}
}
