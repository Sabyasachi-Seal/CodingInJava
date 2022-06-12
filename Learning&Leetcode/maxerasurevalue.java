import java.util.HashSet;
import java.util.*;
// https://leetcode.com/problems/maximum-erasure-value/
public class maxerasurevalue {  
    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int max = 0;
        int sum = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     s.clear();
        //     sum  = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         if(s.contains(nums[j])){
        //             s.add(nums[j]);
        //             sum += nums[j];
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //     max = Math.max(max, sum);
        // }
        // return max;
        int left = 0;
        int right = 0;
        while(right<nums.length){
            if(s.contains(nums[right])){
                s.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            else{
                s.add(nums[right]);
                sum += nums[right];
                right++;
                max = Math.max(sum, max);
            }
        }
        return max;
    }   
    public static void main(String[] args) {
        int a[] = {4, 2,4, 5, 6};
        // int a[] = {1000, 1, 1000, 1,1,1,1};
        System.out.println(maximumUniqueSubarray(a));
    }
}
