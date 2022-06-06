// https://leetcode.com/problems/3sum/
import java.util.*;
public class threesum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> temp =new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        s.add(temp);
                    }
                }
            }
        }
        for(List<Integer> lst: s){
            ans.add(lst);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i).toString());
        }
    }
}
