
package conversordivisas.view.utils;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;



class ImageComboBoxRender extends DefaultListCellRenderer{

    private final ImageIcon usaIcon = new ImageIcon(getClass().getResource("/conversordivisas/img/flag/usa_flag.png"));
    private final ImageIcon euroIcon = new ImageIcon(getClass().getResource("/conversordivisas/img/flag/eu_flag.png"));
    
    @Override
    public Component getListCellRendererComponent(JList <?> list, Object value, int index, boolean  isSelected, boolean cellHasFocus) {
        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value != null) {
            String item = value.toString();
            if (item.contains("USD - Dólar Estadounidense")) {
                label.setIcon(usaIcon);
            } else if (item.contains("EUR - EURO")) {
                label.setIcon(euroIcon);
            }
        }
        
        label.setHorizontalTextPosition(SwingConstants.RIGHT);
        label.setBorder(BorderFactory.createEmptyBorder(5,5,5,0));
        label.setOpaque(true);
        
        if(isSelected) {
            label.setBackground(Color.decode("#f2f2f2"));
            label.setForeground(Color.decode("#666666"));
        } else {
            label.setBackground(Color.WHITE);
            label.setForeground(Color.decode("#313f5b"));
        }
        return label;
    }
    
}
