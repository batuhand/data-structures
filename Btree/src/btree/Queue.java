/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btree;

/**
 *
 * @author Cengiz
 */
public class Queue {
     NodeQueue head,tail;
     
     public void enqueue(Node data){
         if(head == null){
             head = new NodeQueue(data);
             tail = head;
             return;
         }
         NodeQueue nq = new NodeQueue(data);
         tail.next = nq;
         tail = nq;
         
             
         
     }
     
     public Node dequeue(){
          if(head == null){
              
             return null;
         }
         Node temp = head.data;
         head = head.next;
         if(head == null)
         {
            tail = null;
         
         }
         return temp;
     }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
        
    }
}
