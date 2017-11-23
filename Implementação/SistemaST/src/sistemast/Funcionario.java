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
    
    @Override
    public String toString(){//Em construcao
        
        String dadosFunc = super.toString();
        
        return dadosFunc;
    
    
    }
    
    
    
    public String[] toStringDataArray(){
        String[] dados = new String[9];
        
        dados[0] = this.getNome();
        dados[1] = this.getCargo();
        dados[2] = this.getCpf();
        dados[3] = String.valueOf(this.getSexo());
        dados[4] = String.valueOf(this.getIdade());
        
        String endsEmail = this.emailStringify();
        String telefones = this.telefoneStringify();
        
        
        dados[5] = endsEmail;
        dados[6] = telefones;
        dados[7] = String.valueOf(this.getId());
        dados[8] = String.valueOf(this.getSalario());
        
        return dados;
        
    
    
    
    }
    
    public boolean aplicaFiltroData(String filtroData){
            if(filtroData.equals("")){//Nada foi passado
                return true;
            
            
            }else if(filtroData.equals(String.valueOf(this.getIdade()))){//Data confere
            
                return true;
            }
            
            return false;//Se tudo falhar
            
            
    
    
    
    }
    
}
