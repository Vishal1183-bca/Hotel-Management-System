package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JPanel left, right;
    JLabel imageLabel, text1,logoTitile,user,pass;
    JTextField t1,t2;
    JButton login,cancel;

    Login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        // ===== Left Panel =====
        left = new JPanel();
        left.setLayout(null); // allow manual positioning
        left.setBounds(0, 0, 400, 500);
        left.setBackground(new Color(0, 102, 102));

        // Logo Image
        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        imageLabel = new JLabel(logo);

        // Assume logo size is 150x150. Adjust if different.
        imageLabel.setBounds(125, 125, 150, 150); // (centered: (400-150)/2, (500-150)/2)

        // Text below logo
        text1 = new JLabel("METROPOLE", SwingConstants.CENTER);
        text1.setFont(new Font("Showcard Gothic", Font.ITALIC, 30));
        text1.setForeground(Color.WHITE);
        text1.setBounds(50, 300, 300, 50); // Centered text

        left.add(imageLabel);
        left.add(text1);

        // ===== Right Panel =====
        right = new JPanel();
        right.setBounds(400, 0, 400, 500);
        right.setBackground(Color.WHITE);
        right.setLayout(null); // optional if you want to use bounds later
        
        logoTitile = new JLabel("LOGIN");
        logoTitile.setBounds(130, 50, 95, 50);
        logoTitile.setFont(new Font("Segoe UI",Font.PLAIN,30));
        logoTitile.setForeground(new Color(0,102,102));
        right.add(logoTitile);
        
        user = new JLabel("USERNAME");
        user.setBounds(50, 150, 100, 22);
        user.setFont(new Font("Segoe UI",Font.PLAIN,16));
        user.setForeground(new Color(0,102,102));
        right.add(user);
        
        t1 = new JTextField();
        t1.setBounds(50, 180, 300, 30);
        t1.setFont(new Font("Segoe UI",Font.PLAIN,16));
        //t2.setForeground(Color.BLACK);
        right.add(t1);
        
        
        
        pass = new JLabel("PASSWORD");
        pass.setBounds(50, 220, 100, 22);
        pass.setFont(new Font("Segoe UI",Font.PLAIN,16));
        pass.setForeground(new Color(0,102,102));
        right.add(pass);
        
        t2 = new JTextField();
        t2.setBounds(50, 250, 300, 30);
        t2.setFont(new Font("Segoe UI",Font.PLAIN,16));
        //t2.setForeground(Color.BLACK);
        right.add(t2);
        
        login = new JButton("Login");
        login.setBounds(50, 310, 120, 40);
        login.setFont(new Font("Segoe UI",Font.BOLD,16));
        login.setForeground(Color.white);
        login.setFocusable(false);
        login.setBackground(new Color(0,102,102));
        login.addActionListener(this);
        right.add(login);
        

        cancel = new JButton("Cancel");
        cancel.setBounds(230, 310, 120, 40);
        cancel.setFont(new Font("Segoe UI",Font.BOLD,16));
        cancel.setForeground(Color.white);
        cancel.setFocusable(false);
        cancel.setBackground(new Color(0,102,102));
        cancel.addActionListener(this);
        right.add(cancel);
        
        add(left);
        add(right);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login)
        {
            try
            {
                Conn c1 = new Conn();
                String u = t1.getText();
                String p = t2.getText();
                
                String q = "select * from login where username = '"+u+ "' and password = '"+p+"'";
                
                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next())
                {
                    new DashBoard().setVisible(true);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                    setVisible(false);
                }
                
                
            
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }else if(e.getSource() == cancel)
        {
                    System.exit(0);
        }
         
        
    }
}
