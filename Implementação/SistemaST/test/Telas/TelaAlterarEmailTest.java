/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import sistemast.Email;

/**
 *
 * @author antonio
 */
public class TelaAlterarEmailTest {
    
    public TelaAlterarEmailTest() {
    }

    /**
     * Test of configTabela method, of class TelaAlterarEmail.
     */
    @Test
    public void testConfigTabela() {
        System.out.println("configTabela");
        ArrayList<Email> emailAlt = new ArrayList<Email> ();
        TelaAlterarEmail instance = new TelaAlterarEmail(emailAlt);
        instance.configTabela();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
