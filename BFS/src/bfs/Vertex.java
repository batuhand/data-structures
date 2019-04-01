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
public class Vertex {
    Edge adj[]= new Edge[10];
    String id;
    Vertex parent;
    int distance;
    int color;//0 = beyaz, 1 = gri , 2 = siyah.
    public void addAdj(Vertex v, int weight){
        Edge edge = new Edge(this,v,weight);
        for(int i=0;i<adj.length;i++){
            if(adj[i] == null){
                adj[i] = edge;
                return;
            }
        }
    }

    public Vertex(String id) {
        this.id = id;
    }
     public Vertex getWhiteAdj(){
         
         for(int i=0;i<adj.length;i++){
            if(adj[i] == null){
                return null;
            }else if(adj[i].b.color == 0){
               return adj[i].b;              
            }            
         }
         return null;
     }
     
     public String toString(){
         return id;
     }
     
     public int getWeight(Vertex b){
         for (int i = 0; i < 10; i++) {
             if(adj[i].b == b){
                 return adj[i].weight;
             }             
         }
         return -1;
     }
}
