
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame{

    JPanel left,right;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b12,b11;
    public Reception() 
    {
        left = new JPanel();
        left.setLayout(null);
        left.setBackground(Color.white);
        left.setBounds(0, 0,700 , 1100);
        
        b1 = new JButton("New Customer Form");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    NewCustomer customer = new NewCustomer();
                    customer.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e1)
                {
                    e1.printStackTrace();
                }
            }
        });
        b1.setBounds(100, 20, 500, 50);
        b1.setFocusable(false);
        b1.setBackground(new Color(0,102,102));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b1);
        
        
        b2 = new JButton("ROOM");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    Room room = new Room();
                    room.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e2)
                {
                    e2.printStackTrace();
                }
            }
        });
        b2.setBounds(100, 100, 500, 50);
        b2.setFocusable(false);
        b2.setBackground(new Color(0,102,102));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b2);
        
        b3 = new JButton("DEPARTMENT");
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    Department dept = new Department();
                    dept.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e3)
                {
                    e3.printStackTrace();
                }
            }
        });
        b3.setBounds(100, 180, 500, 50);
        b3.setFocusable(false);
        b3.setBackground(new Color(0,102,102));
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b3);
        
        b4 = new JButton("ALL EMPLOYEE INFO");
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    EmployeeInfo epInfo = new EmployeeInfo();
                    epInfo.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e4)
                {
                    e4.printStackTrace();
                }
            }
        });
        b4.setBounds(100, 260, 500, 50);
        b4.setFocusable(false);
        b4.setBackground(new Color(0,102,102));
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b4);

        b5 = new JButton("CUSTOMER INFO");
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    CustomerInfo custoInfo = new CustomerInfo();
                    custoInfo.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e5)
                {
                    e5.printStackTrace();
                }
            }
        });
        b5.setBounds(100, 330, 500, 50);
        b5.setFocusable(false);
        b5.setBackground(new Color(0,102,102));
        b5.setForeground(Color.WHITE);
        b5.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b5);
        

        b6 = new JButton("MANAGER INFO");
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    ManagerInfo managerInfo = new ManagerInfo();
                    managerInfo.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e6)
                {
                    e6.printStackTrace();
                }
            }
        });
        b6.setBounds(100, 410, 500, 50);
        b6.setFocusable(false);
        b6.setBackground(new Color(0,102,102));
        b6.setForeground(Color.WHITE);
        b6.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b6);
        
        b7 = new JButton("CHECK-OUT");
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    Check_Out checkOut = new Check_Out();
                    checkOut.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e7)
                {
                    e7.printStackTrace();
                }
            }
        });
        b7.setBounds(100, 490, 500, 50);
        b7.setFocusable(false);
        b7.setBackground(new Color(0,102,102));
        b7.setForeground(Color.WHITE);
        b7.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b7);
        
        b8 = new JButton("UPDATE STATUS");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    Update_Status updateStatus = new Update_Status();
                    updateStatus.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e8)
                {
                    e8.printStackTrace();
                }
            }
        });
        b8.setBounds(100, 570, 500, 50);
        b8.setFocusable(false);
        b8.setBackground(new Color(0,102,102));
        b8.setForeground(Color.WHITE);
        b8.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b8);
        
        b9 = new JButton("UPDATE ROOM STATUS");
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    Update_Room_Status updateStatus = new Update_Room_Status();
                    updateStatus.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e9)
                {
                    e9.printStackTrace();
                }
            }
        });
        b9.setBounds(100, 650, 500, 50);
        b9.setFocusable(false);
        b9.setBackground(new Color(0,102,102));
        b9.setForeground(Color.WHITE);
        b9.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b9);
        
        
        b10 = new JButton("PICK UP SERVICE");
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    PickUpService pickup = new PickUpService();
                    pickup.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e10)
                {
                    e10.printStackTrace();
                }
            }
        });
        b10.setBounds(100, 730, 500, 50);
        b10.setFocusable(false);
        b10.setBackground(new Color(0,102,102));
        b10.setForeground(Color.WHITE);
        b10.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b10);
        
        b11 = new JButton("SEARCH ROOM");
        b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    Search_Room serachRoom = new Search_Room();
                    serachRoom.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e11)
                {
                    e11.printStackTrace();
                }
            }
        });
        b11.setBounds(100, 810, 500, 50);
        b11.setFocusable(false);
        b11.setBackground(new Color(0,102,102));
        b11.setForeground(Color.WHITE);
        b11.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b11);
        
        b12 = new JButton("LOG-OUT");
        b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                   
                    Logout logout = new Logout();
                    logout.setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e12)
                {
                    e12.printStackTrace();
                }
            }
        });
        b12.setBounds(100, 890, 500, 50);
        b12.setFocusable(false);
        b12.setBackground(new Color(0,102,102));
        b12.setForeground(Color.WHITE);
        b12.setFont(new Font("Sitka Text",Font.BOLD,25));
        left.add(b12);
        
        right = new JPanel();
        right.setLayout(null);
        right.setBounds(700, 0, 1250, 1100);
        right.setBackground(new Color(0,102,102));
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/reception_2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        i4.setBounds(150, 150,900 , 600);
        right.add(i4);
        
        JLabel text1 = new JLabel("RECEPTION");
        text1.setFont(new Font("Showcard Gothic", Font.ITALIC, 70));
        text1.setForeground(Color.WHITE);
        text1.setBounds(370, 770, 500, 100);
        right.add(text1);
        
        
        
        add(right);
        add(left);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,1950,1100);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Reception();
    }
}
