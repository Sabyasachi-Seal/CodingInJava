// https://leetcode.com/problems/single-element-in-a-sorted-array/
public class singleelement {
    // public int singleNonDuplicate(int[] nums) {
    //     int size = 2;

    // }
    // public static int binary(int []arr, int start, int end, int target){
    //     int mid;
    //     while(start<=end){
    //         mid = start + (end - start)/2;
    //         if(arr[mid]==target){
    //             return mid;
    //         }
    //         else if(arr[mid]<target){
    //             start = mid +1;
    //         }
    //         else{
    //             end = mid -1;
    //         }
    //     }
    //     return -1;
    // }
    public int singleNonDuplicate(int[] nums){
        int i = 0;
        for (i = 0; i<nums.length-1 && nums[i] == nums[i+1]; i++) {
            i++;
        }
        return nums[i];
    }
}
