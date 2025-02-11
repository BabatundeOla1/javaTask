package algorithms;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeInAListTest {

    @Test
    public void testThatFindPalindromeReturnPalindromeString(){
        String[] words = {"radar", "level", "pilot", "madam"};
        assertEquals(new String[]{"radar", "level", "madam"}, PalindromeInAList.findPalindrome(words));
    }

}