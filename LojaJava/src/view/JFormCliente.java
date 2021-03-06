/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ClienteDAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author eric
 */
public class JFormCliente extends javax.swing.JFrame {

    /**
     * Creates new form JFormCliente
     */
    public JFormCliente() {
        initComponents();
        setLocationRelativeTo(null);
        
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter tel = new javax.swing.text.MaskFormatter("(##)#########");
            txtTelefone = new javax.swing.JFormattedTextField(tel);
            try{
                javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("####-##-##");
                txtNascimento = new javax.swing.JFormattedTextField(data);
                jScrollPane1 = new javax.swing.JScrollPane();
                tbCliente = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                btnGravar = new javax.swing.JButton();
                btnSair = new javax.swing.JButton();
                btnRemover = new javax.swing.JButton();
                btnAtualizar = new javax.swing.JButton();
                btnClear = new javax.swing.JButton();

                setTitle("Menu Clientes");
                setResizable(false);

            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro : " + ex.getMessage());
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro : " + ex.getMessage());
        }

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "NASCIMENTO", "TELEFONE"
            }
        ));
        tbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCliente);

        jLabel1.setText("Nome");

        jLabel2.setText("Data de Nascimento");

        jLabel3.setText("Telefone");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnSair)
                    .addComponent(btnRemover)
                    .addComponent(btnAtualizar)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
        if (verifica()){
            Cliente cliente = new Cliente();
            cliente.setNome(txtNome.getText());
            cliente.setNascimento(txtNascimento.getText());
            cliente.setTelefone(txtTelefone.getText());

            ClienteDAO dao = new ClienteDAO();
            dao.insert(cliente);

            preencherTabela();
            limparCampos();
        }
        else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }

    }//GEN-LAST:event_btnGravarActionPerformed

    private void preencherTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel) tbCliente.getModel();
        modelo.setNumRows(0); // reinicia os dados da tabela
        
        ClienteDAO dao = new ClienteDAO();
        
        for(Cliente c : dao.selectCliente()){
            
            Object[] dados = {
                    c.getId(),
                    c.getNome(),
                    c.getNascimento(),
                    c.getTelefone()
            };
            
            modelo.addRow(dados);
        } // fim do for
    } // fim do metodo
    
    private void limparCampos(){
        txtNome.setText("");
        txtNascimento.setText("");
        txtTelefone.setText("");
        btnGravar.setEnabled(true);
    }
    
    private boolean verifica(){
        if( !(txtNome.getText().equals("")) && !(txtNascimento.getText().equals("")) && !(txtTelefone.getText().equals("")) ){
            return true;
        }
        return false;
    }
    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        
        int linha = tbCliente.getSelectedRow();
        
        if(linha > -1){
           int id = Integer.parseInt(tbCliente.getValueAt(linha, 0).toString());
           //JOptionPane.showMessageDialog(null, "ID: " + id);
           
           Cliente cliente = new Cliente();
           cliente.setId(id);
           
           ClienteDAO dao = new ClienteDAO();
           dao.delete(cliente);
           
           JOptionPane.showMessageDialog(null, "Removido com Sucesso!");
           
           preencherTabela();
           limparCampos();
           
        } else {
             JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
        
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void tbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteMouseClicked
        // TODO add your handling code here:
        
        int linha = tbCliente.getSelectedRow(); // retorna a linha selecionada
        
        if(linha > -1){ // se linha igual a -1 significa que nao tem linha selecionada
            
            btnGravar.setEnabled(false);
            /* getValueAt ~ o primeiro parametro é a linha e o segundo a coluna */
            txtNome.setText(tbCliente.getValueAt(linha, 1).toString());
            txtNascimento.setText(tbCliente.getValueAt(linha, 2).toString());
            txtTelefone.setText(tbCliente.getValueAt(linha, 3).toString());
            
        }
    }//GEN-LAST:event_tbClienteMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        
        int linha = tbCliente.getSelectedRow();
        
        if(linha > - 1){
            
            Cliente cliente = new Cliente();
            
            int id = Integer.parseInt(tbCliente.getValueAt(linha, 0).toString());
            
            cliente.setId(id);
            cliente.setNome(txtNome.getText());
            cliente.setNascimento(txtNascimento.getText());
            cliente.setTelefone(txtTelefone.getText());
          
            ClienteDAO dao = new ClienteDAO();
            dao.update(cliente);
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucess!");
            
            limparCampos();
            preencherTabela();
        } else {
             JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(JFormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private boolean empty(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
