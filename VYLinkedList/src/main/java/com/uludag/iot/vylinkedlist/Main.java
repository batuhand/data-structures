/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uludag.iot.vylinkedlist;

/**
 *
 * @author Cengiz
 */
public class Main {

    public static void main(String[] args) {

        VYLinkedListInterface instance = new VYLinkedListInterfaceImpl();

        Student student = new Student();
        student.name = "A";
        student.id = 0;
        instance.add(student);

        Student student2 = new Student();
        student2.id = 1;
        student2.name = "B";
        instance.add(student2);

        student = new Student();
        student.id = 2;
        student.name = "C";
        instance.add(student);

        System.out.println(instance.toString());

        instance.remove(0);
        System.out.println(instance.toString());

    }

}
