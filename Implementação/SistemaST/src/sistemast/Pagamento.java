/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

import java.util.Date;

/**
 *
 * @author rodol
 */
public class Pagamento {
    private String categoria;
    private double valor;
    private String detalhesPagamento;
    private boolean pago;
    private int CodigoST;
    private Date data;//Adição//Usar SimpleDateFormat para receber de string

  
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDetalhesPagamento() {
        return detalhesPagamento;
    }

    public void setDetalhesPagamento(String detalhesPagamento) {
        this.detalhesPagamento = detalhesPagamento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public int getCodigoST() {
        return CodigoST;
    }

    public void setCodigoST(int CodigoST) {
        this.CodigoST = CodigoST;
    }
    
}
