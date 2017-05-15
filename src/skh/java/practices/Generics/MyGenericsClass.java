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
public class MyGenericsClass<T> {
    private T t;

//    public MyGenericsClass(T t) {
//        new T();
//    }
    
   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }
   
   public MyGenericsClass<T> getObjectG () { //G is Generics
      this.t = t;
      
      return new MyGenericsClass<T>();
   }
   
}
