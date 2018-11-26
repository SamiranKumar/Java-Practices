/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.PrimitiveNonPrimitiveType;

import skh.java.practices.IDemo;

/**
 *
 * @author samir
 */
public class PrimitiveNonPrimitiveIDemo implements IDemo {
    @Override
    public void runDemoCode(int TYPE){
         MinMaxRange.Example();
    }


    ///////////////=======================================================
    private static PrimitiveNonPrimitiveIDemo instance;

    public static PrimitiveNonPrimitiveIDemo getInstances() {
        if (instance == null) {
            instance = new PrimitiveNonPrimitiveIDemo();
        }
        return instance;
    }

    private PrimitiveNonPrimitiveIDemo() {
    }

    ///--------------------------------------------------------------------


}
