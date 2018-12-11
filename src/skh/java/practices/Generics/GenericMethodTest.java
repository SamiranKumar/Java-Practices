/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.Generics;

import static skh.java.practices.Print.printMessage;

/**
 *
 * @author samir
 */
public class GenericMethodTest {
    // generic method printArray
   public static < E > void printArray( E[] inputArray ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }
   
   public static void Example( ) {
      // Create arrays of Integer, Double and Character
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

      printMessage("Array integerArray contains:");
      printArray(intArray);   // pass an Integer array

      printMessage("\nArray doubleArray contains:");
      printArray(doubleArray);   // pass a Double array

      printMessage("\nArray characterArray contains:");
      printArray(charArray);   // pass a Character array
   }
}




////https://www.tutorialspoint.com/java/java_generics.htm