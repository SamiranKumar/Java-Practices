/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author samir
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RetentionAnnotation {
    String name();
    String desc();
}


class MyAnnTest{
     
    @RetentionAnnotation(name = "test1", desc = "testing annotations")
    public void myTestMethod(){
        //method implementation
    }
}
