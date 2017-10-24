/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author antonio
 */
public interface InterfaceDAO {//Interface usada na implementacao das Classes Data Acess Object
    
    public void adiciona(Object obj);
    public void exclui(Object obj);
    public void altera(Object obj);
    public ArrayList<Object> consulta(Object obj);
    
}
