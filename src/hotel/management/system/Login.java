
package hotel.management.system;

import javax.swing.JFrame;


public class Login extends JFrame
{
    

    Login() 
    {
        setBounds(150,150,800,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
       Login obj =  new Login();
       obj.setVisible(true);
    }
    
}
