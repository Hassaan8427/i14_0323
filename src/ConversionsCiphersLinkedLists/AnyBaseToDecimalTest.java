package ConversionsCiphersLinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnyBaseToDecimalTest {

	@Test
	public void test() {
		AnyBaseToDecimal.convertToDecimal("32", 8);
		AnyBaseToDecimal.convertToDecimal("32", 32);
		AnyBaseToDecimal.convertToDecimal("32A", 16);
		AnyBaseToDecimal.convertToDecimal("10011001", 2);
		AnyBaseToDecimal.convertToDecimal("32", 10);
		AnyBaseToDecimal.convertToDecimal("1232", 40);
		AnyBaseToDecimal.convertToDecimal("abc", 32);
		AnyBaseToDecimal temp= new AnyBaseToDecimal();
	}

}
