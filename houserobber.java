import java.util.Arrays;
// https://leetcode.com/problems/house-robber/
public class houserobber {
    // public int rob(int[] nums) {
    //     int odd =0, even =0;
    //     for (i = 0; i < nums.length; i+=2) {
    //         even+=nums[i];
    //     }
    //     for (i =1 ; i<nums.length; i+=2) {
    //         odd += nums[i];
    //     }
    //     return (odd>even)?odd:even;
    // } 
    // public int rob(int[] nums){
    //     return rob(nums, nums.length-1);
    // }
    // private int rob(int[] nums, int i){
    //     if(i<0) return 0;
    //     return Math.max(nums[i] + rob(nums, i-2), rob(nums, i-1));
    // }
    // public int rob(int[] nums){
    //     int[] temp = new int[nums.length];
    //     Arrays.fill(temp, -1);
    //     return rob(nums, temp, nums.length-1);
    // }
    // private int rob(int[] nums, int[] temp, int i){
    //     if(i<0) return 0;
    //     if(temp[i] >= 0) return temp[i];
    //     int result =  Math.max(nums[i] + rob(nums, temp, i-2), rob(nums, temp, i-1));
    //     temp[i] = result;
    //     return result;
    // }
    // public int rob(int[] nums){
    //     if(nums.length==0) return 0;
    //     int[] temp = new int[nums.length+1];
    //     temp[0] = 0;
    //     temp[1] = nums[0];
    //     for (int i = 0; i < nums.length; i++) {
    //         temp[i+1] = Math.max(temp[i], temp[i+1]+nums[i]);
    //     }
    //     return temp[nums.length];
    // }
    public int rob(int[] nums){
        if(nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for(int num: nums){
            int temp = prev1;
            prev1 = Math.max(prev2+num, prev1);
            prev2 = temp;
        }
        return prev1;
    }
}
