package timestable;

// Exam #2 Program - Lucas Saucer

public class TimesTable {
	
	public static void main (String args[]) {
		
		int[][] timesTableRows = new int[9][9];
		int rowI = 1;
		int columnJ = 1;
		
		System.out.print("* |");
		  for(int i = 1; i <= timesTableRows.length; i++ ) {
			  System.out.printf("\t%d", i);
	        }
		
		System.out.print("\n");
		
		//I found this built-in method on StackOverflow, used it to keep the code more organized.
		String dash = "--";
		String repeated = dash.repeat(37);
		
		System.out.print(repeated);
		System.out.print("\n");
		
		// nested loop to iterate through each array and multiply each index
		for (int i = 0; i < timesTableRows.length; i++) {
			for (int j = 0; j < timesTableRows[i].length; j++) {
				timesTableRows[i][j] = rowI * columnJ;
				columnJ++;
			}
			
		rowI++;
	
		// restart at column #1
		columnJ = 1;
		}
		

		
		for (int i = 0; i < timesTableRows.length; i++) {
			System.out.printf("%d |", i + 1);
			for (int j = 0; j < timesTableRows[i].length; j++) {
				System.out.print("\t"+ timesTableRows[i][j]);
			}
			System.out.print("\n");
		}
		
	}

}
