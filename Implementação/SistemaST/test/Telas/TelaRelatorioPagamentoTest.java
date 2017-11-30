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
 * @author Luiz Manoel
 */
public class TelaRelatorioPagamentoTest {
    
    public TelaRelatorioPagamentoTest() {
    }

    /**
     * Test of criaRelatorio method, of class TelaRelatorioPagamento.
     */
    @Test
    public void testCriaRelatorio() {
        System.out.println("criaRelatorio");
        TelaRelatorioPagamento instance = new TelaRelatorioPagamento();
        instance.criaRelatorio();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of preenche method, of class TelaRelatorioPagamento.
     */
    @Test
    public void testPreenche() {
        System.out.println("preenche");
        TelaRelatorioPagamento instance = new TelaRelatorioPagamento();
        instance.preenche();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checaMarcado method, of class TelaRelatorioPagamento.
     */
    @Test
    public void testChecaMarcado() {
        System.out.println("checaMarcado");
        TelaRelatorioPagamento instance = new TelaRelatorioPagamento();
        int expResult = -1;
        int result = instance.checaMarcado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
