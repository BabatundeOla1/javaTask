package chap14Regex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
//        String text = "Today is Wednesday";
//        String pattern = "";
//        String [] tokens = text.split(pattern);
//        System.out.println(Arrays.toString(tokens));
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{11}");
    }

    public static boolean validateFirstThreeDigit(String phoneNumber){
        return phoneNumber.matches("^[0][789][01]\\d{8}$") || phoneNumber.matches("^[+]234[789][01]\\d{8}$");
    }
}
