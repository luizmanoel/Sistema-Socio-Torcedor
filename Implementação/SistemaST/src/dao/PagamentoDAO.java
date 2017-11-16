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
import sistemast.Pagamento;

/**
 *
 * @author antonio
 */
public class PagamentoDAO implements InterfaceDAO{
    private String sql;
    private Connection conn;
    

    @Override
    public void adiciona(Object obj) {
        
        try{
        Pagamento pagamento = (Pagamento) obj;
        sql = "Insert into Pagamento (valor, detalhesPagamento, data, SocioTorcedor_cod_st) values (?, ?, ?, ?)";
        conn = Conexao.conectar();
        
        
        //Codigo do pagamento é Auto Incrementado
        PreparedStatement statement;
        statement = conn.prepareStatement(sql);
        statement.setString(1, String.valueOf(pagamento.getValor()));
        statement.setString(2, pagamento.getDetalhesPagamento());
        //statement.setString(3, String.valueOf(pagamento.getCodigoST()));//Retirar da tabela isto, desnecessario
        statement.setString(3, pagamento.getData());
        statement.setString(4, String.valueOf(pagamento.getCodigoST()));
        statement.execute();
        Conexao.closeConn();
        
        
        }catch(SQLException sqlex){
             Logger.getLogger(PagamentoDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
    }

    @Override
    public void exclui(Object obj) {//Baseado no codigo do pagamento
        
        try{
            
            Pagamento pagamento = (Pagamento) obj;
            
            sql = "DELETE FROM Pagamento WHERE cod_pagamento = ?";
            
            conn = Conexao.conectar();
        
            PreparedStatement statement;
            statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(pagamento.getCodigoPagamento()));
            statement.execute();
            Conexao.closeConn();
        
        
        
        }catch(SQLException sqlex){
             Logger.getLogger(PagamentoDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
    }

    @Override
    public void altera(Object obj) {//Baseado no codigo do pagamento
        
        
        try{
            
            Pagamento pagamento = (Pagamento) obj;
            
            sql = "UPDATE Pagamento SET valor = ?, detalhesPagamento = ?, data = ? WHERE cod_pagamento = ? ";
            
            conn = Conexao.conectar();
        
            PreparedStatement statement;
            statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(pagamento.getValor()));
            statement.setString(2, String.valueOf(pagamento.getDetalhesPagamento()));
            statement.setString(3, String.valueOf(pagamento.getData()));
            statement.setString(4, String.valueOf(pagamento.getCodigoPagamento()));
            statement.execute();
            Conexao.closeConn();
        
        
        
        }catch(SQLException sqlex){
             Logger.getLogger(PagamentoDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
        
        
        
    }

    @Override
    public ArrayList<Object> consulta(Object obj) {
        ArrayList <Object> lista = new ArrayList();//Lista p/ retorno
        
        try{
            Pagamento pagamento = (Pagamento) obj;
            sql = "SELECT * FROM Pagamento";
            conn = Conexao.conectar();

            PreparedStatement statement;
            ResultSet result;

            statement = conn.prepareStatement(sql);

            result = statement.executeQuery();

            while(result.next()){
                Pagamento pagamento2 = new Pagamento();
                pagamento2.setCodigoPagamento(result.getInt("cod_pagamento"));
                pagamento2.setValor(result.getDouble("valor"));
                pagamento2.setDetalhesPagamento(result.getNString("detalhesPagamento"));
                pagamento2.setCodigoST(result.getInt("SocioTorcedor_cod_st"));
                pagamento2.setData(result.getNString("data"));

                lista.add(pagamento2);



            }


            Conexao.closeConn();
        
        
        }catch(SQLException sqlex){
             Logger.getLogger(PagamentoDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
        
        
        
        
        
        return lista; //Casting depois para receber esta lista
    }
    
}
