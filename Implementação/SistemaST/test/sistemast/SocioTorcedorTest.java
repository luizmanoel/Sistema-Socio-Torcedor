/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonio
 */
public class SocioTorcedorTest {
    
    public SocioTorcedorTest() {
    }

    
    /**
     * Test of numerosTelefone method, of class SocioTorcedor.
     */
    @Test
    public void testNumerosTelefone() {
        System.out.println("numerosTelefone");
        SocioTorcedor instance = new SocioTorcedor();
        
        ArrayList<Telefone> ems = new ArrayList<Telefone>();
        Telefone m1 = new Telefone();
        m1.setNumero("");
        ems.add(m1);
        instance.setTelefone(ems);
        
        
        
        
        String[] expResult = {""};
        String[] result = instance.numerosTelefone();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of endEmails method, of class SocioTorcedor.
     */
    @Test
    public void testEndEmails() {
        System.out.println("endEmails");
        SocioTorcedor instance = new SocioTorcedor();
        
        ArrayList<Email> ems = new ArrayList<Email>();
        Email m1 = new Email();
        m1.setEndereco("");
        ems.add(m1);
        instance.setEmail(ems);
        
        String[] expResult = {""};
        String[] result = instance.endEmails();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pagaMensalidade method, of class SocioTorcedor.
     */
    @Test
    public void testPagaMensalidade() {
        System.out.println("pagaMensalidade");
        int codigoSt = 0;
        SocioTorcedor instance = new SocioTorcedor();
        instance.pagaMensalidade(codigoSt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    /**
     * Test of emailStringify method, of class SocioTorcedor.
     */
    @Test
    public void testEmailStringify() {
        System.out.println("emailStringify");
        SocioTorcedor instance = new SocioTorcedor();
        
        ArrayList<Email> ems = new ArrayList<Email>();
        Email m1 = new Email();
        m1.setEndereco("aa");
        ems.add(m1);
        instance.setEmail(ems);
        
        String expResult = "aa\n";
        String result = instance.emailStringify();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of telefoneStringify method, of class SocioTorcedor.
     */
    @Test
    public void testTelefoneStringify() {
        System.out.println("telefoneStringify");
        SocioTorcedor instance = new SocioTorcedor();
        
        ArrayList<Telefone> ems = new ArrayList<Telefone>();
        Telefone m1 = new Telefone();
        m1.setNumero("a");
        ems.add(m1);
        instance.setTelefone(ems);
        
        
        String expResult = "a\n";
        String result = instance.telefoneStringify();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checaCategoria method, of class SocioTorcedor.
     */
    @Test
    public void testChecaCategoria() {
        System.out.println("checaCategoria");
        
        Categoria cat1 = new Categoria();
        cat1.setCodigoCategoria(0);
        
        SocioTorcedor instance = new SocioTorcedor();
        instance.setCategoria(cat1);
        
        boolean expResult = true;
        boolean result = instance.checaCategoria(cat1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of aplicaFiltroData method, of class SocioTorcedor.
     */
    @Test
    public void testAplicaFiltroData() {
        System.out.println("aplicaFiltroData");
        String filtroData = "";
        SocioTorcedor instance = new SocioTorcedor();
        boolean expResult = true;
        boolean result = instance.aplicaFiltroData(filtroData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
