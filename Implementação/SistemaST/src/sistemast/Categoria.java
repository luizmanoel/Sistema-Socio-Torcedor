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
public class Categoria {
    private String nome;
    private double valorMensalidade;
    private String beneficios;
    private int codigoCategoria;
    
    public Categoria(String nome, double valorMensalidade, String beneficios, int codigoCategoria){
        this.nome = nome;
        this.valorMensalidade = valorMensalidade;
        this.beneficios = beneficios;
        this.codigoCategoria = codigoCategoria;
    }
    
    public Categoria(){
        nome = "";
        valorMensalidade = 0;
        beneficios = "";
        codigoCategoria = 0;
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
     * @return the valorMensalidade
     */
    public double getValorMensalidade() {
        return valorMensalidade;
    }

    /**
     * @param valorMensalidade the valorMensalidade to set
     */
    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    /**
     * @return the beneficios
     */
    public String getBeneficios() {
        return beneficios;
    }

    /**
     * @param beneficios the beneficios to set
     */
    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    /**
     * @return the codigoCategoria
     */
    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    /**
     * @param codigoCategoria the codigoCategoria to set
     */
    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }
    
    
    
    
}
