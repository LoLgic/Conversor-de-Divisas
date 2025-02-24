
package conversordivisas;

import conversordivisas.view.FrameDivisas;


public class ConversorDivisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new FrameDivisas().setVisible(true);
        });
    }
    
}
