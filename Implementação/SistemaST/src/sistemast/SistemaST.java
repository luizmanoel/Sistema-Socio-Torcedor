
package sistemast;

import Telas.TelaAlterarFuncionario;
import Telas.TelaAlterarST;
import dao.CategoriaDAO;
import dao.PagamentoDAO;
import dao.SocioTorcedorDAO;
import java.util.ArrayList;
/**
 *
 * @author antonio
 */
public class SistemaST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
       Funcionario f = new Funcionario();
       f.setCargo("oiuyp");
       f.setCodigoFuncionario(23);
       f.setCpf("98606");
       f.setEmail("sdçjfh");
       f.setIdade(22);
       f.setNome("Luiz  Manoel dos Santos");
       f.setSalario(21312);
       f.setSexo('M');
       f.setTelefone("ilhlihgf");
       TelaAlterarFuncionario t = new TelaAlterarFuncionario(f);
       
       SocioTorcedor st = new SocioTorcedor();
       st.setCodigoSt(12);
       st.setCpf("09849210605");
       st.setEmail("manoelsbt@hotmail.com");
       st.setIdade(22);
       st.setNome("Luiz Manoel dos Santos");
       st.setSexo('M');
       st.setTelefone("32 984001185");
       
       TelaAlterarST t1 = new TelaAlterarST(st);
       t1.setVisible(true);

        SocioTorcedor st1 = new SocioTorcedor();
        Categoria cat1 = new Categoria();
        cat1.setCodigoCategoria(11211);
        cat1.setNome("Categoria1");
        cat1.setBeneficios("Varios beneficios");
        cat1.setValorMensalidade(100);
       
        st1.setId(22);
        st1.setCodigoSt(222);
        st1.setNome("TesteSocio2");
        st1.setCategoria(cat1);
        st1.setCpf("222");
        st1.setEmail("bbalterado@aa");
        st1.setTelefone("313121");
        st1.setSexo('m');
        
        Endereco end1 = new Endereco();
        end1.setEndNum("77");
        end1.setEndRua("Rua X");
        end1.setEndCidade("Cidade Y");
        end1.setEndEstado("Estado W");
       
        st1.setEndereco(end1);
        
        CategoriaDAO catdao = new CategoriaDAO();
        //catdao.adiciona(cat1);
        
        
        SocioTorcedorDAO stdao= new SocioTorcedorDAO(); 
        
        //stdao.adiciona(st1);//teste
        //stdao.altera(st1);
        //stdao.exclui(st1);
        
        /*ArrayList <Object> lista1 = new ArrayList();
        lista1 = stdao.consulta(st1);
        SocioTorcedor streceive = new SocioTorcedor();
        streceive = (SocioTorcedor) lista1.get(lista1.size()-1);
        
        System.out.println(streceive.getCodigoSt() + " " + streceive.getNome());*/
        
        
        Pagamento pg1 = new Pagamento();
        pg1.setCategoria(st1.getCategoria().getNome());
        pg1.setCodigoST(st1.getCodigoSt());
        pg1.setValor(100);
        pg1.setDetalhesPagamento("aaaaa");
        
        PagamentoDAO pgdao = new PagamentoDAO();
        //pgdao.adiciona(pg1);

    }
    
}
