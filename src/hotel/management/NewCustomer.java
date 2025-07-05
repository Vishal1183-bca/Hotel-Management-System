
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

class NewCustomer extends JFrame
{
    JPanel left,right;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,checkinTime;
    JComboBox c1;
    JTextField t1,t2,t3,t4;
    JRadioButton r1,r2;
    Choice c2;
    JButton b1,b2;
    
    NewCustomer()
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        i4.setBounds(0, 0, 1950, 1100);
        
        left = new JPanel();
        left.setLayout(null);
        left.setBounds(250, 60, 700, 900);
        left.setBackground(new Color(210, 168, 108));
        
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icons/guest_3.jpg"));
        Image i6 = i5.getImage().getScaledInstance(600,400, Image.SCALE_DEFAULT);
        ImageIcon i7 = new ImageIcon(i6);
        JLabel i8 = new JLabel(i7);
        i8.setBounds(50, 200, 600, 400);
        left.add(i8);
        
        l1 = new JLabel("METROPOLE");
        l1.setFont(new Font("Showcard Gothic", Font.ITALIC, 70));
        l1.setBounds(130, 630,500,80);
        l1.setForeground(Color.WHITE);
        left.add(l1);

        
        
        
        right = new JPanel();
        right.setLayout(null);
        right.setBounds(950, 60, 700, 900);
        right.setBackground(Color.WHITE);
        
        l2 = new JLabel("NEW CUSTOMER FROM");
        l2.setBounds(100,20,500,50);
        l2.setFont(new Font("Sitka Text",Font.BOLD,40));
        l2.setForeground(Color.BLACK);
        right.add(l2);
        
        l3 = new JLabel("ID:");
        l3.setBounds(50, 110, 250, 30);
        l3.setFont(new Font("Sitka Text",Font.PLAIN,25));
        l3.setForeground(Color.BLACK);
        right.add(l3);
        
        c1 = new JComboBox(new String[] {"Passport","Aadhar-Card","Voter Id","Driving License"});
        c1.setBounds(340, 100, 350, 40);
        c1.setFont(new Font("Sitka Text",Font.PLAIN,25));
        c1.setForeground(Color.BLACK);
        c1.setBackground(Color.WHITE);
        right.add(c1);
        
        l4 = new JLabel("NUMBER:");
        l4.setBounds(50, 180, 250, 30);
        l4.setFont(new Font("Sitka Text",Font.PLAIN,25));
        l4.setForeground(Color.BLACK);
        right.add(l4);
        
        t1 = new JTextField();
        t1.setBounds(340,170,350,40);
        t1.setFont(new Font("Tahoma",Font.PLAIN,30));
        t1.setForeground(Color.BLACK);
        right.add(t1);
        
        l5 = new JLabel("NAME:");
        l5.setBounds(50, 250, 250, 30);
        l5.setFont(new Font("Sitka Text",Font.PLAIN,25));
        l5.setForeground(Color.BLACK);
        right.add(l5);
        
        t2 = new JTextField();
        t2.setBounds(340,240,350,40);
        t2.setFont(new Font("Sitka Text",Font.PLAIN,30));
        t2.setForeground(Color.BLACK);
        right.add(t2);
        
        l6 = new JLabel("GENDER:");
        l6.setBounds(50, 320, 250, 30);
        l6.setFont(new Font("Sitka Text",Font.PLAIN,25));
        l6.setForeground(Color.BLACK);
        right.add(l6);
        
        r1 = new JRadioButton("MALE");
        r1.setBounds(340,310,150,35);
        r1.setFont(new Font("Sitka Text",Font.PLAIN,20));
        r1.setForeground(Color.BLACK);
        r1.setFocusable(false);
        r1.setBackground(Color.WHITE);
        right.add(r1);
        
        r2 = new JRadioButton("FEMALE");
        r2.setBounds(580,310,150,35);
        r2.setFont(new Font("Sitka Text",Font.PLAIN,20));
        r2.setForeground(Color.BLACK);
        r2.setFocusable(false);
        r2.setBackground(Color.WHITE);
        right.add(r2);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        
        l7 = new JLabel("COUNTRY:");
        l7.setBounds(50, 380, 250, 30);
        l7.setFont(new Font("Sitka Text",Font.PLAIN,25));
        l7.setForeground(Color.BLACK);
        right.add(l7);
        
