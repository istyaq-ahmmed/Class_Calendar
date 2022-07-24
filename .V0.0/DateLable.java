import javax.swing.border.Border;
import java.awt.*;
import javax.swing.*;




public class DateLable  {
    JPanel DLPanel = new JPanel();
    String []eStrings={"CT","AS","PR","EX","GG","AS"};
    Border border = BorderFactory.createLineBorder(new Color(6, 154, 142), 1);
    //DateLable(String st , int x,int y,int id){
    DateLable(String st, String eString[]){
        this.eStrings=eString;
        //DLPanel.setLayout(new FlowLayout());
        DLPanel.setPreferredSize(new Dimension(100,100) );
        DLPanel.setLayout(new BorderLayout());
        
        
        DLPanel.add(lavFunc(st),BorderLayout.CENTER);
        DLPanel.add(eventFunc(eStrings),BorderLayout.SOUTH);
        DLPanel.setBorder(border);
    }
    private JLabel lavFunc(String std){
        JLabel label=new JLabel();
        label.setText(std);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setOpaque(true);
        label.setBackground(new Color(161, 227, 216));
        ///label.setBounds(35,10,30,30);
        label.setFont(new Font("Serif", Font.BOLD, 25));
        label.setForeground(Color.GRAY);
        return label;
    }
    private JPanel eventFunc(String eType[]){
        JPanel event=new JPanel();
        event.setOpaque(true);
        event.setBackground(new Color(247, 255, 147));
        event.setPreferredSize(new Dimension(0, 40));
        for (int i=0;i<eType.length;i++) {
            JLabel ct=new JLabel(); 
            ct.setFont(new Font("Serif", Font.PLAIN, 11)); 
            if(i>4){
                ct.setText("...");
                ct.setForeground(Color.red);   
                event.add(ct);
                break;
            }
            else{
            if (eType[i] == "CT") {
                ct.setText("CT");
                ct.setForeground(Color.red);
            }
            else if (eType[i] == "AS") {
                ct.setText("AS");
                ct.setForeground(Color.pink); 
            }
            else if (eType[i] == "PR") {
                ct.setText("PR");
                ct.setForeground(Color.lightGray); 
            }
            else if (eType[i] == "EX") {
                ct.setText("EX");
                ct.setForeground(Color.BLUE); 
            }
            else {
                    ct.setText("OT");
                    ct.setForeground(Color.BLACK);
            }
        }
        event.add(ct);
    
        }
        event.setLayout(new FlowLayout());
        return event;
    }
}
