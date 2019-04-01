/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uludag.iot.vylinkedlist;

/**
 *
 * @author Cengiz
 */
public class Student extends Data{
    String name="";
    String surname="";
    String telefon="";
    
    public String toString(){
        return name+" "+surname+" "+telefon;
    }
    
}
