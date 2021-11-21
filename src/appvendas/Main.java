package appvendas;

import appvendas.view.telas.TelaLogin;
import com.alee.laf.WebLookAndFeel;
import javax.swing.SwingUtilities;

/**
 *
 * @author patrick
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Install WebLaF as application LaF
                WebLookAndFeel.install();
                
//                JFrame telaTeste = new JFrame();
//                telaTeste.setTitle("Janela de Teste");
//                
//                JButton botao = new JButton();
//                telaTeste.add(botao);
//                
//                telaTeste.setVisible(true);
                TelaLogin login = new TelaLogin();
                login.setVisible(true);
            }
        });
    }

}
