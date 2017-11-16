/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import dao.CategoriaDAO;
import dao.PagamentoDAO;
import dao.SocioTorcedorDAO;
import java.util.ArrayList;
import sistemast.Categoria;
import sistemast.Pagamento;
import sistemast.SocioTorcedor;

/**
 *
 * @author antonio
 */
public class TelaCadastroCategoria extends javax.swing.JFrame {

    //ArrayList<SocioTorcedor> lista;
    /**
     * Creates new form TelaCadastroPagamento
     */
    public TelaCadastroCategoria() {
        initComponents();
        
    }
    
    public void preenche(){
        
           // para preencher a lista:
            CategoriaDAO db = new CategoriaDAO();
            Categoria cat = new Categoria();
            ArrayList<Object> listaCat = db.consulta(cat);
            String[] dados = new String[listaCat.size()];
            Categoria categoria;
            for(int i = 0; i < listaCat.size(); i++){
                categoria = (Categoria) listaCat.get(i);
                dados[i] = categoria.getNome();
            }
            
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBeneficios = new javax.swing.JTextArea();
        jLabelData = new javax.swing.JLabel();
        jLabelDetalhes = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextAreaBeneficios.setColumns(20);
        jTextAreaBeneficios.setRows(5);
        jScrollPane1.setViewportView(jTextAreaBeneficios);

        jLabelData.setText("Nome");

        jLabelDetalhes.setText("Beneficios");

        jLabelValor.setText("Valor da Mensalidade");

        jButtonConfirmar.setText("Cadastrar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValor)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelDetalhes)
                        .addComponent(jLabelData)
                        .addComponent(jScrollPane1)
                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonConfirmar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jLabelData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabelDetalhes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jLabelValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
        this.criaPagamento();
        this.dispose();
        
        
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    public void criaPagamento(){
        Categoria novacat = new Categoria();
        
        
        //Codigo é auto-increment
        
        //Agora usamos o codigo 
        //novacat.setCodigoST(socio.getCodigoSt());//Correção
        novacat.setBeneficios(this.jTextAreaBeneficios.getText());
        novacat.setNome(this.jTextFieldNome.getText());
        novacat.setValorMensalidade(Double.parseDouble(this.jTextFieldValor.getText()));
        
        
        
        CategoriaDAO catdao = new CategoriaDAO();
        catdao.adiciona(novacat);
    
    }
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
//            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaCadastroPagamento().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDetalhes;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaBeneficios;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
