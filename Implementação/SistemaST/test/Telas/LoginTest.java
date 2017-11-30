/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonio
 */
public class LoginTest {
    
    public LoginTest() {
    }

    /**
     * Test of checagemLoginAdm method, of class Login.
     */
    @Test
    public void testChecagemLoginAdm() {
        System.out.println("checagemLoginAdm");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checagemLoginAdm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checagemLoginFunc method, of class Login.
     */
    @Test
    public void testChecagemLoginFunc() {
        System.out.println("checagemLoginFunc");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checagemLoginFunc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    
    
}
