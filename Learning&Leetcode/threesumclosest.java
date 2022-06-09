import java.util.*;

import javax.swing.text.html.parser.TagElement;
// https://leetcode.com/problems/3sum-closest/
public class threesumclosest {
    // public int threeSumClosest(int[] nums, int target) {
    //     int closest = nums[0] + nums[1] + nums[2];
    //     int minclose = closest;
    //     int minsum = closest;
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i+1; j < nums.length; j++) {
    //             for (int k = j+1; k < nums.length; k++) {
    //                 if(nums[i]+nums[j]+nums[k] == target){
    //                     return target;
    //                 }
    //                 else{
    //                     closest = Math.abs(target - (nums[i]+nums[j]+nums[k]));
    //                     if(closest<minclose){
    //                         minclose = closest;
    //                         minsum = nums[i]+nums[j]+nums[k];
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return minsum;
    // }
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length-2; i++) {
            int a = i+1;
            int b = nums.length-1;
            while(a<b){
                int currsum = nums[i] + nums[a] + nums[b];
                if(currsum>target){
                    b--;
                }
                else if(currsum<target){
                    a++;
                }
                else{
                    return target;
                }
                if(Math.abs(currsum-target)<Math.abs(ans-target)){
                    ans = currsum;
                }
            }
        }
        return ans;
    }
}
