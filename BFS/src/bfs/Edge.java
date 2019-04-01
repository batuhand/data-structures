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
public class Edge {
    
    Vertex a, b;
    int weight;

    public Edge(Vertex a, Vertex b, int weight) {
        this.a = a;
        this.b = b;
        this.weight = weight;
    }
    
    
    
}
