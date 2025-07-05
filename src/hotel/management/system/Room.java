package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.proteanit.sql.DbUtils;

public class Room extends JFrame {

    JPanel left, right;
    JTable table;

    Room() {
        // Background Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel background = new JLabel(i3);
        background.setBounds(0, 0, 1950, 1100);
        add(background);

        // Left Panel
        left = new JPanel();
        left.setLayout(null);
        left.setBounds(70, 60, 900, 900);
        left.setBackground(Color.WHITE);
        background.add(left);

        JLabel text = new JLabel("METROPOLE");
        text.setFont(new Font("Showcard Gothic",Font.ITALIC,60));
        text.setForeground(new Color(210, 168, 108));
        text.setBounds(250, 700, 400, 100);
        
        left.add(text);
        
        
        
        // JTable with ScrollPane
        table = new JTable();
//        table.setFont(new Font("Sitka Text",Font.PLAIN,25));
//        table.setBackground(new Color(0,102,102));
//        table.setForeground(Color.white);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 50, 800, 500);  // Adjust width and height as needed
        left.add(scrollPane);
        
        

        // Load Button
        JButton btn1 = new JButton("Load Data");
        btn1.setBounds(50, 600, 120, 40);
                btn1.setFocusable(false);

        btn1.setForeground(Color.WHITE);
        btn1.setBackground(new Color(210, 168, 108));
        
        left.add(btn1);

        // Load Button Action
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Conn c = new Conn();
                String str = "SELECT * FROM room_details";
                try {
                    ResultSet rs = c.s.executeQuery(str);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (SQLException ex) {
                    Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        
         JButton btn2 = new JButton("BACK");
        btn2.setBounds(720, 600, 120, 40);
        btn2.setFocusable(false);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(new Color(210, 168, 108));
        left.add(btn2);

        // Load Button Action
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    Reception rec = new Reception();
                    rec.setVisible(true);
                    setVisible(false);
            }
        });
        
        
        
        // Right Panel
        right = new JPanel();
        right.setLayout(null);
        right.setBounds(970, 60, 900, 900);
        right.setBackground(new Color(210, 168, 108));
        background.add(right);

        // Right Panel Image
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icons/eight.jpg"));
        Image i6 = i5.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i7 = new ImageIcon(i6);
        JLabel i8 = new JLabel(i7);
        i8.setBounds(100, 100, 700, 700);
        right.add(i8);

        // Frame settings
        setTitle("ROOM");
        setLayout(null);
        setSize(1950, 1100);
        setLocationRelativeTo(null); // center window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        while(true)
        {
            
        
        text.setVisible(false);
        try
        {
            Thread.sleep(500);
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        text.setVisible(true);
        try
        {
            Thread.sleep(500);
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        }
    }

    public static void main(String[] args) {
        new Room();
    }
}
