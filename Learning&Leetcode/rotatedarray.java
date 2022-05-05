import javax.swing.BoundedRangeModel;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class rotatedarray {
    public static int search(int[] nums, int target) {
        int pivot = pivotfinder(nums);
        if(pivot==-1){
            return binarysearch(nums, 0, nums.length-1, target);
        }
        else if(nums[pivot]==target){
            return pivot;
        }
        else if(target>=nums[0]){
            return binarysearch(nums, 0, pivot-1, target);
        }
        else{
            return binarysearch(nums, pivot+1, nums.length-1, target);
        }
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
        return -1;
    }
    public static int pivotfinder(int[] arr) {
        int start=0, end = arr.length-1, mid =0;
        while(start<=end){
            mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start &&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,0,1,2,4};
        System.out.println(search(arr, 0));
    }
}
