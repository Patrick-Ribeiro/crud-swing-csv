package appvendas.view.login;

import appvendas.view.principal.TelaPrincipal;

/**
 *
 * @author patrick
 */
public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        labelIconeLogin = new javax.swing.JLabel();
        painelFormulario = new javax.swing.JPanel();
        painelCampoEmail = new javax.swing.JPanel();
        labelEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        painelCampoSenha = new javax.swing.JPanel();
        labelSenha = new javax.swing.JLabel();
        passwordFieldSenha = new javax.swing.JPasswordField();
        painelBotoes = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(380, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelPrincipal.setBackground(new java.awt.Color(250, 250, 250));
        painelPrincipal.setMaximumSize(new java.awt.Dimension(380, 330));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(380, 330));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(380, 330));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelIconeLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconeLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appvendas/view/assets/icones/login-128px.png"))); // NOI18N
        labelIconeLogin.setMaximumSize(new java.awt.Dimension(380, 128));
        labelIconeLogin.setMinimumSize(new java.awt.Dimension(380, 128));
        labelIconeLogin.setPreferredSize(new java.awt.Dimension(380, 128));
        painelPrincipal.add(labelIconeLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        painelFormulario.setMaximumSize(new java.awt.Dimension(200, 150));
        painelFormulario.setMinimumSize(new java.awt.Dimension(200, 150));
        painelFormulario.setOpaque(false);
        painelFormulario.setPreferredSize(new java.awt.Dimension(200, 150));
        painelFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelCampoEmail.setMaximumSize(new java.awt.Dimension(200, 60));
        painelCampoEmail.setMinimumSize(new java.awt.Dimension(200, 60));
        painelCampoEmail.setOpaque(false);
        painelCampoEmail.setPreferredSize(new java.awt.Dimension(200, 60));
        painelCampoEmail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEmail.setText("Email");
        labelEmail.setMaximumSize(new java.awt.Dimension(200, 25));
        labelEmail.setMinimumSize(new java.awt.Dimension(200, 25));
        labelEmail.setPreferredSize(new java.awt.Dimension(200, 25));
        painelCampoEmail.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textFieldEmail.setMaximumSize(new java.awt.Dimension(200, 35));
        textFieldEmail.setMinimumSize(new java.awt.Dimension(200, 35));
        textFieldEmail.setPreferredSize(new java.awt.Dimension(200, 35));
        painelCampoEmail.add(textFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

        painelFormulario.add(painelCampoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painelCampoSenha.setMaximumSize(new java.awt.Dimension(200, 60));
        painelCampoSenha.setOpaque(false);
        painelCampoSenha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSenha.setText("Senha");
        labelSenha.setMaximumSize(new java.awt.Dimension(200, 25));
        labelSenha.setMinimumSize(new java.awt.Dimension(200, 25));
        labelSenha.setPreferredSize(new java.awt.Dimension(200, 25));
        painelCampoSenha.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        passwordFieldSenha.setMaximumSize(new java.awt.Dimension(200, 35));
        passwordFieldSenha.setMinimumSize(new java.awt.Dimension(200, 35));
        passwordFieldSenha.setPreferredSize(new java.awt.Dimension(200, 35));
        painelCampoSenha.add(passwordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

        painelFormulario.add(painelCampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, -1, -1));

        painelPrincipal.add(painelFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 135, -1, 130));

        painelBotoes.setMaximumSize(new java.awt.Dimension(200, 35));
        painelBotoes.setOpaque(false);
        painelBotoes.setPreferredSize(new java.awt.Dimension(200, 45));
        painelBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appvendas/view/assets/icones/cancelar-24px.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(95, 35));
        btnSair.setMinimumSize(new java.awt.Dimension(95, 35));
        btnSair.setPreferredSize(new java.awt.Dimension(95, 35));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painelBotoes.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appvendas/view/assets/icones/ok-24px.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setMaximumSize(new java.awt.Dimension(95, 35));
        btnEntrar.setMinimumSize(new java.awt.Dimension(95, 35));
        btnEntrar.setPreferredSize(new java.awt.Dimension(95, 35));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        painelBotoes.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 0, -1, -1));

        painelPrincipal.add(painelBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 275, -1, -1));

        getContentPane().add(painelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        this.dispose();
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
    }//GEN-LAST:event_btnEntrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelIconeLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelCampoEmail;
    private javax.swing.JPanel painelCampoSenha;
    private javax.swing.JPanel painelFormulario;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPasswordField passwordFieldSenha;
    private javax.swing.JTextField textFieldEmail;
    // End of variables declaration//GEN-END:variables
}
