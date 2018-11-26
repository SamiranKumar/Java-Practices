/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.Generics;

/**
 *
 * @author samir
 */
public class GenericsClass<T> {
    private T t;

//    public GenericsClass(T t) {
//        new T();
//    }
    
   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }
   
   public GenericsClass<T> getObjectG () { //G is Generics
      this.t = t;
      
      return new GenericsClass<T>();
   }
   
}
