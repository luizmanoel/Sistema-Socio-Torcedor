/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemast.Categoria;
import sistemast.Endereco;
import sistemast.SocioTorcedor;

/**
 *
 * @author antonio
 */
public class SocioTorcedorDAO implements InterfaceDAO{
    //Dado que as demais classes DAO sao bastante similares, considere os comentarios explicativos desta extensiveis as outras.
    
    private String sql; //Ira ser responsavel pelos SQLs executados
    private Connection conn; //Conexao com o BD 
    

    @Override
    public void adiciona(Object obj) {//Adiciona uma entrada de um ST ao BD
        try{
            SocioTorcedor socio = (SocioTorcedor) obj;//Casting do valor recebido. Feito assim por conta da interface usada.
            conn = Conexao.conectar();//Abre a conexao
            PreparedStatement statement;//Statement SQL
            
            //Precisamos tratar, no caso de uma insercao, as tabelas em separado. Seguiremos a ordem de precedencia para evitar erros por falta de chave.
            //Trata a tabela Pessoa
            sql = "Insert into Pessoa (idPessoa, nome, idade, sexo, end_num, end_rua, end_cidade, end_estado, cpf) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";//Comandos sql que serao responsaveis por adicionar a entrada
            
            statement = conn.prepareStatement(sql);//Marca o sql acima para ser executado
            statement.setString(1, String.valueOf(socio.getId()));//Vai substituindo cada um dos sinais "?" do SQL pela String que representa os dados que desejamos operar
            statement.setString(2, socio.getNome());
            statement.setString(3, String.valueOf(socio.getIdade()));
            statement.setString(4, String.valueOf(socio.getSexo()));
            statement.setString(5, socio.getEndereco().getEndNum());
            statement.setString(6, socio.getEndereco().getEndRua());
            statement.setString(7, socio.getEndereco().getEndCidade());
            statement.setString(8, socio.getEndereco().getEndEstado());
            statement.setString(9, socio.getCpf());
            
            statement.execute();//Executa o sql preparado, apos manipularmos as Strings
            
            
            
            
            //Trata a tabela SocioTorcedor
            
            sql = "Insert into SocioTorcedor (cod_st, Categoria_cod_categoria, Pessoa_idPessoa) values (?,?,?)";
            
            statement = conn.prepareStatement(sql);//Preparar novamente um sql, desta vez para a tabela de STs que trabalhamos
            statement.setString(1, String.valueOf(socio.getCodigoSt()));
            statement.setString(2, String.valueOf(socio.getCategoria().getCodigoCategoria()));
            statement.setString(3, String.valueOf(socio.getId()));
            statement.execute();

            
            //Contato
            sql = "Insert into Contato (Pessoa_idPessoa) values(?)";
            
            statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(socio.getId()));
            
            statement.execute();
            
            sql = "Insert into Email (email, Contato_Pessoa_idPessoa) values (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, socio.getEmail());
            statement.setString(2, String.valueOf(socio.getId()));
            
            statement.execute();
            
            sql = "Insert into Telefone (telefone, Contato_Pessoa_idPessoa) values (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, socio.getTelefone());
            statement.setString(2, String.valueOf(socio.getId()));
            
            statement.execute();


            Conexao.closeConn();//Fecha conexao
        
        }catch(SQLException sqlex){
            Logger.getLogger(SocioTorcedorDAO.class.getName()).log(Level.SEVERE, null, sqlex);//Saida de exception padrao
        
        
        }
    }

    @Override
    public void exclui(Object obj) {//Deleta uma entrada de um ST do BD
        
        try{
            SocioTorcedor socio = (SocioTorcedor) obj;
            sql = "DELETE FROM Pessoa Where idPessoa = ?";//Fazemos assim, por conta do BD implementado seguindo "estilo OO". Nele, usamos cascade pra resolver.
            
            conn = Conexao.conectar();
            PreparedStatement statement;
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, String.valueOf(socio.getId()));
            statement.execute();
            
            Conexao.closeConn();
        
        
        }catch(SQLException sqlex){
            Logger.getLogger(SocioTorcedorDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
    }

    @Override
    public void altera(Object obj) { //Altera uma entrada de um ST do BD
        
        try{
        
            SocioTorcedor socio = (SocioTorcedor) obj;
            conn = Conexao.conectar();
            PreparedStatement statement;

            sql = "UPDATE Pessoa SET nome = ?, idade = ?, sexo = ?, end_num = ?, end_rua = ?, end_cidade = ?, end_estado = ?, cpf = ? WHERE idPessoa = ?";//Comando UPDATE ira resolver a questao da atualizacao de valores. id sempre permanece o mesmo. Atencao com a clausura WHERE
            
            statement = conn.prepareStatement(sql);
            System.out.println(socio.getNome());
            
            statement.setString(1, socio.getNome());
            statement.setString(2, String.valueOf(socio.getIdade()));
            statement.setString(3, String.valueOf(socio.getSexo()));
            statement.setString(4, socio.getEndereco().getEndNum());
            statement.setString(5, socio.getEndereco().getEndRua());
            statement.setString(6, socio.getEndereco().getEndCidade());
            statement.setString(7, socio.getEndereco().getEndEstado());
            statement.setString(8, socio.getCpf());
            statement.setString(9, String.valueOf(socio.getId()));//Atenção a isto aqui
            
            statement.execute();
            
            
            //ST
            sql = "UPDATE SocioTorcedor SET Categoria_cod_categoria = ? WHERE Pessoa_idPessoa = ?";
            
            statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(socio.getCategoria().getCodigoCategoria()));
            statement.setString(2, String.valueOf(socio.getId()));//Atenção a isto aqui
            statement.execute();
            
            
            //Contato
            
            sql = "UPDATE Email SET email = ? WHERE Contato_Pessoa_idPessoa = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, socio.getEmail());
            statement.setString(2, String.valueOf(socio.getId()));//Atenção a isto aqui
            
            statement.execute();
            
            sql = "UPDATE Telefone SET telefone = ? WHERE Contato_Pessoa_idPessoa = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, socio.getTelefone());
            statement.setString(2, String.valueOf(socio.getId()));//Atenção a isto aqui
            
            statement.execute();
            
            
            
            Conexao.closeConn();
            
        
        }catch(SQLException sqlex){
            Logger.getLogger(SocioTorcedorDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
        
    }

    @Override
    public ArrayList<Object> consulta(Object obj) {
        ArrayList <Object> lista = new ArrayList();//Lista que recebera os valores para retorno apos a Query no BD
        
        try{
            SocioTorcedor socio = (SocioTorcedor) obj;//A utilidade disto deve ser revista. Provavel uso para outros comandos especificos
            conn = Conexao.conectar();
            PreparedStatement statement;
            
            sql = "SELECT Pessoa.idPessoa, Pessoa.nome, Pessoa.idade, Pessoa.sexo, Pessoa.end_num, Pessoa.end_rua, Pessoa.end_cidade, Pessoa.end_estado, Pessoa.cpf, SocioTorcedor.cod_st, SocioTorcedor.Categoria_cod_categoria FROM Pessoa INNER JOIN SocioTorcedor ON Pessoa.idPessoa = SocioTorcedor.Pessoa_idPessoa"; //Faz o Join das tabelas, visto que implementamos o BD em "estilo OO". Controle feito pelo idPessoa
            
            ResultSet result;//Objeto que armazena o resultado retornado pelo BD apos uma Query (consulta)
            statement = conn.prepareStatement(sql);
            result = statement.executeQuery();
            
            while(result.next()){//Result armazenara os diversos STs retornados, segundo a consulta. Devemos iterar sobre eles e receber seus valore especificos
                SocioTorcedor socio2 = new SocioTorcedor();
                Endereco endf2 = new Endereco();//Precisamos disto, dada a implementacao da classe ST
                
                socio2.setId(result.getInt("idPessoa"));//Pega o valor, da linha atual, coluna idPessoa.
                socio2.setNome(result.getNString("nome"));
                socio2.setIdade(result.getInt("idade"));
                socio2.setSexo(result.getNString("sexo").charAt(0));//Pegar em forma de caractere, pelo tipo que é definido
                
                endf2.setEndNum(result.getNString("end_num"));
                endf2.setEndRua(result.getNString("end_rua"));
                endf2.setEndCidade(result.getNString("end_cidade"));
                endf2.setEndEstado(result.getNString("end_estado"));
                
                socio2.setEndereco(endf2);
                
                socio2.setCpf(result.getNString("cpf"));
                ////////Provavel correcao necessaria aqui
                Categoria cat1 = new Categoria();
                
                cat1.setCodigoCategoria(result.getInt("Categoria_cod_categoria"));
                socio2.setCategoria(cat1);//Corrigir isto depois
                ///////
                socio2.setCodigoSt(result.getInt("cod_st"));
                
                
                
                
                lista.add(socio2);//Adiciona a Lista apos o mesmo ter sido preenchido com os valores de result
            
            
            
            }
        
        
        
        
        }catch(SQLException sqlex){
            Logger.getLogger(SocioTorcedorDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
        return lista;//Por fim retornamos a lista (tipo object). Devemos converter (cast) o tipo se quisermos acessar algum valor ao receber a mesma
        
    }
    
}
