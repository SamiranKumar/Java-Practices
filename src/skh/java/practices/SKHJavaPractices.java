/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices;

import skh.java.practices.Collections.CollectionAPI;
import skh.java.practices.Generics.GenericIDemo;
import skh.java.practices.Generics.GenericsClass;
import skh.java.practices.PrimitiveNonPrimitiveType.PrimitiveNonPrimitiveIDemo;

import static skh.java.practices.ModuleType.*;

/**
 * @author samir
 */
public class SKHJavaPractices {


    private final static int TYPE_MODULE = TYPE_GENERICS_CLASS;


    private static void runCode() {

        switch (TYPE_MODULE) {

            case TYPE_COLLECTION_API:

                CollectionAPI collectionAPI = CollectionAPI.getInstances();
                collectionAPI.runDemoCode(TYPE_COLLECTION_API_HASH_SET);

                break;

            case TYPE_GENERICS_CLASS:
                GenericIDemo genericDemo = GenericIDemo.getInstances();
                genericDemo.runDemoCode(TYPE_GENERICS_CLASS);

                GenericsClass<GenericIDemo> class1 = new GenericsClass<>();
                class1.add(genericDemo);

                break;

            case TYPE_PRIMITIVE_NON_PRIMITIVE:
                PrimitiveNonPrimitiveIDemo primitiveNonPrimitiveDemo = PrimitiveNonPrimitiveIDemo.getInstances();
                primitiveNonPrimitiveDemo.runDemoCode(TYPE_PRIMITIVE_NON_PRIMITIVE);

                break;
                
        }


    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runCode();
    }

}
