// https://leetcode.com/problems/kth-largest-element-in-an-array/
import java.util.*;
public class kthmax {
    public int findKthLargest(int[] nums, int k) {
        // ArrayList<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(nums);
        // ans.add(nums[0]);
        // for (int i = 1; i < nums.length; i++) {
        //     if(nums[i]!=nums[i-1]) ans.add(nums[i]);
        // }
        return nums[nums.length-k];
    }
}
