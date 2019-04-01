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
public interface StackInterface {

    public void push(Object x) throws StackOverFlow;

    public void pop() throws Exception;

    public Object top() throws Exception;

    public Object topAndPop() throws Exception;

    public boolean isEmpty();

    public void makeEmpty();

}
