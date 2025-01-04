package LeetCode;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
            int[] numbers = {3,3};
            int target = 6;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int index = 0; index < nums.length; index++){
            for(int number = index + 1; number < nums.length; number++) {
                if (nums[index] + nums[number] == target) {
                    output[0] = index;
                    output[1] = number;
                }
            }
        }
        return output;
    }


}
