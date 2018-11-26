/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.Generics;

import skh.java.practices.IDemo;

/**
 *
 * @author samir
 */
public class GenericIDemo implements IDemo {

    @Override
    public void runDemoCode(int TYPE) {
        GenericMethodTest.Example();

        MaximumTest.Example();

        GenericsClass<Integer> integerBox = new GenericsClass<>();
        GenericsClass<String> stringBox = new GenericsClass<>();

        integerBox.add(new Integer(62));

        stringBox.add(new String("Samiran Kumar"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());

    }

    ///////////////=======================================================
    private static GenericIDemo instance;

    public static GenericIDemo getInstances() {
        if (instance == null) {
            instance = new GenericIDemo();
        }
        return instance;
    }

    private GenericIDemo() {
    }

    ///--------------------------------------------------------------------


}
