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
public class VYQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedQueue gani = new LinkedQueue();        
        System.out.println(gani.enqueue(3));
        System.out.println(gani.enqueue(4));
        System.out.println(gani.enqueue(5));
        System.out.println(gani.enqueue(6));
        System.out.println(gani.enqueue(7));
        System.out.println(gani.enqueue(8));
        System.out.println(gani.dequeue());
        System.out.println(gani.dequeue());
        System.out.println(gani.dequeue());
        System.out.println(gani.dequeue());
        System.out.println(gani.dequeue());
        System.out.println(gani.dequeue());
        System.out.println(gani.isEmpty());
        
    }
    
}

