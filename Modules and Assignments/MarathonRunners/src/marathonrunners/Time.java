package marathonrunners;

/**
 * The Time class creates the class Time, the class Time's constructor and sets the getters and setters
 * for the class.
 * <p>
 * @author Lucas Saucer and Steve Cina
 * @since 04/01/2020
 * @version 2.0
 *
 */


/**
 * 
 * @param hour is created to hold the hour in 24-hour time.
 * @param minutes is created to hold the minute in 24-hour time.
 * @param seconds is created to hold the seconds in 24-hour time.
 *
 */


public class Time {
	private int hour;
	private int minutes;
	private int seconds;
	
	public Time (int hour, int minutes, int seconds) {
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	/**
	 * {@link toSeconds()} method is used to convert the user-inputted times to seconds.
	 */
	
	public int toSeconds() {
		int totalSeconds = 0;
		totalSeconds += hour * 3600;
		totalSeconds += minutes * 60;
		totalSeconds += seconds;
		return totalSeconds;
	}
	
}
