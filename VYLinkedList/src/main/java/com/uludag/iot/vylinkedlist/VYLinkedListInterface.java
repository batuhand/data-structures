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
public interface VYLinkedListInterface {    
    boolean isEmpty();
    boolean add(Data data);
    Data remove(int idx);
    boolean remove(Data data);
    Data get(int idx);
    int getLength();   
    String toString();
    int getLimit();
    boolean setLimit(int limit);
    void clear();
}
