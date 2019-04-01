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
public class Node {
    Node prev;
    Node next;
    Data data;

    public Node(Data data) {
        this.data = data;
    }
    
}
