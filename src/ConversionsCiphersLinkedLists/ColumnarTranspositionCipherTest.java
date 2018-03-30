package ConversionsCiphersLinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColumnarTranspositionCipherTest {

	@Test
	public void test() {
		String temp=ColumnarTranspositionCipher.encrpyter("Amazing", "Intelligent");
		String temp3=ColumnarTranspositionCipher.encrpyter("Amazing", "Intelligent",null);
		String temp4=ColumnarTranspositionCipher.decrypter();
		ColumnarTranspositionCipher.main(null);
		ColumnarTranspositionCipher temp1=new ColumnarTranspositionCipher();
		
		}

}
