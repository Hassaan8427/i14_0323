package ConversionsCiphersLinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleLinkedListTest {

	@Test
	public void test() {
		CircleLinkedList tmp=new CircleLinkedList();
		Object value=new Object();
		tmp.append(value);
		tmp.append(value);
		tmp.append(value);
		tmp.append(value);
		tmp.append(value);
		tmp.append(value);
		tmp.equals(value);
		tmp.remove(4);
		tmp.getSize();
	}

}
