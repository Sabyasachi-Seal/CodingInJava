import java.util.*;
// https://leetcode.com/problems/sort-array-by-parity/
public class sortbyparity {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int i, ap=0;
        for (i = 0; i < ans.length; i++) {
            if((nums[i]&1)==0){
                ans[ap++] = nums[i];
            }
        }
        for(i=0;i<ans.length; i++){
            if((nums[i]&1)==1){
                ans[ap++] = nums[i];
            }
        }
        return ans;
    }
}
