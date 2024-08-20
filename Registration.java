
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
   

public class Registration extends JFrame implements ActionListener  {
    
   private JPanel panel;
  
  private JTextField textpassword,textusername,textmobile,textlname,textfname,textemail;
  private JLabel labelusername,labelpassword,labelimg,headline,labaelfname,labellname,labelemail,labelmobile;
  private JPasswordField password;
  private JButton buttonreg;
  private ImageIcon img;
 private Font f,ff,fff;
  private JCheckBox checkCertify;
  private JButton buttonsubmit;
 
 public Registration()
 {
    this.initializeComponents();
    

    this.setTitle(" Sign-up :  Medicine Shop Management System");
    this.setSize(900, 512);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);  
     
     
 }
   public void initializeComponents(){ 
       
   f=new Font("Arial",Font.BOLD,18);
   fff=new Font("Arial",Font.BOLD,25);
   ff=new Font("Arial",Font.BOLD,20);
    this.panel = new JPanel(null);
   panel.setBackground(Color.LIGHT_GRAY);
    
    
     img=new ImageIcon(getClass().getResource("reg.png"));
      this.labelimg=new JLabel(img);
      this.labelimg.setBounds(0, 0, 200, 198);
      this.panel.add(this.labelimg);
      
      this.headline=new JLabel("New User Registration");
    this.headline.setBounds(280, 50, 500, 100);
    headline.setFont(fff);
    headline.setForeground(Color.black);
    this.panel.add(this.headline);
    this.add(this.panel);
     
    this.labelusername = new JLabel("Username : ");
    this.labelusername.setBounds(520, 205, 150, 25);
    labelusername.setFont(f);
    this.panel.add(this.labelusername);


    this.textusername = new JTextField();
    this.textusername.setBounds(625, 200, 150, 30);
    this.panel.add(this.textusername);
    
     this.labelpassword = new JLabel("Password : ");
    this.labelpassword.setBounds(520, 255, 150, 25);
    labelpassword.setFont(f);
    this.panel.add(this.labelpassword);


    this.textpassword = new JPasswordField();
    this.textpassword.setBounds(625, 250, 150, 30);
    this.panel.add(this.textpassword);
     
     this.labelmobile = new JLabel("Mobile No : ");
    this.labelmobile.setBounds(520, 305, 150, 25);
    labelmobile.setFont(f);
    this.panel.add(this.labelmobile);


    this.textmobile = new JTextField();
    this.textmobile.setBounds(625, 300, 150, 30);
    this.panel.add(this.textmobile);
    
    
      this.labaelfname= new JLabel("First Name : ");
    this.labaelfname.setBounds(120, 205, 150, 25);
    labaelfname.setFont(f);
    this.panel.add(this.labaelfname);


    this.textfname = new JTextField();
    this.textfname.setBounds(225, 200, 150, 30);
    this.panel.add(this.textfname);
    
    
    this.labellname= new JLabel("Last Name : ");
    this.labellname.setBounds(120, 255, 150, 25);
    labellname.setFont(f);
    this.panel.add(this.labellname);
    
   this.textlname = new JTextField();
    this.textlname.setBounds(225, 250, 150, 30);
    this.panel.add(this.textlname);
    
    this.labelemail= new JLabel("E-mail: ");
    this.labelemail.setBounds(120, 305, 150, 25);
    labelemail.setFont(f);
    this.panel.add(this.labelemail);
    
   this.textemail = new JTextField();
    this.textemail.setBounds(225, 300, 150, 30);
    this.panel.add(this.textemail);
    
    this.buttonsubmit = new JButton("Submit");
    this.buttonsubmit.setBounds(330, 400, 200, 30);
     buttonsubmit.setFont(ff);
    this.panel.add(this.buttonsubmit);
    

    this.checkCertify = new JCheckBox("I certify that above informations are true");
  
        this.checkCertify.setBounds(300,360,300,25);
        this.panel.add(this.checkCertify);
        
       
    
    buttonsubmit.addActionListener(this);
    
    
   }


     public void actionPerformed(ActionEvent e)
	    {
				
		if(e.getSource()==buttonsubmit)	{
			
				
			String s1=textfname.getText();
			String s2=textlname.getText();
			String s3=textemail.getText();
			String s4=textusername.getText();
			String s5=textpassword.getText();
			String s6=textmobile.getText();
			
			
			
try
{
FileWriter file= new FileWriter(s4+".txt");
file.write(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n");
file.close();
JOptionPane.showMessageDialog(null,"Successfully Signed Up!");
					
Login in =new Login();
in.setVisible(true);
this.setVisible(false);
}
catch(Exception io)
  {
io.printStackTrace();
  }
			
			
}
}
}
