/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import sistemast.Telefone;

/**
 *
 * @author antonio
 */
public class TelaAlterarTelefoneTest {
    
    public TelaAlterarTelefoneTest() {
    }

    /**
     * Test of configTabela method, of class TelaAlterarTelefone.
     */
    @Test
    public void testConfigTabela() {
        System.out.println("configTabela");
        ArrayList <Telefone> tel = new ArrayList<Telefone>();
        TelaAlterarTelefone instance = new TelaAlterarTelefone(tel);
        instance.configTabela();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
