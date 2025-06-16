
package hotel.management.system;
import javax.swing.*;
import javax.swing.JButton;
//import java.awt.Image;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HotelManagementSystem extends JFrame implements ActionListener{

    JButton button;
    HotelManagementSystem()
    {
        
        
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i1 = image.getImage().getScaledInstance(1400, 800,Image.SCALE_DEFAULT);
        ImageIcon image2 = new ImageIcon(i1);
        JLabel setImage = new JLabel(image2);
        setImage.setBounds(0, 0, 1400, 800);
        add(setImage);
        
        button = new JButton("NEXT");
        button.setFont(new Font("sarif",Font.BOLD,30));
        button.setBackground(Color.WHITE);
        button.setFocusable(false);
        button.setBounds(1120,700,250,55);
        button.addActionListener(this);
        
        JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM...");
        text.setForeground(Color.white);
        text.setFont(new Font("sarif",Font.BOLD,50));

        text.setBounds(0, 700, 1000, 60);
        
      
        
        
        setTitle("WELCOME TO HOTEL MANAGEMENT SYSTEM :)");
        setImage.add(text);
        setImage.add(button);
        setResizable(false);

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,150,1400,800);
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
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
          if(e.getSource() == button)
          {
               new Login().setVisible(true);
                this.setVisible(false);
          }
    }
    public static void main(String[] args) {
       HotelManagementSystem obh =  new HotelManagementSystem();
       obh.setVisible(true);
    }

    
    
}
