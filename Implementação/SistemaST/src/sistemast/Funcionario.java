/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

import java.util.ArrayList;

/**
 *
 * @author Luiz Manoel
 */
public class Funcionario extends Operador{
    private String cargo;
    private int codigoFuncionario;
    

    public Funcionario(String nome, int idade, char sexo, Endereco endereco, String cpf, ArrayList<Telefone> telefone, ArrayList<Email> email, double salario, String cargo, int codigoFuncionario, String senha){
        super(nome, idade, sexo, endereco, cpf, telefone, email, salario, senha);
        this.cargo = cargo;
        this.codigoFuncionario = codigoFuncionario;
    }
    
    public Funcionario(){
        super();
        cargo = "";
        codigoFuncionario = 0;
    }
    
    
    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the codigoFuncionario
     */
    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    /**
     * @param codigoFuncionario the codigoFuncionario to set
     */
    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    
    
}
