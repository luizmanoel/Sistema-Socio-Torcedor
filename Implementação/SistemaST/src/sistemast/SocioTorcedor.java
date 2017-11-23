/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

import java.util.ArrayList;

/**
 *
 * @author antonio
 */
public class SocioTorcedor extends Pessoa {

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the codigoSt
     */
    public int getCodigoSt() {
        return codigoSt;
    }

    /**
     * @param codigoSt the codigoSt to set
     */
    public void setCodigoSt(int codigoSt) {
        this.codigoSt = codigoSt;
    }

    private int codigoSt;

    //private Categoria categoria; //Necessaria implementação


    private Categoria categoria; //Necessaria implementação
    
    
    
    public SocioTorcedor(){
        super();
        this.codigoSt = 0;

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
        for(int i = 0; i < this.getEmail().size(); i++){
            enderecos[i] = this.getEmail().get(i).getEndereco();
        
        
        }
    
        return enderecos;
    
    
    
    
    }

     
    public SocioTorcedor(String nome, int idade, char sexo, Endereco endereco, String cpf, ArrayList<Telefone> telefone, ArrayList<Email> email){
        super.setNome(nome);
        super.setIdade(idade);
        super.setSexo(sexo);
        super.setEndereco(endereco);
        super.setCpf(cpf);
        super.setTelefone(telefone);
        super.setEmail(email);

        this.codigoSt = 0;

    }

    public void pagaMensalidade(int codigoSt) {//Necessário BD

    }
    
    public String[] toStringDataArray(){//Adaptada
        String[] dados = new String[8];
        
        dados[0] = this.getNome();
        dados[1] = this.getCategoria().getNome();
        dados[2] = this.getCpf();
        dados[3] = String.valueOf(this.getSexo());
        dados[4] = String.valueOf(this.getIdade());
        
        String endsEmail = this.emailStringify();
        String telefones = this.telefoneStringify();
        
        
        dados[5] = endsEmail;
        dados[6] = telefones;
        dados[7] = String.valueOf(this.getId());
        
        
        return dados;
        
    
    
    
    }
    
    public String emailStringify(){
        String endsEmail = "";
        String telefones = "";
        for(int i = 0; i < this.getEmail().size(); i++){
            endsEmail = endsEmail + this.getEmail().get(i).getEndereco() + "\n";
        
        
        }
        return endsEmail;
    
    
    }
    public String telefoneStringify(){
        
        String telefones = "";
        for(int i = 0; i < this.getEmail().size(); i++){
            telefones = telefones + this.getTelefone().get(i).getNumero()+ "\n";
        
        
        }
        return telefones;
    
    
    }
    
    public boolean checaCategoria(Categoria cat1){//Checa se são da mesma categoria
        if(cat1.getCodigoCategoria() == this.categoria.getCodigoCategoria()){
            return true;
        }
        return false;
    
    
    
    
    }

}
