package searchengine2;

import java.util.*;
import java.io.*;

public class SearchEngine2
{
	public static void main(String[] args)
	{
		Hashtable<String, ArrayList<String> > ht = new Hashtable<String, ArrayList<String> >();
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the filename that you want to Search values for.");

		BufferedReader br = null;

		try
		{
			br = new BufferedReader(new FileReader(kb.nextLine()));//reads information from the file specified by user input
			System.out.println("The file was read. Processing information, please wait...");

			while(br.ready())//should repeat until there are no more lines to read
			{
				String line = br.readLine();//assigns the line read by the reader to line
				String[] result = line.split("\\s");//tokenizes the line into seperate strings, based on spaces only

				for(int i = 0; i < result.length; i++)
				{
					if(!ht.containsKey(result[i]))
					{
						ArrayList<String> temp = new ArrayList<String>(1);
						temp.add(line);
						ht.put(result[i], temp);//assigns a key to anonymous ArrayList that stores the value
					}
					else
					{
						ArrayList<String> temp = (ArrayList<String>)ht.get(result[i]);//if the key has already been assigned, thats ok
						temp.add(line);                                               //just add the argument to the ArrayList!
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.exit(1);
		}

		System.out.println(ht);

		do
		{
			System.out.println("Enter a value to search for.\n");
			System.out.println(ht.get(kb.nextLine()));
			System.out.println("\nKeep searching? Enter any key to continue, or type <NO> to end the process");
		}while(!kb.nextLine().equalsIgnoreCase("<NO>"));

		try
		{
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.exit(1);
		}

	}//end main
}//end class

