/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import dao.PagamentoDAO;
import dao.SocioTorcedorDAO;
import java.util.ArrayList;
import sistemast.Pagamento;
import sistemast.Relatorio;
import sistemast.SocioTorcedor;

/**
 *
 * @author antonio
 */
public class TelaRelatorioPagamento extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatorioPagamento
     */
    
    Relatorio rel = new Relatorio();
    
    public TelaRelatorioPagamento() {
        initComponents();
        preenche();
    }
    
    public void criaRelatorio(){
        
        if(!this.jTextFieldRelatorio.getText().equals("")){//Diferente de vazio
            rel.setIdRelatorio(Integer.parseInt(this.jTextFieldRelatorio.getText()));
        }
        
        Pagamento pgto = new Pagamento();
        PagamentoDAO pgDAO = new PagamentoDAO();
        
        ArrayList<Object> lista = pgDAO.consulta(pgto);
        ArrayList<Pagamento> listaPag = new ArrayList<>();
        
        String filtroData = this.jTextField1.getText();//Tratamento de filtros
        int filtroST = this.checaMarcado();
        
        for(int i = 0; i < lista.size(); i++){
            Pagamento novoPag = (Pagamento) lista.get(i);
            
            
            if(novoPag.aplicaFiltroData(filtroData) && novoPag.aplicaFiltroST(filtroST)){//Se passar pelos filtros
                listaPag.add(novoPag);//Adicionamos a nosso relatorio
            }
            
        }
        
        rel.gerarRelatorioPagamento(listaPag);
        
        
    
    
    
    }
    
    public void preenche(){
        
           // para preencher a lista:
            SocioTorcedorDAO db = new SocioTorcedorDAO();
            SocioTorcedor st = new SocioTorcedor();
            ArrayList<Object> listaSTs = db.consulta(st);
            String[] dados = new String[listaSTs.size()+1];//+1, pela opção de não selecionar ninguem
            SocioTorcedor socio;
            for(int i = 0; i < listaSTs.size(); i++){
                socio = (SocioTorcedor) listaSTs.get(i);
                dados[i] = socio.getNome();
            }
            dados[listaSTs.size()] = "Todos";
            jListSTs.setListData(dados);
            
    }
    
    public int checaMarcado(){
        
        if(jListSTs.isSelectionEmpty()){//Não selecionou ninguém
            return -1;
        
        }
        
        
        
       int x = jListSTs.getSelectedIndex();//Pega pelo valor marcado
       
       
       SocioTorcedorDAO db = new SocioTorcedorDAO();
       SocioTorcedor st = new SocioTorcedor();
       ArrayList<Object> listaSTs = db.consulta(st);
       
       if(x == listaSTs.size()){
           return -1;//Selecionou todos
       
       }
       
       SocioTorcedor socio = (SocioTorcedor) listaSTs.get(x);
       
       
       
       return socio.getCodigoSt();
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGerarRelatorio = new javax.swing.JButton();
        jTextFieldRelatorio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSTs = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonGerarRelatorio.setText("Gerar Relatório");
        jButtonGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioActionPerformed(evt);
            }
        });

        jLabel1.setText("ID do Relatório");

        jLabel2.setText("Filtro de Data");

        jLabel3.setText("Filtro de Socio Torcedor");

        jListSTs.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListSTs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 453, Short.MAX_VALUE)
                        .addComponent(jButtonGerarRelatorio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(jButtonGerarRelatorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioActionPerformed
        // TODO add your handling code here:
        this.criaRelatorio();
        this.dispose();
    }//GEN-LAST:event_jButtonGerarRelatorioActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaRelatorioPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaRelatorioPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaRelatorioPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaRelatorioPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaRelatorioPagamento().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerarRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListSTs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldRelatorio;
    // End of variables declaration//GEN-END:variables
}
