import java.util.*;
public class setmismatchcyclic {
    public static int[] findErrorNums(int[] nums){
        int i = 0;
        int ans[] = new int[2];
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] == nums[correct]){
                i++;
            }
            else{
                swap(nums, i, correct);
            }
        }
        for (i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }
        return ans;
    }
    public static void swap(int arr[], int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        int [] ans = findErrorNums(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }
    }
}
