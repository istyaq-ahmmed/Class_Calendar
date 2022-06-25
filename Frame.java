//import javax.swing.JPanel;
//import javax.swing.border.Border;
import java.awt.Color;
//import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.BorderFactory;
public class Frame {
    ImageIcon image =new ImageIcon("Asset\\cse.png");

    JFrame frame = new JFrame();
    Frame(){
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setIconImage(image.getImage());
    frame.setLayout(null);
    frame.setSize(716, 570);
    frame.setResizable(false); 
    frame.getContentPane().setBackground(new Color(50,50,50));
    frame.setTitle("Class Calender");

     int x_axix=0,y_axix=-70;
     String day[]={"Sat","Sun","Mon","Tue","Wed","Thu","Fri"};
    
    lables lableForDay[]  = new lables[7];
    for (int i=0;i<lableForDay.length;i++) {
        lableForDay[i]=new lables(day[i],100*i,0);
        frame.add(lableForDay[i].pane);
    }
    DateLable dateLable[] = new DateLable[35];
    for(Integer i=0;i<dateLable.length;i++){
        if(i%7 ==0){
            y_axix+=100;
            x_axix=0;
        } 
        dateLable[i]=new DateLable(i.toString(i), 100*x_axix, y_axix);
        frame.add(dateLable[i].DLPanel);
        x_axix++;
    }
    frame.setLayout(null);
    frame.setVisible(true);
    }
}
