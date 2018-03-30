package ConversionsCiphersLinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaesarTest {

	@Test
	public void encodetest() {
		Caesar.encode("What is this?",100);
		Caesar.encode("Let me guess",122);
		Caesar.encode("Hahahah",3);
				
		Caesar.decode("Hahahah",3);
		Caesar.decode("What is this?",100);
		Caesar.decode("Let me guess",122);
		
		Caesar.main(null);
		Caesar.main(null);
		Caesar temp=new Caesar();
		
		
	}

}
