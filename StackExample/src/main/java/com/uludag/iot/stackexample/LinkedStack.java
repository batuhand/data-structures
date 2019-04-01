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
public class LinkedStack implements StackInterface{

    StackNode head;

    public void push(Object x) {
        StackNode node = new StackNode(x);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public Object top() throws Exception {
        if (head == null) {
            return null;
        }
        return head.data;     
    }

    public Object topAndPop() throws Exception {
        
        Object data = top();
        pop();
        return data;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void makeEmpty() {
        head = null;
    }

}
