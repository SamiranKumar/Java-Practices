/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices;

import skh.java.practices.Collections.MyCollectionAPI;
import skh.java.practices.Generics.GenericDemo;
import skh.java.practices.Generics.MyGenericsClass;
import skh.java.practices.PrimitiveNonPrimitiveType.PrimitiveNonPrimitiveDemo;

/**
 *
 * @author samir
 */
public class SKHJavaPractices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        PrimitiveNonPrimitiveDemo primitiveNonPrimitiveDemo = new PrimitiveNonPrimitiveDemo();
        primitiveNonPrimitiveDemo.demo();
        
        
        GenericDemo genericDemo = new GenericDemo();
        genericDemo.demo();
        
        MyGenericsClass<GenericDemo> class1 = new MyGenericsClass<>();
        
       // class1.add(new genericDemo());
        */
        MyCollectionAPI collectionAPI = new MyCollectionAPI();
        
        collectionAPI.demo();
        
    }
    
}
