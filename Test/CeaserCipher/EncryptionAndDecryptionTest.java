package CeaserCipher;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class EncryptionAndDecryptionTest {

    private  EncryptionAndDecryption encrypt = new EncryptionAndDecryption();
    @Test
    public void Test_That_Message_Can_Be_Encrypted_In_UpperCase(){
        String text = "CODEDAMN";
        int number = 3;
        assertEquals("FRGHGDPQ",  encrypt.encryption(number, text));
    }

    @Test
    public void Test_That_Message_Can_Be_Encrypted_In_LowerCase(){
        String text = "codedamn";
        int number = 3;
        assertEquals("frghgdpq",  encrypt.encryption(number, text));
    }

    @Test
    public void Test_That_Ecryption_number_Can_Not_Be_Less_Than_One(){
        String text = "CODEDAMN";
        int number = 0;
        assertThrows(IllegalArgumentException.class, ()-> encrypt.encryption(number, text));
    }

    @Test
    public void Test_That_Ecryption_number_Can_Not_Be_Greater_Than_TwentySix(){
        String text = "CODEDAMN";
        int number = 27;
        assertThrows(IllegalArgumentException.class, ()-> encrypt.encryption(number, text));
    }
    @Test
    public void Test_That_Error_is_Thrown_When_Message_Is_Not_Either_CapitalLetter_not_SmallLetter(){
        String text = "CodeDamn";
        int number = 3;
        assertThrows(IllegalArgumentException.class, ()-> encrypt.encryption(number, text));
    }

    @Test
    public void Test_That_Message_Can_Be_Decrypted_In_UpperCase(){
        String text = "FRGHGDPQ";
        int number = 3;
        assertEquals("CODEDAMN",  encrypt.decryption(number, text));
    }
    @Test
    public void Test_That_Message_Can_Be_Decrypted_In_LowerCase(){
        String text = "frghgdpq";
        int number = 3;
        assertEquals("codedamn",  encrypt.decryption(number, text));
    }

    @Test
    public void Test_That_Decryption_number_Can_Not_Be_Less_Than_One(){
        String text = "CODEDAMN";
        int number = 0;
        assertThrows(IllegalArgumentException.class, ()-> encrypt.decryption(number, text));
    }

    @Test
    public void Test_That_Decryption_number_Can_Not_Be_Greater_Than_TwentySix(){
        String text = "CODEDAMN";
        int number = 27;
        assertThrows(IllegalArgumentException.class, ()-> encrypt.decryption(number, text));
    }

    @Test
    public void Test_That_Decryption_Throws_Error_When_Message_Is_Not_Either_CapitalLetter_not_SmallLetter(){
        String text = "FrghGdpq";
        int number = 3;
        assertThrows(IllegalArgumentException.class, ()-> encrypt.decryption(number, text));
    }
}
