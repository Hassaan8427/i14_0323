package ConversionsCiphersLinkedLists;
import java.util.Scanner;

/**
 * This class converts a Binary number to a Decimal number
 * 
 * @author Unknown
 *
 */
class BinaryToDecimal
{
	
  public static void convertToDecimal(int n)
  {
    int k,d,s=0,c=0;
    k=n;
    while(k!=0)
    {
      d=k%10;
      s+=d*(int)Math.pow(2,c++);
      k/=10;
    }
    System.out.println("Decimal equivalent:"+s);
    
  }
}
