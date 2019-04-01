/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uludag.iot.vylinkedlist;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cengiz
 */
public class VYLinkedListInterfaceTest {

    public VYLinkedListInterfaceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class VYLinkedListInterface.
     */
    @Test
    public void testAdd() {
        System.out.println("add");

        VYLinkedListInterface instance = new VYLinkedListInterfaceImpl();

        Student s = new Student();
        s.name = "Ahmet";
        boolean result = instance.add(s);
        assertEquals(true, result);

        s = new Student();
        s.name = "Mehmet";
        result = instance.add(s);
        assertEquals(true, result);

        Student temp = (Student) instance.get(0);
        assertEquals(temp.name, "Mehmet");
        temp = (Student) instance.get(1);
        assertEquals(temp.name, "Ahmet");

        temp = (Student) instance.get(2);
        
        assertNull(temp);

        instance.clear();

        for (int i = 0; i < instance.getLimit()-1; i++) {
            result = instance.add(s);
            assertEquals(true, result);
        }

        result = instance.add(s);
        assertEquals(false, result);
    }

    /**
     * Test of isEmpty method, of class VYLinkedListInterface.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        VYLinkedListInterface instance = new VYLinkedListInterfaceImpl();
        boolean result = instance.isEmpty();
        assertEquals(true, result);
        Student s = new Student();
        s.name = "Ahmet";
        instance.add(s);
        result = instance.isEmpty();
        assertEquals(false, result);
    }

    /**
     * Test of remove method, of class VYLinkedListInterface.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");

        VYLinkedListInterface instance = new VYLinkedListInterfaceImpl();
        Student s = new Student();
        s.name = "Ahmet";
        boolean resultb = instance.add(s);
        assertEquals(true, resultb);

        Object expResult = null;
        Student result = (Student) instance.remove(0);
        assertEquals("Ahmet", result.name);
    }

    /**
     * Test of remove method, of class VYLinkedListInterface.
     */
    @Test
    public void testRemove_Object() {
        System.out.println("remove");
        Object data = null;
        VYLinkedListInterface instance = new VYLinkedListInterfaceImpl();
        Student s = new Student();
        s.name = "Ahmet";
        boolean resultb = instance.add(s);
        assertEquals(true, resultb);
        s = new Student();
        s.name = "Mehmet";
        resultb = instance.add(s);
        assertEquals(true, resultb);

        Data o = instance.get(1);
        boolean result = instance.remove(o);
        assertEquals(true, result);

        Student student = (Student) instance.get(1);
        assertNull(student);
      //  assertNotEquals(student.name, "Ahmet");

        o = instance.get(10);
        assertNull(o);
        
        result = instance.remove(o);
        assertEquals(false, result);
    }

    /**
     * Test of getLength method, of class VYLinkedListInterface.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        VYLinkedListInterface instance = new VYLinkedListInterfaceImpl();
        Student s = new Student();
        s.name = "Ahmet";
        boolean resultb = instance.add(s);
        assertEquals(true, resultb);

        int result = instance.getLength();
        assertEquals(1, result);

        s = new Student();
        s.name = "Ahmet";
        resultb = instance.add(s);
        assertEquals(true, resultb);

        result = instance.getLength();
        assertEquals(2, result);

    }

    /**
     * Test of toString method, of class VYLinkedListInterface.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        VYLinkedListInterface instance = new VYLinkedListInterfaceImpl();

        Student s = new Student();
        s.name = "Ahmet";
        boolean resultb = instance.add(s);
        assertEquals(true, resultb);

        s = new Student();
        s.name = "Mehmet";
        resultb = instance.add(s);
        assertEquals(true, resultb);

        String expResult = "Mehmet  ;Ahmet  ";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
