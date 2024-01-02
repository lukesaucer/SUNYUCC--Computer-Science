package breakexample;

public class BreakExample {

	public static void main(String[] args) {
		int count;
		
		// TODO Auto-generated method stub
		for (count=1; count<=10; count++) {
		
			//if (count==5) // comment out line 12 and see what happens then line 13
				//break;    // exit the for loop here and go to line 18
				//continue; // skip line 15 but return back to line 9
			
			System.out.printf("%d ",count);
		}
		
		System.out.printf("%nBroke out of loop at count=%d%n", count);
	}

}
