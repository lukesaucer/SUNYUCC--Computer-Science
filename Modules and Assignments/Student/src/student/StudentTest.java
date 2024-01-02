package student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student john = new Student("John", 95);
		Student sue = new Student("Sue", 100);
		
		System.out.printf("John's Grade: %s%n",john.getLetterGrade());
		System.out.printf("Sue's Grade: %s%n", sue.getLetterGrade());
	}

}
