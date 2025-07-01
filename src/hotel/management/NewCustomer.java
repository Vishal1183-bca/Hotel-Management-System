
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NewCustomer extends JFrame
{
    JPanel left,right;
    JLabel l1;
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
