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
public class Node {
    Node neighbours[] = new Node[4];
    int visitCount;
    int no;
    
 

    Node() {
        
    }
    
    /*
    0 sag, 1 asagi, 2 sol, 3 ust
    */    
    public void add(Node node, int yon){
        neighbours[yon] = node;
         
    }
    
}
