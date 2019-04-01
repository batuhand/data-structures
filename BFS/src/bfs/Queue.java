/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;

/**
 *
 * @author Cengiz
 */
public class Queue {

    Node rear;
    Node front;

    public void enqueue(Object data) {
        Node node = new Node(data);
        if (front == null) {
            rear = node;
            front = node;
            return;
        }
        rear.next = node;
        rear = node;
    }

    public Object dequeue() {
        if (front == null) {
            return null;
        }
        Object tmp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return tmp;
    }

    public String toString() {
        Node tmp = front;
        String tmpString = "";
        while (tmp != null) {
            tmpString += tmp.data.toString();
            tmp = tmp.next;
        }
        return tmpString;
    }

    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }
}
