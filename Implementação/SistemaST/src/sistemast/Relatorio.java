/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemast;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rodol
 */

public class Relatorio {
    private int idRelatorio;
    private double valorTotalPagamentos;
    private String data;
    private String Responsavel;
    
    private PdfWriter writer;
    private PdfDocument pdf;
    private Document document;
    
    public Relatorio(){
        this.Responsavel = "";
        this.data = "";
        this.idRelatorio = 0;
        
        try{
            this.writer = new PdfWriter("Relatorio.pdf");
            this.pdf = new PdfDocument(writer);
            this.document = new Document(pdf);
            this.document.setMargins(20, 20, 20, 20);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao criar o relatório. Detalhes: " + e.getMessage(), "Relatório", 0);//Se falhar na criação, gera erro
            
        
        }
        
    
    
    
    
    }
    
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }
    
    public void gerarRelatorioFuncionario(ArrayList<Funcionario> listaFunc){//FIltros em parametros
        Paragraph conteudo = new Paragraph("Id do Relatório: " + this.getIdRelatorio());
        this.document.add(conteudo);
        
        conteudo = new Paragraph("Relatório de Funcionários");
        
        Table table = new Table(9);
        
        for(int i = 0; i < listaFunc.size(); i++){
            
            String[] dadosFunc = listaFunc.get(i).toStringDataArray();
            for(int j = 0; j < 9; j++){
                table.addCell(new Paragraph(dadosFunc[j]));
            }
        
        }
        document.add(table);
        try{
            Desktop.getDesktop().open(new File("Relatorio.pdf"));//Abre
            JOptionPane.showMessageDialog(null, "Relatório aberto pelo aplicativo padrão", "Gerado", 0);//Confirmar que gerou
        }catch(Exception e){
        
        
        }
        this.fecharRel();
    
    
    
    }
    
    public void gerarRelatorioST(ArrayList<SocioTorcedor> listaST){//FIltros em parametros
        Paragraph conteudo = new Paragraph("Id do Relatório: " + this.getIdRelatorio());
        this.document.add(conteudo);
        
        conteudo = new Paragraph("Relatório de Sócios Torcedores");
        
        Table table = new Table(8);//8 Colunas
        
        for(int i = 0; i < listaST.size(); i++){
            
            String[] dadosST = listaST.get(i).toStringDataArray();
            for(int j = 0; j < 8; j++){
                table.addCell(new Paragraph(dadosST[j]));
            }
        
        }
        document.add(table);
        try{
            Desktop.getDesktop().open(new File("Relatorio.pdf"));//Abre
            JOptionPane.showMessageDialog(null, "Relatório aberto pelo aplicativo padrão", "Gerado", 2);//Confirmar que gerou
        }catch(Exception e){
        
        
        }
        this.fecharRel();
    
    
    
    }
    
    
    public void gerarRelatorioPagamento(ArrayList<Pagamento> listaPgto){//FIltros em parametros
        Paragraph conteudo = new Paragraph("Id do Relatório: " + this.getIdRelatorio());
        this.document.add(conteudo);
        
        conteudo = new Paragraph("Relatório de Pagamentos");
        
        Table table = new Table(4);//8 Colunas
        
        for(int i = 0; i < listaPgto.size(); i++){
            
            //String[] dadosST = listaPgto.get(i).toStringDataArray();
            
            table.addCell(new Paragraph(listaPgto.get(i).getData()));
            table.addCell(new Paragraph(listaPgto.get(i).getDetalhesPagamento()));
            table.addCell(new Paragraph(String.valueOf(listaPgto.get(i).getCodigoST())));
            table.addCell(new Paragraph(String.valueOf(listaPgto.get(i).getValor())));
            
        
        }
        document.add(table);
        try{
            Desktop.getDesktop().open(new File("Relatorio.pdf"));//Abre
            JOptionPane.showMessageDialog(null, "Relatório aberto pelo aplicativo padrão", "Gerado", 0);//Confirmar que gerou
        }catch(Exception e){
        
        
        }
        this.fecharRel();
    
    
    
    }
    
    
    public void fecharRel(){
        this.document.close();
        this.pdf.close();
        try{
            
            this.writer.close();
        }catch(Exception e){//Resolver
        
        
        }
            
    
    }
    
    
    
}
