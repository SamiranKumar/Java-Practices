/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skh.java.practices;

import java.util.List;

/**
 * @author samir
 */
public class Print {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printListMessage(List<String> messageList) {
        for (String s : messageList)
            System.out.println(s);
    }
}
