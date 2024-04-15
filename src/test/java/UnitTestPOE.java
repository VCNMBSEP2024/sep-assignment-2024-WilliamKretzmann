import com.mycompany.registration.Login;
import com.mycompany.registration.Password;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTestPOE {
    
    public UnitTestPOE() {
        }
    Login  Login = new Login ();
    
     @Test
    void TestOneUserName()
    {
        Boolean strExpected = true;
        Boolean strActual  =   Login.CheckUsername("W_K");
        
        Assertions.assertEquals(strExpected, strActual); 
        
    }
    
    void TestTwoUserName()
    {
        Boolean strExpected = false;
        Boolean strActual  =   Login.CheckUsername("WK!!!!!");
        
        Assertions.assertEquals(strExpected, strActual, "Username not  formateed correctly, Please make  sure you're contains an underscore and is not more than 5 charcacters long");
        
    }
    @Test
    void TestThreePassword()    
    {
        
        Password pass = new Password();
        Boolean strExpected = true;
        Boolean strActual  =   pass.ValidPassword("Connorwilliam1!");
        
        Assertions.assertEquals(strExpected, strActual);
        
    }
    
     @Test
    void TestFourPassword()
    {
        Password pass = new Password();
        Boolean strExpected = true;
        Boolean strActual  =   pass.ValidPassword("Connorwilliam1!");
        
        Assertions.assertEquals(strExpected, strActual);
        
    }
    
    @Test 
    void TestUserNameIfTrue(){
         Assertions.assertTrue(Login.CheckUsername("W_K"));
    }
    
     @Test
    void TestUserNameIfFalse(){
        Assertions.assertFalse(Login.CheckUsername("WK!!!!!"));
    }
    
     @Test 
    void TestPasswordIfTrue(){
        Password pass = new Password();
        Assertions.assertTrue(Password.ValidPassword("Connorwilliam1!"));
    }
    
     @Test 
    void TestPasswordIfFalse(){
        Password pass = new Password();
        Assertions.assertFalse(Password.ValidPassword("password"));
    }
    
     @Test 
    void TestLoginIfTrue(){
       Assertions.assertFalse(Login.LoginUser("W_K","W_K", "Connorwilliam1!", "Connorwilliam1!", "Willaim", "Kretzmann"));
    }
    
    }
