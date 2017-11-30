/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import sistemast.Administrador;
import sistemast.Email;
import sistemast.Endereco;
import sistemast.Funcionario;
import sistemast.Telefone;

/**
 *
 * @author Luiz Manoel
 */
public class TelaVerDadosFuncionarioTest {
    
    public TelaVerDadosFuncionarioTest() {
    }

    /**
     * Test of preenche method, of class TelaVerDadosFuncionario.
     */
    @Test
    public void testPreenche() {
        Endereco e = new Endereco();
        e.setEndCidade("kjh");
        e.setEndEstado("kjh");
        e.setEndNum("2");
        e.setEndRua("khk");
        Telefone t = new Telefone();
        t.setCodTelefone(23);
        t.setNumero("876976");
        ArrayList<Telefone> tel = new ArrayList<>();
        ArrayList<Email> em = new ArrayList<>();
        tel.add(t);
        Email email = new Email();
        email.setCodEmail(4);
        email.setEndereco("kjhkj");
        em.add(email);
        Funcionario func = new Funcionario();
        func.setCargo("jh");
        func.setCodigoFuncionario(3);
        func.setCpf("9879");
        func.setEmail(em);
        func.setEndereco(e);
        func.setId(5);
        func.setIdade(8);
        func.setNome("kjh");
        func.setSalario(78);
        func.setSenha("987");
        func.setSexo('F');
        func.setTelefone(tel);
        System.out.println("preenche");
        
        TelaVerDadosFuncionario instance = new TelaVerDadosFuncionario(func) ;
        instance.preenche();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
