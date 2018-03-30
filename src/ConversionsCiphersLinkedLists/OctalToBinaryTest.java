package ConversionsCiphersLinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class OctalToBinaryTest {

	@Test
	public void test() {
		OctalToBinary tmp=new OctalToBinary();
		tmp.convertOctalToBinary(23);
		tmp.convertOctalToBinary(8);
	}

}
