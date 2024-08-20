import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome extends JFrame implements ActionListener {
    JPanel c;
	
    JLabel l1;
   

    JButton cancel,registration,login;
    Font font = new Font("Comic Sans MS", Font.PLAIN, 14);
	Font font1 = new Font("Comic Sans MS", Font.BOLD, 50);
   public welcome()
	 {
		initComponents() ;
		this.setVisible(true);
		 
	 }
	
	public void initComponents()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200,100,900,600);
		this.setLayout(null);
	      this.setTitle("  Medicine Shop Management");
        this.setResizable(false);
		
		
		
		//c=this.getContentPane();
		c=new JPanel();
		c.setLayout(null);
		c.setBounds(0,0,1000,700);
		c.setBackground(Color.LIGHT_GRAY);
		
		
		JLabel imageLabel = new JLabel(new ImageIcon("logo.png"));
		imageLabel.setBounds(10,20,500,500);
		c.add(imageLabel);
		
		
	
		cancel=new JButton("Cancel");
		cancel.setBounds(550,320,100,40);
		cancel.setFont(font);
		cancel.addActionListener(this);
		c.add(cancel);
		
		
		registration=new JButton("Registration");
		registration.setBounds(450,240,140,40);
		registration.setFont(font);
	    registration.addActionListener(this);
		c.add(registration);
		
		
		login=new JButton("LOGIN");
		login.setBounds(650,240,140,40);
		login.setFont(font);
		login.addActionListener(this);
		c.add(login);
		
		l1=new JLabel("WELCOME");
		l1.setBounds(370,50,300,100);
		l1.setFont(font1);
		this.add(l1);
		
		this.add(c);
		
		
		
	}
	
     public void actionPerformed(ActionEvent e)
	    {
			if(e.getSource()==login)
			{
				new Login();
			}
			
			else if(e.getSource()==registration)
			{
				new Registration();
			}
			else if(e.getSource()==cancel)
			{
				this.dispose();
			}
			
			
			
		}
		
	
	
	
	
	
	
	
	
	
	

		
		
		
		
		
}	
	
	
	