// import java.util.*;
public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ori = nums.clone();
        quicksort(nums, 0, nums.length-1);
        int[] ans = new int[2]; 
        for(int i=0; i<ori.length; i++){
            if(binarysearch(nums, i+1, ori.length-1, target-ori[i])>-1){
                ans[0] = i;
                ans[1] = linearsearch(ori, i+1, target-ori[i]);
            }
        }
        return ans;
    }
    public static int linearsearch(int[]arr, int start, int target){
        for(int n=start; n<arr.length; n++){
            if(arr[n] == target){
                return n;
            }
        }
        return -1;
    }
    public static int binarysearch(int[]arr, int start, int end,  int target){
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;
        for (int j = low; j <= high-1; j++) {
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }
    public static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    // public static int[] twoSum(int[] nums, int target) {
    //     int ans[] = new int[2];
    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i; j<nums.length; j++){
    //             if(nums[i]+nums[j]==target){
    //                 ans[0] = i;
    //                 ans[1] = j;
    //                 return ans;
    //             }
    //         }
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4,-5};
        int target = -8;
        int a[] = twoSum(arr, target);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
