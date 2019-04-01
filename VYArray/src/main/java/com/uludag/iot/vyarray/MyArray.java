/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uludag.iot.vyarray;

import java.util.Random;

/**
 *
 * @author Cengiz
 */
public class MyArray implements VYADTInterface {

    char array[];
    int index = 0;
    static final char EMPTY_CELL = '_';

    public MyArray() {
        array = new char[10];
    }

    public MyArray(int size) {
        array = new char[size];
    }

    public void expand(int size) {
        char newArray[] = new char[size];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != EMPTY_CELL) {
                newArray[j] = array[i];
                j++;
            }
        }
        array = newArray;
        index = j;
    }

    @Override
    public void add(char c) {
        if (index == array.length) {
            expand(array.length * 2);
        }
        array[index] = c;
        index++;
    }

    @Override
    public void add(String str) {

        if (index + str.length() > array.length) {
            expand((index + str.length()) * 2);
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            add(c);
        }
    }

    @Override
    public void add(VYADTInterface o) {
        add(o.toString());
    }

    @Override
    public boolean remove(char c) {
        int idx = find(c);
        if (idx == -1) {
            return false;
        }
        return remove(idx);
    }

    @Override
    public int find(char c) {
        for (int i = 0; i < index; i++) {
            if (array[i] == c) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(int idx) {
        if (idx > 0 && idx < index) {
            array[idx] = EMPTY_CELL;
            return true;
        }
        return false;
    }

    @Override
    public void sortOddEven() {
        char newArray[] = new char[array.length];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '1' || array[i] == '3' || array[i] == '5'
                    || array[i] == '7' || array[i] == '9') {
                newArray[j] = array[i];
                array[i] = EMPTY_CELL;
                j++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '0' || array[i] == '2' || array[i] == '4'
                    || array[i] == '6' || array[i] == '8') {
                newArray[j] = array[i];
                array[i] = EMPTY_CELL;
                j++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != EMPTY_CELL) {
                newArray[j] = array[i];
                j++;
            }
        }
        array = newArray;
        index = j;
    }

    @Override
    public char[] toCharArray() {       
         return toString().toCharArray();
    }

    @Override
    public void encrypt(String str) {
        Random r = new Random();
        expand(500);
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (r.nextInt() % 128);
        }

        boolean cont = true;
        int idx = 0;
        while (cont) {
            idx = r.nextInt();
            if (idx < 0) {
                idx = idx * -1;
            }
            idx = idx % array.length;
            if (idx + str.length() + 3 < array.length) {
                cont = false;
            }
        }
        array[idx] = 'V';
        array[idx + 1] = 'Y';
        array[idx + 2] = (char) (str.length() + 48);
        for (int i = 0; i < str.length(); i++) {
            array[idx + 3 + i] = str.charAt(i);
        }
        index = array.length;
    }

    @Override
    public String decrypt() {
        String str = "";
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 'V' && array[i + 1] == 'Y') {
                int len = array[i + 2] - 48;
                for (int j = 0; j < len; j++) {
                    str = str + array[i + 3 + j];
                }
                i = i + 2 + len;
            }

        }
        return str;
    }

    @Override
    public int calculateMean() {
        int toplam = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != EMPTY_CELL && array[i] >= '0' && array[i] <= '9') {
                toplam = array[i] - 48;
                count++;
            }
        }
        return toplam / count;

    }

  
    @Override
    public void clearByMean() {
        int mean = calculateMean();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != EMPTY_CELL && array[i] >= '0' && array[i] <= '9') {
                int s = array[i]-48;
                if(s<mean)
                    array[i] = EMPTY_CELL;
            }
        }      
    }
    
    @Override
     public String toString(){
         StringBuilder builder = new StringBuilder();
         
         for (int i = 0; i < array.length; i++) {
             builder.append(array[i]);
         }
         return builder.toString();
     }

}
