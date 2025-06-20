
package hotel.management.system;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DashBoard extends JFrame 
{
    JLabel imageLabel1,AirlineManagementSystem;
    JMenuItem FlightDetailshello1,flightDetails,FlightDetailshello2;
    JMenuBar menuBar;
    JMenu AirlineSystem, AirlineSystemHello;
    
    
    DashBoard()
    {
       setTitle("HOTEL MANAGEMENT SYSTEM");
    setLayout(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1950, 1100);

    ImageIcon backGround = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
    Image i1 = backGround.getImage().getScaledInstance(1950, 1100, Image.SCALE_DEFAULT);
    ImageIcon backGround2 = new ImageIcon(i1);
    imageLabel1 = new JLabel(backGround2);
    imageLabel1.setBounds(0, 0, 1950, 1100);

  
    AirlineManagementSystem = new JLabel("THE METROPOLE GROUP WELCOME YOU :)");
    AirlineManagementSystem.setForeground(Color.white);
    AirlineManagementSystem.setFont(new Font("Serif", Font.PLAIN, 50));
    AirlineManagementSystem.setBounds(500, 500, 1100, 85);
    imageLabel1.add(AirlineManagementSystem);

    
    menuBar = new JMenuBar();
    
    setJMenuBar(menuBar);
    
    AirlineSystem = new JMenu("HOTEL MANAGEMENT");
    AirlineSystem.setForeground(Color.BLUE);
    menuBar.add(AirlineSystem);
    
    flightDetails = new JMenuItem("RECEPTION");
    
    flightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
	});
        
    AirlineSystem.add(flightDetails);
    
    AirlineSystemHello = new JMenu("ADMIN");
    AirlineSystemHello.setForeground(Color.RED);
    menuBar.add(AirlineSystemHello);
        
    FlightDetailshello1 = new JMenuItem("ADD EMPLOYEE");
    AirlineSystemHello.add(FlightDetailshello1);
       
    FlightDetailshello1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            try
            {
                new AddEmployee().setVisible(true);
            }catch(Exception e){}
        }
    
    });
    
    FlightDetailshello2 = new JMenuItem("ADD ROOMS");
    AirlineSystemHello.add(FlightDetailshello2);
    
        FlightDetailshello2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
      JMenuItem FlightDetailshello3 = new JMenuItem("ADD DRIVERS");
	AirlineSystemHello.add(FlightDetailshello3);
        
	FlightDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
    
    
    add(imageLabel1);

    setVisible(true);
    }
    public static void main(String[] args)
    {
        new DashBoard();
    }

    
    
}
