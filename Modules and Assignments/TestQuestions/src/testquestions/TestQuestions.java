package testquestions;

public class TestQuestions {

	public static int sum(int n)
	{
		if (n==0)
			return 0;
		else
			return n + sum(n);
	}
	public static void main(String[] args) {
		
		int n = 4;
		
		System.out.print("Result is: " + sum(n));

	}

}
