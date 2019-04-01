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
public class NYLinkedList {

    Node head;

    public void insert(Data data) {

        Node node = new Node(data);
        Node temp = head;

        if (head == null) {
            head = node;
            head.prev = head;
            head.next = head;
            return;
        } else if (head.data.id > data.id) {
            node.next = head;
            head.prev.next = node;
            node.prev = head.prev;
            head.prev = node;
            head = node;
            return;
        }
        while (temp != null) {
            if (temp.data.id < data.id) {
                if (temp.next == head) {
                    temp.next = node;
                    node.prev = temp;
                    node.next = head;
                    head.prev = node;
                    return;
                } else if (temp.next.data.id > data.id) {
                    node.next = temp.next;
                    temp.next = node;
                    node.next.prev = node;
                    node.prev = temp;
                    return;
                }
            }
            temp = temp.next;
        }
    }

    public void list() {

        System.out.println("TOPLAM = " + length());
        System.out.println("ILERI");
        Node temp = head;
        Node temp2 = null;
        while (temp != null) {
            System.out.println(temp.data);
            if (temp.next == head) {
                temp2 = temp;
            }
            temp = temp.next;
            if(temp == head) break;
        }
        System.out.println("GERI");
        while (true) {
            System.out.println(temp2.data);
            if(temp2 == head) break;
            temp2 = temp2.prev;
           // 
        }

    }

    public Data search(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.id == id) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean delete(int id) {
        System.out.println("SIL " + id);
        Node temp = head;
        if (head == null) {
            return false;
        }
        while (temp != null) {
            if (temp.data.id == id) {
                if (head == temp) {
                    head = temp.next;
                }
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int length() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            i++;
            temp = temp.next;
            if(temp == head) break;
        }
        return i;
    }

    public static void main(String[] args) {
        NYLinkedList list = new NYLinkedList();
        Secmen secmen = new Secmen(5, "ahmet", "niliguere");
        list.insert(secmen);
        secmen = new Secmen(10, "ayse", "niliguere");
        list.insert(secmen);
        secmen = new Secmen(8, "mehmet", "niliguere");
        list.insert(secmen);
        secmen = new Secmen(2, "hakan", "niliguere");
        list.insert(secmen);
        list.list();
  /*     System.out.println("ARAMA");
        Secmen s = (Secmen) list.search(8);
        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println("YOK");
        }

        // System.out.println(list.delete(2));
        // list.list();
        System.out.println(list.delete(8));
        list.list();

        list.update(new Secmen(5, "hasan", "niliguere"));
        list.list();
 */   }

    private boolean update(Secmen secmen) {
        Node temp = head;
        while (temp != null) {
            if (secmen.id == temp.data.id) {
                temp.data = secmen;
                return true;
            }
            temp = temp.next;

        }
        return false;
    }
}
