// https://leetcode.com/problems/3sum/
import java.util.*;
public class threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if(nums[i]+nums[j]+nums[k] == 0 && i!=j && j!=k && k!=i){
                        List <Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        ans.add(temp);
                    }
                }
            }
        }
        return ans;
    }
}
