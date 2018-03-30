package ConversionsCiphersLinkedLists;

import java.util.*;
import java.util.Scanner;
import javax.swing.*;

@SuppressWarnings("unused")
public class HexaDecimalToBinary {
 
    private final int LONG_BITS = 8;

    public void convert(String numHex) {
        //String a HexaDecimal:
        int conHex = Integer.parseInt(numHex, 16);
        //Hex a Binary:
        String binary = Integer.toBinaryString(conHex);
        //Presentation:
        System.out.println(numHex + " = " + completeDigits(binary));
    }

    public String completeDigits(String binNum) {
        for (int i = binNum.length(); i < LONG_BITS; i++) {
            binNum = "0" + binNum;
        }
        return binNum;
    }

    
}
