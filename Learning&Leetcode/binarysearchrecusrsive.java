public class binarysearchrecusrsive {
    public static int search(int[] nums, int target) {
        return binary(nums, 0, nums.length-1, target);
    }
    public static int binary(int[] nums, int start, int end, int target){
        if(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid]>target) return binary(nums, start, mid-1, target);
            else return binary(nums, mid+1, end, target);
        }
        return -1;
    }
}
