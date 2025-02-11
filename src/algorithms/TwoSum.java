package algorithms;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int [] nums1 = {3,2,4};
        int [] nums2 = {3,3};
        int target = 9;
        int target1 = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target1)));
    }

    public static int[] twoSum(int[] input, int target){
        int [] newAnswer = new int[2];
       for (int count = 0; count < input.length; count++){
           for (int counter = count + 1; counter < input.length; counter++){
               if(input[count] + input[counter] == target){
                   newAnswer[0] = count;
                   newAnswer[1] = counter;
                }
           }
       }
       return newAnswer;
    }
}
