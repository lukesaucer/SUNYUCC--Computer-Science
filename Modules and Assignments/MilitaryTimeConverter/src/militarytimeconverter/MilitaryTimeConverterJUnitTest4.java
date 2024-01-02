package militarytimeconverter;

import static org.junit.Assert.assertThrows;

class MilitaryTimeConverterJUnitTest4 {

	public void testCase4() {
		assertThrows(IllegalArgumentException.class, () -> {
	        MilitaryTimeConverter.convertTime(24);
		});
	}
}
