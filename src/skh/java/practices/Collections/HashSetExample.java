/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import skh.java.practices.Print;

/**
 *
 * @author samir
 */
public class HashSetExample {
   public static List<String> addElement(List<String> mList){
    
// Adding elements to the HashSet
    HashSet<String> hashSet  = new HashSet<>();
    
    for(String s: mList){
        hashSet.add(s);
    }
    return new ArrayList<String>(hashSet);
    
    }
   
   
     public static void addElementDemo(){
    
// Adding elements to the HashSet
    HashSet<String> hashSet  = new HashSet<>();
    
   
        hashSet.add("aa1");
        hashSet.add("aa2");
        hashSet.add("aa3");
        hashSet.add("aa4");
        hashSet.add("aa5");
        hashSet.add("aa6");
        
         Print.prinListMessage(new ArrayList<String>(hashSet));
    
    }
}
