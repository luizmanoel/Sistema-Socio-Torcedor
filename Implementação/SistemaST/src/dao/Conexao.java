/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antonio
 */
public class Conexao {//Tratamento das conexoes com o BD
    
    //Para testes de operacao do programa, favor criar o BD com os seguintes detalhes:
    /*
    MySQL
    Usr: adminbdst
    Senha: torcedor
    Porta:3306 (padrao)
    Use o script SQL que temos para gerar as tabelas e criar o BD
    Recomendo o uso do MysqlWorkbench para operar o BD diretamente
    
    
    
    */
    
    private static Connection conn = null;
    
    public Conexao(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistemast", "adminbdst", "torcedor");//Responsavel por gerir toda a parte de conexao com o localhost. Conecta ao BD usando a senha e usr passados
        }catch(SQLException sqlex){//Em caso de problemas na conexao
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
    }
    
    public static Connection conectar(){//Abre conexao
    
       // if(conn == null){//Possivel necessidade de alteracao aqui.
        
            new Conexao();
        
        //}
        return conn;
    
    
    
    }
    
    public static void closeConn(){//Fecha conexao
        try{
        
            conn.close();
        
        }catch(SQLException sqlex){
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, sqlex);
        
        
        }
    
    
    
    }
    
    
}
