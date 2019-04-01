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
public class VYLinkedListInterfaceImpl implements VYLinkedListInterface {

    private Node head = null;
    private int len = 0;
    private int limit = 10;

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean add(Data data) {
        if (limit == len + 1) {
            return false;
        }
        Node node = new Node(data);
        node.next = head;
        head = node;
        len++;
        return true;
    }

    @Override
    public Data remove(int idx) {

        if (idx > len) {
            return null;
        }

        Node temp = head;
        Data data = temp.data;
        if (idx == 0) {
            head = head.next;
            len--;
            return data;
        }

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        len--;
        return data;
    }

    @Override
    public boolean remove(Data data) {

        Node temp = head;
        if (data == null) {
            return false;
        }
        if (head == null) {
            return false;
        }
        if (head.data.id == data.id) {
            head = head.next;
            len--;
            return true;
        }

        for (int i = 0; i < len; i++) {
            if (temp.next != null) {
                if (temp.next.data.id == data.id) {
                    temp.next = temp.next.next;
                    len--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Data get(int idx) {
        Node temp = head;
        if (idx >= len) {
            return null;
        }

        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    @Override
    public int getLength() {
        Node temp = head;
        int sayac = 0;
        while (temp != null) {
            sayac++;
            temp = temp.next;
        }
        return sayac;
    }

    @Override
    public int getLimit() {
        return limit;
    }

    @Override
    public boolean setLimit(int limit) {
        if (limit < len) {
            return false;
        }
        this.limit = limit;
        return true;
    }

    @Override
    public void clear() {
        head = null;
        len = 0;
    }

    @Override
    public String toString() {

        Node temp = head;
        StringBuilder strBuilder = new StringBuilder();
        boolean first = false;
        while (temp != null) {
            if (!first) {
                first = true;
                strBuilder.append(temp.data.toString());
            } else {
                strBuilder.append(";" + temp.data.toString());
            }
            temp = temp.next;
        }
        return strBuilder.toString();
    }

}
