/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uludag.iot.stackexample;

/**
 *
 * @author Cengiz
 */
public class Main {

    static Node nodes[] = new Node[10];

    public static void main(String[] args) {

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node();
            nodes[i].no = i;
        }
        nodes[0].add(nodes[1], 3);
        nodes[1].add(nodes[0], 1);
        nodes[1].add(nodes[8], 0);
        nodes[8].add(nodes[1], 2);
        nodes[8].add(nodes[9], 0);
        nodes[9].add(nodes[8], 2);
        nodes[9].add(nodes[2], 3);
        nodes[2].add(nodes[9], 1);
        nodes[2].add(nodes[5], 2);
        nodes[2].add(nodes[3], 3);
        nodes[3].add(nodes[4], 2);
        nodes[3].add(nodes[2], 1);
        nodes[4].add(nodes[3], 0);
        nodes[4].add(nodes[5], 1);
        nodes[4].add(nodes[6], 2);
        nodes[5].add(nodes[2], 0);
        nodes[5].add(nodes[4], 3);
        nodes[6].add(nodes[4], 0);
        nodes[6].add(nodes[7], 1);
        nodes[7].add(nodes[6], 3);
        nodes[7].add(nodes[1], 1);
        nodes[1].add(nodes[7], 3);
        String res = search(nodes[6], nodes[0], "");
        if (res != null) {
            System.out.println(res);
        }

    }

    private static String search(Node source, Node target, String path) {

        if (source == target) {
            return path + " =>" + target.no;
        }

        for (int i = 0; i < source.neighbours.length; i++) {
            Node neighbour = source.neighbours[i];
            if (neighbour != null) {
                if (neighbour.visitCount == 0) {
                    neighbour.visitCount++;
                    String s = search(neighbour, target, path + " =>" + source.no);
                    if (!s.equals("")) {
                        return s;
                    }
                    neighbour.visitCount--;
                }
            }
        }
        return "";
    }

}
