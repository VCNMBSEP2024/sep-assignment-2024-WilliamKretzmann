//Package shows that is comes from Registration
package com.mycompany.registration;
//Seperate class for login to reference in Registration class
public class Login {
    
    public static boolean CheckUsername(String username){
        //Sets the rules for Username, 5 characters or less and must contain an underscore
        if(username.length() <=5 && username.contains("_") ){
            //If statement will tell the user, their username has been successfully created if the criteria is met(_)(5 Characters)
            System.out.println("Username created successfully");
            return true;
        //Else statement prints statement that the user has not formatted the username correctly and should try again
        }else{
            System.out.println("Username not formatted correctly, please try again");
            return false;
        }
    }
        public static boolean LoginUser(String inputUsername, String Username, String inputPassword, String password, String Name, String Surname){
            if (inputUsername.equals(Username) && inputPassword.equals(password)) {
            System.out.println("\nLogin successful! Welcome, " + Name + " " + Surname + "!");
        } else {
            System.out.println("\nLogin failed. Incorrect username or password.");
        }
return false;
    }
        }
    
/*
    public Boolean ValidPassword(String chsecke99) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Boolean ValidPassword(String chsecke99) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Boolean ValidPassword(String chsecke99) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   }
*/
