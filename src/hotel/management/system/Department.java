
package hotel.management.system;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.proteanit.sql.DbUtils;
import javax.swing.JFrame;


class Department extends JFrame
{
    JPanel left;
    JTable table;
    Department()
    {
        
         
        // Left Panel
        left = new JPanel();
        left.setLayout(null);
        left.setBounds(0, 0, 1950, 1100);
        left.setBackground(new Color(0,102,102));
        add(left);

        JLabel text = new JLabel("METROPOLE");
        text.setFont(new Font("Showcard Gothic",Font.ITALIC,60));
        text.setForeground(Color.WHITE);
        text.setBounds(750, 925, 400, 100);
          // Start blinking using Swing Timer
        Timer timer = new Timer(500, new ActionListener() {
            private boolean visible = true;

            public void actionPerformed(ActionEvent e) {
                text.setVisible(visible);
                visible = !visible;
            }
        });
        timer.start();
        left.add(text);
        
        JLabel text11 = new JLabel("Click Load-Data Button To Show departments Details");
        text11.setFont(new Font("Sitka Text",Font.BOLD,30));
        text11.setBounds(550,30,800,40);
        
        text11.setForeground(Color.WHITE);
        left.add(text11);
        
        // JTable with ScrollPane
        table = new JTable();
        //table.getColumnModel().getColumn(2).setPreferredWidth(200);
        JScrollPane scrollPane = new JScrollPane(table);
       table.setFont(new Font("Tahoma", Font.PLAIN, 20));
       table.setRowHeight(50);
       
       table.setFocusable(false);
       table.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 25));
       table.getTableHeader().setForeground(Color.WHITE);
         table.getTableHeader().setBackground(new Color(0,102,102));
        table.setBackground(new Color(0,102,102));
        table.setForeground(Color.white);
        scrollPane.setBounds(0, 100, 1950, 800);  // Adjust width and height as needed
        
        left.add(scrollPane);
        
        

        // Load Button
        JButton btn1 = new JButton("Load Data");
        btn1.setBounds(125, 950, 120, 40);
                btn1.setFocusable(false);

        btn1.setForeground(new Color(0,102,102));
        btn1.setBackground(Color.WHITE);
        
        left.add(btn1);

        // Load Button Action
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Conn c = new Conn();
                String str = "SELECT * FROM department";
                try {
                    ResultSet rs = c.s.executeQuery(str);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (SQLException ex) {
                    Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        
         JButton btn2 = new JButton("BACK");
        btn2.setBounds(1700, 950, 120, 40);
        btn2.setFocusable(false);
     btn2.setForeground(new Color(0,102,102));
        btn2.setBackground(Color.WHITE);
        left.add(btn2);

        // Load Button Action
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    Reception rec = new Reception();
                    rec.setVisible(true);
                    setVisible(false);
            }
        });
        
        
    
        // Frame settings
        setTitle("department");
        setLayout(null);
        setSize(1950, 1100);
        setLocationRelativeTo(null); // center window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
    }
    
    
    public static void main(String[] args)
    {
        new Department();
    }
    
}
