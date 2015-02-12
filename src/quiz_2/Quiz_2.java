package quiz_2;
/**
 *
 * @author Amirkhan Mukashev
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Quiz_2 
{
        static String myUsername = "Amirkhan";
        static String myPassword = "Mukashev";
        static String newUsername;
        static String newPassword;
        
        
        
    
        Scanner keyboard = new Scanner (System.in);
    
  
    /*    
    public static String doAuthentication(String newUsername, String newPassword)
    {
        String message = "Worng username or password!";
        
        //code to check the validity of the input data
        if ((newUsername == "Amirkhan") && (newPassword == "Mukashev"))
            System.out.println("Welcome " + newUsername);
        else       
            System.out.println(message);
        return message;
    }
    */
    
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
/*
    Quiz_2 myUserName = new Quiz_2();
		myUserName.username = "Amirkhan";
		myUserName.password = "Mukashev";
		myUserName.writeOutput();

		System.out.println(scooby.name + " is a " + scooby.breed + ".");
		System.out.print("He is " + scooby.age + " years old, or ");
		int humanYears = scooby.getAgeInHumanYears();
		System.out.println(humanYears + " in human years.");

        
    }
}
*/