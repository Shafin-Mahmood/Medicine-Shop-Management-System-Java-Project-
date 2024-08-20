
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.util.Scanner;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Login extends JFrame implements ActionListener{
  private JPanel panel;
  private JLabel labelEmail;
  private JTextField textEmail;
  private JLabel labelPassword,labelimg,headline,infoadd;
  private JPasswordField password;
  private JButton button,button1,button2;
  private ImageIcon img;
  private Font f,ff,fff;
  
  public Login() {
    
    this.initializeComponents();

    this.setTitle(" Login :  Medicine Shop Management System");
    this.setSize(900, 512);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  private void initializeComponents() {
      f=new Font("Arial",Font.BOLD,18);
      ff=new Font("Arial",Font.BOLD,16);
      fff=new Font("Arial",Font.BOLD,25);
      this.panel = new JPanel(null);
      img=new ImageIcon(getClass().getResource("logo.png"));
      this.labelimg=new JLabel(img);
      this.labelimg.setBounds(10, 100, 300, 300);
      this.panel.add(this.labelimg);
      
      panel.setBackground(Color.LIGHT_GRAY);

    
    this.headline=new JLabel("Medical Shop Management System");
    this.headline.setBounds(200, 10, 500, 100);
    headline.setFont(fff);
    headline.setForeground(Color.black);
    this.panel.add(this.headline);
    
    this.infoadd=new JLabel("Login ----------------------------");
    this.infoadd.setBounds(500, 150, 500, 100);
   infoadd.setFont(f);
    
    this.panel.add(this.infoadd);

    
    this.labelEmail = new JLabel("Username : ");
    this.labelEmail.setBounds(500, 250, 150, 25);
    labelEmail.setFont(f);
    this.panel.add(this.labelEmail);


    this.textEmail = new JTextField();
    this.textEmail.setBounds(600, 250, 150, 30);
    this.panel.add(this.textEmail);

    this.labelPassword = new JLabel("Password : ");
    labelPassword.setFont(f);
    this.labelPassword.setBounds(500, 300, 220, 30);
    
    this.panel.add(this.labelPassword);

    
    this.password = new JPasswordField();
    this.password.setBounds(600, 300, 150, 30);
    
    this.panel.add(this.password);

    
    this.button = new JButton("Sign-in");
    this.button.setBounds(530, 370, 100, 30);
     button.setFont(ff);
    this.panel.add(this.button);
    
    this.button1 = new JButton("Clear");
    this.button1.setBounds(700, 370, 100, 30);
    button1.setFont(ff);
    this.panel.add(this.button1);
    
    this.button2 = new JButton("Sign-up");
    this.button2.setBounds(560, 420, 200, 30);
     button2.setFont(ff);
    this.panel.add(this.button2);
   
   
   

    
    
    

    this.add(this.panel);
    button.addActionListener(this);
    button2.addActionListener(this);
    


    this.button1.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
             password.setText("");
             textEmail.setText("");
          }
    
    
    });
    
  }

  
  
  
		  public void actionPerformed(ActionEvent e){
			 
			if(e.getSource()==button2){
		
			Registration c=new Registration();
		          c.setVisible(true);
				 this.setVisible(false);
				  
			}
			
			
			else if(e.getSource()==button){
				
	String line1="";
	String line2="";
	String line3="";
	String line4="";
	String line5="";		
	String line6="";
						
						
	try{
	FileReader fr= new FileReader(textEmail.getText()+".txt");
	Scanner sc = new Scanner(fr);
						
	
	while(sc.hasNext())
	{
	line1 = sc.nextLine();
	line2 = sc.nextLine();
	line3 = sc.nextLine();
	 line4 = sc.nextLine();
	 line5 = sc.nextLine();
	line6 = sc.nextLine();	
	if(line4.equals(textEmail.getText()) && line5.equals(password.getText()))
        {
          setVisible(false);
          new Dashboard();
            
        }

	else{
							
	JOptionPane.showMessageDialog(null, "Wrong Username or Password");
							}
	}
						
						
fr.close();
}
catch(Exception io){
							
io.printStackTrace();
}
				
				
				
			}

                  }
}