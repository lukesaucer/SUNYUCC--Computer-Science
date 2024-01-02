package marathonrunners;


/**
 * The Runner class creates the constructor for the class Runner as well as defining the methods,
 * getters and setters for the class Runner.
 * <p>
 * @author Lucas Saucer and Steve Cina
 * @since 04/01/2020
 * @version 2.0
 */

public class Runner {
	
	private String name;
	private Time startTime;
	private Time endTime;
	
/**
 * {@link getDurationSeconds()} method is used to get the duration that it took each runner
 * to start and finish the rach in.
 */
	public int getDurationSeconds() {
		return endTime.toSeconds() - startTime.toSeconds();
	}
/**
 * {@link getTimes()} method is used to convert the user-inputted times back to a standard hour,
 * minute and seconds format from when they were all converted to seconds after using the toSeconds()
 * method in the Time class.
 * <p>
 * @return returns the time in a string format.
 */
	public String getTimes() {
		String timeString = "";
		int duration = getDurationSeconds();
		int hour = duration / 3600;
		duration = duration % 3600;
		int minute = duration / 60;
		duration = duration % 60;
		int seconds = duration;
		if (hour < 10) timeString += "0";
		timeString += hour + ":";
		if (minute < 10) timeString += "0";
		timeString += minute + ":";
		if (seconds < 10) timeString += "0";
		timeString += seconds;
		return timeString;
 	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


public Runner (String name, int startHour, int startMinutes, int startSeconds, 
		int endHour, int endMinutes, int endSeconds)
		
	{	
		this.setName(name);
		this.startTime = new Time (startHour, startMinutes, startSeconds);
		this.endTime = new Time (endHour, endMinutes, endSeconds);
	}

/**
 * The {link toString()} method is used to create the print-out for each user-inputted runner, 
 * start-time and end-time.
 * <p>
 * @return returns the name, start-time, end-time and duration of each runner in a string format
 * using getter methods.
 */

 public String toString()
{
    return name + "	" + startTime.getHour() + ":" + startTime.getMinutes() + 
    		":" + startTime.getSeconds() + "	 " + endTime.getHour() + ":" + endTime.getMinutes() + ":" +
    		endTime.getSeconds() + "  " + getTimes() + "\n";
}


}
