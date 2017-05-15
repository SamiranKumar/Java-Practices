/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.Generics;

import skh.java.practices.Demo;

/**
 *
 * @author samir
 */
public class GenericDemo implements Demo {

    @Override
    public void demo() {
        GenericMethodTest.Example();

        MaximumTest.Example();

        MyGenericsClass<Integer> integerBox = new MyGenericsClass<Integer>();
        MyGenericsClass<String> stringBox = new MyGenericsClass<String>();

        integerBox.add(new Integer(62));
        stringBox.add(new String("Samiran Kumar"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());

    }

}
