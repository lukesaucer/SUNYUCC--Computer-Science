package militarytimeconverter;

import static org.junit.Assert.assertThrows;

public class MilitaryTimeConverterJUnitTest3 {
	
	public void testCase3() {
				assertThrows(IllegalArgumentException.class, () -> {
			        MilitaryTimeConverter.convertTime(-1);
				});
			}
		}
			