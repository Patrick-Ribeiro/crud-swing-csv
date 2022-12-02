package appvendas.view.vendedor;

/**
 *
 * @author patrick
 */
public class FormularioVendedor extends javax.swing.JDialog {

    public FormularioVendedor(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFormulario = new javax.swing.JPanel();
        campoNome = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelErroNome = new javax.swing.JLabel();
        campoLogin = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        textFieldLogin = new javax.swing.JTextField();
        labelErroLogin = new javax.swing.JLabel();
        campoEmail = new javax.swing.JPanel();
        labelEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelErroEmail = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPanel();
        labelSenha = new javax.swing.JLabel();
        passwordFieldSenha = new javax.swing.JPasswordField();
        labelErroSenha = new javax.swing.JLabel();
        painelRodape = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
        buttonCancelar = new javax.swing.JButton();
        buttonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Usuário");
        setMinimumSize(new java.awt.Dimension(420, 200));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        painelFormulario.setBackground(new java.awt.Color(250, 250, 250));
        painelFormulario.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painelFormulario.setMinimumSize(new java.awt.Dimension(400, 100));
        painelFormulario.setLayout(new java.awt.GridLayout(3, 2, 10, 0));

        campoNome.setMaximumSize(new java.awt.Dimension(151512, 90));
        campoNome.setMinimumSize(new java.awt.Dimension(200, 90));
        campoNome.setOpaque(false);
        campoNome.setPreferredSize(new java.awt.Dimension(200, 90));
        campoNome.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 1));

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNome.setText("Nome");
        labelNome.setMaximumSize(new java.awt.Dimension(200, 20));
        labelNome.setMinimumSize(new java.awt.Dimension(200, 20));
        labelNome.setPreferredSize(new java.awt.Dimension(200, 20));
        campoNome.add(labelNome);

        textFieldNome.setMaximumSize(new java.awt.Dimension(200, 35));
        textFieldNome.setMinimumSize(new java.awt.Dimension(200, 35));
        textFieldNome.setPreferredSize(new java.awt.Dimension(200, 35));
        campoNome.add(textFieldNome);

        labelErroNome.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroNome.setForeground(java.awt.Color.red);
        labelErroNome.setMaximumSize(new java.awt.Dimension(200, 20));
        labelErroNome.setMinimumSize(new java.awt.Dimension(200, 20));
        labelErroNome.setPreferredSize(new java.awt.Dimension(200, 20));
        campoNome.add(labelErroNome);

        painelFormulario.add(campoNome);

        campoLogin.setMaximumSize(new java.awt.Dimension(200, 90));
        campoLogin.setMinimumSize(new java.awt.Dimension(200, 90));
        campoLogin.setOpaque(false);
        campoLogin.setPreferredSize(new java.awt.Dimension(200, 90));
        campoLogin.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 1));

        labelLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icones/info-12px.png"))); // NOI18N
        labelLogin.setLabelFor(textFieldLogin);
        labelLogin.setText("Login");
        labelLogin.setToolTipText("Nome usado para fazer login no sistema");
        labelLogin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labelLogin.setMaximumSize(new java.awt.Dimension(200, 20));
        labelLogin.setMinimumSize(new java.awt.Dimension(200, 20));
        labelLogin.setPreferredSize(new java.awt.Dimension(200, 20));
        campoLogin.add(labelLogin);

        textFieldLogin.setMaximumSize(new java.awt.Dimension(5451, 35));
        textFieldLogin.setMinimumSize(new java.awt.Dimension(200, 35));
        textFieldLogin.setPreferredSize(new java.awt.Dimension(200, 35));
        campoLogin.add(textFieldLogin);

        labelErroLogin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroLogin.setForeground(java.awt.Color.red);
        labelErroLogin.setMaximumSize(new java.awt.Dimension(200, 20));
        labelErroLogin.setMinimumSize(new java.awt.Dimension(200, 20));
        labelErroLogin.setPreferredSize(new java.awt.Dimension(200, 20));
        campoLogin.add(labelErroLogin);

        painelFormulario.add(campoLogin);

        campoEmail.setMaximumSize(new java.awt.Dimension(200, 90));
        campoEmail.setMinimumSize(new java.awt.Dimension(200, 90));
        campoEmail.setOpaque(false);
        campoEmail.setPreferredSize(new java.awt.Dimension(200, 90));
        campoEmail.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 1));

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icones/info-12px.png"))); // NOI18N
        labelEmail.setText("Email");
        labelEmail.setToolTipText("Escolha seu melhor email");
        labelEmail.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labelEmail.setMaximumSize(new java.awt.Dimension(200, 20));
        labelEmail.setMinimumSize(new java.awt.Dimension(200, 20));
        labelEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        campoEmail.add(labelEmail);

        textFieldEmail.setMaximumSize(new java.awt.Dimension(5451, 35));
        textFieldEmail.setMinimumSize(new java.awt.Dimension(200, 35));
        textFieldEmail.setPreferredSize(new java.awt.Dimension(200, 35));
        campoEmail.add(textFieldEmail);

        labelErroEmail.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroEmail.setForeground(java.awt.Color.red);
        labelErroEmail.setMaximumSize(new java.awt.Dimension(200, 20));
        labelErroEmail.setMinimumSize(new java.awt.Dimension(200, 20));
        labelErroEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        campoEmail.add(labelErroEmail);

        painelFormulario.add(campoEmail);

        campoSenha.setMaximumSize(new java.awt.Dimension(200, 90));
        campoSenha.setMinimumSize(new java.awt.Dimension(200, 90));
        campoSenha.setOpaque(false);
        campoSenha.setPreferredSize(new java.awt.Dimension(200, 90));
        campoSenha.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 1));

        labelSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icones/info-12px.png"))); // NOI18N
        labelSenha.setText("Senha");
        labelSenha.setToolTipText("Escolha uma senha segura para maior proteção dos seus dados");
        labelSenha.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labelSenha.setMaximumSize(new java.awt.Dimension(200, 20));
        labelSenha.setMinimumSize(new java.awt.Dimension(200, 20));
        labelSenha.setPreferredSize(new java.awt.Dimension(200, 20));
        campoSenha.add(labelSenha);

        passwordFieldSenha.setMinimumSize(new java.awt.Dimension(200, 35));
        passwordFieldSenha.setPreferredSize(new java.awt.Dimension(200, 35));
        campoSenha.add(passwordFieldSenha);

        labelErroSenha.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroSenha.setForeground(java.awt.Color.red);
        labelErroSenha.setMaximumSize(new java.awt.Dimension(200, 20));
        labelErroSenha.setMinimumSize(new java.awt.Dimension(200, 20));
        labelErroSenha.setPreferredSize(new java.awt.Dimension(200, 20));
        campoSenha.add(labelErroSenha);

        painelFormulario.add(campoSenha);

        getContentPane().add(painelFormulario);

        painelRodape.setBackground(new java.awt.Color(250, 250, 250));
        painelRodape.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 5));
        painelRodape.setMaximumSize(new java.awt.Dimension(15236, 50));
        painelRodape.setMinimumSize(new java.awt.Dimension(400, 50));
        painelRodape.setPreferredSize(new java.awt.Dimension(400, 50));
        painelRodape.setVerifyInputWhenFocusTarget(false);
        painelRodape.setLayout(new java.awt.BorderLayout());

        painelBotoes.setBackground(new java.awt.Color(255, 255, 255));
        painelBotoes.setOpaque(false);

        buttonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icones/cancelar-24px.png"))); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.setBorderPainted(false);
        buttonCancelar.setFocusPainted(false);
        buttonCancelar.setFocusable(false);
        buttonCancelar.setPreferredSize(new java.awt.Dimension(115, 35));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        painelBotoes.add(buttonCancelar);

        buttonConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        buttonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icones/ok-24px.png"))); // NOI18N
        buttonConfirmar.setText("Confirmar");
        buttonConfirmar.setBorderPainted(false);
        buttonConfirmar.setFocusPainted(false);
        buttonConfirmar.setFocusable(false);
        buttonConfirmar.setPreferredSize(new java.awt.Dimension(115, 35));
        buttonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarActionPerformed(evt);
            }
        });
        painelBotoes.add(buttonConfirmar);

        painelRodape.add(painelBotoes, java.awt.BorderLayout.LINE_END);

        getContentPane().add(painelRodape);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonConfirmar;
    private javax.swing.JPanel campoEmail;
    private javax.swing.JPanel campoLogin;
    private javax.swing.JPanel campoNome;
    private javax.swing.JPanel campoSenha;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelErroEmail;
    private javax.swing.JLabel labelErroLogin;
    private javax.swing.JLabel labelErroNome;
    private javax.swing.JLabel labelErroSenha;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelFormulario;
    private javax.swing.JPanel painelRodape;
    private javax.swing.JPasswordField passwordFieldSenha;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldLogin;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables

}
