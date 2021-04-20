/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import javax.swing.JOptionPane;
import classes.game1;

/**
 *
 * @author Nicolas
 */
public class Login extends javax.swing.JFrame {

    String nome = "";
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextSenha = new javax.swing.JTextField();
        jTextApelido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBentrar = new javax.swing.JButton();
        jButtonvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 560));
        setMinimumSize(new java.awt.Dimension(650, 560));
        setPreferredSize(new java.awt.Dimension(650, 560));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextSenha.setBackground(new java.awt.Color(83, 99, 175));
        jTextSenha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextSenha);
        jTextSenha.setBounds(170, 280, 310, 40);

        jTextApelido.setBackground(new java.awt.Color(83, 99, 175));
        getContentPane().add(jTextApelido);
        jTextApelido.setBounds(170, 180, 310, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 7.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 660, 580);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 20, 30, 30);

        jBentrar.setText("ENTRAR");
        jBentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBentrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBentrar);
        jBentrar.setBounds(230, 380, 180, 40);

        jButtonvoltar.setText("jButton2");
        jButtonvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonvoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonvoltar);
        jButtonvoltar.setBounds(20, 10, 60, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBentrarActionPerformed
           if(jTextApelido.getText().equals(""))
        JOptionPane.showMessageDialog(null,"Digite um nome");
       else{
           nome = jTextApelido.getText();
       }
       
       game1 cg1 = new game1();
       cg1.recebedados(nome);
       cg1.mostradados(nome);
       
     
       Splash obj = new Splash();
       
        obj.ledados(cg1);
       
       obj.setVisible(true);
        dispose();
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jBentrarActionPerformed

    private void jButtonvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonvoltarActionPerformed
        
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonvoltarActionPerformed

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
    private javax.swing.JButton jBentrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextApelido;
    private javax.swing.JTextField jTextSenha;
    // End of variables declaration//GEN-END:variables
}
