/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.Annotation;

/**
 *
 * @author samir
 */
public @interface MyCustomAnnotation {
//Annotations are created by using @ sign, folled by the keyword interface
    String name();
    String desc();
}