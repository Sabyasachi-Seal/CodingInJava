import java.util.Arrays;

// https://leetcode.com/problems/max-number-of-k-sum-pairs/
public class maxksum {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        // for (int i = count; i < nums.length; i++) {
        //     // int target = binarysearch(nums, 0, nums.length-1, k-nums[i]);
        //     // if(target>=0 && target!=i){
        //     //     count++;
        //     // }
        //     for (int j = nums.length-1; j>i; j--) {
        //         if(nums[j] > 0 && nums[j]==(k-nums[i])){
        //             nums[j] = -1;
        //             nums[i] = -1;
        //             i++;
        //             count++;
        //             break;
        //         }
        //     }
        // }
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            if(nums[i]+nums[j] == k){
                i++;
                j--;
                count++;
            }
            else if(nums[i]+nums[j] < k){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
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
        return start;
    }
    public static void main(String[] args) {
        int arr[] = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        // int arr[] = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        // int arr[] = {3, 4, 1, 3, 3};
        System.out.println(maxOperations(arr, 6));
    }
}
