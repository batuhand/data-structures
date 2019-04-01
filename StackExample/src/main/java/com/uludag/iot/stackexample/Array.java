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
public class Array implements StackInterface {

    Object array[] = new Object[10];
    int top = -1;

    public void push(Object x) throws StackOverFlow {
        if (top == array.length-1) {
            throw new StackOverFlow();
        }
        array[++top] = x;
    }

    public void pop() throws Exception {
        if (top == -1) {
            throw new StackEmpty();
        }
        top--;
    }

    public Object top() throws Exception {
        if (top == -1) {
            throw new StackEmpty();
        }
        return array[top];
    }

    public Object topAndPop() throws Exception {
        if (top == -1) {
            throw new StackEmpty();
        }
        return array[top--];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void makeEmpty() {
        top = -1;
    }
}
