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
public class Email {

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endemail;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endemail = endereco;
    }

    /**
     * @return the codEmail
     */
    public int getCodEmail() {
        return codEmail;
    }

    /**
     * @param codEmail the codEmail to set
     */
    public void setCodEmail(int codEmail) {
        this.codEmail = codEmail;
    }
    
    private String endemail;
    private int codEmail;
    
    public Email(){
        this.endemail = "";
        this.codEmail = 0;
    
    
    
    }
    
    
}
