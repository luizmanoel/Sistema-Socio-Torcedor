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
public class Telefone {

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the codTelefone
     */
    public int getCodTelefone() {
        return codTelefone;
    }

    /**
     * @param codTelefone the codTelefone to set
     */
    public void setCodTelefone(int codTelefone) {
        this.codTelefone = codTelefone;
    }
    
    private String numero;
    private int codTelefone;
    
    public Telefone(){
        this.numero = "";
        this.codTelefone = 0;
    
    
    
    }
    
    
}
