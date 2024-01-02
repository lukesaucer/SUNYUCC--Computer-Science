package studentgrades;


// Assignment #4 - Lucas Saucer (Please let me know how I can make this more simple, the whole thing looks like a mess to me.)

import java.util.Scanner;

public class StudentGradesTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int counter = 1;
		int averageGrade = 0;
		
		
		System.out.println("Welcome to the Gradebook for CSC150 Intro to Computer Science\n");
		System.out.print("Enter grade or -1 to quit:");
		int grade = input.nextInt();
		
			while (grade != -1) {
				total += grade;
				counter++;    
				System.out.printf("Enter grade or -1 to quit:");
				grade = input.nextInt();
				averageGrade = total / (counter - 1);
				
			}
				input.close();
			
		System.out.printf("\nAverage grade is: %d%n\n",averageGrade);
		
		if ((averageGrade >= 92.5) && (averageGrade <= 100))
			System.out.println("Letter Grade is A");
			else
				if ((averageGrade >= 89.5) && (averageGrade <= 92.4))
					System.out.println("Letter Grade is A-");
				else 
					if ((averageGrade >= 86.5) && (averageGrade <= 89.4))
						System.out.println("Letter Grade is B+");
					else
						if ((averageGrade >= 82.5) && (averageGrade <= 86.4))
							System.out.println("Letter Grade is B");
						else
							if ((averageGrade >= 79.5) && (averageGrade <= 82.4))
								System.out.println("Letter Grade is B-");
							else
								if ((averageGrade >= 76.5) && (averageGrade <= 79.4))
									System.out.println("Letter Grade is C+");
								else
									if ((averageGrade >= 72.5) && (averageGrade <= 76.4))
										System.out.println("Letter Grade is C");
									else
										if ((averageGrade >= 69.5) && (averageGrade <= 72.4))
											System.out.println("Letter Grade is C-");
										else
											if ((averageGrade >= 66.5) && (averageGrade <= 69.4))
												System.out.println("Letter Grade is D+");
											else
												if ((averageGrade >= 62.5) && (averageGrade <= 66.4))
													System.out.println("Letter Grade is D");
												else
													if ((averageGrade >= 59.5) && (averageGrade <= 62.4))
														System.out.println("Letter Grade is D-");
													else
														System.out.println("Letter Grade is F");
		
	}

}
