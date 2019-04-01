/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uludag.iot.secmen;

/**
 *
 * @author Cengiz
 */
public class Secmen extends Data {

    String name;
    String addres;

    public Secmen(int id, String name, String addres) {
        this.id = id;
        this.name = name;
        this.addres = addres;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+ addres; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
