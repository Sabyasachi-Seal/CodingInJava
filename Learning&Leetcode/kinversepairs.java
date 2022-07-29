// https://leetcode.com/problems/k-inverse-pairs-array/
import java.util.*;
public class kinversepairs {
    public static int kInversePairs(int n, int k) {
        int nums[] = new int[n];
        boolean taken[] = new boolean[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }
        int ans = permus(nums, taken, new ArrayList<>(), k, 0);
        return ans;
    }
    public static int permus(int nums[], boolean taken[], List<Integer> curr, int k, int ans){
        if(curr.size() == nums.length){
            System.out.println(curr);
            if(k == kpair(curr)) ans++;
            return ans;
        }
        for (int i = 0; i < taken.length; i++) {
            if(!taken[i]){
                curr.add(nums[i]);
                taken[i] = true;
                ans = permus(nums, taken, curr, k, ans);
                taken[i] = false;
                curr.remove(curr.size()-1);
            }
        }
        return ans;
    }
    public static int kpair(List<Integer> nums){
        int ans = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                if(i<j && nums.get(i) > nums.get(j)){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(kInversePairs(3, 1));
    }
}
