
package conversordivisas.view.utils;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FrameDragger {
    
    private int xMouse, yMouse;

    public FrameDragger(JPanel panelFondo, JFrame frame) {
        panelFondo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                xMouse = event.getX();
                yMouse = event.getY();
            }
        });
        
        panelFondo.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent event) {
                int x = event.getXOnScreen();
                int y = event.getYOnScreen();
                
                frame.setLocation(x - xMouse, y - yMouse);
            }
        });
        
    }

    
    
}
