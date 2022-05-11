

import java.util.Arrays;

public class duplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            // if(binarysearch(nums, i+1, nums.length, nums[i])) return true;
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }
    public static boolean binarysearch(int[] arr, int start, int end, int target){
        int mid;
        while(start<=end){
            mid = start +(end-start)/2;
            if(arr[mid] ==  target){
                return true;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}
