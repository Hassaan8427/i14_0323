package ConversionsCiphersLinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class HexToOctTest {

	@Test
	public void test() {
		HexToOct tmp=new HexToOct();
		tmp.hex2decimal("1A4F");
		tmp.decimal2octal(43);
	}

}
