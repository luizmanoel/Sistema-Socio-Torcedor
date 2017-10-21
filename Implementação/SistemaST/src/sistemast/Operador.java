/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

import javax.swing.JOptionPane;

/**
 *
 * @author antonio
 */
public class Operador extends Pessoa {

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
    
    private double salario;
    
    public Operador(){
        super();
        this.salario = 0;
        
    
    
    
    }
    
    public Operador(String nome, int idade, char sexo, String endereco, String cpf, String telefone, String email, double salario){
        super.setNome(nome);
        super.setIdade(idade);
        super.setSexo(sexo);
        super.setEndereco(endereco);
        super.setCpf(cpf);
        super.setTelefone(telefone);
        super.setEmail(email);
        
        this.salario = salario;
        
    
    
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
    
    
    
}
