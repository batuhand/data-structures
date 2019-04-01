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
public class BFS {

    void bfsSearch(Vertex start, Vertex target) {

        Queue queue = new Queue();
        queue.enqueue(start);
        start.color = 1;
        while (!queue.isEmpty()) {
            Vertex u = (Vertex) queue.dequeue();
            Vertex v = u.getWhiteAdj();
            while (v != null) {
                v.color = 1;
                v.distance = u.distance + 1;

                v.parent = u;

                if (v == target) {
                    System.out.println("uzaklik =:" + v.distance);
                    Vertex temp = v;
                    int weight = 0;
                    while (temp != null) {
                        System.out.print(temp.toString() + "->");
                        if (temp.parent != null) {
                            weight += temp.parent.getWeight(temp);
                        }
                        temp = temp.parent;
                    }

                    System.out.println("mesafe =:" + weight);
                    return;
                }
                queue.enqueue(v);
                v = u.getWhiteAdj();
            }
            u.color = 2;
        }

    }

    public static void main(String[] args) {
        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");
        Vertex g = new Vertex("g");
        Vertex h = new Vertex("h");
        Vertex k = new Vertex("k");
        Vertex j = new Vertex("j");
        Vertex i = new Vertex("i");
        a.addAdj(b, 100);
        a.addAdj(c, 100);
        b.addAdj(d, 45);
        b.addAdj(e, 35);
        c.addAdj(h, 180);
        c.addAdj(i, 50);
        d.addAdj(e, 17);
        e.addAdj(f, 12);
        e.addAdj(g, 8);
        f.addAdj(d, 6);
        i.addAdj(j, 80);
        i.addAdj(k, 30);
        j.addAdj(h, 7);
        j.addAdj(g, 9);
        BFS arama = new BFS();
        arama.bfsSearch(a, g);

    }

}
