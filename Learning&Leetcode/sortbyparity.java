import java.util.*;
// https://leetcode.com/problems/sort-array-by-parity/
public class sortbyparity {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int i, start=0, end=nums.length-1;
        for (i = 0; i < ans.length; i++) {
            if((nums[i]&1)==0){
                ans[start++] = nums[i];
            }
            else{
                ans[end--] = nums[i];
            }
        }
        return ans;
    }
}
