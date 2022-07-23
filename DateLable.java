//All credit goes to Istyaq. Thank you so much Istyaq.
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Color;
//import java.lang.System.Logger.Level;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
public class DateLable {
    JPanel DLPanel = new JPanel();
    Border border = BorderFactory.createLineBorder(Color.black, 1);
    DateLable(String st , int x,int y){
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 252, 194));
        panel.setBounds(x, y, 100, 100);
        JLabel label=new JLabel();
        label.setText(st);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.BOTTOM);
        panel.add(label);
        panel.setBorder(border);
        DLPanel=panel;
    }
}
