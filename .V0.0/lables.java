import javax.swing.border.Border;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
//import java.lang.System.Logger.Level;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
//import java.awt.FlowLayout;
public class lables {
    /**
     *
     */
    JPanel actpane = new JPanel();
    Border border = BorderFactory.createLineBorder(new Color(6, 154, 142), 1);
    lables(){
        actpane.setLayout(new GridLayout(1,7));
        actpane.setPreferredSize(new Dimension(700,30));
        for(int i=0;i<7;i++){
            JPanel pane = new JPanel();
            pane.setPreferredSize(new Dimension(100,30));
            String day[]={"Sat","Sun","Mon","Tue","Wed","Thu","Fri"};
            //pane.setLayout(new FlowLayout());
            pane.setBackground(new Color(6, 154, 142));
            pane.setLayout(new BorderLayout());
            JLabel label=new JLabel();
            label.setText(day[1]);
            label.setForeground(new Color(255, 255, 255));
            label.setFont(new Font("Serif", Font.BOLD, 20));
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);
            pane.add(label,BorderLayout.CENTER);
            pane.setBorder(border);
            actpane.add(pane);
            JButton bt = new JButton();
        }
    }
    
} 
