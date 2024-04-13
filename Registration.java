package com.mycompany.registration;
//ValidPassword import used for if/else statement
import static com.mycompany.registration.Password.ValidPassword;
import java.util.Scanner; //Java scanner import used for Scanner(System.in)

public class Registration {

    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        //Contains all string values
        Login login = new Login ();
        Scanner in = new Scanner(System.in);
        String Name;
        String Surname;
        String Username; //Used to reference username
        String Password;
        //Prompts user to enter their name
        System.out.println("Please enter First name: ");
        Name = in.nextLine();
        //Prompts user to enter their surname
        System.out.println("\nPlease enter Surname: ");
        Surname = in.nextLine();
        //Prompts user to enter their username
        System.out.println("\nPlease enter a username (username must contain an underscore and should be less than 5 characters) ");
        Username = in.nextLine();
       
                  
        //Prompts user to create a password that meets a set of rules
         Scanner scanner = new Scanner(System.in);
         boolean LoginPass = false;
         while (!LoginPass){
             //Prompts user to enter a password with a certain set of rules. (8 Characters, a number, special character and a capital letter)
        System.out.println("Enter a password with at least 8 characters, including a number, a capital letter, and a special character:");
       
        String password = scanner.nextLine();
        System.out.println("\nPlease log in to your account.");
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();
        
        
        
        
        //IF/Else statement tells user if password is valid, if invalid user is prompted to re-enter the passowrd
        if (ValidPassword(password)) {
            System.out.println("Password is valid!");
            LoginPass = true;
            //If user fails to enetr within correct parameters else statemnt will prompt them to re-enter a password
        } else {
            System.out.println("Password is not valid. Please make sure it has at least 8 characters, including a number, a capital letter, and a special character.");
        //While command allows user to re-enter the password if they enter it incorrectly
        while(Login.CheckUsername(Username) == false) {
            Username = in.nextLine();
             
     if (inputUsername.equals(Username) && inputPassword.equals(password)) {
            System.out.println("\nLogin successful! Welcome, " + Name + " " + Surname + "!");
        } else {
            System.out.println("\nLogin failed. Incorrect username or password.");
        }
    }
}
}
    }
    }