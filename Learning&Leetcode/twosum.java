import java.util.*;
public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int[] copy = new int[nums.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = nums[i];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(search(nums, 0, nums.length-1, target-copy[i])){
                int s = linear(copy, target-copy[i]);
                if(s!=i) return new int[] {i, s};
            }
        }
        return new int[] {-1, -1};
    }
    public static int linear(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search) return i;
        }
        return 0;
    }
    public static boolean search(int[] nums, int start, int end, int target) {
        int mid=0;
        while(start<=end){
            mid = start + (end - start)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]<target){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {-3, -2, -4};
        int target = -6;
        int a[] = twoSum(arr, target);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
