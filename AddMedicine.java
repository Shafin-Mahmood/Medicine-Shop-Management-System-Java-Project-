
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddMedicine extends JFrame implements ActionListener {
    
    private JTable table;
    private DefaultTableModel model; 
    private JScrollPane scroll;
    private Container c;
    private JLabel titleLabel,iLabel,mnLabel,cuLabel,cnLabel,tLabel;
    private JTextField iTf,mnTf,cuTf,cnTf,tTf;
    private JButton addButton,updateButton,deleteButton,clearButton,saveButton,cancelButton;
    private String[] columns = {"ID","Medicine Name","Cost","Company","Type"};
    private String[] rows = new String[5];
    
                               
    
    AddMedicine(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
        this.setTitle("Medicine Management");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
       
        
        Font font = new Font("Arial",Font.BOLD,16);
        
        titleLabel = new JLabel("Medicine Management");
        titleLabel.setFont(font );
        titleLabel.setBounds(2,-50,250,150);
        c.add(titleLabel);
        
        iLabel = new JLabel("ID   ");
        iLabel.setBounds(10,80,140,30);
        iLabel.setFont(font);
        c.add(iLabel);
        
        
        iTf = new JTextField();
        iTf.setBounds(150,80,350,30);
        iTf.setFont(font);
        c.add(iTf);
        
        
        mnLabel = new JLabel("Medicine Name    ");
        mnLabel.setBounds (10,130,150,30);
        mnLabel.setFont(font);
        c.add(mnLabel);
        
        
        
        mnTf = new JTextField();
        mnTf.setBounds(150,130,350,30);
        mnTf.setFont(font);
        c.add(mnTf);
        
        
        addButton = new JButton("Add");
        addButton.setBounds(550,130,100,30);
        addButton.setFont(font);
        c.add(addButton);
        
        
        
        cuLabel = new JLabel("Cost Per Unit    ");
        cuLabel.setBounds(10,180,150,30);
        cuLabel.setFont(font);
        c.add(cuLabel);
        
        cuTf = new JTextField();
        cuTf.setBounds(150,180,350,30);
        cuTf.setFont(font);
        c.add(cuTf);
        
        
        updateButton = new JButton("Update");
        updateButton.setBounds(550,180,100,30);
        updateButton.setFont(font);
        c.add(updateButton);
        
        
        
        cnLabel = new JLabel("Company Name    ");
        cnLabel.setBounds(10,230,150,30);
        cnLabel.setFont(font);
        c.add(cnLabel);
        
        cnTf = new JTextField();
        cnTf.setBounds(150,230,350,30);
        cnTf.setFont(font);
        c.add(cnTf);
        
        
        deleteButton = new JButton("Delete");
        deleteButton.setBounds(550,230,100,30);
        deleteButton.setFont(font);
        c.add(deleteButton);
        
        
        tLabel = new JLabel("Type    ");
        tLabel.setBounds(10,280,150,30);
        tLabel.setFont(font);
        c.add(tLabel); 
                
        tTf = new JTextField();
        tTf.setBounds(150,280,350,30);
        tTf.setFont(font);
        c.add(tTf);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(550,280,100,30);
        clearButton.setFont(font);
        c.add(clearButton);
        
        
        
        saveButton = new JButton("Save Medicine");
        saveButton.setBounds(150,330,150,30);
        saveButton.setFont(font);
        c.add(saveButton);
        
        
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(350,330,150,30);
        cancelButton.setFont(font);
        c.add(cancelButton);
        
        table = new JTable();
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(font);
        table.setRowHeight(30);
        
        scroll = new JScrollPane(table);
        scroll.setBounds(40,400,800,255);
        c.add(scroll);
        
        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);
        
        table.addMouseListener(new MouseAdapter(){
        
          public void mouseClicked(MouseEvent me){
              
              int numberofRow = table.getSelectedRow();
              
              String i = model.getValueAt(numberofRow,0).toString();
              String m_name = model.getValueAt(numberofRow,1).toString();
              String c_unit = model.getValueAt(numberofRow,2).toString();
              String c_name= model.getValueAt(numberofRow,3).toString();
              String t = model.getValueAt(numberofRow,4).toString();
              
              
              iTf.setText(i);
              mnTf.setText(m_name);
              cuTf.setText(c_unit);
              cnTf.setText(c_name);
              tTf.setText(t);
               
          }  
          
          });
    }
    
    
    @Override
   
    public void actionPerformed(ActionEvent e){
        
         if (e.getSource()==addButton){
            
            rows[0] = iTf.getText();
            rows[1] = mnTf.getText();
            rows[2] = cuTf.getText();
            rows[3] = cnTf.getText();
            rows[4] = tTf.getText();
            model.addRow(rows);
            JOptionPane.showMessageDialog(null,"Add Successful","Info",  JOptionPane.INFORMATION_MESSAGE);
         }  
        else if(e.getSource()==clearButton){
                
                iTf.setText("");
                mnTf.setText("");
                cuTf.setText("");
                cnTf.setText("");
                tTf.setText("");
                JOptionPane.showMessageDialog(null,"Clear Successful","Info",  JOptionPane.INFORMATION_MESSAGE);
                }
        else if (e.getSource()==deleteButton){
            
            int numberofRow = table.getSelectedRow();
            if(numberofRow>=0){
                model.removeRow(numberofRow);
                JOptionPane.showMessageDialog(null,"Delete Successful","Info",  JOptionPane.INFORMATION_MESSAGE);
         }
            else{
                JOptionPane.showMessageDialog(null,"no row exist");
                
            
            }
    }
      

else if(e.getSource()==updateButton){
   
    int numberofRow = table.getSelectedRow();

    String i = iTf.getText();
    String m_name = mnTf.getText();
    String c_unit = cuTf.getText();
    String c_name = cnTf.getText();
    String t = tTf.getText();

    model.setValueAt(i,numberofRow,0);
    model.setValueAt(m_name,numberofRow,1);
    model.setValueAt(c_unit,numberofRow,2);
    model.setValueAt(c_name,numberofRow,3);
    model.setValueAt(t,numberofRow,4);
    JOptionPane.showMessageDialog(null,"Upadte Successful","Info",  JOptionPane.INFORMATION_MESSAGE);
}
         
         
                this.cancelButton.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
               setVisible(false);
             new Dashboard();
          }
    
    
    });
                
                
       this.saveButton.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null,"Save Successful");
          }
    
    
    });                
   
}    
}

