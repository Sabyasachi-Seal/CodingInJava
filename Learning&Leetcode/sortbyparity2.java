// https://leetcode.com/problems/sort-array-by-parity-ii/
public class sortbyparity2 {
    public static int[] sortArrayByParityII(int[] nums) {
        int op = 1, ep=0;
        while(op<nums.length && ep<nums.length){
            if((nums[ep]&1)==1){
                swap(nums, op, ep);
                op+=2;
            }
            else{
                ep += 2;
            }
        }
        return nums;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr [a] = arr[b];
        arr[b] = temp;
    }
    // public static int[] sortArrayByParityII(int[] nums){
    //     int even[] = new int[nums.length/2];
    //     int ep=0;
    //     int odd[] = new int[nums.length/2];
    //     int op=0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if((nums[i]&1)==0){ 
    //             even[ep++] = nums[i];
    //         }
    //         else{
    //             odd[op++] = nums[i];
    //         }
    //     }
    //     ep=0;
    //     op=0;
    //     for (int i = 0; i < nums.length; i+=2) {
    //         nums[i] = even[ep++];
    //         nums[i+1] = odd[op++];
    //     }
    //     return nums;
    // }
    public static void main(String[] args) {
        int[] a = {4, 2, 5, 7};
        int[] ans = sortArrayByParityII(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
