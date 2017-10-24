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
import sistemast.Administrador;
import sistemast.Endereco;

/**
 *
 * @author antonio
 */
public class AdministradorDAO implements InterfaceDAO{
    
    private String sql;
    private Connection conn;

    @Override
    public void adiciona(Object obj) {//Adiciona um Adm. ao BD
        try{
            Administrador administrador = (Administrador) obj;
            
            conn = Conexao.conectar();
            PreparedStatement statement;


            sql = "Insert into Pessoa (idPessoa, nome, idade, sexo, end_num, end_rua, end_cidade, end_estado, cpf) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(administrador.getId()));
            statement.setString(2, administrador.getNome());
            statement.setString(3, String.valueOf(administrador.getIdade()));
            statement.setString(4, String.valueOf(administrador.getSexo()));
            statement.setString(5, administrador.getEndereco().getEndNum());
            statement.setString(6, administrador.getEndereco().getEndRua());
            statement.setString(7, administrador.getEndereco().getEndCidade());
            statement.setString(8, administrador.getEndereco().getEndEstado());
            statement.setString(9, administrador.getCpf());

            statement.execute();
            
            //Funcionario
            sql = "Insert into Administrador (senha, cod_adm, salario, Pessoa_idPessoa) values (?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, administrador.getSenha());//Colocar senha em funcionario
            statement.setString(2, String.valueOf(administrador.getCodigoAdministrador()));
            statement.setString(3, String.valueOf(administrador.getSalario()));
            statement.setString(4, String.valueOf(administrador.getId()));
            
            statement.execute();
            
            
            //Contato
            sql = "Insert into Contato (Pessoa_idPessoa) values(?)";
            
            statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(administrador.getId()));
            
            statement.execute();
            
            sql = "Insert into Email (email, Contato_Pessoa_idPessoa) values (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, administrador.getEmail());
            statement.setString(2, String.valueOf(administrador.getId()));
            
            statement.execute();
            
            sql = "Insert into Telefone (telefone, Contato_Pessoa_idPessoa) values (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, administrador.getTelefone());
            statement.setString(2, String.valueOf(administrador.getId()));
            
            statement.execute();
            
            
            
            Conexao.closeConn();
            
            }catch(SQLException sqlex){
             Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }

        
    }

    @Override
    public void exclui(Object obj) {//Exclui um Adm. do BD
        
        try{
            Administrador administrador = (Administrador) obj;
            sql = "DELETE FROM Pessoa WHERE idPessoa = ?";//Fazemos assim, por conta do BD implementado seguindo "estilo OO". Nele, usamos cascade pra resolver.
            
            conn = Conexao.conectar();
            PreparedStatement statement;
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, String.valueOf(administrador.getId()));
            statement.execute();
            
            Conexao.closeConn();
        
        
        }catch(SQLException sqlex){
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
    }

    @Override
    public void altera(Object obj) {//Altera uma entrada da Tabela Adm.
        
        try{
        
            Administrador administrador = (Administrador) obj;
            conn = Conexao.conectar();
            PreparedStatement statement;

            sql = "UPDATE Pessoa SET nome = ?, idade = ?, sexo = ?, end_num = ?, end_rua = ?, end_cidade = ?, end_estado = ?, cpf = ? WHERE idPessoa = ?";//id sempre permanece o mesmo
            
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, administrador.getNome());
            statement.setString(2, String.valueOf(administrador.getIdade()));
            statement.setString(3, String.valueOf(administrador.getSexo()));
            statement.setString(4, administrador.getEndereco().getEndNum());
            statement.setString(5, administrador.getEndereco().getEndRua());
            statement.setString(6, administrador.getEndereco().getEndCidade());
            statement.setString(7, administrador.getEndereco().getEndEstado());
            statement.setString(8, administrador.getCpf());
            statement.setString(9, String.valueOf(administrador.getId()));
            
            statement.execute();
            
            
            //Admin
            sql = "UPDATE Administrador SET senha= ?, salario = ? WHERE Pessoa_idPessoa = ?";
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, administrador.getSenha());
            statement.setString(2, String.valueOf(administrador.getSalario()));
            statement.setString(3, String.valueOf(administrador.getId()));
            statement.execute();
            
            
            //Contato
            
            sql = "UPDATE Email SET email = ? WHERE Contato_Pessoa_idPessoa = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, administrador.getEmail());
            statement.setString(2, String.valueOf(administrador.getId()));
            
            statement.execute();
            
            sql = "UPDATE Telefone SET telefone = ? WHERE Contato_Pessoa_idPessoa = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, administrador.getTelefone());
            statement.setString(2, String.valueOf(administrador.getId()));
            
            statement.execute();
            
            
            
            Conexao.closeConn();
            
        
        }catch(SQLException sqlex){
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
    }

    @Override
    public ArrayList<Object> consulta(Object obj) {//Retorna uma lista com os dados parametros de consulta.
        ArrayList <Object> lista = new ArrayList();
        try{
            Administrador administrador = (Administrador) obj;
            conn = Conexao.conectar();
            PreparedStatement statement;
            
            sql = "SELECT Pessoa.idPessoa, Pessoa.nome, Pessoa.idade, Pessoa.sexo, Pessoa.end_num, Pessoa.end_rua, Pessoa.end_cidade, Pessoa.end_estado, Pessoa.cpf, Administrador.senha, Administrador.cod_adm, Administrador.salario FROM Pessoa INNER JOIN Administrador ON Pessoa.idPessoa = Administrador.Pessoa_idPessoa";
            
            ResultSet result;
            statement = conn.prepareStatement(sql);
            result = statement.executeQuery();
            
            while(result.next()){
                Administrador administrador2 = new Administrador();
                Endereco enda2 = new Endereco();
                
                administrador2.setId(result.getInt("idPessoa"));
                administrador2.setNome(result.getNString("nome"));
                administrador2.setIdade(result.getInt("idade"));
                administrador2.setSexo(result.getNString("sexo").charAt(0));//Pegar em forma de caractere
                
                enda2.setEndNum(result.getNString("end_num"));
                enda2.setEndRua(result.getNString("end_rua"));
                enda2.setEndCidade(result.getNString("end_cidade"));
                enda2.setEndEstado(result.getNString("end_estado"));
                
                administrador2.setEndereco(enda2);
                
                administrador2.setCpf(result.getNString("cpf"));
                administrador2.setSenha(result.getNString("senha"));
                administrador2.setCodigoAdministrador(result.getInt("cod_adm"));
                administrador2.setSalario(result.getDouble("salario"));
                
                
                
                lista.add(administrador2);
            
            
            
            }
        
        
        
        
        }catch(SQLException sqlex){
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
        return lista;
    }
    
}
