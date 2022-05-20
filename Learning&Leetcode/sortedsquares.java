import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class sortedsquares {
    // public int[] sortedSquares(int[] nums) {
    //     for (int i = 0; i < nums.length; i++) {
    //         nums[i] = nums[i]*nums[i];
    //     }
    //     Arrays.sort(nums);
    //     return nums;
    // }
    public int[] sortedSquares(int[] nums){
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for (int i = ans.length-1; i >= 0; i--) {
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                ans[i] = nums[left] * nums[left];
                left++;
            }
            else{
                ans[i] = nums[right] * nums[right];
                right--;
            }
        }
        return ans;
    }
}
