//import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.*;
//import java.lang.System.Logger.Level;
//import javax.swing.BorderFactory;
import javax.swing.*;
//import javax.swing.JLabel;
public class DateLable {
    JPanel DLPanel = new JPanel();
    Border border = BorderFactory.createLineBorder(new Color(6, 154, 142), 1);
    DateLable(String st , int x,int y){
        DLPanel.setLayout(new FlowLayout());
        DLPanel.setBackground(new Color(255, 252, 194));
        DLPanel.setBounds(x, y, 100, 100);
        DLPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        DLPanel.setLayout(new BorderLayout());
        JLabel label=new JLabel();
        label.setText(st);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setOpaque(true);
        label.setBackground(new Color(161, 227, 216));
        ///label.setBounds(35,10,30,30);
        label.setFont(new Font("Serif", Font.PLAIN, 25));
        JPanel event=new JPanel();
        event.setOpaque(true);
        event.setBackground(new Color(247, 255, 147));
        JLabel ct=new JLabel();
        ct.setText("CT");
        ct.setForeground(Color.red);
        JLabel as=new JLabel();
        as.setText("AS");
        as.setForeground(Color.pink);
        event.add(ct);
        event.add(as);
        event.setLayout(new FlowLayout());
        DLPanel.add(label,BorderLayout.CENTER);
        DLPanel.add(event,BorderLayout.SOUTH);
        DLPanel.setBorder(border);
    }
}
