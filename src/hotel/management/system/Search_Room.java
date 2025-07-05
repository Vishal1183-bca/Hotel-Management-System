
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.proteanit.sql.DbUtils;
import javax.swing.JFrame;


class Search_Room extends JFrame
{
    JTable table;
    Choice c1;
    JTextField t1;
    JPanel center;
    Search_Room()
    {
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel background = new JLabel(i3);
        background.setBounds(0, 0, 1950, 1100);
        add(background);
        
        center = new JPanel();
        center.setLayout(null);
        center.setBackground(new Color(0,102,102));
        center.setBounds(400,100,1200,850);
        background.add(center);
        
        JLabel title = new JLabel("SEARCH FOR ROOM");
        title.setBounds(400, 30, 500, 50);
        title.setFont(new Font("Sitka Text",Font.BOLD,40));
        title.setForeground(Color.WHITE);
        center.add(title);
        
        JLabel l1 = new JLabel("BED TYPE:");
        l1.setBounds(50, 120, 150, 30);
        l1.setFont(new Font("sitka Text",Font.BOLD,25));
        l1.setForeground(Color.WHITE);
        center.add(l1);
        
        c1 = new Choice();
        c1.add("Single Bed");
        c1.add("Double Bed");
        c1.setFocusable(false);
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(0,102,102));
        c1.setFont(new Font("sitka Text",Font.BOLD,25));
        c1.setBounds(220, 110, 200, 40);
        center.add(c1);
        
        JCheckBox ch1 = new JCheckBox("ONLY DISPLAY AVAILABLE ROOMS");
        ch1.setBounds(670, 110,500,40);
        ch1.setForeground(Color.WHITE);
        ch1.setFont(new Font("sitka Text",Font.BOLD,25));
        ch1.setFocusable(false);
        ch1.setBackground(new Color(0,102,102));
        center.add(ch1);
        
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 200, 1200, 500);  // Adjust width and height as needed
        center.add(scrollPane);
        
             JButton btn1 = new JButton("SEARCH");
        btn1.setBounds(400, 750, 200, 50);
        btn1.setFont(new Font("Sitka Text",Font.BOLD,26));
                btn1.setFocusable(false);

        btn1.setForeground(Color.WHITE);
        btn1.setForeground(new Color(0,102,102));
        
        center.add(btn1);

        // Load Button Action
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String str1 = "SELECT * FROM room_details where type = '"+c1.getSelectedItem()+"'";
                String str2 = "SELECT * FROM room_details where available = 'Available' AND type = '"+c1.getSelectedItem()+"'";
                
                try {
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery(str1);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                    if(ch1.isSelected())
                    {
                        ResultSet rss = c.s.executeQuery(str2);
                        table.setModel(DbUtils.resultSetToTableModel(rss));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        
        JButton btn2 = new JButton("BACK");
        btn2.setBounds(650, 750, 200, 50);
                btn2.setFont(new Font("Sitka Text",Font.BOLD,26));

        btn2.setFocusable(false);
        btn2.setForeground(Color.WHITE);
        btn2.setForeground(new Color(0,102,102));
        center.add(btn2);

        // Load Button Action
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    Reception rec = new Reception();
                    rec.setVisible(true);
                    setVisible(false);
            }
        });
        
        
        
        setTitle("SEARCH ROOM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1950,1100);
        setVisible(true); 
      
        
        
    }
    
    
    public static void main(String[] args)
    {
        new Search_Room();
    }
    
}
