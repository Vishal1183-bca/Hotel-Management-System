
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.proteanit.sql.DbUtils;
import javax.swing.JFrame;

import javax.swing.JFrame;


class PickUpService extends JFrame
{
    JTable table;
    Choice c1;
    JTextField t1;
    JPanel center;
    PickUpService()
    {
        
        
        center = new JPanel();
        center.setLayout(null);
        center.setBackground(new Color(0,102,102));
        center.setBounds(0,0,1950,1100);
        add(center);
        
        JLabel title = new JLabel("SEARCH FOR CAR");
        title.setBounds(750, 30, 500, 50);
        title.setFont(new Font("Sitka Text",Font.BOLD,40));
        title.setForeground(Color.WHITE);
        center.add(title);
        
        JLabel l1 = new JLabel("Car Type:");
        l1.setBounds(10, 120, 150, 30);
        l1.setFont(new Font("sitka Text",Font.BOLD,25));
        l1.setForeground(Color.WHITE);
        center.add(l1);
        
    
        
        c1 = new Choice();
        c1.add("SEDAN");
        c1.add("SUV");
        c1.add("VAN");
        c1.add("LUXURY");
        c1.add("ELECTICAL");
        c1.add("RICKSHAW");
        c1.add("MINIBUS");
        c1.setFocusable(false);
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(0,102,102));
        c1.setFont(new Font("sitka Text",Font.BOLD,25));
        c1.setBounds(220, 110, 200, 40);
        center.add(c1);
        
       
        
       JLabel text = new JLabel("METROPOLE");
        text.setFont(new Font("Showcard Gothic",Font.ITALIC,60));
        text.setForeground(Color.WHITE);
        text.setBounds(750, 915, 400, 100);
          // Start blinking using Swing Timer
        Timer timer = new Timer(500, new ActionListener() {
            private boolean visible = true;

            public void actionPerformed(ActionEvent e) {
                text.setVisible(visible);
                visible = !visible;
            }
        });
        timer.start();
        center.add(text);
        
       
        
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
        scrollPane.setBounds(0, 150, 1950, 700);  // Adjust width a  // Adjust width and height as needed
        center.add(scrollPane);
        
             JButton btn1 = new JButton("SEARCH");
        btn1.setBounds(10, 925, 200, 50);
        btn1.setFont(new Font("Sitka Text",Font.BOLD,26));
                btn1.setFocusable(false);

        btn1.setBackground(Color.WHITE);
        btn1.setForeground(new Color(0,102,102));
        
        center.add(btn1);

        // Load Button Action
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String str1 = "SELECT * FROM driver where vehicalType = '"+c1.getSelectedItem()+"'";
                //String str2 = "UPDATE driver set status = 'ON TRIP' WHERE status = '"+c1.getSelectedItem()+"'";
                
                try {
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery(str1);
                     
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                    //c.s.executeUpdate(str2);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        
        JButton btn2 = new JButton("BACK");
        btn2.setBounds(1700, 925, 200, 50);
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
        
        
        
        setTitle("Pick-up Service");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1950,1100);
        setVisible(true); 
    }
    
    
    public static void main(String[] args)
    {
        new PickUpService();
    }
    
}
