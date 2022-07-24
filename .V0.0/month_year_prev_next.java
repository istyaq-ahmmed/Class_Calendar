import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class month_year_prev_next{
    JLabel fieldLabel = new JLabel();
    ImageIcon nextIcon;
    month_year_prev_next(String st){
        fieldLabel.setText(st);
        fieldLabel.setFont(new Font("Serif", Font.BOLD, 30));
        fieldLabel.setForeground(new Color(0, 130, 176));
        fieldLabel.setVerticalAlignment(JLabel.CENTER);
        fieldLabel.setOpaque(false);
        fieldLabel.setBorder(null);
    }
    month_year_prev_next(int x){
        if(x==1)
            nextIcon= new ImageIcon("Asset\\next.png");
        else 
            nextIcon= new ImageIcon("Asset\\Prev.png");
        fieldLabel.setBorder(new EmptyBorder(0, 20, 0, 20));
        fieldLabel.setIcon(nextIcon);
    }
}