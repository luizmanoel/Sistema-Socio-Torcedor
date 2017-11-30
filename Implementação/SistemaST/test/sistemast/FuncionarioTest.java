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
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }

    

    /**
     * Test of toStringDataArray method, of class Funcionario.
     */
    @Test
    public void testToStringDataArray() {
        System.out.println("toStringDataArray");
        Funcionario instance = new Funcionario();
        instance.setId(0);
        instance.setNome("Irineu");
        instance.setCargo("Cargo");
        instance.setCodigoFuncionario(0);
        instance.setCpf("000");
        instance.setSexo('M');
        instance.setIdade(0);
        instance.setSalario(0.0);
        
        Email email = new Email();
        email.setEndereco("aaa");
        email.setCodEmail(0);
        ArrayList<Email> listaE = new ArrayList<Email>();
        listaE.add(email);
        
        instance.setEmail(listaE);
        
        Telefone tel = new Telefone();
        tel.setCodTelefone(0);
        tel.setNumero("000");
        ArrayList <Telefone> listaT = new ArrayList<Telefone>();
        listaT.add(tel);
        
        instance.setTelefone(listaT);
        String[] expResult = {"Irineu", "Cargo", "000", "M", "0", "aaa\n", "000\n", "0", "0.0"};
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
        boolean expResult = true;
        boolean result = instance.aplicaFiltroData(filtroData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
