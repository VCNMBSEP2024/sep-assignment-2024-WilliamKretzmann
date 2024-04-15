package com.mycompany.registration;

public class Password {

     public static boolean ValidPassword(String password) {
        // Checks that password is atleast 8 characters in length.
       
        
        //Checks that the password is of atleast 8 characters in length
        if (password.length() < 8) {
            return false;
        }

        // Checks if password contains atleast one number.
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Checks if password contains atleast one capital letter.
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Checks if password contains atleast one special character.
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            return false;
        }

        return true;
         }
         
    }  

