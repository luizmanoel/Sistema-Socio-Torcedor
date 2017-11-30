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
import sistemast.Telefone;

/**
 *
 * @author Luiz Manoel
 */
public class TelaVerDadosAdministradorTest {
    
    public TelaVerDadosAdministradorTest() {
    }

    /**
     * Test of preenche method, of class TelaVerDadosAdministrador.
     */
    @Test
    public void testPreenche() {
        System.out.println("preenche");
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
        Administrador admin = new Administrador();
        admin.setCodigoAdministrador(23);
        admin.setCpf("087987");
        admin.setEndereco(e);
        admin.setId(45);
        admin.setIdade(12);
        admin.setNome("ioh");
        admin.setSalario(123);
        admin.setSenha("jjhkhkj");
        admin.setSexo('M');
        admin.setTelefone(tel);
        admin.setEmail(em);
        TelaVerDadosAdministrador instance = new TelaVerDadosAdministrador(admin);
        instance.preenche();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
