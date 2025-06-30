
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
 JPanel left,right;
    JLabel text1,text2,name,age,gender,job,salary,phone,aadhar,email;
    JTextField t1,t2,t3,t4,t5,t6;
    JRadioButton r1,r2,r3;
    JComboBox c1;
    JButton submit;
    public AddEmployee() 
    {
        
        ImageIcon backGround = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
        Image i11 = backGround.getImage().getScaledInstance(1950, 1100, Image.SCALE_DEFAULT);
        ImageIcon backGround2 = new ImageIcon(i11);
        JLabel imageLabel1 = new JLabel(backGround2);
        imageLabel1.setBounds(0, 0, 1950, 1100);
        left = new JPanel();
        
        
        left.setBounds(500, 20,500,1000);
        left.setBackground(new Color(0,102,102));
        left.setLayout(null);
        imageLabel1.add(left);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/employees2.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(500, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 500, 500);
        left.add(image);
        
        text1 = new JLabel("METROPOLE");
        //text1.setHorizontalAlignment(JLabel.TRAILING);
        text1.setFont(new Font("Showcard Gothic", Font.ITALIC, 70));
        text1.setForeground(Color.WHITE);
        text1.setBounds(40, 700, 500, 100);
        left.add(text1);
        
       


        right = new JPanel();
        
        right.setBounds(1000, 20,500,1000);
        right.setBackground(Color.WHITE);
        right.setLayout(null);
        imageLabel1.add(right);
        text2 = new JLabel("ADD EMPLOYEE DETAILS");
        text2.setBounds(25, 30, 500, 50);
        text2.setFont(new Font("Sitka Text",Font.BOLD,35));
        right.add(text2);
        
        name = new JLabel("NAME");
        name.setBounds(25, 120, 100, 30);
        name.setFont(new Font("Sitka Text",Font.PLAIN,25));
        name.setForeground(Color.BLACK);
        right.add(name);
        
        t1 = new JTextField();
        t1.setBounds(25, 160, 400, 35);
        t1.setFont(new Font("Sitka Text",Font.PLAIN,25));
        t1.setForeground(Color.black);
        right.add(t1);
        
        age = new JLabel("AGE");
        age.setBounds(25, 220, 100, 30);
        age.setFont(new Font("Sitka Text",Font.PLAIN,25));
        age.setForeground(Color.BLACK);
        right.add(age);
        
        t2 = new JTextField();
        t2.setBounds(25, 260, 400, 35);
        t2.setFont(new Font("Sitka Text",Font.PLAIN,25));
        t2.setForeground(Color.black);
        right.add(t2);
        
        gender = new JLabel("GENDER");
        gender.setBounds(25, 320, 150, 30);
        gender.setFont(new Font("Sitka Text",Font.PLAIN,25));
        gender.setForeground(Color.BLACK);
        right.add(gender);
        
        r1 = new JRadioButton("MALE");
        r1.setFont(new Font("Sitka Text",Font.PLAIN,20));
        r1.setBounds(25, 360, 120, 30);
        r1.setBackground(Color.WHITE);
        right.add(r1);
        
        r3 = new JRadioButton("FEMALE");
        r3.setFont(new Font("Sitka Text",Font.PLAIN,20));
        r3.setBounds(170, 360, 120, 30);
        r3.setBackground(Color.WHITE);
        right.add(r3);
        
        r2 = new JRadioButton("OTHER");
        r2.setFont(new Font("Sitka Text",Font.PLAIN,20));
        r2.setBounds(320, 360, 120, 30);
        r2.setBackground(Color.WHITE);
        right.add(r2);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);
        genderGroup.add(r3);
        
        job = new JLabel("JOB");
        job.setBounds(25, 410, 150, 30);
        job.setFont(new Font("Sitka Text",Font.PLAIN,25));
        job.setForeground(Color.BLACK);
        right.add(job);
        
        String jobRoll[] = 
        {
           "Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"
        };
        c1 = new JComboBox(jobRoll);
        c1.setFont(new Font("Sitka Text",Font.PLAIN,25));
        c1.setBackground(Color.WHITE);
        c1.setBounds(25, 450, 400, 35);
        right.add(c1);
        
        
        salary = new JLabel("SALARY");
        salary.setBounds(25, 520, 150, 30);
        salary.setFont(new Font("Sitka Text",Font.PLAIN,25));
        salary.setForeground(Color.BLACK);
        right.add(salary);
        
        t3 = new JTextField();
        t3.setBounds(25, 560, 400, 35);
        t3.setFont(new Font("Tahoma",Font.PLAIN,25));
        t3.setForeground(Color.black);
        right.add(t3);
        
        
        phone = new JLabel("PHONE");
        phone.setBounds(25, 620, 150, 30);
        phone.setFont(new Font("Sitka Text",Font.PLAIN,25));
        phone.setForeground(Color.BLACK);
        right.add(phone);
        
        t4 = new JTextField();
        t4.setBounds(25, 660, 400, 35);
        t4.setFont(new Font("Tahoma",Font.PLAIN,25));
        t4.setForeground(Color.black);
        right.add(t4);
        
        
        aadhar = new JLabel("AADHAR");
        aadhar.setBounds(25, 720, 150, 30);
        aadhar.setFont(new Font("Sitka Text",Font.PLAIN,25));
        aadhar.setForeground(Color.BLACK);
        right.add(aadhar);
        
        t5 = new JTextField();
        t5.setBounds(25, 760, 400, 35);
        t5.setFont(new Font("Tahoma",Font.PLAIN,25));
        t5.setForeground(Color.black);
        right.add(t5);
        
        email = new JLabel("E-MAIL");
        email.setBounds(25, 820, 150, 30);
        email.setFont(new Font("Sitka Text",Font.PLAIN,25));
        email.setForeground(Color.BLACK);
        right.add(email);
        
        t6 = new JTextField();
        t6.setBounds(25, 860, 400, 35);
        t6.setFont(new Font("Tahoma",Font.PLAIN,25));
        t6.setForeground(Color.black);
        right.add(t6);
        
        submit = new JButton("SUBMIT");
        submit.setFont(new Font("Sitka Text",Font.BOLD,25));
        submit.setFocusable(false);
        submit.setForeground(Color.WHITE);
        submit.setBackground(new Color(0,102,102));
        submit.addActionListener(this);
        submit.setBounds(150, 920, 200, 40);
        right.add(submit);
        
        
        setTitle("ADD EMPLOYEE DETAILS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1950, 1100);
        //setLocation(550,100);
        setLocationRelativeTo(null);
        setLayout(null);
        add(imageLabel1);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new AddEmployee();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == submit)
        {
            String name = t1.getText();
            String age = t2.getText();
            String salary = t3.getText();
            String phone = t4.getText();
            String aadhar = t5.getText();
            String email = t6.getText();
            
            String gender = null;
            if(r1.isSelected())
            {
                gender = "male";
            }
            else if(r2.isSelected())
            {
                gender = "other";
            }
            else if(r3.isSelected())
            {
                gender = "female";
            }
            
            String jobRole = (String)c1.getSelectedItem();
            
            try
            {
                Conn c = new Conn();
                String str = "INSERT INTO employee values('"+name+"','"+age+"','"+gender+"','"+jobRole+"','"+salary+"','"+phone+"','"+aadhar+"','"+email+"')";
                c.s.executeUpdate(str);
                JOptionPane.showConfirmDialog(null, "Employee Added");
                DashBoard obje = new DashBoard();
                obje.setVisible(true);
                setVisible(false);
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
            
            
            
        }
    }
}
