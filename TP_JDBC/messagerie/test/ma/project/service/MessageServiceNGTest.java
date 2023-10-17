/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.service;

import java.util.List;
import ma.project.beans.Message;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Asmaa
 */
public class MessageServiceNGTest {
    
    public MessageServiceNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of create method, of class MessageService.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Message o = null;
        MessageService instance = new MessageService();
        boolean expResult = false;
        boolean result = instance.create(o);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class MessageService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Message o = null;
        MessageService instance = new MessageService();
        boolean expResult = false;
        boolean result = instance.update(o);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class MessageService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Message o = null;
        MessageService instance = new MessageService();
        boolean expResult = false;
        boolean result = instance.delete(o);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class MessageService.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        MessageService instance = new MessageService();
        Message expResult = null;
        Message result = instance.getById(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class MessageService.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        MessageService instance = new MessageService();
        List expResult = null;
        List result = instance.getAll();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
