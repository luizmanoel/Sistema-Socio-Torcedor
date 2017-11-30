/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import dao.CategoriaDAO;
import dao.SocioTorcedorDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemast.Categoria;
import sistemast.Email;
import sistemast.Endereco;
import sistemast.SocioTorcedor;
import sistemast.Telefone;

/**
 *
 * @author Luiz Manoel
 */
public class TelaCadastroST extends javax.swing.JFrame {

    //private SocioTorcedor st;
    private String [] dadosCatCod;

    /**
     * Creates new form TelaCadastroST
     */
    public TelaCadastroST() {
        initComponents();
    }

    public TelaCadastroST(SocioTorcedor st) {
        //this.st = st;
        
        initComponents();
        preencherListaCategoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextCpf = new javax.swing.JTextField();
        jTextTelefone = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextCod = new javax.swing.JTextField();
        jBtEnviar = new javax.swing.JButton();
        jComboSexo = new javax.swing.JComboBox<>();
        jComboIdade = new javax.swing.JComboBox<>();
        jTextEndNum = new javax.swing.JTextField();
        jTextEndRua = new javax.swing.JTextField();
        jTextEndCidade = new javax.swing.JTextField();
        jTextEndEstado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jTextCodTel = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextCodMail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCategoria = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Cadastro de Sócio Torcedor");

        jLabel3.setText("Idade");

        jLabel4.setText("Sexo");

        jLabel5.setText("Endereço");

        jLabel6.setText("CPF");

        jLabel7.setText("Telefone");

        jLabel8.setText("Email");

        jLabel9.setText("Código Socio Torcedor");

        jTextTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefoneActionPerformed(evt);
            }
        });

        jBtEnviar.setText("Enviar");
        jBtEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEnviarActionPerformed(evt);
            }
        });

        jComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        jComboIdade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "54", "56", "57", "58", "59", "60" }));
        jComboIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboIdadeActionPerformed(evt);
            }
        });

        jLabel12.setText("Numero");

        jLabel13.setText("Rua");

        jLabel14.setText("Estado");

        jLabel15.setText("Cidade");

        jLabel10.setText("ID");

        jLabel17.setText("Código do Telefone");

        jLabel18.setText("Código do Email");

        jListCategoria.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListCategoria);

        jLabel11.setText("Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addComponent(jTextEmail)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCodMail)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextCodTel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(51, 51, 51)
                                .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextEndCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextEndNum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextEndRua, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEndEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jBtEnviar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(28, 28, 28)
                        .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(68, 68, 68)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEndNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextEndRua))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEndCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEndEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCodTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEmail)
                    .addComponent(jLabel8))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextCodMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jBtEnviar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefoneActionPerformed

    private void jComboIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboIdadeActionPerformed

    private void jBtEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEnviarActionPerformed
       
        if(validacao()){
            incluirST();
            this.dispose();
        
        }else{
        
            JOptionPane.showMessageDialog(null, "Favor preencher todos os campos corretamente!", "Atenção", 0);//Provisorio
        }
    }//GEN-LAST:event_jBtEnviarActionPerformed

    
    public void preencherListaCategoria(){
        CategoriaDAO catdao = new CategoriaDAO();
        Categoria cat1 = new Categoria();
        ArrayList<Object> listaCat = catdao.consulta(cat1);
        String [] dadosCat = new String[listaCat.size()];//Armazena o par, nome e codigo
        this.dadosCatCod = new String[listaCat.size()];//Armazena o par, nome e codigo
        Categoria catRecebida;
        for(int i = 0; i < listaCat.size(); i++){
            catRecebida = (Categoria) listaCat.get(i);
            dadosCat[i]= catRecebida.getNome();
            this.dadosCatCod[i] = String.valueOf(catRecebida.getCodigoCategoria());
        
        }
    
        this.jListCategoria.setListData(dadosCat);//Exibir na caida de lista, as categorias disponiveis
        //Usar getSelectedIndex com o par de código de categoria
    
    
    
    
    }
    
    
    
    public void incluirST(){
        SocioTorcedor st = new SocioTorcedor();//Melhor fazer assim ?
        
        System.out.println(this.jTextNome.getText());
        st.setNome(jTextNome.getText());
        st.setCodigoSt(Integer.parseInt(jTextCod.getText()));
        st.setCpf(jTextCpf.getText());
        st.setIdade(Integer.parseInt(jComboIdade.getSelectedItem().toString()));
        
        Telefone novoTel = new Telefone();
        novoTel.setCodTelefone(Integer.parseInt(jTextCodTel.getText()));
        novoTel.setNumero(jTextTelefone.getText());
        
        ArrayList<Telefone> listTel = new ArrayList<Telefone>();
        listTel.add(novoTel);
        
        st.setTelefone(listTel);
        
        Email novoMail = new Email();
        novoMail.setCodEmail(Integer.parseInt(jTextCodMail.getText()));
        novoMail.setEndereco(jTextEmail.getText());
        
        ArrayList<Email> listMail = new ArrayList<Email>();
        listMail.add(novoMail);
        
        st.setEmail(listMail);
        
        st.setSexo(jComboSexo.getSelectedItem().toString().charAt(0));
        
        
        //Tratamento de email e telefone
//        Email em1 = new Email();
//        em1.setEndereco(this.jTextEmail.getText());
//        st.getEmail().add(em1);//Adiciona a lista, só para testes mesmo
//        
//        Telefone tel1 = new Telefone();
//        tel1.setNumero(this.jTextTelefone.getText());
//        st.getTelefone().add(tel1);
        //
        
        
        
        //Tratamento endereço
        Endereco end1 = new Endereco();
        end1.setEndNum(this.jTextEndNum.getText());
        end1.setEndRua(this.jTextEndRua.getText());
        end1.setEndCidade(this.jTextEndCidade.getText());
        end1.setEndEstado(this.jTextEndEstado.getText());
        st.setEndereco(end1);
        
        st.setId(Integer.parseInt(this.jTextID.getText()));
        
        
        //Tratar Categoria
        
        //Para testes
//        Categoria cat1 = new Categoria();
//        cat1.setBeneficios("Varios beneficios");
//        cat1.setValorMensalidade(100);
//        cat1.setCodigoCategoria(11211);
//        cat1.setNome("Categoria1");
//        st.setCategoria(cat1);
        
//Passivel de solucao temporaria
        Categoria cat1 = new Categoria();
        cat1.setCodigoCategoria(Integer.parseInt(this.dadosCatCod[this.jListCategoria.getSelectedIndex()]));//SOmente o código eh necessario
        
        st.setCategoria(cat1);
        
        
        SocioTorcedorDAO stdao = new SocioTorcedorDAO();
        stdao.adiciona(st);
        //joga no banco
        
    }
    
    private boolean validacao(){
        //System.out.print(this.jTextCod.getText());
        if(this.jTextCod.getText().equals("")){//Se está vazio...
            //Podemos usar labels e setVisible para indicar campos c/ obrigatoriedade
            return false;
        
        }
        if(this.jTextCpf.getText().length() != 11){//CPF c/ 9 digitos
        
            return false;
        }
        
        if(this.jListCategoria.isSelectionEmpty()){//Sem categoria selecionada
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
//            java.util.logging.Logger.getLogger(TelaCadastroST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaCadastroST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaCadastroST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaCadastroST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaCadastroST().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtEnviar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboIdade;
    private javax.swing.JComboBox<String> jComboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCod;
    private javax.swing.JTextField jTextCodMail;
    private javax.swing.JTextField jTextCodTel;
    private javax.swing.JTextField jTextCpf;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEndCidade;
    private javax.swing.JTextField jTextEndEstado;
    private javax.swing.JTextField jTextEndNum;
    private javax.swing.JTextField jTextEndRua;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables
}
