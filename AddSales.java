
import Interface.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class AddSales extends JFrame implements ActionListener,Icalculate{
    
private Container c;
private  Color c1=new Color(211,211,211);
private Font font = new Font("cambria", Font.BOLD,15);
private Font fontt = new Font("cambria", Font.PLAIN ,35);
private JTable table;
private JComboBox price,selectmedicine,qty;
private DefaultTableModel model;
private JLabel l1,l2,l3,titleLabel,idlabel,cnamelabel,datelable,paylabel;
private JTextField idtext,cnametext,datetext,paytext;
private JButton addButton,exitButton,payButton,paidButton;
private JScrollPane scroll;
private String[] medicine={"Abacavir","Acetazolamide","Ascorbic Acid","Atenolol","Chloroquine","Clofazimine","Dapsone","Diazepam","Diloxanide","Enapril","Ethambutol","Fluconazole","Folic Acid","Furosemide","Haloperidol","Ibuprofen","Isoniazide","Levamisole","Monas","Napa","Esloric","Vigorex","Flexi","Ace","Intimate","Aclitol","Comet","Ambrisan","Angilock","Acical-D","Coralcal-D","Angivent","Alatrol","Antiva","Mirader","Alenvir","Finix","Flacol","Anzet","Clavurox","Betacor","Glympa","Menoharb","Oxyfer","Magnide","Clinivas","Nafodil","Omeprazole","Ciprofloxacin","Algin"};
private String []quantity={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77","78","79","80","81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99","100"};
private String [] Price={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77","78","79","80","81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99","100"};
private String [] cols={"ID","Customer Name ","Date","Medicine","Quantity","Per Unit Price","Total"};
private JTextField id,cname,mobile,date,total;
private String [] rows=new String[7];
	
	
	 AddSales()
	 {
		initComponents() ;
               
                this.setVisible(true);
              this.setLocationRelativeTo(null);
		 
	 }
	
	public void initComponents()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50,50,900,700);
		this.setTitle("Sales Dashboard : Medical Shop Management System");
		
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(c1);
                
                 titleLabel = new JLabel("Sells Dashboard");
        titleLabel.setFont(fontt );
        titleLabel.setBounds(2,-50,400,150);
        c.add(titleLabel);
		
		selectmedicine=new JComboBox(medicine);
		selectmedicine.setBounds(150,250,170,30);
		
		c.add(selectmedicine);
		
		qty=new JComboBox(quantity);
		qty.setBounds(400,300,150,30);
                c.add(qty);
                
                price=new JComboBox(Price );
		 price.setBounds(150,300,170,30);
		c.add( price);
                
               l3=new JLabel("Cost Per Unit : ");
		l3.setBounds(40,300,150,30);
		l3.setFont(font);
		c.add(l3);
		
		l1=new JLabel("Select Medicine : ");
		l1.setBounds(40,250,150,30);
		l1.setFont(font);
		c.add(l1);
		
		l2=new JLabel("Quantity");
		l2.setBounds(330,300,150,30);
		l2.setFont(font);
		c.add(l2);
		
		addButton=new JButton("Add Item");
		addButton.setBounds(600,300,150,30);
		c.add(addButton);
                
                payButton=new JButton("Calculate Bill");
		payButton.setBounds(550,210,150,30);
		c.add(payButton);
                
                 paidButton=new JButton("Paid");
                 paidButton.setFont(font);
		paidButton.setBounds(570,250,100,30);
		c.add(paidButton);
                
                paylabel = new JLabel("Total Payable Bill  ");
         paylabel .setBounds(550,100,200,50);
        paylabel .setFont(font);
        c.add( paylabel );
        
        
        paytext = new JTextField();
       paytext.setBounds(550,150,150,50);
        paytext.setFont(font);
        c.add(paytext);
                
         idlabel = new JLabel("ID : ");
         idlabel .setBounds(40,130,100,30);
        idlabel .setFont(font);
        c.add( idlabel );
        
        
        idtext = new JTextField();
       idtext.setBounds(100,130,230,30);
        idtext.setFont(font);
        c.add(idtext);
        
        cnamelabel = new JLabel("Customer Name : ");
        cnamelabel .setBounds(40,180,130,30);
       cnamelabel .setFont(font);
        c.add( cnamelabel );
        
        
        cnametext = new JTextField();
        cnametext.setBounds(180,180,150,30);
        cnametext.setFont(font);
        c.add(cnametext);
        
       datelable = new JLabel("Date : ");
        datelable .setBounds(40,80,130,30);
       datelable.setFont(font);
        c.add( datelable );
        
        
        datetext = new JTextField();
        datetext.setBounds(100,80,230,30);
        datetext.setFont(font);
        c.add(datetext);
		
		exitButton=new JButton("Exit");
		exitButton.setBounds(610,620,150,30);
                exitButton.setFont(font);
		c.add(exitButton);
                
                table =new JTable();
                model=new DefaultTableModel();
                model.setColumnIdentifiers(cols);
                table.setModel(model);
                table.setFont(font);
                table.setSelectionBackground(Color.lightGray);
                table.setBackground(Color.WHITE);
                table.setRowHeight(40);
                scroll=new JScrollPane(table);
                scroll.setBounds(40, 340, 800, 265);
                c.add(scroll);
                addButton.addActionListener(this);
                payButton.addActionListener(this);
                paidButton.addActionListener(this);
                exitButton.addActionListener(this);
                
		
		
		
		
	}
   public void getSum() 
   {
       int sum=0;
       for(int i=0;i<table.getRowCount();i++)
       {
        sum=sum+Integer.parseInt(table.getValueAt(i, 6).toString());
       }
       paytext.setText(Integer.toString(sum)+" "+"TK");
       
   }
           


    @Override
   
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==addButton)
       { 
      /*    
      String selectmedi=selectmedicine.getSelectedItem().toString();
         String selectqt=qty.getSelectedItem().toString();
          String Selectprice= price.getSelectedItem().toString();
          int QTY=Integer.parseInt(selectqt);
          int unitprice=Integer.parseInt(Selectprice);
       int bill=unitprice*QTY;
         String Bill= String.valueOf(bill);

          
      rows[0] = idtext.getText();
      rows[1] = cnametext.getText();
      rows[2] = datetext.getText();
              
      rows[3] = selectmedi;
      rows[4]=selectqt;
      rows[5]= Selectprice;
      rows[6]=Bill;
      
      
       model.addRow(rows);
        
        */   
         getBill() ; 
       }
       else if(e.getSource()==payButton)
       {
           getSum() ;
             
       }
       else if(e.getSource()==paidButton)
       {
         JOptionPane.showConfirmDialog(null, "Are You Collect Bill From Customer ? ", "Confrim", JOptionPane.YES_NO_OPTION);
         JOptionPane.showMessageDialog(null, "Success");
       }
     
       else if(e.getSource()==exitButton)
       {
        this.setVisible(false);
        new Dashboard(); 
       }
           
       
        
    }

    @Override
    public void getBill() {
           
      String selectmedi=selectmedicine.getSelectedItem().toString();
         String selectqt=qty.getSelectedItem().toString();
          String Selectprice= price.getSelectedItem().toString();
          int QTY=Integer.parseInt(selectqt);
          int unitprice=Integer.parseInt(Selectprice);
       int bill=unitprice*QTY;
         String Bill= String.valueOf(bill);

          
      rows[0] = idtext.getText();
      rows[1] = cnametext.getText();
      rows[2] = datetext.getText();
              
      rows[3] = selectmedi;
      rows[4]=selectqt;
      rows[5]= Selectprice;
      rows[6]=Bill;
      
      
       model.addRow(rows);
    }
	
	
	
	
}