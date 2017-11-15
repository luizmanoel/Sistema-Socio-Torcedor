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
public abstract class Pessoa {

    /**
     * @return the telefone
     */
    public ArrayList<Telefone> getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(ArrayList<Telefone> telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public ArrayList<Email> getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(ArrayList<Email> email) {
        this.email = email;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    
    private int id;
    private String nome;
    private int idade;
    private char sexo;
    private Endereco endereco;
    private String cpf;
    private ArrayList<Telefone> telefone;
    private ArrayList<Email> email;
    
    public Pessoa(){}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    public Pessoa convertePessoa(){
    
        return null;
    
    
    
    }
    
}
