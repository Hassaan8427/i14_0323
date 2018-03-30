package ConversionsCiphersLinkedLists;
import java.util.Scanner;

/**
 * This class converts Decimal numbers to Octal Numbers
 * 
 * @author Unknown
 *
 */
class DecimalToOctal
{
	
  public static void Octal(int n)
  {
    
    int k,d,s=0,c=0;
    
    k=n;
    while(k!=0)
    {
      d=k%8;
      s+=d*(int)Math.pow(10,c++);
      k/=8;
    }
   
    System.out.println("Octal equivalent:"+s);
    
  }
}
