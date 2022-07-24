//import javax.swing.JPanel;
//import javax.swing.border.Border;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

//import javax.swing.BoxLayout;
//import javax.swing.Icon;
import javax.swing.JFrame;
import java.awt.Dimension;
//import javax.swing.JLabel;
//import javax.swing.BorderFactory;
public class Frame {
    BufferedImage img = null;
	List<BufferedImage> iList = new ArrayList<BufferedImage>();
    Dimension dm = new Dimension(700,570);
    JFrame frame = new JFrame();
    Frame(){
        try {
            iList.add(ImageIO.read(new File("Asset\\cse_16X16.png")));  
            iList.add(ImageIO.read(new File("Asset\\cse_32X32.png")));
            iList.add(ImageIO.read(new File("Asset\\cse_64X64.png")));
            iList.add(ImageIO.read(new File("Asset\\cse_128X128.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setIconImage(image.getImage());
    frame.setIconImages(iList);
    frame.setLayout(new GridLayout(6,1));
    frame.setSize(700, 570);
    frame.setMinimumSize(dm);
    frame.getContentPane().setBackground(new Color(50,50,50));
    frame.setTitle("Class Calender");
     
    
    // frame.add(new lables().actpane);
    // frame.add(new DatePane().panel1);
    // frame.add(new DatePane().panel2);
    // frame.setVisible(true);
    //frame.setLayout(new BoxLayout(frame, BoxLayout.PAGE_AXIS));
    }
}
