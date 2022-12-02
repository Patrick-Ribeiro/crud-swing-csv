package appvendas.view.principal;

import appvendas.view.venda.ListagemVenda;
import appvendas.view.vendedor.ListagemVendedor;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author patrick
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    /**
     * Este método limpa o painei principal e carrega um novo painel dentro de
     * si. É usado nas trocas de telas de acordo com o item do menu selecionado
     *
     * @param painel tela a ser carregada
     */
    private void carregarPainelPrincipal(JPanel painel) {
        painelCentral.removeAll();
        painelCentral.revalidate();
        painelCentral.repaint();

        painelCentral.add(painel);

        painelCentral.revalidate();
        painelCentral.repaint();
    }

    /**
     * Este método configura a cor de fundo de um painel de item do menu quando
     * o mouse passa por cima deste item
     *
     * @param painelMenu item do menu a ser configurado
     */
    private void efeitoMenuMouseEntered(JPanel painelMenu) {
        painelMenu.setBackground(new Color(101, 101, 101));
    }

    /**
     * Este método configura a cor de fundo de um painel de item do menu quando
     * o mouse sai de cima deste item
     *
     * @param painelMenu item do menu a ser configurado
     */
    private void efeitoMenuMouseExited(JPanel painelMenu) {
        painelMenu.setBackground(new Color(51, 51, 51));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLateralEsquerdo = new javax.swing.JPanel();
        painelLogo = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        painelLogoTexto = new javax.swing.JPanel();
        labelLogoTexto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        painelItensMenu = new javax.swing.JPanel();
        painelMenuHome = new javax.swing.JPanel();
        labelHome = new javax.swing.JLabel();
        painelMenuVendedores = new javax.swing.JPanel();
        labelVendedores = new javax.swing.JLabel();
        painelMenuVendas = new javax.swing.JPanel();
        labelVendas = new javax.swing.JLabel();
        painelCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App Vendas");
        setMinimumSize(new java.awt.Dimension(1366, 768));

        painelLateralEsquerdo.setBackground(new java.awt.Color(51, 51, 51));
        painelLateralEsquerdo.setMaximumSize(new java.awt.Dimension(200, 10000));
        painelLateralEsquerdo.setMinimumSize(new java.awt.Dimension(200, 768));
        painelLateralEsquerdo.setPreferredSize(new java.awt.Dimension(200, 768));
        painelLateralEsquerdo.setRequestFocusEnabled(false);

        painelLogo.setBackground(new java.awt.Color(51, 51, 51));
        painelLogo.setMaximumSize(new java.awt.Dimension(200, 120));
        painelLogo.setMinimumSize(new java.awt.Dimension(200, 120));
        painelLogo.setPreferredSize(new java.awt.Dimension(200, 120));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icones/logo-64px.png"))); // NOI18N
        painelLogo.add(labelLogo);

        painelLogoTexto.setBackground(new java.awt.Color(51, 51, 51));
        painelLogoTexto.setMaximumSize(new java.awt.Dimension(200, 35));
        painelLogoTexto.setMinimumSize(new java.awt.Dimension(200, 35));
        painelLogoTexto.setPreferredSize(new java.awt.Dimension(200, 35));
        painelLogoTexto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogoTexto.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        labelLogoTexto.setForeground(new java.awt.Color(255, 255, 255));
        labelLogoTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogoTexto.setText("APP VENDAS");
        labelLogoTexto.setIconTextGap(10);
        labelLogoTexto.setMaximumSize(new java.awt.Dimension(150, 35));
        labelLogoTexto.setMinimumSize(new java.awt.Dimension(150, 35));
        labelLogoTexto.setPreferredSize(new java.awt.Dimension(150, 35));
        painelLogoTexto.add(labelLogoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 200, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setMaximumSize(new java.awt.Dimension(150, 10));
        jSeparator1.setMinimumSize(new java.awt.Dimension(150, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(150, 10));
        painelLogoTexto.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, -1, -1));

        painelLogo.add(painelLogoTexto);

        painelLateralEsquerdo.add(painelLogo);

        painelItensMenu.setMaximumSize(new java.awt.Dimension(200, 500));
        painelItensMenu.setMinimumSize(new java.awt.Dimension(200, 500));
        painelItensMenu.setOpaque(false);
        painelItensMenu.setPreferredSize(new java.awt.Dimension(200, 500));

        painelMenuHome.setBackground(new java.awt.Color(51, 51, 51));
        painelMenuHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelMenuHome.setMaximumSize(new java.awt.Dimension(200, 35));
        painelMenuHome.setMinimumSize(new java.awt.Dimension(200, 35));
        painelMenuHome.setPreferredSize(new java.awt.Dimension(200, 35));
        painelMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelMenuHomeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelMenuHomeMouseEntered(evt);
            }
        });
        painelMenuHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHome.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        labelHome.setForeground(new java.awt.Color(255, 255, 255));
        labelHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icones/home-32px.png"))); // NOI18N
        labelHome.setText("Home");
        labelHome.setIconTextGap(10);
        labelHome.setMaximumSize(new java.awt.Dimension(150, 35));
        labelHome.setMinimumSize(new java.awt.Dimension(150, 35));
        labelHome.setPreferredSize(new java.awt.Dimension(150, 35));
        painelMenuHome.add(labelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 170, -1));

        painelItensMenu.add(painelMenuHome);

        painelMenuVendedores.setBackground(new java.awt.Color(51, 51, 51));
        painelMenuVendedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelMenuVendedores.setMaximumSize(new java.awt.Dimension(200, 35));
        painelMenuVendedores.setMinimumSize(new java.awt.Dimension(200, 35));
        painelMenuVendedores.setPreferredSize(new java.awt.Dimension(200, 35));
        painelMenuVendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelMenuVendedoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelMenuVendedoresMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelMenuVendedoresMouseEntered(evt);
            }
        });
        painelMenuVendedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVendedores.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        labelVendedores.setForeground(new java.awt.Color(255, 255, 255));
        labelVendedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icones/usuarios-32px.png"))); // NOI18N
        labelVendedores.setText("Vendedores");
        labelVendedores.setIconTextGap(10);
        labelVendedores.setMaximumSize(new java.awt.Dimension(150, 35));
        labelVendedores.setMinimumSize(new java.awt.Dimension(150, 35));
        labelVendedores.setPreferredSize(new java.awt.Dimension(150, 35));
        painelMenuVendedores.add(labelVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 200, -1));

        painelItensMenu.add(painelMenuVendedores);

        painelMenuVendas.setBackground(new java.awt.Color(51, 51, 51));
        painelMenuVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelMenuVendas.setMaximumSize(new java.awt.Dimension(200, 35));
        painelMenuVendas.setMinimumSize(new java.awt.Dimension(200, 35));
        painelMenuVendas.setPreferredSize(new java.awt.Dimension(200, 35));
        painelMenuVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelMenuVendasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelMenuVendasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelMenuVendasMouseEntered(evt);
            }
        });
        painelMenuVendas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVendas.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        labelVendas.setForeground(new java.awt.Color(255, 255, 255));
        labelVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icones/vendas-32px.png"))); // NOI18N
        labelVendas.setText("Vendas");
        labelVendas.setIconTextGap(10);
        labelVendas.setMaximumSize(new java.awt.Dimension(150, 35));
        labelVendas.setMinimumSize(new java.awt.Dimension(150, 35));
        labelVendas.setPreferredSize(new java.awt.Dimension(150, 35));
        painelMenuVendas.add(labelVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 180, -1));

        painelItensMenu.add(painelMenuVendas);

        painelLateralEsquerdo.add(painelItensMenu);

        getContentPane().add(painelLateralEsquerdo, java.awt.BorderLayout.LINE_START);

        painelCentral.setBackground(new java.awt.Color(250, 250, 250));
        painelCentral.setLayout(new javax.swing.BoxLayout(painelCentral, javax.swing.BoxLayout.PAGE_AXIS));
        getContentPane().add(painelCentral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void painelMenuVendedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuVendedoresMouseClicked
        carregarPainelPrincipal(new ListagemVendedor());
    }//GEN-LAST:event_painelMenuVendedoresMouseClicked

    private void painelMenuHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuHomeMouseEntered
        efeitoMenuMouseEntered(painelMenuHome);
    }//GEN-LAST:event_painelMenuHomeMouseEntered

    private void painelMenuHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuHomeMouseExited
        efeitoMenuMouseExited(painelMenuHome);
    }//GEN-LAST:event_painelMenuHomeMouseExited

    private void painelMenuVendedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuVendedoresMouseEntered
        efeitoMenuMouseEntered(painelMenuVendedores);
    }//GEN-LAST:event_painelMenuVendedoresMouseEntered

    private void painelMenuVendedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuVendedoresMouseExited
        efeitoMenuMouseExited(painelMenuVendedores);
    }//GEN-LAST:event_painelMenuVendedoresMouseExited

    private void painelMenuVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuVendasMouseEntered
        efeitoMenuMouseEntered(painelMenuVendas);
    }//GEN-LAST:event_painelMenuVendasMouseEntered

    private void painelMenuVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuVendasMouseExited
        efeitoMenuMouseExited(painelMenuVendas);
    }//GEN-LAST:event_painelMenuVendasMouseExited

    private void painelMenuVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuVendasMouseClicked
        carregarPainelPrincipal(new ListagemVenda());
    }//GEN-LAST:event_painelMenuVendasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelLogoTexto;
    private javax.swing.JLabel labelVendas;
    private javax.swing.JLabel labelVendedores;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPanel painelItensMenu;
    private javax.swing.JPanel painelLateralEsquerdo;
    private javax.swing.JPanel painelLogo;
    private javax.swing.JPanel painelLogoTexto;
    private javax.swing.JPanel painelMenuHome;
    private javax.swing.JPanel painelMenuVendas;
    private javax.swing.JPanel painelMenuVendedores;
    // End of variables declaration//GEN-END:variables
}
