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
public class MainArrayTest {

    public static void main(String[] args) {
        
        
        Array array = new Array();
        try {
            array.push(new Insan("Ahmet"));
            array.push(new Insan("Ayse"));
            array.push(new Insan("Hakan"));
            while (!array.isEmpty()) {
                System.out.println(""+(Insan)array.topAndPop());                
            }
        } catch (Exception ex) {
            Logger.getLogger(MainArrayTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

}
