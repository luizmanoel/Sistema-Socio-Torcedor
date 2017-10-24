/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

/**
 *
 * @author Luiz Manoel
 */
public class Administrador extends Operador{
    private int codigoAdministrador;
    
    public Administrador(String nome, int idade, char sexo, Endereco endereco, String cpf, String telefone, String email, double salario, int codigoAdministrador, String senha){
        super(nome, idade, sexo, endereco, cpf, telefone, email, salario, senha);
        this.codigoAdministrador = codigoAdministrador;
    }
    
    public Administrador(){
        super();
        this.codigoAdministrador = 0;
    }
    
    public void cadastrarFuncionario(){
        
    }
    
    public void cadastrarST(){
        
    }
    
    public void removerST(int codigoST){
        
    }
    public void alterarDadosST(int codigoST){
        
    }
    
    public void delegarCargos(int codigoF){
        
    }
    
    public void gerarRelatorioFinanceiro(){
        
    }
    
    public void alterarDadosFuncionario(){
        
    }
    
    public void removerFuncionario(int codigoF){
        
    }
     
    
    /**
     * @return the codigoAdministrador
     */
    public int getCodigoAdministrador() {
        return codigoAdministrador;
    }

    /**
     * @param codigoAdministrador the codigoAdministrador to set
     */
    public void setCodigoAdministrador(int codigoAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
    }
    
    
    
}
