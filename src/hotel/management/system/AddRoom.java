
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddRoom extends JFrame implements ActionListener{

    JLabel imageLabel1 ,text1,imageLabel2,text2,text3,text4,text5,text6,text7;
    JPanel left,right;
    JTextField t1,t2;
    JComboBox c1,c2,c3;
    JButton b1,b2;
    public AddRoom() 
    {
        ImageIcon backGround = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
        Image i1 = backGround.getImage().getScaledInstance(1950, 1100, Image.SCALE_DEFAULT);
        ImageIcon backGround2 = new ImageIcon(i1);
        imageLabel1 = new JLabel(backGround2);
        imageLabel1.setBounds(0, 0, 1950, 1100);
        
        left = new JPanel();
        left.setLayout(null);
        left.setBounds(300, 150, 700, 700);
        left.setBackground(new Color(0,102,102));
       
        text1 = new JLabel("METROPOLE");
        text1.setFont(new Font("Showcard Gothic", Font.ITALIC, 70));
        text1.setForeground(Color.WHITE);
        text1.setBounds(140,530,500,90);
        left.add(text1);
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
        Image i3 = i2.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        imageLabel2 = new JLabel(i4);
        imageLabel2.setBounds(100, 200, 500, 300);
        left.add(imageLabel2);
        
        
        right = new JPanel();
        right.setLayout(null);
        right.setBounds(1000, 150, 700, 700);
        right.setBackground(Color.WHITE);
        imageLabel1.add(right);
        
        text2 = new JLabel("ADD ROOMS");
        text2.setBounds(200, 30, 400, 50);
        text2.setFont(new Font("Sitka Text",Font.BOLD,50));
        text2.setForeground(Color.BLACK);
        right.add(text2);
        
        text3 = new JLabel("ROOM NUMBER: ");
        text3.setBounds(30, 150, 300, 30);
        text3.setFont(new Font("Sitka Text",Font.PLAIN,30));
        text3.setForeground(Color.BLACK);
        right.add(text3);
        
        t1 = new JTextField();
        t1.setBounds(350, 140, 300, 40);
        t1.setFont(new Font("Tahoma",Font.PLAIN,25));
        t1.setForeground(Color.BLACK);
        right.add(t1);
        
        
        text4 = new JLabel("AVAILABLE: ");
        text4.setBounds(30, 230, 300, 30);
        text4.setFont(new Font("Sitka Text",Font.PLAIN,30));
        text4.setForeground(Color.BLACK);
        right.add(text4);
        
        c1 = new JComboBox(new String[] { "Available", "Occupied" });
        c1.setBounds(350, 220, 300, 40);
        c1.setFont(new Font("Sitka Text",Font.PLAIN,25));
        c1.setForeground(Color.BLACK);
        c1.setBackground(Color.WHITE);
        right.add(c1);

        
        
        
        text5 = new JLabel("CLEANING STATUS: ");
        text5.setBounds(30, 310, 300, 30);
        text5.setFont(new Font("Sitka Text",Font.PLAIN,30));
        text5.setForeground(Color.BLACK);
        right.add(text5);
        
        c2 = new JComboBox(new String[] { "Cleaned", "Dirty" });
        c2.setBounds(350, 300, 300, 40);
        c2.setFont(new Font("Sitka Text",Font.PLAIN,25));
        c2.setForeground(Color.BLACK);
        c2.setBackground(Color.WHITE);
        right.add(c2);

        text6 = new JLabel("PRICE: ");
        text6.setBounds(30, 390, 300, 30);
        text6.setFont(new Font("Sitka Text",Font.PLAIN,30));
        text6.setForeground(Color.BLACK);
        right.add(text6);
        
        t2 = new JTextField();
        t2.setBounds(350, 380, 300, 40);
        t2.setFont(new Font("Tahoma",Font.PLAIN,25));
        t2.setForeground(Color.BLACK);
        right.add(t2);
        
        text7 = new JLabel("BED TYPE: ");
        text7.setBounds(30, 470, 300, 30);
        text7.setFont(new Font("Sitka Text",Font.PLAIN,30));
        text7.setForeground(Color.BLACK);
        right.add(text7);
        
        c3 = new JComboBox(new String[] { "Single Bed", "Double Bed"});
        c3.setBounds(350, 460, 300, 40);
        c3.setFont(new Font("Sitka Text",Font.PLAIN,25));
        c3.setForeground(Color.BLACK);
        c3.setBackground(Color.WHITE);
        right.add(c3);
        
        b1 = new JButton("Add Room");
        b1.setBounds(30, 580, 200, 50);
        b1.setBackground(new Color(0,102,102));
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.addActionListener(this);
        b1.setFont(new Font("Sitka Text",Font.BOLD,25));
        right.add(b1);
        
        
        b2 = new JButton("Cancel");
        b2.setBounds(450, 580, 200, 50);
        b2.setBackground(new Color(0,102,102));
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);
        b2.addActionListener(this);
        b2.setFont(new Font("Sitka Text",Font.BOLD,25));
        right.add(b2);
        
        imageLabel1.add(left);
        add(imageLabel1);
        setTitle("Add Room");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(0,0,1950,1100);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new AddRoom();
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        try{
            if(ae.getSource() == b1)
            {
                try
                {
                    Conn c = new Conn();
                    String room_NO = t1.getText();
                    String available = (String)c1.getSelectedItem();
                    String status = (String)c2.getSelectedItem();
                    String price = t2.getText();
                    String type = (String)c3.getSelectedItem();
                    
                    String str = "INSERT INTO room_details values('"+room_NO+"','"+available+"','"+status+"','"+price+"','"+type+"')";
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null, "Room Successfully Added");
                    DashBoard obje = new DashBoard();
                    obje.setVisible(true);
                    this.setVisible(false);
                }
                catch(Exception ee)
                {
                    ee.printStackTrace();
                }
            }
            else if(ae.getSource() == b2)
            {
                DashBoard obje = new DashBoard();
                obje.setVisible(true);
                this.setVisible(false);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
