/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import skh.java.practices.IDemo;
import skh.java.practices.Print;

import static skh.java.practices.ModuleType.TYPE_COLLECTION_API_HASH_SET;

/**
 * @author samir
 */
public class CollectionAPI implements IDemo {

    List<String> mList = new ArrayList<>();

    @Override
    public void runDemoCode(int TYPE_MODULE) {

        switch (TYPE_MODULE) {
            case TYPE_COLLECTION_API_HASH_SET:
                run();
                break;
        }


    }


    private void run() {
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int n = rand.nextInt(10) + 1;
            mList.add("a-" + n);
        }

        Print.printMessage("[START]: Before Sorted with HashSet \n");
        Print.printListMessage(mList);
        Print.printMessage("\n[END]: Before Sorted with HashSet \n");

        List<String> mList1 = HashSetExample.addElement(mList);

        Print.printMessage("[START]: After Sorted with HashSet \n");
        Print.printListMessage(mList1);
        Print.printMessage("\n[END]: After Sorted with HashSet \n");

        HashSetExample.addElementDemo();
    }


    ///////////////=======================================================
    private static CollectionAPI instance;

    public static CollectionAPI getInstances() {
        if (instance == null) {
            instance = new CollectionAPI();
        }
        return instance;
    }

    private CollectionAPI() {
    }

    ///--------------------------------------------------------------------


}
