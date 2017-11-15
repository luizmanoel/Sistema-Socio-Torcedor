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
import sistemast.Email;
import sistemast.Endereco;
import sistemast.Funcionario;
import sistemast.Telefone;

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
            sql = "Insert into Funcionario (senha, cod_func, salario, cargo, Pessoa_idPessoa) values (?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, funcionario.getSenha());//Colocar senha em funcionario
            statement.setString(2, String.valueOf(funcionario.getCodigoFuncionario()));
            statement.setString(3, String.valueOf(funcionario.getSalario()));
            statement.setString(4, funcionario.getCargo());
            statement.setString(5, String.valueOf(funcionario.getId()));
            
            statement.execute();
            
            

            
            for(int i = 0; i < funcionario.getEmail().size(); i++){//Dentro de loop, para pegar todos os cadastrados
                sql = "Insert into Email (email, cod_email) values (?, ?)";
                statement = conn.prepareStatement(sql);
                statement.setString(1, funcionario.getEmail().get(i).getEndereco());//End do email
                statement.setString(2, String.valueOf(funcionario.getEmail().get(i).getCodEmail()));//Cod do email

                statement.execute();
            }
            
            //Pessoa_Email
            for(int i = 0; i < funcionario.getEmail().size(); i++){
                sql = "Insert into Pessoa_Email (Pessoa_idPessoa, Email_cod_email) values(?, ?)";//Relaciona duas tabelas

                statement = conn.prepareStatement(sql);
                statement.setString(1, String.valueOf(funcionario.getId()));
                statement.setString(2, String.valueOf(funcionario.getEmail().get(i).getCodEmail()));

                statement.execute();
            }
            
            for(int i = 0; i < funcionario.getTelefone().size(); i++){
                sql = "Insert into Telefone (telefone, cod_tel) values (?, ?)";//Numtel e codigo do tel
                statement = conn.prepareStatement(sql);
                statement.setString(1, funcionario.getTelefone().get(i).getNumero());
                statement.setString(2, String.valueOf(funcionario.getTelefone().get(i).getCodTelefone()));

                statement.execute();
            }
            
            //Pessoa_Email
            for(int i = 0; i < funcionario.getTelefone().size(); i++){
                sql = "Insert into Pessoa_Telefone (Pessoa_idPessoa, Telefone_cod_tel) values(?, ?)";//Relaciona duas tabelas

                statement = conn.prepareStatement(sql);
                statement.setString(1, String.valueOf(funcionario.getId()));
                statement.setString(2, String.valueOf(funcionario.getTelefone().get(i).getCodTelefone()));

                statement.execute();
            }
            
            
            Conexao.closeConn();
            




        }catch(SQLException sqlex){
             Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
    }

    
    public void delecaoTelefones(String idPessoa){//Deletar os numeros e emails associados das tabelas Email e Telefone
        //NAO FECHAR CONEXAO NEM ABRIR AQUI, TRATAR NO METODO QUE CHAMAR ESTE
        try{
            PreparedStatement statement;
            sql = "SELECT * FROM Pessoa_Telefone WHERE Pessoa_idPessoa = ?";
            ResultSet result;
            statement = conn.prepareStatement(sql);
            statement.setString(1, idPessoa);//Por id
            result = statement.executeQuery();
            
            while(result.next()){//Pega todos os tels da pessoa com id passado
                sql = "DELETE FROM Telefone WHERE cod_tel = ? ";
                statement = conn.prepareStatement(sql);
                statement.setString(1, result.getString("Telefone_cod_tel"));
                statement.execute();
            
            
            }
            
            
            sql = "SELECT * FROM Pessoa_Email WHERE Pessoa_idPessoa = ?";
            
            statement = conn.prepareStatement(sql);
            statement.setString(1, idPessoa);//Por id
            result = statement.executeQuery();//Reciclando
            
            while(result.next()){
                sql = "DELETE FROM Email WHERE cod_email = ? ";
                statement = conn.prepareStatement(sql);
                statement.setString(1, result.getString("Email_cod_email"));
                statement.execute();
            
            
            }
            
            //Tels e Emails Já deletados
            
    
            }catch(SQLException sqlex){
                Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, sqlex);
                
                
                
            }
    
    
    }
    
    
    @Override
    public void exclui(Object obj) {//Deleta um Func. do BD
        
        try{
            
            conn = Conexao.conectar();
            Funcionario funcionario = (Funcionario) obj;
            this.delecaoTelefones(String.valueOf(funcionario.getId()));
            
            
            sql = "DELETE FROM Pessoa Where idPessoa = ?";//Fazemos assim, por conta do BD implementado seguindo "estilo OO". Nele, usamos cascade pra resolver.
            
            
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
            sql = "UPDATE Funcionario SET senha= ?, salario = ?, cargo = ? WHERE Pessoa_idPessoa = ?";
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, funcionario.getSenha());
            statement.setString(2, String.valueOf(funcionario.getSalario()));
            statement.setString(3, funcionario.getCargo());
            statement.setString(4, String.valueOf(funcionario.getId()));
            statement.execute();
            
            /*
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
            */
            for(int i = 0; i < funcionario.getEmail().size(); i++){//Itera sobre a lista analisada
                sql = "UPDATE Email SET email = ? WHERE cod_email = ?";
                statement = conn.prepareStatement(sql);
                statement.setString(1, funcionario.getEmail().get(i).getEndereco());
                statement.setString(2, String.valueOf(funcionario.getEmail().get(i).getCodEmail()));//Pega este indice, atualiza o mesmo
                statement.execute();
            }
            
            for(int i = 0; i < funcionario.getTelefone().size(); i++){
                sql = "UPDATE Telefone SET telefone = ? WHERE cod_tel = ?";
                statement = conn.prepareStatement(sql);
                statement.setString(1, funcionario.getTelefone().get(i).getNumero());
                statement.setString(2, String.valueOf(funcionario.getTelefone().get(i).getCodTelefone()));//Pega este indice, atualiza o mesmo
                statement.execute();
            }
            
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
            
            sql = "SELECT Pessoa.idPessoa, Pessoa.nome, Pessoa.idade, Pessoa.sexo, Pessoa.end_num, Pessoa.end_rua, Pessoa.end_cidade, Pessoa.end_estado, Pessoa.cpf, Funcionario.senha, Funcionario.cod_func, Funcionario.salario, Funcionario.cargo FROM Pessoa INNER JOIN Funcionario ON Pessoa.idPessoa = Funcionario.Pessoa_idPessoa";
            
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
                funcionario2.setCargo(result.getNString("cargo"));
                
                //Tratamento de Telefone e email
                
                
                
                sql = "SELECT Email.email, Email.cod_email, Pessoa_Email.Pessoa_idPessoa FROM Pessoa_Email INNER JOIN Email ON Pessoa_Email.Email_cod_email = Email.cod_email WHERE Pessoa_Email.Pessoa_idPessoa = ?";//Pegar
                
                
                ResultSet rmail;
                statement = conn.prepareStatement(sql);//Usa statement la de cima
                statement.setString(1, String.valueOf(funcionario2.getId()));
                rmail = statement.executeQuery();
                
                ArrayList <Email> listMail = new ArrayList<Email>();
                
                while(rmail.next()){//Todos da Query
                    Email tempmail = new Email();
                    tempmail.setCodEmail(rmail.getInt("cod_email"));//Cod email
                    tempmail.setEndereco(rmail.getString("email"));//Endereco email
                    
                    //Agora, adicionamos ao funcionario
                    listMail.add(tempmail);
                    
                    
                
                
                
                }
                funcionario2.setEmail(listMail);
                
                
                sql = "SELECT Telefone.telefone, Telefone.cod_tel, Pessoa_Telefone.Pessoa_idPessoa FROM Pessoa_Telefone INNER JOIN Telefone ON Pessoa_Telefone.Telefone_cod_tel = Telefone.cod_tel WHERE Pessoa_Telefone.Pessoa_idPessoa = ?";//Pegar
                
                ResultSet rfone;
                statement = conn.prepareStatement(sql);//Usa statement la de cima
                statement.setString(1, String.valueOf(funcionario2.getId()));
                rfone = statement.executeQuery();
                
                ArrayList <Telefone> listTel = new ArrayList<Telefone>();
                
                while(rfone.next()){//Todos da Query
                    Telefone temptel = new Telefone();
                    temptel.setCodTelefone(rfone.getInt("cod_tel"));//Cod //CONSERTO//Adicionar ambos o codigo e o numero sera util para o update
                    temptel.setNumero(rfone.getString("telefone"));//Telefone
                    
                    //Agora, adicionamos ao funcionario
                    listTel.add(temptel);
                
                
                
                }
                funcionario2.setTelefone(listTel);
                
                
                
                
                lista.add(funcionario2);
                
                
                
            
            
            
            }
            Conexao.closeConn();
        
        
        
        
        }catch(SQLException sqlex){
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
        return lista;
    }
    
    
    public int controleID(){//Utilitario, p/ controle da quantidade de IDs
        int quantid = 0;
        
        Funcionario f1 = new Funcionario();
        
        quantid = this.consulta(f1).size();
        
        return quantid;
    }
    
}
