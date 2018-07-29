package io.github.radd;

import javax.swing.UIManager;

/**
 *
 * @author Piotr
 */
public class MP3Tags {
    
    public static final String PROPERTIES_FILENAME = "mp3tagsapi.properties";
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
}
