import java.io.LineNumberInputStream;
import java.util.Arrays;

// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class specialarray {
    public int specialArray(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int ind = 0;
        for (int i = 1; i < nums[nums.length-1]; i++) {
            if(i<nums[i]){
                if(i == nums.length-i);
            }
            // ind = binarysearch(nums, i+1, nums.length-1, i);
            // int temp = ind;
            // while(ind<nums.length && nums[ind] >= i){
            //     ind++;
            //     count++;
            // }
            // if(count == temp){
            //     return count;
            // }
            // else{
            //     count = 0;
            // }
        }
        return ind;
    }
    public static int binarysearch(int[] arr, int start, int end, int target){
        int mid;
        while(start<=end){
            mid  = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return end;
    }
}
