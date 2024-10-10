public class StringPalindrome12{
    public static void main(String[] args) {
        String[] words = {"m", "a", "d", "a", "m"};
        boolean check = getPalindrome(words);
        
        if (check) 
            System.out.print("It is a palindrome");
        else 
            System.out.print("It is not a palindrome");
    }



    public static boolean getPalindrome(String[] letters) {
        int start = 0;
        int end = letters.length - 1;
        
        while (start < end) {
            if (!letters[start].equals(letters[end])) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
