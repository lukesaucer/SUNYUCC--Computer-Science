package examoneproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter; // writing to the file object
import java.util.Scanner;

/**
 * This program prompts the user to enter in ten integers. Once
 * the user ends the sequence by typing, 'EOF' the program
 * then writes the integers into a .txt file and separates
 * each integer by a comma. The program will then open the .txt file
 * and print the ten digits into the console and display the average of the
 * ten integers in the console.
 * <p>
 * @author Lucas Saucer
 * @since 03/14/2021
 * @version 1.0
 * 
 */

public class ExamOneProject {

	private static Scanner fileIn;
	private static Formatter fileOut;
	private static final String FILENAME = "Numbers.txt";
	
	
	public static void main(String[] args) {
		openFileForWrite();
		writeToFile();
		closeFileForWrite();
		openFileForRead();
		readToFile();
		closeFileForRead();
	}
	
	/**
	 * Use the {@link openFileForWrite()} method to open the .txt file.
	 */
	
	public static void openFileForWrite() {
			
		try {
			fileOut = new Formatter(FILENAME);
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file. Terminating");
	    	System.exit(1);
			e.printStackTrace();
		}
		
	}
	
	/**
	 * I had a problem here with trying to close the input object. Each time
	 * I did so, something would create an error in how the program ran and
	 * it would print out the error in a stack trace. I was unable to 
	 * solve the issue.
	 * <p>
	 * I also had another issue here with trying to create if statements that
	 * would not allow the user to enter certain characters in place of entering numbers.
	 * I had tried to create if statements that would break the while loop if the user
	 * entered special characters such as "!,*?." or letters [a-zA-z]. Not sure
	 * if I should have been attempting that in an if statement or if I should have
	 * been trying to create some sort of custom exception handling to handle that.
	 * <p>
	 * Use the {@link #writeToFile()} method to write to the .txt file.
	 */
	
	public static void writeToFile() {
		while (true) {
			System.out.printf("%s%n%s%n","Enter 10 Integers","Enter 'EOF' to End Input");
			Scanner input = new Scanner(System.in);
			String userInput = input.nextLine();
			String[] inputArray = userInput.split(" ");
			
			
			
			if (userInput.equalsIgnoreCase("EOF")) {
				break;
			}
			if (inputArray.length != 10) {
				System.out.println("Invalid input, not the correct amount of integers.");
				continue;
			}
	   
			fileOut.format("%s, %s, %s, %s, %s, %s, %s, %s, %s, %s%n", inputArray[0], inputArray[1], inputArray[2], inputArray[3], inputArray[4], inputArray[5], inputArray[6], inputArray[7], inputArray[8], inputArray[9]);
			
		}
	}
			
		
	
	/**
	 * Use the {@link #closeFileForWrite()} method to close the .txt file.
	 */
	
	public static void closeFileForWrite() {
		fileOut.close();
	}
	
	/**
	 * Use the {@link #openFileForRead()} method to open the .txt file to read it.
	 */
	
	public static void openFileForRead() {
			try {
				fileIn = new Scanner(new File(FILENAME));
			} catch (FileNotFoundException e) {
				System.out.println("Error opening file. Terminating");
				e.printStackTrace();
			}
		
	}
	
	/**
	 * Use the {@link #readToFile()} method to read the .txt file.
	 * <p>
	 * @param sumForAverage takes the Integer inputs in the averageArray string
	 * and adds them all together.
	 * @return average takes sumForAverage and divides it by the number 10.
	 * 
	 */
	
	public static void readToFile() {
		while (fileIn.hasNextLine()) {
			String nextLine = fileIn.nextLine();
				System.out.println(nextLine);
				String[] averageArray = nextLine.split(", ");
				Integer inputOne = Integer.parseInt(averageArray[0]);
				Integer inputTwo = Integer.parseInt(averageArray[1]);
				Integer inputThree = Integer.parseInt(averageArray[2]);
				Integer inputFour = Integer.parseInt(averageArray[3]);
				Integer inputFive = Integer.parseInt(averageArray[4]);
				Integer inputSix = Integer.parseInt(averageArray[5]);
				Integer inputSeven = Integer.parseInt(averageArray[6]);
				Integer inputEight = Integer.parseInt(averageArray[7]);
				Integer inputNine = Integer.parseInt(averageArray[8]);
				Integer inputTen = Integer.parseInt(averageArray[9]);
				Integer sumForAverage = inputOne + inputTwo + inputThree + inputFour + inputFive + inputSix + inputSeven + inputEight + inputNine + inputTen;
				Integer average = sumForAverage / 10;
				System.out.printf("The average of the numbers is: %d%n", average);
			
		}
	}
	
	/**
	 * Use the {@link #closeFileForRead()} method to close the .txt file.
	 */
	
	public static void closeFileForRead() {
		fileIn.close();
	}
}
