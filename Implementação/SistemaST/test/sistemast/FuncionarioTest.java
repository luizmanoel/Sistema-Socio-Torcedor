/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luiz Manoel
 */
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }

    /**
     * Test of getCargo method, of class Funcionario.
     */
   

    /**
     * Test of toStringDataArray method, of class Funcionario.
     */
    @Test
    public void testToStringDataArray() {
        System.out.println("toStringDataArray");
        Funcionario instance = new Funcionario();
        String[] expResult = null;
        String[] result = instance.toStringDataArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of aplicaFiltroData method, of class Funcionario.
     */
    @Test
    public void testAplicaFiltroData() {
        System.out.println("aplicaFiltroData");
        String filtroData = "";
        Funcionario instance = new Funcionario();
        boolean expResult = false;
        boolean result = instance.aplicaFiltroData(filtroData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
