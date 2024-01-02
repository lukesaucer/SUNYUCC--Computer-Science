package militarytimeconverter;

import static org.junit.jupiter.api.Assertions.*;

public class MilitaryTimeConverterJUnitTest1 {


	//@Test
	public void testCase1() {
		   String standardTime = MilitaryTimeConverter.convertTime(0);
		   assertEquals(standardTime, "12 AM");
		}
	
}
