/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uludag.iot.stackexample;

/**
 *
 * @author Cengiz
 */
public class StackNode {
    
    StackNode next;
    Object data;

    public StackNode(Object data) {
        this.data = data;
    }
    
}
