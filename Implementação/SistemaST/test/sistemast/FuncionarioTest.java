/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> 81434f5c1a9bdcf4368f7bf8f912a8171c4143ac
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
<<<<<<< HEAD
 * @author Luiz Manoel
=======
 * @author antonio
>>>>>>> 81434f5c1a9bdcf4368f7bf8f912a8171c4143ac
 */
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }

<<<<<<< HEAD
    /**
     * Test of getCargo method, of class Funcionario.
     */
   
=======
    
>>>>>>> 81434f5c1a9bdcf4368f7bf8f912a8171c4143ac

    /**
     * Test of toStringDataArray method, of class Funcionario.
     */
    @Test
    public void testToStringDataArray() {
        System.out.println("toStringDataArray");
        Funcionario instance = new Funcionario();
<<<<<<< HEAD
        String[] expResult = null;
=======
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
>>>>>>> 81434f5c1a9bdcf4368f7bf8f912a8171c4143ac
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
<<<<<<< HEAD
        boolean expResult = false;
=======
        boolean expResult = true;
>>>>>>> 81434f5c1a9bdcf4368f7bf8f912a8171c4143ac
        boolean result = instance.aplicaFiltroData(filtroData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
