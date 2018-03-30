package ConversionsCiphersLinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnyBaseToAnyBaseTest {

	@Test
	public void test() {
		AnyBaseToAnyBase temp4=new AnyBaseToAnyBase();
		temp4.base2base("32",2,10); 
		temp4.AnyToAny("32",2,16);
		temp4.AnyToAny("1AF",2,16);
		temp4.AnyToAny("123",8,2);
		temp4.AnyToAny("32", 1, 100);
		temp4.AnyToAny("*&^", 2, 8);
		temp4.AnyToAny("7652", 2, 8);
		temp4.AnyToAny("-1", 2, 8);
		temp4.base2base("123452", 32, 8);
		
			
	}

}
