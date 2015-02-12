package quiz_2;
/**
 *
 * @author Amirkhan Mukashev
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Quiz_2 

{
	//declaring variables
        static String myUsername = "Amirkhan";
        static String myPassword = "Mukashev";
        static String newUsername;
        static String newPassword;
        
        
        
    
        Scanner keyboard = new Scanner (System.in);
    
  
   
    // authenticaiting method itself
    public static boolean doAuthentication (String newUsername, String newPassword)
    {
    String myUsername = "Amirkhan", myPassword = "Mukashev";
    boolean finalValue = false;
    if(myUsername.equalsIgnoreCase(newUsername)){
        if(myPassword.equals(newPassword))
    
    System.out.println ("Welcome " + newUsername );
    finalValue = true;
    }
    else 
        System.out.println ("Wrong password or username!");
    
    finalValue = false;
    
    return finalValue;
    }
        
        
    
    
    //main method 
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Your Username: ");
        newUsername = keyboard.nextLine ();
        
        System.out.println ("Your Password: ");
        newPassword = keyboard.nextLine ();
        
        //call authentication method here
        doAuthentication (newUsername, newPassword);
                
    }
        
      


}
