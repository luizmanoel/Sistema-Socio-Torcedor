/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import sistemast.Categoria;
import sistemast.Email;
import sistemast.Endereco;
import sistemast.SocioTorcedor;
import sistemast.Telefone;

/**
 *
 * @author Luiz Manoel
 */
public class TelaVerDadosSTTest {
    
    public TelaVerDadosSTTest() {
    }

    /**
     * Test of preenche method, of class TelaVerDadosST.
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
        Categoria c = new Categoria();
        c.setBeneficios("huj");
        c.setCodigoCategoria(3);
        c.setNome("Lj");
        c.setValorMensalidade(78);        
        SocioTorcedor st = new SocioTorcedor();
        st.setCategoria(c);
        st.setCodigoSt(4);
        st.setCpf("09");
        st.setEmail(em);
        st.setEndereco(e);
        st.setId(7);
        st.setIdade(8);
        st.setNome("98");
        st.setSexo('M');
        st.setTelefone(tel);
        TelaVerDadosST instance = new TelaVerDadosST(st);
        instance.preenche();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
