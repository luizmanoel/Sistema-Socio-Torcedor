/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonio
 */
public class AdministradorDAOTest {
    
    public AdministradorDAOTest() {
    }

    /**
     * Test of adiciona method, of class AdministradorDAO.
     */
    @Test
    public void testAdiciona() {
        System.out.println("adiciona");
        Object obj = null;
        AdministradorDAO instance = new AdministradorDAO();
        instance.adiciona(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delecaoTelefones method, of class AdministradorDAO.
     */
    @Test
    public void testDelecaoTelefones() {
        System.out.println("delecaoTelefones");
        String idPessoa = "";
        AdministradorDAO instance = new AdministradorDAO();
        instance.delecaoTelefones(idPessoa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exclui method, of class AdministradorDAO.
     */
    @Test
    public void testExclui() {
        System.out.println("exclui");
        Object obj = null;
        AdministradorDAO instance = new AdministradorDAO();
        instance.exclui(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altera method, of class AdministradorDAO.
     */
    @Test
    public void testAltera() {
        System.out.println("altera");
        Object obj = null;
        AdministradorDAO instance = new AdministradorDAO();
        instance.altera(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consulta method, of class AdministradorDAO.
     */
    @Test
    public void testConsulta() {
        System.out.println("consulta");
        Object obj = null;
        AdministradorDAO instance = new AdministradorDAO();
        ArrayList<Object> expResult = null;
        ArrayList<Object> result = instance.consulta(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of controleID method, of class AdministradorDAO.
     */
    @Test
    public void testControleID() {
        System.out.println("controleID");
        AdministradorDAO instance = new AdministradorDAO();
        int expResult = 0;
        int result = instance.controleID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
