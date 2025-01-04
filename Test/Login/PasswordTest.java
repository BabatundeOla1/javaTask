package Login;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class PasswordTest {

    @Test
    public void Test_That_Error_Is_Thrown_If_Password_Length_Is_LessThan_Eight(){
        Password userPassword = new Password("Olaleye");
        assertThrows(IllegalArgumentException.class, ()-> userPassword.passwordLength());
    }

    @Test
    public void Test_That_Error_Is_Thrown_If_Password_Does_Not_Contain_Numbers(){
        Password userPassword = new Password("Olaleyelei");
        assertThrows(IllegalArgumentException.class, ()-> userPassword.passwordNumber());
    }

    @Test
    public void Test_That_Error_Is_Thrown_If_Password_Does_Not_ContainCapital_Case(){
        Password userPassword = new Password("olaleyeuifd");
        assertThrows(IllegalArgumentException.class, ()-> userPassword.passwordCapitalCase());
    }

    @Test
    public void Test_That_Error_Is_Thrown_If_Password_Does_Not_Contain_lower_Case(){
        Password userPassword = new Password("OLALEYEDJGSH");
        assertThrows(IllegalArgumentException.class, ()-> userPassword.passwordLowerCase());
    }
}
