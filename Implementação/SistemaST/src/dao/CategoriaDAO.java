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

/**
 *
 * @author antonio
 */
public class CategoriaDAO implements InterfaceDAO{
    private String sql;
    private Connection conn;
    

    @Override
    public void adiciona(Object obj) {
        try{
            
            Categoria categoria = (Categoria) obj;
            sql = "Insert into Categoria (cod_categoria, nome, beneficios, valor_mensalidade) values (?, ?, ?, ?)";
            conn = Conexao.conectar();
            
            PreparedStatement statement;
            statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(categoria.getCodigoCategoria()));
            statement.setString(2, categoria.getNome());
            statement.setString(3, categoria.getBeneficios());
            statement.setString(4, String.valueOf(categoria.getValorMensalidade()));
            
            statement.execute();
            Conexao.closeConn();
            
        
        
        
        
        
        }catch(SQLException sqlex){
             Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
    }

    @Override
    public void exclui(Object obj) {
        try{
            Categoria categoria = (Categoria) obj;
            sql = "DELETE FROM Categoria WHERE cod_categoria = ?";
            conn = Conexao.conectar();
            
            PreparedStatement statement;
            statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(categoria.getCodigoCategoria()));
            
            statement.execute();
            Conexao.closeConn();
            
            
        }catch(SQLException sqlex){
             Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
        
        
    }

    @Override
    public void altera(Object obj) {
        
                
        try{
            
            Categoria categoria = (Categoria) obj;
            
            sql = "UPDATE Categoria SET nome = ?, beneficios = ?, valor_mensalidade = ? WHERE cod_categoria = ? ";
            
            conn = Conexao.conectar();
        
            PreparedStatement statement;
            statement = conn.prepareStatement(sql);
            statement.setString(1, categoria.getNome());
            statement.setString(2, categoria.getBeneficios());
            statement.setString(3, String.valueOf(categoria.getValorMensalidade()));
            statement.setString(4, String.valueOf(categoria.getCodigoCategoria()));

            statement.execute();
            Conexao.closeConn();
        
        
        
        }catch(SQLException sqlex){
             Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
    }

    @Override
    public ArrayList<Object> consulta(Object obj) {
        
        ArrayList <Object> lista = new ArrayList();
        
        try{
            
            Categoria categoria = (Categoria) obj;
            
            sql = "SELECT * FROM Categoria";//Nesse SQL, pegamos todos os valores da tabela de Categoria
            conn = Conexao.conectar();
            
            PreparedStatement statement;
            ResultSet result;
        
            statement = conn.prepareStatement(sql);
            result = statement.executeQuery();
            
            while(result.next()){//Passando para lista
                Categoria categoria2 = new Categoria();
                categoria2.setNome(result.getNString("nome"));
                categoria2.setBeneficios(result.getNString("beneficios"));
                categoria2.setValorMensalidade(result.getDouble("valor_mensalidade"));
                categoria2.setCodigoCategoria(result.getInt("cod_categoria"));
            
                    
                    
                lista.add(categoria2);
            
            
            
            }
        
        
        
        
        
        
        }catch(SQLException sqlex){
             Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
        return lista;
    }
    
}
