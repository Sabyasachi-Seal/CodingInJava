import java.util.*;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class smallerthancurrent2 {
    // public static int[] smallerNumbersThanCurrent(int[] nums) {
    //     int[] copy = new int[nums.length];
    //     for (int i = 0; i < copy.length; i++) {
    //         copy[i] = nums[i];
    //     }
    //     Arrays.sort(copy);
    //     for (int i = 0; i < nums.length; i++) {
    //         nums[i] = linear(copy, nums[i]);
    //     }
    //     return nums;
    // }
    // public static int linear(int[] arr, int target){
    //     for (int i = 0; i < arr.length; i++) {
    //         if(target==arr[i]) return i+1;
    //     }
    //     return -1;
    // }
    // public static int[] smallerNumbersThanCurrent(int[] nums){
    //     HashMap<Integer, Integer> hm = new HashMap<>();
    //     int[] copy = nums.clone();
    //     int i;
    //     Arrays.sort(copy);
    //     for (i = 0; i < nums.length; i++) {
    //         hm.putIfAbsent(copy[i], i);
    //     }
    //     for (i = 0; i < copy.length; i++) {
    //         copy[i] = hm.get(nums[i]);
    //     }
    //     return copy;
    // }
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int count[] = new int[101];
        int res[] = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 1; i < 101; i++) {
            count[i] = count[i] + count[i-1];
        }
        for (int i = 0; i < res.length; i++) {
            if(nums[i] == 0){
                res[i] = 0;
            }
            else{
                res[i] = count[nums[i] - 1];
            }
        }
        return res;
    }
}
