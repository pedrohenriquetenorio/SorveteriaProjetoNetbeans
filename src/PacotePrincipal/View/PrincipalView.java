/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacotePrincipal.View;

/**
 *
 * @author pedro
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public PrincipalView() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItemVenda = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuItemFinanceiro = new javax.swing.JMenuItem();
        jControleCaixa = new javax.swing.JMenu();
        jMenuItemCaixa = new javax.swing.JMenuItem();
        jMenuFornecedores = new javax.swing.JMenu();
        jMenuItemFornecedores = new javax.swing.JMenuItem();
        jMenuFuncionario = new javax.swing.JMenu();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Caixa Status:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Aberto");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Hora:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("10:23");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Data:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("23/08/2020");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Bem Vindo: \"Nome Funcionario\" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(102, 102, 102)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(385, 40));

        jMenuVenda.setForeground(new java.awt.Color(0, 0, 0));
        jMenuVenda.setText("Venda");
        jMenuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendaActionPerformed(evt);
            }
        });

        jMenuItemVenda.setText("Venda");
        jMenuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendaActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemVenda);

        jMenuBar1.add(jMenuVenda);

        jMenuFinanceiro.setForeground(new java.awt.Color(0, 0, 0));
        jMenuFinanceiro.setText("Financeiro");

        jMenuItemFinanceiro.setText("Financeiro");
        jMenuItemFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFinanceiroActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemFinanceiro);

        jMenuBar1.add(jMenuFinanceiro);

        jControleCaixa.setForeground(new java.awt.Color(0, 0, 0));
        jControleCaixa.setText("Controle Caixa");

        jMenuItemCaixa.setText("Controle Caixa");
        jMenuItemCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCaixaActionPerformed(evt);
            }
        });
        jControleCaixa.add(jMenuItemCaixa);

        jMenuBar1.add(jControleCaixa);

        jMenuFornecedores.setForeground(new java.awt.Color(0, 0, 0));
        jMenuFornecedores.setText("Fornecedores");
        jMenuFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFornecedoresActionPerformed(evt);
            }
        });

        jMenuItemFornecedores.setText("Fornecedores");
        jMenuFornecedores.add(jMenuItemFornecedores);

        jMenuBar1.add(jMenuFornecedores);

        jMenuFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        jMenuFuncionario.setText("Funcionário");
        jMenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFuncionarioActionPerformed(evt);
            }
        });

        jMenuItemFuncionario.setText("Funcionário");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(jMenuItemFuncionario);

        jMenuBar1.add(jMenuFuncionario);

        jMenuSair.setForeground(new java.awt.Color(0, 0, 0));
        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   

/// ARRUMAR ISSO +++ADICIONAR UMA TELA DO FUNCIONARIO DENTRO DO MENU PRINCIPAL +++
    private void jMenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFuncionarioActionPerformed
       
        new FuncionarioView().setVisible(true);
        
    }//GEN-LAST:event_jMenuFuncionarioActionPerformed

    private void jMenuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendaActionPerformed
        // TODO add your handling code here:
        
   
      
   
        
        
    }//GEN-LAST:event_jMenuVendaActionPerformed

    private void jMenuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendaActionPerformed
        // TODO add your handling code here:
        VendaView venda = new VendaView();
        venda.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemVendaActionPerformed

    private void jMenuItemCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCaixaActionPerformed
        // TODO add your handling code here:
        CaixaView caixa = new CaixaView();
        caixa.setVisible(true);
    }//GEN-LAST:event_jMenuItemCaixaActionPerformed

    private void jMenuItemFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinanceiroActionPerformed
        // TODO add your handling code here:
        
        FinanceiroView financeiro = new FinanceiroView();
        financeiro.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemFinanceiroActionPerformed

    private void jMenuFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFornecedoresActionPerformed
        // TODO add your handling code here:
        
        FinanceiroView financeiro = new FinanceiroView();
        financeiro.setVisible(true);
    }//GEN-LAST:event_jMenuFornecedoresActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        // TODO add your handling code here:
        FuncionarioView funcionario = new FuncionarioView();
        funcionario.setVisible(true);
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jControleCaixa;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenu jMenuFornecedores;
    private javax.swing.JMenu jMenuFuncionario;
    private javax.swing.JMenuItem jMenuItemCaixa;
    private javax.swing.JMenuItem jMenuItemFinanceiro;
    private javax.swing.JMenuItem jMenuItemFornecedores;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemVenda;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
