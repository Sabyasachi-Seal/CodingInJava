import java.util.*;
public class combinationsum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combi(candidates, 0, target, new ArrayList<>(), new ArrayList<>());
    }
    public static List<List<Integer>> combi(int[] nums, int i, int target, List<List<Integer>> ans, List<Integer> curr){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return ans;
        }
        if (i == nums.length) return ans;

        if(nums[i] <= target){
            curr.add(nums[i]);
            combi(nums, i, target-nums[i], ans, curr);
            curr.remove(curr.size()-1);
        }
        combi(nums, i+1, target, ans, curr);
        return ans;
    }
    public static void main(String[] args) {
        List<List<Integer>> ans = combinationSum(new int[]{2, 3, 7}, 7);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
