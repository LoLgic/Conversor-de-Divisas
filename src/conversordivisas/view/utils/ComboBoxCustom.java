
package conversordivisas.view.utils;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;


public class ComboBoxCustom {

    ImageIcon arrowIcon = new ImageIcon(getClass().getResource("/conversordivisas/img/chevron.png"));
    
    public ComboBoxCustom(JComboBox<String> combobox) {
        
        combobox.setOpaque(false);
        
        combobox.setModel(new DefaultComboBoxModel<>(new String[] {
            "USD - Dólar Estadounidense",
            "EUR - EURO"
        }));
        
        combobox.setRenderer(new ImageComboBoxRender());
        combobox.setMaximumRowCount(4);
        
        combobox.setUI(new BasicComboBoxUI(){
            @Override
            protected JButton createArrowButton() {
                JButton button = new JButton(arrowIcon);
                button.setBorder(null);
                button.setContentAreaFilled(false);
                button.setFocusPainted(false);
                return button;
            }
            
            @Override
            protected BasicComboPopup createPopup() {
                BasicComboPopup popup = new BasicComboPopup(comboBox);
                
                popup.setBorder(BorderFactory.createEmptyBorder());
           
                return popup;
                
            }
        });
        
    }
    
}
