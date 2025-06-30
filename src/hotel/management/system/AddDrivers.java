
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddDrivers extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
    JPanel left,right;
    JTextField t1,t2,t3,t4,t5,t6;
    JComboBox c1,c2,c3,c4;
    JRadioButton r1,r2,r3;
    JButton b1,b2;
    public AddDrivers() 
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1950, 1100);
        
        left = new JPanel();
        left.setLayout(null);
        left.setBounds(250,1,700,1000);
        left.setBackground(new Color(0,102,102));
        l1.add(left);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i5 = i4.getImage().getScaledInstance(700, 500,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l2 = new JLabel(i6);
        l2.setBounds(0,200,700,500);
        left.add(l2);
        
        l3 = new JLabel("METROPOLE");
        l3.setFont(new Font("Showcard Gothic", Font.ITALIC, 70));
        l3.setForeground(Color.WHITE);
        l3.setBounds(130,730,500,90);
        left.add(l3);
        
        
        
        right = new JPanel();
        right.setLayout(null);
        right.setBounds(950,1,700,1000);
        right.setBackground(Color.WHITE);
        l1.add(right);
        
        l4 = new JLabel("ADD DRIVER");
       
        l4.setBounds(180, 30, 400, 50);
        l4.setFont(new Font("Sitka Text",Font.BOLD,50));
        l4.setForeground(Color.BLACK);
        right.add(l4);
        
        l5 = new JLabel("DRIVER NAME: ");
        l5.setBounds(30, 130, 300, 30);
        l5.setFont(new Font("Sitka Text",Font.PLAIN,30));
        l5.setForeground(Color.BLACK);
        right.add(l5);
        
        t1 = new JTextField();
        t1.setBounds(350, 120, 300, 40);
        t1.setFont(new Font("Tahoma",Font.PLAIN,25));
        t1.setForeground(Color.BLACK);
        right.add(t1);
        
        l6 = new JLabel("PHONE NUMBER: ");
        l6.setBounds(30, 200, 300, 30);
        l6.setFont(new Font("Sitka Text",Font.PLAIN,30));
        l6.setForeground(Color.BLACK);
        right.add(l6);
        
        t2 = new JTextField();
        t2.setBounds(350, 190, 300, 40);
        t2.setFont(new Font("Tahoma",Font.PLAIN,25));
        t2.setForeground(Color.BLACK);
        right.add(t2);
        
        l7 = new JLabel("LICENSE NUMBER: ");
        l7.setBounds(30, 270, 300, 30);
        l7.setFont(new Font("Sitka Text",Font.PLAIN,30));
        l7.setForeground(Color.BLACK);
        right.add(l7);
        
        t3 = new JTextField();
        t3.setBounds(350, 260, 300, 40);
        t3.setFont(new Font("Tahoma",Font.PLAIN,25));
        t3.setForeground(Color.BLACK);
        right.add(t3);
        
        l8 = new JLabel("GENDER: ");
        l8.setBounds(30, 340, 150, 30);
        l8.setFont(new Font("Sitka Text",Font.PLAIN,30));
        l8.setForeground(Color.BLACK);
        right.add(l8);
        
        r1 = new JRadioButton("MALE");
        r1.setBounds(220, 340, 120, 30);
        r1.setFont(new Font("Sitka Text",Font.PLAIN,25));
        r1.setBackground(Color.WHITE);
        r1.setForeground(Color.BLACK);
        r1.setFocusable(false);
        right.add(r1);
        
        r2 = new JRadioButton("FEMALE");
        r2.setBounds(370, 340, 150, 30);
        r2.setFont(new Font("Sitka Text",Font.PLAIN,25));
        r2.setBackground(Color.WHITE);
        r2.setForeground(Color.BLACK);
        r2.setFocusable(false);
        right.add(r2);
        
        r3 = new JRadioButton("OTHER");
        r3.setBounds(540, 340, 150, 30);
        r3.setFont(new Font("Sitka Text",Font.PLAIN,25));
        r3.setBackground(Color.WHITE);
        r3.setForeground(Color.BLACK);
        r3.setFocusable(false);
        right.add(r3);
            
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        
        l9 = new JLabel("VEHICLE TYPE: ");
        l9.setBounds(30, 410, 300, 30);
        l9.setFont(new Font("Sitka Text",Font.PLAIN,30));
        l9.setForeground(Color.BLACK);
        right.add(l9);
        
        c1 = new JComboBox(new String[]{"SEDAN","SUV","VAN","LUXURY","ELECTICAL","RICKSHAW","MINIBUS"});
        c1.setBounds(350,400 , 300, 40);
        c1.setFont(new Font("Sitka Text",Font.PLAIN,25));
        c1.setForeground(Color.BLACK);
        c1.setBackground(Color.WHITE);
        right.add(c1);
        
        l10 = new JLabel("VEHICLE NUMBER: ");
        l10.setBounds(30, 480, 300, 30);
        l10.setFont(new Font("Sitka Text",Font.PLAIN,30));
        l10.setForeground(Color.BLACK);
        right.add(l10);
        
        t4 = new JTextField();
        t4.setBounds(350, 470, 300, 40);
        t4.setFont(new Font("Tahoma",Font.PLAIN,25));
        t4.setForeground(Color.BLACK);
        right.add(t4);
        
        l11 = new JLabel("AVAILABILITY: ");
        l11.setBounds(30, 550, 300, 30);
        l11.setFont(new Font("Sitka Text",Font.PLAIN,30));
        l11.setForeground(Color.BLACK);
        right.add(l11);
        
        String[] status = {"AVAILABLE","ON TRIP","OFF DUTY"};
        c2 = new JComboBox(status);
        c2.setBounds(350,540 , 300, 40);
        c2.setFont(new Font("Sitka Text",Font.PLAIN,25));
        c2.setForeground(Color.BLACK);
        c2.setBackground(Color.WHITE);
        right.add(c2);
        
        l12 = new JLabel("LOCATION: ");
        l12.setBounds(30, 620, 300, 30);
        l12.setFont(new Font("Sitka Text",Font.PLAIN,30));
        l12.setForeground(Color.BLACK);
        right.add(l12);
                
        t5 = new JTextField();
        t5.setBounds(350, 610, 300, 40);
        t5.setFont(new Font("Tahoma",Font.PLAIN,25));
        t5.setForeground(Color.BLACK);
        right.add(t5);
        
        l13 = new JLabel("EXPERIENCE: ");
        l13.setBounds(30, 690, 300, 30);
        l13.setFont(new Font("Sitka Text",Font.PLAIN,30));
        l13.setForeground(Color.BLACK);
        right.add(l13);
                
        t6 = new JTextField();
        t6.setBounds(350, 680, 300, 40);
        t6.setFont(new Font("Tahoma",Font.PLAIN,25));
        t6.setForeground(Color.BLACK);
        right.add(t6);
        
        l14 = new JLabel("LANGUAGE: ");
        l14.setBounds(30, 760, 300, 30);
        l14.setFont(new Font("Sitka Text",Font.PLAIN,30));
        l14.setForeground(Color.BLACK);
        right.add(l14);
         
        String lang[] = {"HINDI","ENGLISH","GUJARATI","FRENCH"};
        c3 = new JComboBox(lang);
        c3.setBounds(350,750 , 300, 40);
        c3.setFont(new Font("Sitka Text",Font.PLAIN,25));
        c3.setForeground(Color.BLACK);
        c3.setBackground(Color.WHITE);
        right.add(c3);
                
        b1 = new JButton("Add Driver");
        b1.setBounds(30, 870, 200, 50);
        b1.setBackground(new Color(0,102,102));
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.addActionListener(this);
        b1.setFont(new Font("Sitka Text",Font.BOLD,25));
        right.add(b1);
        
        
        b2 = new JButton("Cancel");
        b2.setBounds(450, 870, 200, 50);
        b2.setBackground(new Color(0,102,102));
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);
        b2.addActionListener(this);
        b2.setFont(new Font("Sitka Text",Font.BOLD,25));
        right.add(b2);
        
        add(l1); 
        setTitle("Add Driver");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,1950,1100);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new AddDrivers();
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        try
        {
            if(ae.getSource() == b1)
            {
                try
                {
                    Conn c = new Conn();
                    
                    
                    String  name = t1.getText();
                    String phoneNo = t2.getText();
                    String licenseNo = t3.getText();
                    String gender = null;
                    if(r1.isSelected())
                    {
                        gender = "MALE";
                    }
                    else if(r2.isSelected())
                    {
                        gender = "FEMALE";
                    }
                    else if(r3.isSelected())
                    {
                        gender = "OTHER";
                    }
                    String vehicalType =(String)c1.getSelectedItem();
                    String vehicalNo = t4.getText();
                    String availability = (String)c2.getSelectedItem();
                    String location = t5.getText();
                    String experience = t6.getText();
                    String language = (String)c3.getSelectedItem();
                    
                    if(name == null || phoneNo == null || licenseNo == null || gender == null || vehicalType == null || vehicalNo == null || availability == null || location == null || experience == null || language == null)
                    {
                        JOptionPane.showMessageDialog(null,"Please fill Alll the Fields");
                    }
                    String str = "INSERT INTO driver VALUES('"+name+"','"+phoneNo+"','"+licenseNo+"','"+gender+"','"+vehicalType+"','"+vehicalNo+"','"+availability+"','"+location+"','"+experience+"','" +language+ "')";
                    
                    c.s.executeUpdate(str);
                    JOptionPane.showConfirmDialog(null, "Driver Added");
                    JOptionPane.showMessageDialog(null, "Driver Added Successfully");
                    
                    DashBoard obj = new DashBoard();
                    this.setVisible(false);
                    obj.setVisible(true);
                    
                    
                    
                }
                catch(Exception ee)
                {
                    ee.printStackTrace();
                }
            }
            else if(ae.getSource() == b2)
            {
                DashBoard obj = new DashBoard();
                    this.setVisible(false);
                    obj.setVisible(true);
            }
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
