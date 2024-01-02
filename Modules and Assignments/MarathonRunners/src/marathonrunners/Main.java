package marathonrunners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This program tracks the start and end times for marathon runners and stores them in a list.
 * The program asks the user to input this data for each runner and then sorts them in terms of
 * who finished the marathon race first. The program calculates and displays the duration of 
 * each runner's run-time during the race.
 * <p>
 * There are four classes for this java project. A Runner class, a Time class, a Comparator class
 * as well as the Main class for running the program.
 * <p>
 * The Main class is used to run the program and ask the user to input the data for each runner
 * in the marathon and then passes that data to the Runner constructor to create each individual
 * runner within the program.
 * <p>
 * @author Lucas Saucer and Steve Cina
 * @since 04/01/2020
 * @version 2.0
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Runner> runnerList = new ArrayList<Runner>();
		
			System.out.println("Please enter information for runners in the marathon.");
			
				do {
				
/**
 * @param name is used to store each runner's name.
 * @param startHour is used to store each runner's hour that they started the marathon.
 * @param startMinutes is used to store each runner's minute within the hour that they started
 * the marathon.
 * @param startSeconds is used to store each runner's second within the minute within the hour
 * that they started the marathon.
 * @param endHour is used to store each runner's hour that they finished the marathon.
 * @param endMinutes is used to store each runner's minute within the hour that they finished
 * the marathon.
 * @param endSeconds is used to store each runner's second within the minute within the hour
 * that they finished the marathon.
 * 			
 */
					
					System.out.println("Enter Runner Name: ");
					String name = input.next();
					
					
					System.out.println("Enter Start Time Hours: ");
					Integer startHour = input.nextInt();
			
					
					System.out.println("Enter Start Time Minutes: ");
					int startMinutes = input.nextInt();
					
					
					System.out.println("Enter Start Time Seconds: ");
					int startSeconds = input.nextInt();
				
					
					System.out.println("Enter End Time Hours: ");
					int endHour = input.nextInt();
					
					
					System.out.println("Enter End Time Minutes: ");
					int endMinutes = input.nextInt();
				
					
					
					System.out.println("Enter End Time Seconds: ");
					int endSeconds = input.nextInt();
			

				Runner runner1 = new Runner(name, startHour, startMinutes, startSeconds, endHour, endMinutes, endSeconds);	
					
					System.out.println("Enter Another Runner (Y/N)? ");
					String proceedInput = input.next();
					
					runnerList.add(runner1);
					
					if (proceedInput.equalsIgnoreCase("N")) {
						break;
					}	
					if (proceedInput.equalsIgnoreCase("Y")) {
						continue;
					}
					else {
						System.out.println("Invalid Entry");
					}
				}	while (true);	
				
				// Unsorted
				System.out.printf("%n%s %s %s %s%n%n", "Name", "Start-Time", "End-Time", "Duration");
				for ( int i = 0; i < runnerList.size(); i++) {
					System.out.println(runnerList.get(i));
				}
				Collections.sort(runnerList, new RunnerComparator());
				System.out.printf("%n%s %s %s %s%n%n", "Name", "Start-Time", "End-Time", "Duration");
				for ( int i = 0; i < runnerList.size(); i++) {
					System.out.println(runnerList.get(i));
				}
	}
}
