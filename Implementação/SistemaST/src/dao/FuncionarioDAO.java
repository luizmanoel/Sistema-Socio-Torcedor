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
import sistemast.Endereco;
import sistemast.Funcionario;

/**
 *
 * @author antonio
 */
public class FuncionarioDAO implements InterfaceDAO {
    private String sql;
    private Connection conn;

    @Override
    public void adiciona(Object obj) {//Adiciona um Func. ao BD
        try{
            Funcionario funcionario = (Funcionario) obj;
            conn = Conexao.conectar();
            PreparedStatement statement;


            sql = "Insert into Pessoa (idPessoa, nome, idade, sexo, end_num, end_rua, end_cidade, end_estado, cpf) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(funcionario.getId()));
            statement.setString(2, funcionario.getNome());
            statement.setString(3, String.valueOf(funcionario.getIdade()));
            statement.setString(4, String.valueOf(funcionario.getSexo()));
            statement.setString(5, funcionario.getEndereco().getEndNum());
            statement.setString(6, funcionario.getEndereco().getEndRua());
            statement.setString(7, funcionario.getEndereco().getEndCidade());
            statement.setString(8, funcionario.getEndereco().getEndEstado());
            statement.setString(9, funcionario.getCpf());

            statement.execute();





            //Funcionario
            sql = "Insert into Funcionario (senha, cod_func, salario, Pessoa_idPessoa) values (?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, funcionario.getSenha());//Colocar senha em funcionario
            statement.setString(2, String.valueOf(funcionario.getCodigoFuncionario()));
            statement.setString(3, String.valueOf(funcionario.getSalario()));
            statement.setString(4, String.valueOf(funcionario.getId()));
            
            statement.execute();
            
            
            //Contato
            sql = "Insert into Contato (Pessoa_idPessoa) values(?)";
            
            statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(funcionario.getId()));
            
            statement.execute();
            
            sql = "Insert into Email (email, Contato_Pessoa_idPessoa) values (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, funcionario.getEmail());
            statement.setString(2, String.valueOf(funcionario.getId()));
            
            statement.execute();
            
            sql = "Insert into Telefone (telefone, Contato_Pessoa_idPessoa) values (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, funcionario.getTelefone());
            statement.setString(2, String.valueOf(funcionario.getId()));
            
            statement.execute();
            
            
            
            Conexao.closeConn();
            




        }catch(SQLException sqlex){
             Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
    }

    @Override
    public void exclui(Object obj) {//Deleta um Func. do BD
        
        try{
            Funcionario funcionario = (Funcionario) obj;
            sql = "DELETE FROM Pessoa Where idPessoa = ?";//Fazemos assim, por conta do BD implementado seguindo "estilo OO". Nele, usamos cascade pra resolver.
            
            conn = Conexao.conectar();
            PreparedStatement statement;
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, String.valueOf(funcionario.getId()));
            statement.execute();
            
            Conexao.closeConn();
        
        
        }catch(SQLException sqlex){
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
    }

    @Override
    public void altera(Object obj) {//Altera uma entrada de um Func. do BD
        
        
        try{
        
            Funcionario funcionario = (Funcionario) obj;
            conn = Conexao.conectar();
            PreparedStatement statement;

            sql = "UPDATE Pessoa SET nome = ?, idade = ?, sexo = ?, end_num = ?, end_rua = ?, end_cidade = ?, end_estado = ?, cpf = ? WHERE idPessoa = ?";//id sempre permanece o mesmo
            
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, funcionario.getNome());
            statement.setString(2, String.valueOf(funcionario.getIdade()));
            statement.setString(3, String.valueOf(funcionario.getSexo()));
            statement.setString(4, funcionario.getEndereco().getEndNum());
            statement.setString(5, funcionario.getEndereco().getEndRua());
            statement.setString(6, funcionario.getEndereco().getEndCidade());
            statement.setString(7, funcionario.getEndereco().getEndEstado());
            statement.setString(8, funcionario.getCpf());
            statement.setString(9, String.valueOf(funcionario.getId()));
            
            statement.execute();
            
            
            //Funcionario
            sql = "UPDATE Funcionario SET senha= ?, salario = ? WHERE Pessoa_idPessoa = ?";
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, funcionario.getSenha());
            statement.setString(2, String.valueOf(funcionario.getSalario()));
            statement.setString(3, String.valueOf(funcionario.getId()));
            statement.execute();
            
            
            //Contato
            
            sql = "UPDATE Email SET email = ? WHERE Contato_Pessoa_idPessoa = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, funcionario.getEmail());
            statement.setString(2, String.valueOf(funcionario.getId()));
            
            statement.execute();
            
            sql = "UPDATE Telefone SET telefone = ? WHERE Contato_Pessoa_idPessoa = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, funcionario.getTelefone());
            statement.setString(2, String.valueOf(funcionario.getId()));
            
            statement.execute();
            
            
            
            Conexao.closeConn();
            
        
        }catch(SQLException sqlex){
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
        
        
    }

    @Override
    public ArrayList<Object> consulta(Object obj) {//Retorna uma lista com os dados parametros de consulta.
        ArrayList <Object> lista = new ArrayList();
        
        try{
            Funcionario funcionario = (Funcionario) obj;
            conn = Conexao.conectar();
            PreparedStatement statement;
            
            sql = "SELECT Pessoa.idPessoa, Pessoa.nome, Pessoa.idade, Pessoa.sexo, Pessoa.end_num, Pessoa.end_rua, Pessoa.end_cidade, Pessoa.end_estado, Pessoa.cpf, Funcionario.senha, Funcionario.cod_func, Funcionario.salario FROM Pessoa INNER JOIN Funcionario ON Pessoa.idPessoa = Funcionario.Pessoa_idPessoa";
            
            ResultSet result;
            statement = conn.prepareStatement(sql);
            result = statement.executeQuery();
            
            while(result.next()){
                Funcionario funcionario2 = new Funcionario();
                Endereco endf2 = new Endereco();
                
                funcionario2.setId(result.getInt("idPessoa"));
                funcionario2.setNome(result.getNString("nome"));
                funcionario2.setIdade(result.getInt("idade"));
                funcionario2.setSexo(result.getNString("sexo").charAt(0));//Pegar em forma de caractere
                
                endf2.setEndNum(result.getNString("end_num"));
                endf2.setEndRua(result.getNString("end_rua"));
                endf2.setEndCidade(result.getNString("end_cidade"));
                endf2.setEndEstado(result.getNString("end_estado"));
                
                funcionario2.setEndereco(endf2);
                
                funcionario2.setCpf(result.getNString("cpf"));
                funcionario2.setSenha(result.getNString("senha"));
                funcionario2.setCodigoFuncionario(result.getInt("cod_func"));
                funcionario2.setSalario(result.getDouble("salario"));
                
                
                
                lista.add(funcionario2);
            
            
            
            }
        
        
        
        
        }catch(SQLException sqlex){
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
        return lista;
    }
    
}
