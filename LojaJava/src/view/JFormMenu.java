/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Conexao;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author eric
 */
public class JFormMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFormMenu
     */
    public JFormMenu() {
        initComponents();
        
        setLocationRelativeTo(null); // metodo que inicializa o form no centro da Tela
        
        Date data = new Date();
        DateFormat dataFormatada = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        lblData.setText(dataFormatada.format(data));
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMsgConexao = new javax.swing.JLabel();
        btnConectar = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuTabelas = new javax.swing.JMenu();
        menuOptionCliente = new javax.swing.JMenuItem();
        menuOptionItem = new javax.swing.JMenuItem();
        menuOptionCompra = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Panel");
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        lblMsgConexao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMsgConexao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsgConexao.setText("o banco esta desconectado");
        lblMsgConexao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnConectar.setText("Testar Conexao");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        lblData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblData.setText("Data");

        menuTabelas.setText("Tabelas");

        menuOptionCliente.setText("Clientes");
        menuOptionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionClienteActionPerformed(evt);
            }
        });
        menuTabelas.add(menuOptionCliente);

        menuOptionItem.setText("Itens");
        menuOptionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionItemActionPerformed(evt);
            }
        });
        menuTabelas.add(menuOptionItem);

        menuOptionCompra.setText("Compras");
        menuOptionCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionCompraActionPerformed(evt);
            }
        });
        menuTabelas.add(menuOptionCompra);

        menuPrincipal.add(menuTabelas);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMsgConexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnConectar)
                        .addGap(0, 135, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnConectar)
                .addGap(18, 18, 18)
                .addComponent(lblMsgConexao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(lblData)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        String msg = "";
        try {
            Connection con = Conexao.getConexao();
            msg = "O Banco foi conectado com sucesso!";
            Conexao.fecharConexao(con);
        } catch (Exception ex) {
            msg = ex.getMessage();
        }
        lblMsgConexao.setText(msg);
    }//GEN-LAST:event_btnConectarActionPerformed

    private void menuOptionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptionClienteActionPerformed
        // TODO add your handling code here:
        JFormCliente frmCliente = new JFormCliente();
        frmCliente.setVisible(true);
    }//GEN-LAST:event_menuOptionClienteActionPerformed

    private void menuOptionItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptionItemActionPerformed
        // TODO add your handling code here:
        JFormItem frmItem = new JFormItem();
        frmItem.setVisible(true);
    }//GEN-LAST:event_menuOptionItemActionPerformed

    private void menuOptionCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptionCompraActionPerformed
        // TODO add your handling code here:
        JFormCompra frmCompra = new JFormCompra();
        frmCompra.setVisible(true);
    }//GEN-LAST:event_menuOptionCompraActionPerformed

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
            java.util.logging.Logger.getLogger(JFormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblMsgConexao;
    private javax.swing.JMenuItem menuOptionCliente;
    private javax.swing.JMenuItem menuOptionCompra;
    private javax.swing.JMenuItem menuOptionItem;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuTabelas;
    // End of variables declaration//GEN-END:variables
}