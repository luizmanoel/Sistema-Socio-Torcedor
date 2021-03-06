/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import dao.AdministradorDAO;
import dao.FuncionarioDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemast.Administrador;
import sistemast.Funcionario;


/**
 *
 * @author Luiz Manoel
 */
public class Login extends javax.swing.JFrame {

    private Funcionario ffinal;
    private Administrador afinal;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuário");

        jTextLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLoginActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha");

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Autenticação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(validacao()){//Se senha e login não estão vazios
            //Buscar no banco e etc...
            //Provavelmente um objeto adm e func deverá ser passado por parametro, por conta do "meus dados"
            if(checagemLoginAdm()){
                //System.out.println("Pato2");
                //Iniciar uma tela p/ admin
                TelaAdmin tela1 = new TelaAdmin(afinal);//Passa o admin que logou
                tela1.setVisible(true);
                this.dispose();
                
                

            }else if(checagemLoginFunc()){
                //System.out.println("Pato3");
                //Iniciar uma tela p/ funcionario
                TelaFuncionario tela1 = new TelaFuncionario(ffinal);//Passa o func. que logou
                tela1.setVisible(true);
                this.dispose();
            
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!", "Falha de Login", JOptionPane.ERROR_MESSAGE);
                jTextLogin.setText("");
                jPasswordField1.setText("");
            
            }
        
        
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private boolean validacao(){
        if(!this.jTextLogin.getText().equals("")){
            char [] pass = this.jPasswordField1.getPassword();
            if(pass.length > 0){
                //System.out.println("Pato");
                return true;
            
            }

        }
        return false;
    }
    
    public boolean checagemLoginAdm(){
        
        Administrador a1 = new Administrador();
        AdministradorDAO admindao = new AdministradorDAO();
        
        
        ArrayList <Object> listaAdmin = new ArrayList();
        
        
        listaAdmin = admindao.consulta(a1);
        
        for(int i = 0; i < listaAdmin.size(); i++){
            a1 = (Administrador)listaAdmin.get(i);//Cast
            //System.out.println(a1.getNome());
            if(this.jTextLogin.getText().equals(String.valueOf(a1.getId()))){//Teste se login e senha conferem //Decisao do parametro
                if(this.jPasswordField1.getText().equals(a1.getSenha())){//Encontrar alternativa
                
                    this.afinal = a1;
                    return true; // Login c/ sucesso
                }
            
            
            }
        
        
        }
        //System.out.println("FinishPato");//Caso de erro
        

        
        return false;
    
    
    
    
    }
    
    public boolean checagemLoginFunc(){
        Funcionario f1 = new Funcionario();
        FuncionarioDAO funcDAO = new FuncionarioDAO();
        
        ArrayList <Object> listaFunc = new ArrayList();
        
        listaFunc = funcDAO.consulta(f1);
        
        
        for(int i = 0; i < listaFunc.size(); i++ ){
            f1 = (Funcionario)listaFunc.get(i);//Cast
            
            if(this.jTextLogin.getText().equals(String.valueOf(f1.getId()))){//Teste se login e senha conferem
                if(this.jPasswordField1.getText().equals(f1.getSenha())){
                    this.ffinal = f1;
                    return true;
                
                }
            
            }
        
        
        }
        
        return false;
    
    
    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextLogin;
    // End of variables declaration//GEN-END:variables
}
