import java.util.*;
public class combinationsumtwo {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        // Set<List<Integer>> temp = combisum(candidates, target, 0, new HashSet<>(), new ArrayList<>());
        // List<List<Integer>> ans = new ArrayList<>();
        // for (List<Integer> list : temp) {
        //     ans.add(list);
        // } 
        // return ans;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combisum2(candidates, target, 0, ans, curr);
        return ans;
    }
    // public static Set<List<Integer>> combisum(int[] nums, int target, int i, Set<List<Integer>> ans, List<Integer> curr){

    //     if(target == 0){
    //         if(!ans.contains(curr)) ans.add(new ArrayList<>(curr));
    //         return ans;
    //     }
        
    //     if(i == nums.length) return ans;
        
    //     if(nums[i]<=target){
    //         curr.add(nums[i]);
    //         combisum(nums, target-nums[i], i+1, ans, curr);
    //         curr.remove(curr.size()-1);
    //     }
    //     combisum(nums, target, i+1, ans, curr);
    //     return ans;
    // }

    public static void combisum2(int[] nums, int target, int start, List<List<Integer>> ans, List<Integer> curr){
        if(target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if(target<nums[i]) break;
            if(i> start && nums[i] == nums[i-1]) continue;

            curr.add(nums[i]);
            combisum2(nums, target-nums[i], i+1, ans, curr);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> ans = combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
