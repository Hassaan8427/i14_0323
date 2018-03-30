package ConversionsCiphersLinkedLists;
import java.util.Scanner;

/**
 * Converts any Octal number to a Binary number
 * 
 * @author Zachary Jones
 *
 */
public class OctalToBinary {

	
	/**
	 * This method converts an octal number
	 * to a binary number.
	 * 
	 * @param o The octal number
	 * @return The binary number
	 */
	public static void convertOctalToBinary(int num) {
				
		
		String binary = Integer.toBinaryString(num);		
		System.out.println("Binary Value is : " + binary);
		
	}
}