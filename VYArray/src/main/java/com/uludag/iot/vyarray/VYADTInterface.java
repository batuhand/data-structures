/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uludag.iot.vyarray;

/**
 *
 * @author Cengiz
 */
public interface VYADTInterface {    
    public void add(char c);
    public void add(String  str);
    public void add(VYADTInterface o);
    public boolean remove(char c);
    public int find(char c);
    public boolean remove (int idx);
    public void sortOddEven();
    public String toString();
    public char[] toCharArray();
    public void encrypt(String str);
    public String decrypt();
    public int calculateMean();
    public void clearByMean();
}
