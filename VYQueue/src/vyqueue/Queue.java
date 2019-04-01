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
public class Queue {

    Object myArray[];
    int front, rear, counter;

    public Queue(int maxLen) {
        myArray = new Object[maxLen];
    }
    public boolean isEmpty() {
        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (counter == myArray.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean enqueue(Object o) {
        if (rear == front && myArray[front] == null) {
            myArray[front] = o;
            counter++;
            return true;
        }
        if (isFull()) {
            return false;
        }
        rear++;
        if (rear == myArray.length) {
            rear = 0;
        }
        myArray[rear] = o;
        counter++;
        return true;
    }

    public Object dequeue() {
        if (myArray[front] == null) {
            return null;
        } else {
            Object temp = myArray[front];
            myArray[front] = null;
            if (front == rear) {
                counter --;
                return temp;
            } else {
                front++;
            }
            if (front == myArray.length) {
                front = 0;
            }
            counter --;
            return temp;       
        }
        

    }
}
