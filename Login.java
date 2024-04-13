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
   }

