/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.PrimitiveNonPrimitiveType;

import static skh.java.practices.Print.printMessage;

/**
 *
 * @author samir
 */
public class MinMaxRange {

    public static void Example() {
        printMessage("byte minimum value  : " + Byte.MIN_VALUE + " and maximum value: " + Byte.MAX_VALUE);

        printMessage("short minimum value : " + Short.MIN_VALUE + " and maximum value: " + Short.MAX_VALUE);

        printMessage("int minimum value   : " + Integer.MIN_VALUE + " and maximum value: " + Integer.MAX_VALUE);

        printMessage("long minimum value  : " + Long.MIN_VALUE + " and maximum value: " + Long.MAX_VALUE);
        printMessage("float minimum value : " + Float.MIN_VALUE + " and maximum value: " + Float.MAX_VALUE);
        printMessage("double minimum value: " + Double.MIN_VALUE + " and maximum value: " + Double.MAX_VALUE);
        printMessage(s);
    
    }
   static String s = new String("Under the numbers we have\n" +
"\n" +
"Byte: -128 to 127\n" +
"Short: -32,768 to 32,767\n" +
"Int: -2^31 to 2^31\n" +
"Long: -2^63 to 2^63 - 1"
    
);
}
