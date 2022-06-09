// https://leetcode.com/problems/3sum/
import java.lang.reflect.Array;
import java.util.*;
public class threesumprac {
    // public List<List<Integer>> threeSum(int[] nums) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     Set<List<Integer>> temp = new HashSet<>();
    //     Arrays.sort(nums);
    //     for (int i = 0; i < nums.length-2; i++) {
    //         int a = i+1;
    //         int b = nums.length-1;
    //         while(a<b){
    //             int currsum = nums[i] + nums[a] + nums[b] ;
    //             if(currsum== 0){
    //                 List<Integer> t = new ArrayList<>();
    //                 t.add(nums[i]);
    //                 t.add(nums[a]);
    //                 t.add(nums[b]);
    //                 Collections.sort(t);
    //                 temp.add(t);
    //                 a++;
    //                 b--;
    //             }
    //             else if(currsum<0){
    //                 a++;
    //             }
    //             else{
    //                 b--;
    //             }
    //         }
    //     }
    //     for( List<Integer> i: temp){
    //         ans.add(i);
    //     }
    //     return ans;
    // }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int a = i+1;
            int b = nums.length-1;
            while(i<nums.length-2 && nums[i]==nums[i+1]) i++;
            while(a<b){
                int currsum = nums[i] + nums[a] + nums[b] ;
                if(currsum== 0){
                    List<Integer> t = new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[a]);
                    t.add(nums[b]);
                    ans.add(t);
                    while(a<b && nums[a]==nums[a+1]) a++;
                    while(a<b && nums[b]==nums[b-1]) b--;
                    a++;
                    b--;
                }
                else if(currsum<0){
                    a++;
                }
                else{
                    b--;
                }
            }
        }
        return ans;
    }
}
