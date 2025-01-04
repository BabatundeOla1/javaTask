package LeetCode;

public class Solution2 {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int occurrency = 0;
        for(int letters = 0; letters < s.length(); letters++){
            for(int elements = letters+1; elements < s.length(); elements++){
                if(letters == elements){
                    occurrency++;
                }
            }
        }
        return occurrency;
    }
}

