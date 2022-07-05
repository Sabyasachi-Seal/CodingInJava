import java.util.*;
class sumofxor {
    public static int subsetXORSum(int[] nums) {
        List<List<Integer>> subsets = subsetter(nums);
        int ans = 0;
        for (int i = 0; i < subsets.size(); i++) {
            int curr = 0;
            for (int j = 0; j < subsets.get(i).size(); j++) {
                curr ^= subsets.get(i).get(j);
            }
            ans += curr;
        }
        return ans;
    }
    public static List<List<Integer>> subsetter(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < (1<<nums.length); i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if((i & (1<<j))>0){
                    temp.add(nums[j]);
                }
            }
            ans.add(temp);
        }
        return ans;
    } 
}