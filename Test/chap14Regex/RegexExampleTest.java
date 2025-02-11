package chap14Regex;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegexExampleTest {

    @Test
    public void isPhoneNumberValidTest(){
       String phoneNumber = "09036011444";
       assertTrue(RegexExample.validatePhoneNumber(phoneNumber));
    }

    @Test
    public void validateFirstThreeDigitOfPhoneNumber(){
        String phoneNumber = "08136011444";
        assertTrue(RegexExample.validateFirstThreeDigit(phoneNumber));
    }
    @Test
    public void validateFirstThreeDigitOfPhoneNumberCanBe(){
        String phoneNumber = "+23471360114.4";
        assertTrue(RegexExample.validateFirstThreeDigit(phoneNumber));
    }

//    @Test
//    public void testThatPhoneNumberCanBeInUniqueFormat(){
//        String phoneNumber = "090-360-11444";
//        assertTrue(RegexExample.validatePhoneNumber(phoneNumber));
//    }

}