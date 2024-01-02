package gradebook;

public class GradeBook {
	private String courseName; 
	private int[][] grades;
	
	public GradeBook(String name, int[][] gradesArray) {
		setCourseName(name);
		grades = gradesArray;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	// find the lowest of all student grades
	public int getMinimum() {
		int lowGrade = grades[0][0];
		
		// get the first student's grades 
		for (int[] studentGrades : grades)
		{
			// for this student go grade by grade
			for (int grade : studentGrades) {
				if (grade < lowGrade)
					lowGrade = grade;
			}
		}
		return lowGrade;
	}

}