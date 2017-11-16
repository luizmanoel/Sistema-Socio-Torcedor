/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author antonio
 */
public class Operador extends Pessoa {

    
    private double salario;
    private String senha;
    
    public Operador(){
        super();
        this.salario = 0;
        
    
    
    
    }
    
    public Operador(String nome, int idade, char sexo, Endereco endereco, String cpf, ArrayList<Telefone> telefone, ArrayList<Email> email, double salario, String senha){
        super.setNome(nome);
        super.setIdade(idade);
        super.setSexo(sexo);
        super.setEndereco(endereco);
        super.setCpf(cpf);
        super.setTelefone(telefone);
        super.setEmail(email);
        
        this.salario = salario;
        this.senha = senha;
        
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public void listarSt(){ //Dependente do BD
    
    
    
    }
    
    public void buscarSt(int codigoSt){//Dependente do BD
        
    
    
    
    
    }
    
    public void confirmarPagamento(){
    
        JOptionPane.showConfirmDialog(null, "Pagamento efetuado com sucesso!", "Confirmacao", JOptionPane.OK_CANCEL_OPTION);
    
    }
    
    public void consultarPagamento(int codigoSt){//Dependente do BD
    
    
    }
    
    public void classificaSt(int codigoSt){//Dependente do BD
    
    
    }
    
    public void checarFuncionarios(){//Dependente do BD
    
    
    }
    
    public double loadValorPagamentos(){//Dependente do BD
        double d1 = 0;
        
        return d1;
    
    
    }
    
    public String[] numerosTelefone(){
        String[] vetNumeros = new String[this.getTelefone().size()];
        for(int i = 0; i < this.getTelefone().size(); i++){
            vetNumeros[i] = this.getTelefone().get(i).getNumero();
        
        
        }
    
        return vetNumeros;
    
    
    }
    
    public String[] endEmails(){
        String[] enderecos = new String[this.getEmail().size()];
        for(int i = 0; i < this.getTelefone().size(); i++){
            enderecos[i] = this.getEmail().get(i).getEndereco();
        
        
        }
    
        return enderecos;
    
    
    
    
    }
    
    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
