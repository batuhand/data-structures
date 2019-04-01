/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uludag.iot.stackexample;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cengiz
 */
public class LinkedStackTest {

    public static void main(String[] args) {

        StackInterface stack = new Array();
        try {
            stack.push(new Insan("Ahmet"));
            stack.push(new Insan("Ayse"));
            stack.push(new Insan("Hakan"));
           
            while (!stack.isEmpty()) {
                System.out.println("" + (Insan) stack.topAndPop());
            }
        } catch (Exception ex) {
            Logger.getLogger(MainArrayTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
