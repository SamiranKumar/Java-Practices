/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices.Algorithom.SearchAlgorithms;

/**
 *
 * @author samir
 */
public class LinearSearch {

    public static int linerSearch(int[] arr, int key) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
