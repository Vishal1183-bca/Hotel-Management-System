package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Update_Room_Status extends JFrame implements ActionListener {
    JLabel imageLabel1, text1, imageLabel2, text2, text3, text4, text5, text6, text7, text33;
    JPanel left, right;
    private JTextField txt_ID, txt_Ava, txt_Status, txt_Room;

    JButton b1, b2, b3;
    Choice ch1;

    Update_Room_Status() {
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
        text1.setBounds(140, 530, 500, 90);
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

        text2 = new JLabel("UPDATE ROOM STATUS");
        text2.setBounds(100, 30, 600, 40);
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
        txt_Room.setFont(new Font("Sitka Text", Font.PLAIN, 25));
        txt_Room.setForeground(Color.BLACK);
        txt_Room.setBackground(Color.WHITE);
        right.add(txt_Room);

        text4 = new JLabel("AVAILABLE: ");
        text4.setBounds(30, 320, 300, 30);
        text4.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        text4.setForeground(Color.BLACK);
        right.add(text4);

        txt_Ava = new JTextField();
        txt_Ava.setBounds(350, 310, 300, 40);
        txt_Ava.setFont(new Font("Sitka Text", Font.PLAIN, 25));
        txt_Ava.setForeground(Color.BLACK);
        right.add(txt_Ava);

        text5 = new JLabel("CLEANING STATUS: ");
        text5.setBounds(30, 420, 300, 30);
        text5.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        text5.setForeground(Color.BLACK);
        right.add(text5);

        txt_Status = new JTextField();
        txt_Status.setBounds(350, 410, 300, 40);
        txt_Status.setFont(new Font("Sitka Text", Font.PLAIN, 25));
        txt_Status.setForeground(Color.BLACK);
        right.add(txt_Status); // ✅ Corrected: added txt_Status (was missing)

        // Buttons
        b1 = new JButton("UPDATE");
        b1.setBounds(30, 580, 200, 50);
        b1.setBackground(new Color(0, 102, 102));
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.addActionListener(this);
        b1.setFont(new Font("Sitka Text", Font.BOLD, 25));
        right.add(b1);

        b3 = new JButton("CHECK");
        b3.setBounds(250, 580, 200, 50);
        b3.setBackground(new Color(0, 102, 102));
        b3.setForeground(Color.WHITE);
        b3.setFocusable(false);
        b3.addActionListener(this);
        b3.setFont(new Font("Sitka Text", Font.BOLD, 25));
        right.add(b3);

        b2 = new JButton("Cancel");
        b2.setBounds(470, 580, 200, 50);
        b2.setBackground(new Color(0, 102, 102));
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);
        b2.addActionListener(this);
        b2.setFont(new Font("Sitka Text", Font.BOLD, 25));
        right.add(b2);

        imageLabel1.add(left);
        add(imageLabel1);
        setTitle("Update Room Status");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(0, 0, 1950, 1100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == b1) {
                int confirm = JOptionPane.showConfirmDialog(null, "Do you want to update the room status?");
                if (confirm == JOptionPane.YES_OPTION) {
                    Conn c = new Conn();
                    String str = "UPDATE room_details SET status = '" + txt_Status.getText() + "' WHERE room_NO = '" + txt_Room.getText() + "'";
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null, "Update Successful");
                    new Reception().setVisible(true);
                    setVisible(false);
                }
            } else if (e.getSource() == b3) {
                String guestID = ch1.getSelectedItem();

                Conn c = new Conn();

                ResultSet rs = c.s.executeQuery("SELECT * FROM customer WHERE number = '" + guestID + "'");
                if (rs.next()) {
                    txt_Room.setText(rs.getString("allocateRoomNo"));
                }

                ResultSet rs2 = c.s.executeQuery("SELECT * FROM room_details WHERE room_NO = '" + txt_Room.getText() + "'");
                if (rs2.next()) {
                    txt_Ava.setText(rs2.getString("available"));
                    txt_Status.setText(rs2.getString("status"));
                }
            } else if (e.getSource() == b2) {
                int ans = JOptionPane.showConfirmDialog(null, "Are You Sure to Cancel?");
                if (ans == JOptionPane.YES_OPTION) {
                    new DashBoard().setVisible(true);
                    this.setVisible(false);
                }
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Update_Room_Status();
    }
}
