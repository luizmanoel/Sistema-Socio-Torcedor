
package sistemast;

import Telas.TelaAlterarFuncionario;
import Telas.TelaAlterarST;

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
       f.setEndereco("end");
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
       st.setEndereco("Rua São Luiz, 2");
       st.setIdade(22);
       st.setNome("Luiz Manoel dos Santos");
       st.setSexo('M');
       st.setTelefone("32 984001185");
       
       TelaAlterarST t1 = new TelaAlterarST(st);
       t1.setVisible(true);
    }
    
}
