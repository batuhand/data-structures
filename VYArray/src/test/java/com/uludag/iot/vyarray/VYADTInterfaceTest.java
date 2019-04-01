/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uludag.iot.vyarray;

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
public class VYADTInterfaceTest {

    public VYADTInterfaceTest() {
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
     * Test of add method, of class VYADTInterface.
     */
    @Test
    public void testAdd_char() {
        System.out.println("add");
        char c = 'A';
        VYADTInterface instance = new MyArray();
        instance.add(c);
        char result[] = instance.toCharArray();
        assertTrue("eklendi", result[0] == c);
        instance.add('B');
        assertTrue("eklendi", result[0] == c && result[1] == 'B');

        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class VYADTInterface.
     */
    @Test
    public void testAdd_VYADTInterface() {
        System.out.println("add");
        VYADTInterface instance = new MyArray();
        instance.add("merhaba");

        String result1 = instance.toString();
        assertTrue(result1.equals("merhaba"));

        VYADTInterface instance2 = new MyArray();
        instance2.add(instance);
        instance2.add("VY");

        String result2 = instance2.toString();
        assertTrue(result2.equals("merhabaVY"));

    }

    /**
     * Test of remove method, of class VYADTInterface.
     */
    @Test
    public void testRemove_char() {
        System.out.println("remove");
        char c = ' ';
        VYADTInterface instance = new MyArray();
        instance.add("merhaba");
        instance.remove('e');
        assertTrue(instance.toString().equals("m_rhaba"));
    }

    /**
     * Test of find method, of class VYADTInterface.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        char c = ' ';
        VYADTInterface instance = new MyArray();
        instance.add("merhaba");
        int result = instance.find('h');
        assertEquals(3, result);

    }

    /**
     * Test of remove method, of class VYADTInterface.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int idx = 0;
        VYADTInterface instance = new MyArray();
        instance.add("merhaba");
        boolean expResult = false;
        boolean result = instance.remove(1);
        assertEquals(instance.toString(), "m_rhaba");
    }

    /**
     * Test of sortOddEven method, of class VYADTInterface.
     */
    @Test
    public void testSortOddEven() {
        System.out.println("sortOddEven");
        VYADTInterface instance = new MyArray();
        instance.add("merhaba123456789");
        instance.sortOddEven();
        assertEquals(instance.toString(), "135792468merhaba");
    }

    /**
     * Test of toString method, of class VYADTInterface.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        VYADTInterface instance = new MyArray();
        instance.add("merhaba123456789");
        String expResult = "";
        String result = instance.toString();
        assertEquals("merhaba123456789", result);
    }

    /**
     * Test of toCharArray method, of class VYADTInterface.
     */
    @Test
    public void testToCharArray() {
        System.out.println("toCharArray");
        VYADTInterface instance = new MyArray();
        instance.add("merhaba");

        char[] result = instance.toCharArray();
        String expResult = "merhaba___";
        assertArrayEquals(expResult.toCharArray(), result);

    }

    /**
     * Test of encrypt method, of class VYADTInterface.
     */
    @Test
    public void testEncryptDecrypt() {
        System.out.println("encrypt");
        String str = "";
        VYADTInterface instance = new MyArray();
       // instance.add("merhaba");
        instance.encrypt("merhaba");
        String result = instance.decrypt();
        assertTrue(result.equals("merhaba"));
    }

    /**
     * Test of calculateMean method, of class VYADTInterface.
     */
    @Test
    public void testCalculateMean() {
        System.out.println("calculateMean");
        VYADTInterface instance = new MyArray();
        instance.add("46825");

        int result = instance.calculateMean();
        assertEquals(5, result);

    }

    /**
     * Test of clearByMean method, of class VYADTInterface.
     */
    @Test
    public void testClearByMean() {
        System.out.println("clearByMean");
        VYADTInterface instance = new MyArray();
        instance.add("46825");

        instance.clearByMean();
        String result = instance.toString();
        assertEquals("685", result);

    }

}
