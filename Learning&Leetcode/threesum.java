// https://leetcode.com/problems/3sum/
import java.util.*;
public class threesum {
    // public static List<List<Integer>> threeSum(int[] nums) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     Set<List<Integer>> s = new HashSet<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i+1; j < nums.length; j++) {
    //             for (int k = j+1; k < nums.length; k++) {
    //                 if(nums[i]+nums[j]+nums[k] == 0){
    //                     List<Integer> temp =new ArrayList<Integer>();
    //                     temp.add(nums[i]);
    //                     temp.add(nums[j]);
    //                     temp.add(nums[k]);
    //                     Collections.sort(temp);
    //                     s.add(temp);
    //                 }
    //             }
    //         }
    //     }
    //     for(List<Integer> lst: s){
    //         ans.add(lst);
    //     }
    //     return ans;
    // }
    // public static List<List<Integer>> threeSum(int[] nums) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     Set<List<Integer>> s = new HashSet<>();
    //     HashMap<Integer, Integer> hm = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         hm.put(nums[i], hm.get(nums[i])-1);
    //         for (int j = i+1; j < nums.length; j++) {
    //             hm.put(nums[j], hm.get(nums[j])-1);
    //             if(hm.containsKey(-(nums[i]+nums[j])) && hm.get(-(nums[i]+nums[j]))>0){
    //                 List<Integer> temp =new ArrayList<Integer>();
    //                     temp.add(nums[i]);
    //                     temp.add(nums[j]);
    //                     temp.add(-(nums[i]+nums[j]));
    //                     Collections.sort(temp);
    //                     s.add(temp);
    //             }
    //             hm.put(nums[j], hm.get(nums[j])+1);
    //         }
    //         hm.put(nums[i], hm.get(nums[i])+1);
    //     }
    //     for(List<Integer> lst: s){
    //         ans.add(lst);
    //     }
    //     return ans;
    // }
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int high = nums.length-1;
                int low = i+1;
                int sum = 0 - nums[i];
                while(low<high){
                    if(sum == nums[low]+nums[high]){
                        ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low<high && (nums[low] == nums[low+1])) low++;
                        while(low<high && (nums[high] == nums[high-1])) high--;
                        low++; high--;
                    }
                    else if(sum > nums[low]+nums[high]){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
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
