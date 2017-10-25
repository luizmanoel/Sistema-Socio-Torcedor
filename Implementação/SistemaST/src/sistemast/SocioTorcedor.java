/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

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

     
    public SocioTorcedor(String nome, int idade, char sexo, Endereco endereco, String cpf, String telefone, String email){
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

}
