package ConversionsCiphersLinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class HexaDecimalToBinaryTest {

	@Test
	public void test() {
		HexaDecimalToBinary tmp=new HexaDecimalToBinary();
		tmp.convert("1A2F000B");
		tmp.completeDigits("4");
	}

}
