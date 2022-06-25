import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
//import java.lang.System.Logger.Level;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
//import java.awt.FlowLayout;
public class lables {
    /**
     *
     */
    private static final int _30 = 30;
    JPanel pane = new JPanel();
    Border border = BorderFactory.createLineBorder(new Color(6, 154, 142), 1);
    lables(String st , int x,int y){
        //pane.setLayout(new FlowLayout());
        pane.setBackground(new Color(6, 154, 142));
        pane.setBounds(x, y, 100, _30);
        pane.setLayout(new BorderLayout());
        JLabel label=new JLabel();
        label.setText(st);
        label.setForeground(new Color(255, 255, 255));
        label.setFont(new Font("Serif", Font.PLAIN, 18));
        
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        pane.add(label,BorderLayout.CENTER);

        pane.setBorder(border);
    }
} 
