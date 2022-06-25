import java.util.Arrays;

// https://leetcode.com/problems/non-decreasing-array/
class nondecreasingarray {
    public static boolean checkPossibility(int[] nums) {
        boolean tolerate = false;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] <= nums[i+1]) continue;
            if(tolerate) return false;
            if (i==0 || nums[i+1] >= nums[i-1]) nums[i] = nums[i+1];
            else nums[i+1] = nums[i];
            tolerate = true;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPossibility(new int[]{3, 2, 3}));
    }
}