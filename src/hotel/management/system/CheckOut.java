
package hotel.management.system;

import java.awt.BorderLayout;
import java.awt.*;

import java.sql.*;	
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

import java.util.Date;
class CheckOut extends JFrame
{
    private JPanel contentPane;
	JLabel imageLabel1, checkoutTime,text1, imageLabel2, text2, text3, text4, text5, text6, text7, text33;
    JPanel left, right;
    private JTextField txt_ID, txt_Ava, txt_Status, txt_Room,txt_out,txt_Date,txt_Payment,txt_pend_Payment;

    JButton b1, b2, b3;
    Choice ch1;
        
    CheckOut()
    {
       ImageIcon backGround = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
        Image i1 = backGround.getImage().getScaledInstance(1950, 1100, Image.SCALE_DEFAULT);
        ImageIcon backGround2 = new ImageIcon(i1);
        imageLabel1 = new JLabel(backGround2);
        imageLabel1.setBounds(0, 0, 1950, 1100);

        left = new JPanel();
        left.setLayout(null);
        left.setBounds(300, 150, 700, 700);
        left.setBackground(new Color(0, 102, 102));

        text1 = new JLabel("METROPOLE");
        text1.setFont(new Font("Showcard Gothic", Font.ITALIC, 70));
        text1.setForeground(Color.WHITE);
        text1.setBounds(110, 550, 500, 90);
        left.add(text1);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/nine.jpg"));
        Image i3 = i2.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        imageLabel2 = new JLabel(i4);
        imageLabel2.setBounds(130, 100, 400, 400);
        left.add(imageLabel2);

        right = new JPanel();
        right.setLayout(null);
        right.setBounds(1000, 150, 700, 700);
        right.setBackground(Color.WHITE);
        imageLabel1.add(right);

        text2 = new JLabel("CHECK OUT");
        text2.setBounds(230, 30, 600, 40);
        text2.setFont(new Font("Sitka Text", Font.BOLD, 40));
        text2.setForeground(Color.BLACK);
        right.add(text2);

        text3 = new JLabel("GUEST ID: ");
        text3.setBounds(30, 150, 300, 30);
        text3.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        text3.setForeground(Color.BLACK);
        right.add(text3);

        ch1 = new Choice();
        try {
            Conn cc = new Conn();
            ResultSet rs = cc.s.executeQuery("SELECT * FROM customers");
            while (rs.next()) {
                ch1.add(rs.getString("number"));
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        ch1.setBounds(350, 140, 300, 40);
        ch1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        ch1.setForeground(Color.BLACK);
        ch1.setBackground(Color.WHITE);
        ch1.setFocusable(false);
        right.add(ch1);

        text33 = new JLabel("ROOM NUMBER: ");
        text33.setBounds(30, 230, 300, 30);
        text33.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        text33.setForeground(Color.BLACK);
        right.add(text33);

        txt_Room = new JTextField();
        txt_Room.setBounds(350, 220, 300, 40);
        txt_Room.setFont(new Font("Tahoma", Font.PLAIN, 25));
        txt_Room.setForeground(Color.BLACK);
        txt_Room.setBackground(Color.WHITE);
        right.add(txt_Room);

        text4 = new JLabel("CHECK-IN TIME: ");
        text4.setBounds(30, 320, 300, 30);
        text4.setFont(new Font("Tahoma", Font.PLAIN, 30));
        text4.setForeground(Color.BLACK);
        right.add(text4);

        txt_Date = new JTextField();
        txt_Date.setBounds(350, 310, 300, 40);
        txt_Date.setFont(new Font("Sitka Text", Font.PLAIN, 25));
        txt_Date.setForeground(Color.BLACK);
        right.add(txt_Date);

        text5 = new JLabel("CHECK-OUT TIME: ");
        text5.setBounds(30, 410, 300, 30);
        text5.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        text5.setForeground(Color.BLACK);
        right.add(text5);
        
        
        Date date = new Date();
        
        checkoutTime = new JLabel("" + date);
        checkoutTime.setBounds(350, 410, 290, 30);
        checkoutTime.setFont(new Font("Releway",Font.PLAIN,23));
        checkoutTime.setForeground(Color.BLACK);
        right.add(checkoutTime);
        
        b3 = new JButton("CHECK");
        b3.setBounds(30, 490, 200, 50);
        b3.setBackground(new Color(0, 102, 102));
        b3.setForeground(Color.WHITE);
        b3.setFocusable(false);
        b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) { 
                           try{
				String s1 = ch1.getSelectedItem();
				Conn c = new Conn();
                                ResultSet rs1 = c.s.executeQuery("select * from customers where number = "+s1);
                                
                                while(rs1.next()){
                                    txt_Room.setText(rs1.getString("allocateRoomNo"));    
                                       
                                    txt_Date.setText(rs1.getString("checkInTime"));    
                                       
                                }
                            }catch(Exception ee){}
                            
                            
			}				
				
				
				
			
		});
        b3.setFont(new Font("Sitka Text", Font.BOLD, 25));
        right.add(b3);

        
        
        b1 = new JButton("CHECK-OUT");
        b1.setBounds(250, 570, 200, 50);
        b1.setBackground(new Color(0, 102, 102));
        
        b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) { 
                             String id = ch1.getSelectedItem();
                                String s1 = txt_Room.getText();
                                String deleteSQL = "Delete from customers where number = "+id;
                                String q2 = "update room_details set available = 'Available' where room_NO = "+s1;
                                
                                
				Conn c = new Conn();
                                     try{
				c.s.executeUpdate(deleteSQL);
	    			c.s.executeUpdate(q2);
	    			JOptionPane.showMessageDialog(null, "Check Out Successful");
	    			new Reception().setVisible(true);
                                setVisible(false);
                
                
                            }catch(Exception ee){}
                            
			}				
				
				
				
			
		});
        
        b1.setForeground(Color.WHITE);
        
        b1.setFocusable(false);
       
        b1.setFont(new Font("Sitka Text", Font.BOLD, 25));
        right.add(b1);

        
        b2 = new JButton("Cancel");
        b2.setBounds(470, 490, 200, 50);
        b2.setBackground(new Color(0, 102, 102));
        
        b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) { 
                                     try{
				
                                int ans = JOptionPane.showConfirmDialog(null, "Are You Sure to Cancel?");
                if (ans == JOptionPane.YES_OPTION) {
                    new Reception().setVisible(true);
                    setVisible(false);
                }
                            }catch(Exception ee){}
                            
			}				
				
				
				
			
		});
        
        b2.setForeground(Color.WHITE);
        
        b2.setFocusable(false);
       
        b2.setFont(new Font("Sitka Text", Font.BOLD, 25));
        right.add(b2);
        
        imageLabel1.add(left);
        add(imageLabel1);
        setTitle("Update Status");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(0, 0, 1950, 1100);
        setVisible(true); 
    }
    
    
    public static void main(String[] args)
    {
        new CheckOut();
    }
    
}
