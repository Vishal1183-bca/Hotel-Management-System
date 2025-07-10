
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


class Update_Status extends JFrame
{
    private JPanel contentPane;
	JLabel imageLabel1, text1, imageLabel2, text2, text3, text4, text5, text6, text7, text33;
    JPanel left, right;
    private JTextField txt_ID, txt_Ava, txt_Status, txt_Room,txt_Name,txt_Date,txt_Payment,txt_pend_Payment;

    JButton b1, b2, b3;
    Choice ch1;
        
    Update_Status()
    {
       ImageIcon backGround = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
        Image i1 = backGround.getImage().getScaledInstance(1950, 1100, Image.SCALE_DEFAULT);
        ImageIcon backGround2 = new ImageIcon(i1);
        imageLabel1 = new JLabel(backGround2);
        imageLabel1.setBounds(0, 0, 1950, 1100);

        left = new JPanel();
        left.setLayout(null);
        left.setBounds(300, 50, 700, 900);
        left.setBackground(new Color(0, 102, 102));

        text1 = new JLabel("METROPOLE");
        text1.setFont(new Font("Showcard Gothic", Font.ITALIC, 70));
        text1.setForeground(Color.WHITE);
        text1.setBounds(140, 730, 500, 90);
        left.add(text1);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/nine.jpg"));
        Image i3 = i2.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        imageLabel2 = new JLabel(i4);
        imageLabel2.setBounds(50, 100, 600, 600);
        left.add(imageLabel2);

        right = new JPanel();
        right.setLayout(null);
        right.setBounds(1000, 50, 700, 900);
        right.setBackground(Color.WHITE);
        imageLabel1.add(right);

        text2 = new JLabel("UPDATE STATUS");
        text2.setBounds(200, 30, 600, 40);
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

        text4 = new JLabel("NAME: ");
        text4.setBounds(30, 320, 300, 30);
        text4.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        text4.setForeground(Color.BLACK);
        right.add(text4);

        txt_Name = new JTextField();
        txt_Name.setBounds(350, 310, 300, 40);
        txt_Name.setFont(new Font("Sitka Text", Font.PLAIN, 25));
        txt_Name.setForeground(Color.BLACK);
        right.add(txt_Name);

        text5 = new JLabel("CHECK-IN: ");
        text5.setBounds(30, 410, 300, 30);
        text5.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        text5.setForeground(Color.BLACK);
        right.add(text5);
        
        txt_Date = new JTextField();
        txt_Date.setBounds(350, 410, 300, 40);
        txt_Date.setFont(new Font("Tahoma", Font.PLAIN, 25));
        txt_Date.setForeground(Color.BLACK);
        right.add(txt_Date); // ✅ Corrected: added txt_Status (was missing)

         text6 = new JLabel("AMOUNT PAID: ");
        text6.setBounds(30, 520, 300, 30);
        text6.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        text6.setForeground(Color.BLACK);
        right.add(text6);

        txt_Payment = new JTextField();
        txt_Payment.setBounds(350, 510, 300, 40);
        txt_Payment.setFont(new Font("Tahoma", Font.PLAIN, 25));
        txt_Payment.setForeground(Color.BLACK);
        right.add(txt_Payment); // ✅ Corrected: added txt_Status (was missing)

         text7 = new JLabel("PENDING AMOUNT: ");
        text7.setBounds(30, 620, 300, 30);
        text7.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        text7.setForeground(Color.BLACK);
        right.add(text7);

        txt_pend_Payment = new JTextField();
         txt_pend_Payment.setBounds(350, 610, 300, 40);
        txt_pend_Payment.setFont(new Font("Tahoma", Font.PLAIN, 25));
        txt_pend_Payment.setForeground(Color.BLACK);
        right.add(txt_pend_Payment); // ✅ Corrected: added txt_Status (was missing)
        
        
        
        // Buttons
        b1 = new JButton("UPDATE");
        b1.setBounds(30, 730, 200, 50);
        b1.setBackground(new Color(0, 102, 102));
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) { 
                            try{
                                Conn c = new Conn();
                                
                                String s1 = ch1.getSelectedItem();
				String s2 = txt_Room.getText(); //room_number;    
                                String s3 = txt_Name.getText(); //name    
                                String s4 = txt_Date.getText(); //status;    
                                String s5 = txt_Payment.getText(); //deposit    
				
                                c.s.executeUpdate("update customers set allocateRoomNo = '"+s2+"', name = '"+s3+"', checkInTime = '"+s4+"', deposite = '"+s5+"' where number = '"+s1+"'");
                                
                                JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                                new Reception().setVisible(true);
                                setVisible(false);
                            }catch(Exception ee){
                                System.out.println(ee);
                            }				
				
				
				
			}
		});
        b1.setFont(new Font("Sitka Text", Font.BOLD, 25));
        right.add(b1);
        
        b3 = new JButton("CHECK");
        b3.setBounds(250, 730, 200, 50);
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
                                    txt_Name.setText(rs1.getString("name"));    
                                    txt_Date.setText(rs1.getString("checkInTime"));    
                                    txt_Payment.setText(rs1.getString("deposite"));    
                                }
                            }catch(Exception ee){}
                            
                            try{
                                String total = "";
                                Conn c  = new Conn();
                                ResultSet rs2 = c.s.executeQuery("select * from room_details where room_NO = "+txt_Room.getText());
                                while(rs2.next()){
                                    total = rs2.getString("price"); 
                                    
                                }
                                String paid = txt_Payment.getText();
                                int pending = Integer.parseInt(total)- Integer.parseInt(paid);
                                
                                txt_pend_Payment.setText(Integer.toString(pending));
                                
                            }catch(Exception ee){}
			}				
				
				
				
			
		});
        b3.setFont(new Font("Sitka Text", Font.BOLD, 25));
        right.add(b3);

        
        
        b2 = new JButton("Cancel");
        b2.setBounds(470, 730, 200, 50);
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
        new Update_Status();
    }
    
}
