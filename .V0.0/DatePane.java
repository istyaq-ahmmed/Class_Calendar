import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

public class DatePane implements ActionListener{
    int height=100,width=100;
    String []eStrings={"CT","AS","PR","EX","GG","AS"};
    String list_of_Months[]={"January","February","March","April","May","June","July","Augst","September","October","November","December"};
    int month_number=0;
    Dimension dm = new Dimension(width,height);
    String actullyDate[] = new String[35];
    JPanel panel_of_Month_and_week = new JPanel();
    JButton previous_Button = new JButton();
    JButton next_Button = new JButton();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JButton date_Button[]= new JButton[35];

    
    JPanel Month_Change_Manue = new JPanel();
    JPanel Month_Year_Name = new JPanel();
    
    Frame fr;
    DatePane(){
        fr=new Frame();
        month_nevigation();
        init_actuallyDate(actullyDate);
        //paint_Date_button();
        new_paint_Date_button();
        panel1.setLayout(new GridLayout(1,7));
        panel2.setLayout(new GridLayout(1,7));
        panel3.setLayout(new GridLayout(1,7));
        panel4.setLayout(new GridLayout(1,7));
        panel5.setLayout(new GridLayout(1,7));
        //panel2.setBounds(0, 130, 700, 100);
        add_to_frame();
    }
    public void month_nevigation(){
        Month_Year_Name.add(new month_year_prev_next("January").fieldLabel);
        Month_Year_Name.add(new month_year_prev_next("2022").fieldLabel);
        Month_Year_Name.setBackground(Color.CYAN);
        previous_Button.add(new month_year_prev_next(0).fieldLabel);
        next_Button.add(new month_year_prev_next(1).fieldLabel);
        previous_Button.setBorder(null);
        next_Button.setBorder(null);
        next_Button.setBackground(Color.CYAN);
        previous_Button.setBackground(Color.CYAN);
        previous_Button.addActionListener(this);
        next_Button.addActionListener(this);

        Month_Change_Manue.setPreferredSize(new Dimension(700,50));
        Month_Change_Manue.setLayout(new BorderLayout());
        Month_Change_Manue.add(next_Button,BorderLayout.EAST);
        Month_Change_Manue.add(Month_Year_Name,BorderLayout.CENTER);
        Month_Change_Manue.add(previous_Button,BorderLayout.WEST);

        panel_of_Month_and_week.setLayout( new BorderLayout());
        panel_of_Month_and_week.add(Month_Change_Manue,BorderLayout.NORTH);
        panel_of_Month_and_week.add(new lables().actpane,BorderLayout.CENTER); 
    }
    public void repaint_month_nevigation(String month_String) {
        Month_Year_Name.removeAll();
        Month_Change_Manue.removeAll();
        panel_of_Month_and_week.removeAll();
        
        Month_Year_Name.add(new month_year_prev_next(month_String).fieldLabel);
        Month_Year_Name.add(new month_year_prev_next("2022").fieldLabel);

        Month_Change_Manue.add(next_Button,BorderLayout.EAST);
        Month_Change_Manue.add(Month_Year_Name,BorderLayout.CENTER);
        Month_Change_Manue.add(previous_Button,BorderLayout.WEST);

        panel_of_Month_and_week.setLayout( new BorderLayout());
        panel_of_Month_and_week.add(Month_Change_Manue,BorderLayout.NORTH);
        panel_of_Month_and_week.add(new lables().actpane,BorderLayout.CENTER); 

    }
    public void new_paint_Date_button(){
        int i=0;
        panel1.removeAll();
        panel2.removeAll();
        panel3.removeAll();
        panel4.removeAll();
        panel5.removeAll();
        for(i=0;i<35;i++){
            date_Button[i]=new JButton();
            date_Button[i].removeAll();
            date_Button[i].add(new DateLable( actullyDate[i],eStrings).DLPanel);
            date_Button[i].addActionListener(this);
            date_Button[i].setPreferredSize(dm);
            date_Button[i].setBorder(null);
            if(i<7){
                panel1.add(date_Button[i]);
            }
            else if(i<14){;
                panel2.add(date_Button[i]);
            }
            else if(i<21){
                panel3.add(date_Button[i]);
            }
            else if(i<28){
                panel4.add(date_Button[i]);
            }
            else {
                panel5.add(date_Button[i]);
            }

        }
    }
    private void add_to_frame(){
        fr.frame.add(panel_of_Month_and_week);
        fr.frame.add(panel1);
        fr.frame.add(panel2);
        fr.frame.add(panel3);
        fr.frame.add(panel4);
        fr.frame.add(panel5);
        fr.frame.setVisible(true);
    }
    private void mod_actuallyDate(String st[]){
        for(Integer i=0;i<st.length;i++ ){
            st[i]=i.toString(i+month_number);
            }
    }
    private void init_actuallyDate(String st[]){
        for(Integer i=0;i<st.length;i++ ){
            st[i]=i.toString(i+1);
            }
    }
    public void repaint_date_box(){
            //paint_Date_button();
            repaint_month_nevigation(list_of_Months[month_number]);
            new_paint_Date_button();
            fr.frame.repaint();
            fr.frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==date_Button[0]) {
            repaint_date_box();
        }



        else if(e.getSource()==previous_Button){
            
            month_number--;
            if(month_number<0)
                month_number=11;
            
            mod_actuallyDate(actullyDate);
            repaint_date_box();
        }
        else if(e.getSource()==next_Button){
            month_number++;
            if(month_number>11)
                month_number=0;
            
            mod_actuallyDate(actullyDate);
            repaint_date_box();
        }
    }
}
