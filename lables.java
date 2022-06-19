import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.Color;
//import java.lang.System.Logger.Level;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class lables {
    /**
     *
     */
    private static final int _30 = 30;
    JPanel pane = new JPanel();
    Border border = BorderFactory.createLineBorder(Color.black, 1);
    lables(String st , int x,int y){
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 252, 194));
        panel.setBounds(x, y, 100, _30);
        JLabel label=new JLabel();
        label.setText(st);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.BOTTOM);
        panel.add(label);
        panel.setBorder(border);
        pane=panel;
    }
}
