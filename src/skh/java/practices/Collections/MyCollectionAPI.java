/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import skh.java.practices.Demo;
import skh.java.practices.Print;

/**
 *
 * @author samir
 */
public class MyCollectionAPI implements Demo{

    
    List<String> mList = new ArrayList<>();
    
    @Override
    public void demo() {
        
        for(int i=0;i<10;i++){
            Random rand = new Random();
            int  n = rand.nextInt(10) + 1;
            mList.add("a-"+n);
        }
       /* 
        Print.prinMessage("[START]: Befour Sorted with HashSet \n");
        Print.prinListMessage(mList);
         Print.prinMessage("\n[END]: Befour Sorted with HashSet \n");
         
       List<String> mList1=  HashSetExample.addElement(mList);
        
         Print.prinMessage("[START]: After Sorted with HashSet \n");
        Print.prinListMessage(mList1);
         Print.prinMessage("\n[END]: After Sorted with HashSet \n");
        */
         
         HashSetExample.addElementDemo();
    }
   
    
   
}
