/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

/**
 *
 * @author rodol
 */

public class Relatorio {
    private int idRelatorio;
    private double valorTotalPagamentos;
    private int data;
    private String Responsavel;
    
    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public double getValorTotalPagamentos() {
        return valorTotalPagamentos;
    }

    public void setValorTotalPagamentos(double valorTotalPagamentos) {
        this.valorTotalPagamentos = valorTotalPagamentos;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }
    
}
