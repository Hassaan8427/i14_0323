package ConversionsCiphersLinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class OctalToDecimalTest {

	@Test
	public void test() {
		OctalToDecimal tmp=new OctalToDecimal();
		tmp.convertOctalToDecimal("2347");
		tmp.convertOctalToDecimal("8");
	}

}
