import java.util.*;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class smallerthancurrent2 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy = new int[nums.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = linear(copy, nums[i]);
        }
        return nums;
    }
    public static int linear(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]) return i+1;
        }
        return -1;
    }
}
