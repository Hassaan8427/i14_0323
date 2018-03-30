package ConversionsCiphersLinkedLists;
import java.util.Scanner;

/**
 * Converts any Octal Number to a Decimal Number
 * 
 * @author Zachary Jones
 *
 */
public class OctalToDecimal {

		/**
	 * This method converts an octal number to a decimal number.
	 * 
	 * @param inputOctal
	 *            The octal number
	 * @return The decimal number
	 */
	public static int convertOctalToDecimal(String inputOctal) {

		try {
			// Actual conversion of Octal to Decimal:
			Integer outputDecimal = Integer.parseInt(inputOctal, 8);
			return outputDecimal;
		} catch (NumberFormatException ne) {
			// Printing a warning message if the input is not a valid octal
			// number:
			System.out.println("Invalid Input, Expecting octal number 0-7");
			return -1;
		}
	}
}