/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import dao.SocioTorcedorDAO;
import sistemast.Categoria;
import sistemast.Email;
import sistemast.Endereco;
import sistemast.SocioTorcedor;
import sistemast.Telefone;

/**
 *
 * @author Luiz Manoel
 */
public class TelaAlterarST extends javax.swing.JFrame {

    /**
     * @return the st
     */
    public SocioTorcedor getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(SocioTorcedor st) {
        this.st = st;
    }

    private SocioTorcedor st;
    /**
     * Creates new form TelaAlterarST
     */
    public TelaAlterarST() {
        initComponents();
    }
    public TelaAlterarST(SocioTorcedor st) {//Chamada apos usr selecionar quem vai alterar
        this.st = st;
        initComponents();
        preenche();    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtEnviar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboIdade = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextCpf = new javax.swing.JTextField();
        jTextNome = new javax.swing.JTextField();
        jTextTelefone = new javax.swing.JTextField();
        jTextEndNum = new javax.swing.JTextField();
        jTextEndRua = new javax.swing.JTextField();
        jTextEndCidade = new javax.swing.JTextField();
        jTextEndEstado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButtonEmail = new javax.swing.JButton();
        jButtonTelefone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Alterar Dados -  Sócio Torcedor");

        jLabel3.setText("Idade");

        jLabel4.setText("Sexo");

        jBtEnviar.setText("Enviar");
        jBtEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEnviarActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço");

        jComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        jLabel6.setText("CPF");

        jComboIdade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "54", "56", "57", "58", "59", "60" }));
        jComboIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboIdadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefone");

        jLabel8.setText("Email");

        jLabel1.setText("Nome");

        jTextTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefoneActionPerformed(evt);
            }
        });

        jLabel12.setText("Numero");

        jLabel13.setText("Rua");

        jLabel14.setText("Estado");

        jLabel15.setText("Cidade");

        jButtonEmail.setText("Alterar Email");
        jButtonEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmailActionPerformed(evt);
            }
        });

        jButtonTelefone.setText("Alterar Telefone");
        jButtonTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextEmail)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNome)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel14)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(22, 22, 22)
                                                        .addComponent(jLabel13)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextEndRua, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextEndEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(57, 57, 57))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextEndCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextEndNum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonEmail)
                                .addGap(62, 445, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextEndRua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextEndNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEndCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEndEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButtonEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTelefone)
                    .addComponent(jBtEnviar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEnviarActionPerformed
        
        if(validacao()){
            //Acesso ao BD
            this.alterarST();
            
            this.dispose();
        
        
        }
        
    }//GEN-LAST:event_jBtEnviarActionPerformed

    private void jComboIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboIdadeActionPerformed

    private void jTextTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefoneActionPerformed

    private void jButtonEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmailActionPerformed
        // TODO add your handling code here:
        TelaAlterarEmail telaEmail = new TelaAlterarEmail(this.st.getEmail());
        telaEmail.setVisible(true);
    }//GEN-LAST:event_jButtonEmailActionPerformed

    private void jButtonTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelefoneActionPerformed
        // TODO add your handling code here:
        TelaAlterarTelefone telaTel = new TelaAlterarTelefone(this.st.getTelefone());
        telaTel.setVisible(true);
    }//GEN-LAST:event_jButtonTelefoneActionPerformed

    public void preenche(){//Preenche quando tela eh chamada
        jTextNome.setText(getSt().getNome());
        //jTextCod.setText(String.valueOf(st.getCodigoSt()));//Desnecessario
        jTextCpf.setText(getSt().getCpf());
        //jTextEmail.setText(getSt().getEmail());//.get(0).getEndereco()//Verificar um jeito melhor... as classes similares também
        jComboIdade.setSelectedIndex(getSt().getIdade());
        //jTextTelefone.setText(getSt().getTelefone());//.get(0).getNumero()
        
        this.jTextEndNum.setText(getSt().getEndereco().getEndNum());
        this.jTextEndRua.setText(getSt().getEndereco().getEndRua());
        this.jTextEndCidade.setText(getSt().getEndereco().getEndCidade());
        this.jTextEndEstado.setText(getSt().getEndereco().getEndEstado());//Email, Telefone X
        
        
        if(getSt().getSexo() == 'F'){
            jComboSexo.setSelectedIndex(0);
            
        }else{
            jComboSexo.setSelectedIndex(1);
        }
    }
    
    public void alterarST(){
        
                //Para testes, alterar depois
        Categoria cat1 = new Categoria();
        cat1.setBeneficios("Varios beneficios");
        cat1.setValorMensalidade(100);
        cat1.setCodigoCategoria(11211);
        cat1.setNome("Categoria1");
        getSt().setCategoria(cat1);
        
        
        getSt().setCategoria(cat1);
        
        Endereco end1 = new Endereco();
        end1.setEndNum(this.jTextEndNum.getText());
        end1.setEndRua(this.jTextEndRua.getText());
        end1.setEndCidade(this.jTextEndCidade.getText());
        end1.setEndEstado(this.jTextEndEstado.getText());
        getSt().setEndereco(end1);
        
        
        getSt().setCpf(this.jTextCpf.getText());
        
        getSt().setIdade(Integer.parseInt(this.jComboIdade.getSelectedItem().toString()));
        getSt().setNome(this.jTextNome.getText());
        getSt().setSexo(jComboSexo.getSelectedItem().toString().charAt(0));
        
        //getSt().setEmail(this.jTextEmail.getText());
        //getSt().setTelefone(jTextTelefone.getText());
        
                //Tratamento de email e telefone
//        Email em1 = new Email();
//        em1.setEndereco(this.jTextEmail.getText());
//        getSt().getEmail().add(em1);//Adiciona a lista, só para testes mesmo
//        
//        Telefone tel1 = new Telefone();
//        tel1.setNumero(this.jTextTelefone.getText());
//        getSt().getTelefone().add(tel1);
//        //
        
        
        
        SocioTorcedorDAO stdao = new SocioTorcedorDAO();
        stdao.altera(getSt());
    
    
    
    
    
    }
    
    
    private boolean validacao(){
        if(this.jTextCpf.getText().length() != 11){//CPF c/ 11 digitos
        
            return false;
        }
        
        if(this.jTextEmail.getText().equals("")){
        
            return false;
        }
        
        //if(this.jTextEndereco){}//resolver
        if(this.jTextNome.getText().equals("")){
            
            return false;
        }
        
        if(this.jTextTelefone.getText().equals("")){
            return false;
        }
        
        if(this.jTextEndNum.getText().equals("")){
        
            return false;
        
        }
        
        if(this.jTextEndCidade.getText().equals("")){
            return false;
        
        }
        
        if(this.jTextEndRua.getText().equals("")){
            return false;
        
        
        }
        
        if(this.jTextEndEstado.getText().equals("")){
            return false;
        
        }
        
        
        return true;
    
    
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtEnviar;
    private javax.swing.JButton jButtonEmail;
    private javax.swing.JButton jButtonTelefone;
    private javax.swing.JComboBox<String> jComboIdade;
    private javax.swing.JComboBox<String> jComboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextCpf;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEndCidade;
    private javax.swing.JTextField jTextEndEstado;
    private javax.swing.JTextField jTextEndNum;
    private javax.swing.JTextField jTextEndRua;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables
}
