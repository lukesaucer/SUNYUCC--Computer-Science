package militarytimeconverter;

import static org.junit.jupiter.api.Assertions.*;

public class MilitaryTimeConverterJUnitTest2 {
	
	public void testCase2() {
		   String standardTime = MilitaryTimeConverter.convertTime(23);
		   assertEquals(standardTime, "11 PM");
		}
	
	
}