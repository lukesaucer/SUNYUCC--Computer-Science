package searchengine;

/**
 * @author - Lucas Saucer and Alex Edwards (Daniweb.com)
 * @since - 12/01/2021
 * @version 1.0
 * 
 * Most of this code came from Alex Edwards' posting on Daniweb.com 
 * 
 * This program takes a text file and loads the values into a hashtable. It then prompts the user
 * for an input to search the hashtable for that key. Unfortunately, not all items are 
 * correctly returned that contain the desired search key.
 * 
 */

import java.util.*;
import java.io.*;

public class SearchEngine
{
	public static void main(String[] args)
	{
		
/**
 * @param hashTable
 * 		- Creates a hashtable containing strings that will be used to store key-value pairs
 * in order to locate during the search function of the program.
 * @param bufferedReader
 * 		- Is an object of class BufferedReader that is used to read the text from the
 * character-based input stream.
 */
		
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the filename that you would like to search:");
		System.out.println();
		BufferedReader bufferedReader = null;
		
		try
		{
			bufferedReader = new BufferedReader(new FileReader(input.nextLine()));//reads information from the file specified by user input
			System.out.println();
			System.out.println("The file was read. Processing information, please wait...");
			System.out.println();
			System.out.println();

			while(bufferedReader.ready())//should repeat until there are no more lines to read
			{
/**
 * @param line
 * 		- Is a variable used to store the value read by bufferedReader
 * @param result
 * 		- Breaks up the line variable into separate strings based off of finding the 'space' character.
 */
				String line = bufferedReader.readLine();
				String[] result = line.split("\\s");

				for(int i = 0; i < result.length; i++)
				{
					if(!hashTable.containsKey(result[i]))
					{
						hashTable.put(result[i], line);//assigns a key to the line
					}
					else
					{
						hashTable.put(result[i], line+"\n"+hashTable.get(result[i]));
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.exit(1);
		}

		System.out.println(hashTable);

		do
		{
			System.out.println();
			System.out.println("Enter a value to search:\n");
			System.out.println(hashTable.get(input.nextLine()));
			System.out.println();
			System.out.println();
			System.out.println("\nKeep searching? Enter any key to continue, or type <NO> to end the process");
		}while(!input.nextLine().equalsIgnoreCase("<NO>"));

		try
		{
			bufferedReader.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.exit(1);
		}
		input.close();
	}
}
