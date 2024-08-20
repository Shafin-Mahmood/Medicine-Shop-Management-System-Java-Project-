
import java.awt.Color;
 import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class MedicineReport extends JFrame{

    private  Container c;
    private JLabel label,label1;
    private JTable table; 
    private JScrollPane scroll;
    private JPanel panel;
    private Font font;
    private JButton button;
    
    private String []cols = {"ID","Medicine Name","Cost","company","type"};
    private String [][]rows ={
        {"2001","Napa","2","Beximco","Tab"},
                                {"2002","Sergel","7","Renata","Tab"},
                                {"2003","Ambrox","40","Drug Int.","Syrup"},
                                {"2004","Adovas","40","Square","Syrup"},
                                {"2005","Fexo","10","Square","Tab"},
                                {"2006","Monten","17","SkF","Tab"},
                                {"2007","Monas 10","30","Square","Tab"},
                                {"2008","Glucon","40","Beximco","Tab"},
                                {"2009","Alatrol","2","Ad-Din","Tab"},
                                {"2010","Ace","3","Radiant","Tab"},
                                {"2011","Revital","30","Revital","Tab"},
                                {"2012","Jardimat","40","Beximco","Tab"},
                                {"2013","Crocin","10","Healthcare","Tab"},
                                {"2014","saridon","20","cipla","Tab"},
                                {"2015","Flacol","30","Revital","Tab"},
                                {"2016","Finix","40","Opsonin","Tab"},
                                {"2017","Maganta","10","Square","Tab"},
                                {"2018","Ancor","20","Aristopharma","Tab"},
                                {"2019","Montela","30","Delta","Tab"},
                                {"2020","Secrin","40","Square","Tab"},
                                {"2021","Vertina Plus","10","Square","Tab"},
                                {"2022","Deslor","20","Orion","Tab"},
                                {"2023","Reservix","30","Incepta","Tab"},
                                {"2024","Losectil V 20","40","SK+F","Tab"},
                                {"2025","PG","40","SK+F","Tab"},
                                {"2026","Flexibac","40","Beacon","Tab"},
                                {"2027","Bizoran","10","Beximco","Tab"},
                                {"2028","Flugal","17","Square","Tab"},
                                {"2029","Xinc","30","SK+F","Tab"},
                                {"2030","D-Rise","40","Beximco","Tab"},
                                
    };
    MedicineReport()
    {
        
       this.initcomponents(); 
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
     this. setVisible(true);
     this.setLocationRelativeTo(null);
        
    }
    
    
 
  public void  initcomponents(){
      
    this.panel = new JPanel(null);
    panel.setBounds(100, 100, 750, 450);
    panel.setBackground(Color.LIGHT_GRAY);
      font=new Font("Arial",Font.BOLD,20);
      
  c = this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.LIGHT_GRAY);
      label=new JLabel(" All Medicine Report");
      label.setBounds(100, 50, 400, 500);
        this.setBounds(100,100,900,550);
      this.setTitle("MedicineReport : Medicine Shop Management System");
      label.setBounds(250,20,200,50);
       this.add(label);
       label.setFont(font);
         table = new JTable(rows,cols);
         scroll = new JScrollPane(table);
          scroll.setBounds(50,80,800,350);
             c.add(scroll); 
             table.setSelectionBackground(Color.green);
             this.button = new JButton("Close");
            
              this.button.setBounds(630, 350, 100, 30);
     button.setFont(font);
    this.panel.add(this.button);
   
     
    this.add(this.panel);
       
    
     this.add(this.panel);
     this.button.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              setVisible(false);
          new Dashboard();
      
          }
    
    
    });
  
}

   
    }

    
      
    


