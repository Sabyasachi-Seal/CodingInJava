import java.util.Arrays;
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class specialarray {
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums.length-i <= nums[i] && (i==0 || nums.length-i>nums[i-1])){
                return nums.length-i;
            }
        }
        return -1;
    }
    // public static int binarysearch(int[] arr, int start, int end, int target){
    //     int mid;
    //     while(start<=end){
    //         mid  = start + (end - start)/2;
    //         if(arr[mid]==target){
    //             return mid;
    //         }
    //         else if(arr[mid]<target){
    //             start = mid+1;
    //         }
    //         else{
    //             end = mid -1;
    //         }
    //     }
    //     return start;
    // }
    public static void main(String[] args) {
        int arr[] = {3, 5};
        System.out.println(specialArray(arr));
    }
}