        t3 = new JTextField();
        t3.setBounds(340,370,350,40);
        t3.setFont(new Font("Sitka Text",Font.PLAIN,30));
        t3.setForeground(Color.BLACK);
        right.add(t3);
        
           
        l8 = new JLabel("ALLOCATED ROOM-NO:");
        l8.setBounds(50, 460, 290, 30);
        l8.setFont(new Font("Sitka Text",Font.PLAIN,25));
        l8.setForeground(Color.BLACK);
        right.add(l8);
        
        c2 = new Choice();
        try
        {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM  room_details");
            while(rs.next())
                    {
                        c2.add(rs.getString("room_NO"));
                    }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        c2.setBounds(340, 450, 350, 40);
        c2.setFont(new Font("Sitka Text",Font.PLAIN,25));
        c2.setForeground(Color.BLACK);
        right.add(c2);
        
        l9 = new JLabel("CHECK-IN TIME:");
        l9.setBounds(50, 530, 290, 30);
        l9.setFont(new Font("Sitka Text",Font.PLAIN,25));
        l9.setForeground(Color.BLACK);
        right.add(l9);
        
        Date date = new Date();
        
        checkinTime = new JLabel("" + date);
        checkinTime.setBounds(340, 530, 290, 23);
        checkinTime.setFont(new Font("Releway",Font.PLAIN,23));
        checkinTime.setForeground(Color.BLACK);
        right.add(checkinTime);
        
        l10 = new JLabel("DEPOSITE:");
        l10.setBounds(50, 600, 250, 30);
        l10.setFont(new Font("Sitka Text",Font.PLAIN,25));
        l10.setForeground(Color.BLACK);
        right.add(l10);
        
        t4 = new JTextField();
        t4.setBounds(340,590,350,40);
        t4.setFont(new Font("Tahoma",Font.PLAIN,40));
        t4.setForeground(Color.BLACK);
        right.add(t4);
        
        
        b1 = new JButton("ADD");
        b1.setBounds(50, 730, 250, 50);
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(210, 168, 108));
        b1.setFocusable(false);
        b1.setFont(new Font("Sitka Text",Font.PLAIN,30));
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                
                String id = (String)c1.getSelectedItem();
                String number = t1.getText();
                String name = t2.getText();
                String gender = null;
                if(r1.isSelected())
                {
                    gender = "Male";
                }
                else if(r2.isSelected())
                {
                    gender = "Female";
                }
                String country = t3.getText();
                String allocateRoomNo = c2.getSelectedItem();
                String checkInTime = checkinTime.getText();
                String deposite = t4.getText();
                if(id == null || number.trim().isEmpty() || name.trim().isEmpty() || gender == null || country.trim().isEmpty() || allocateRoomNo.trim().isEmpty() || checkinTime == null || deposite.trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please Fill All The Details", "WARNING", JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    
               
                try
                {
                    Conn cc = new Conn();
                    String str1 = "INSERT INTO customer VALUES('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+allocateRoomNo+"','"+checkInTime+"','"+deposite+"')";
                    String str2 = "UPDATE room_details set available = 'Occupied' WHERE room_NO = " + allocateRoomNo;
                    
                    cc.s.executeUpdate(str1);
                    cc.s.executeUpdate(str2);
                    
                    JOptionPane.showConfirmDialog(null, "Customer Add");
                    JOptionPane.showMessageDialog(null, "Customer Added Succesfully:)");
                    Reception rec = new Reception();
                    rec.setVisible(true);
                    setVisible(false);
                }catch(Exception e1)
                {
                    e1.printStackTrace();
                }
                }
            }
        });
        right.add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(400, 730, 250, 50);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(210, 168, 108));
        b2.setFocusable(false);
        b2.setFont(new Font("Sitka Text",Font.PLAIN,30));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               
                Reception rec = new Reception();
                
                rec.setVisible(true);
                setVisible(false);
                
            }
        });
        right.add(b2);
        i4.add(right);
        i4.add(left);
        add(i4);
        setTitle("ADD NEW CUSTOMER");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1950,1100);
        setVisible(true); 
    }
    
    
    public static void main(String[] args)
    {
        new NewCustomer();
    }
    
}
