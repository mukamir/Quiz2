package quiz_2;

/**
 *
 * @author Amirkhan Mukashev
 */
import javax.swing.JOptionPane;
public class jOptionPane 
{
    static String myUsername = "Amirkhan";
    static String myPassword = "Mukashev";
    static String newUsername;
    static String newPassword;
    
    public static void main(String[]args)
    {
    
    newUsername = JOptionPane.showInputDialog("Your Username: ");
    newPassword = JOptionPane.showInputDialog("Your Password: ");
    if (Quiz_2.doAuthentication(myUsername, myPassword))
    {
        JOptionPane.showMessageDialog(null, "Welcome " + myUsername);
    }
    else JOptionPane.showMessageDialog(null, "Wrong Username or Password!");
    
    
    
    
    
    }
}
