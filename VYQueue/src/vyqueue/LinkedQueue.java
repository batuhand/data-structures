/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vyqueue;

/**
 *
 * @author Cengiz
 */
public class LinkedQueue {
    Node front, rear;
    int counter ;
    
    public boolean enqueue(Object o){
        Node node = new Node(o);
        if(front == null){
            front = node;
            rear = node;
            counter ++;
            return true;
        }
        rear.next= node;
        counter ++;
        rear= rear.next;
        return true;
    }
    public Object dequeue(){
        if(front == null){
            return null;
        }
        Object data = front.data;
        front= front.next;
        if(front == null){
            rear = null;
        }
        counter--;
        return data;
    }
    public boolean isEmpty(){
        if(front == null){
            return true;
        }else
            return false;
    }
}
