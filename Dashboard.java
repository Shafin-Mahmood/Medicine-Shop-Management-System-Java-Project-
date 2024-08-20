
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Dashboard extends JFrame{
  private JPanel panel;
  private JLabel labeladmin,labeldasbord;
  
  private JLabel labelimg,headline,infoadd;
  
  private JButton buttonam,buttonmr,buttonas,buttonsr,buttonabout,buttonlogout,buttonexit;
  private ImageIcon img;
 private Font f,ff,fff;  
 
   public  Dashboard()
   {
       this.initializeComponents();
        

    this.setTitle(" Dashboard :  Medicine Shop Management System");
    this.setSize(1050, 680);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true); 
       
       
   }
   public void initializeComponents()
   { 
       ff=new Font("Arial",Font.BOLD,18);
        fff=new Font("Arial",Font.BOLD,28);
       this.panel = new JPanel(null);
       this.buttonam = new JButton("Add Medicine");
    this.buttonam.setBounds(10, 60, 200, 30);
    buttonam.setFont(ff);
    this.panel.add(this.buttonam);
    
    
     
       this.buttonmr = new JButton("Medicine Report");
    this.buttonmr.setBounds(10, 120, 200, 30);
buttonmr.setFont(ff);
    this.panel.add(this.buttonmr);
    
     this.buttonas = new JButton("Add Sells");
    this.buttonas.setBounds(10, 180, 200, 30);
buttonas.setFont(ff);
    this.panel.add(this.buttonas);
    
     this.buttonsr = new JButton("Sells Report");
    this.buttonsr.setBounds(10, 240, 200, 30);
buttonsr.setFont(ff);
    this.panel.add(this.buttonsr);
    
    this.buttonabout = new JButton("About Project");
    this.buttonabout.setBounds(10, 300, 200, 30);
buttonabout.setFont(ff);
    this.panel.add(this.buttonabout);
    
    
    this.buttonlogout = new JButton("Logout");
    this.buttonlogout .setBounds(10, 360, 200, 30);
    buttonlogout .setFont(ff);
    this.panel.add(this.buttonlogout );
    
    this.buttonexit = new JButton(" Exit");
    this.buttonexit .setBounds(10, 420, 200, 30);
   buttonexit .setFont(ff);
    this.panel.add(this.buttonexit );
    
    img=new ImageIcon(getClass().getResource("pharmacy.jpg"));
      this.labelimg=new JLabel(img);
      labelimg.setBounds(205, 60, 830, 600);
      this.panel.add(this.labelimg);
      
      this.labeladmin=new JLabel("Admin Menu");
    this.labeladmin.setBounds(25, -15, 130, 90);
    labeladmin.setFont(ff);
    labeladmin.setForeground(Color.darkGray);
    this.panel.add(this.labeladmin);
    
    this.labeldasbord=new JLabel("_____________________________________________");
    this.labeldasbord.setBounds(250, 0, 800, 90);
    labeldasbord.setFont(ff);
    labeldasbord.setForeground(Color.darkGray);
    this.panel.add(this.labeldasbord);
    
    
     this.headline=new JLabel("Medical Shop Management System");
    this.headline.setBounds(250, -55, 650, 160);
    headline.setFont(fff);
   headline.setForeground(Color.black);
    this.panel.add(this.headline);
    
    panel.setBackground(Color.LIGHT_GRAY);

   
      
        this.add(this.panel);
        
        
        this.buttonlogout .addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              
               int receive= JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Info", JOptionPane.YES_NO_OPTION);
       if (JOptionPane.YES_OPTION==receive)
       {
        setVisible(false);   
       new Login();
       }
       else
       {
          
       setVisible(false);
          new Dashboard();
         
         
       }
             
          }
      
    }); 
        
        
           this.buttonexit.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
         int receive= JOptionPane.showConfirmDialog(null, "Do you want to Exit?", "Info", JOptionPane.YES_NO_OPTION);
       if (JOptionPane.YES_OPTION==receive)
       {
           System.exit(receive);
       }
            
          }
    
    
    });
        
         this.buttonam.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              setVisible(false);
           new  AddMedicine();
            
          }
    
    
    });
         
            
         this.buttonmr.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
               setVisible(false);
           new  MedicineReport();
            
          }
    
    });
         
           this.buttonabout.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
               setVisible(false);
           new  AboutProject();
            
          }
    
    });
              this.buttonas.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
               setVisible(false);
           new  AddSales();
            
          }
    
    });
              
              this.buttonsr.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
               setVisible(false);
           new  AddSalesReport();
            
          }
    
    });
        
   }

 
 
    
}
