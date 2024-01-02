package student;

public class Student {
	private String name;
	private double average;
	
	public Student(String name, double average) {
		this.name = name;
		
		if (average > 0.0) {
			if (average <= 100.0)
				this.average = average;
			
		}
		
	}


	public String getLetterGrade() {
		String letterGrade = "";
		
		if (average >= 90)
			letterGrade = "A";
		else 
			if (average >= 80)
				letterGrade = "B";
			else if (average >= 70)
				letterGrade = "C";
				else if (average >= 60)
					letterGrade = "D";
					else
						letterGrade = "F";
		return letterGrade;
	}

}


	