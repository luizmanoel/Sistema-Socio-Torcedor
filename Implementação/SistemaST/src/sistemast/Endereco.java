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
public class Endereco {

    /**
     * @return the endNum
     */
    public String getEndNum() {
        return endNum;
    }

    /**
     * @param endNum the endNum to set
     */
    public void setEndNum(String endNum) {
        this.endNum = endNum;
    }

    /**
     * @return the endRua
     */
    public String getEndRua() {
        return endRua;
    }

    /**
     * @param endRua the endRua to set
     */
    public void setEndRua(String endRua) {
        this.endRua = endRua;
    }

    /**
     * @return the endCidade
     */
    public String getEndCidade() {
        return endCidade;
    }

    /**
     * @param endCidade the endCidade to set
     */
    public void setEndCidade(String endCidade) {
        this.endCidade = endCidade;
    }

    /**
     * @return the endEstado
     */
    public String getEndEstado() {
        return endEstado;
    }

    /**
     * @param endEstado the endEstado to set
     */
    public void setEndEstado(String endEstado) {
        this.endEstado = endEstado;
    }
    
    private String endNum;
    private String endRua;
    private String endCidade;
    private String endEstado;
    
}
