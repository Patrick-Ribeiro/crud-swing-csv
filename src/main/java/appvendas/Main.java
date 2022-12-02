package appvendas;

import appvendas.view.login.TelaLogin;
import com.alee.laf.WebLookAndFeel;
import com.alee.managers.CoreManagers;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author patrick
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {;
            // Install WebLaF as application LaF
            WebLookAndFeel.install();
            WebLookAndFeel.initializeManagers();
            CoreManagers.initialize();

            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);

            TelaLogin login = new TelaLogin();
            login.setVisible(true);
        });
    }

}
