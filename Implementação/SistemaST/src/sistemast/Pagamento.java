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

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    private int codigoPagamento;
    private double valor;
    private String detalhesPagamento;
    private boolean pago;
    private int CodigoST;
    private String data;//Adição//Usar SimpleDateFormat para receber de string

  
    public int getCodigoPagamento() {
        return codigoPagamento;
    }

    public void setCodigoPagamento(int codigoPagamento) {
        this.codigoPagamento = codigoPagamento;
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
    
    public String[] toStringDataArray(){
        String[] dados = new String[3];
        
        dados[0] = this.getData();
        dados[1] = this.getDetalhesPagamento();
        dados[2] = String.valueOf(this.getCodigoST());
        
        return dados;
        
    
    
    
    }
    
    public boolean aplicaFiltroData(String filtroData){
            if(filtroData.equals("")){//Nada foi passado
                return true;
            
            
            }else if(filtroData.equals(this.data)){//Data confere
            
                return true;
            }
            
            return false;//Se tudo falhar
            
            
    
    
    
    }
    
    public boolean aplicaFiltroST(int filtroST){
            if(filtroST == -1){//-1, significa que o usuario nao esta usando este filtro
                return true;
            
            
            }else if(filtroST == this.CodigoST){//Data confere
            
                return true;
            }
            
            return false;//Se tudo falhar
            
            
    
    
    
    }
    
}
