// https://leetcode.com/problems/set-mismatch/
import java.util.*;
public class setmismatch {
    // public static int[] findErrorNums(int[] nums) {
    //     // find duplicate
    //     // subratct duplicate frm sunning sum
    //     // subtract sum fromsunning sum
    //     int[] ans = new int[2];
    //     int sum = nums[0];
    //     int accsum = ((nums.length)*(nums.length+1)/2);
    //     for(int i=1; i<nums.length; i++){
    //         if(nums[i]==nums[i-1]){
    //             ans[0] = nums[i];
    //             continue;
    //         }
    //         sum += nums[i];
            
    //     }
    //     ans[1] = accsum - sum;
    //     return ans;
    // }
    public static int[] findErrorNums(int[] nums) {
        // intitialize array of length nums.length+1
        // all elements are 0
        // keep track of the frequency of the elements with the loop
        // nums[nums[i]]++
        // find the element with freqency 2
        // find the element with freqnecty 0
        int[] freq = new int[nums.length+1];
        int[] ans = new int[2];
        for (int i = 0; i < freq.length - 1; i++) {
            freq[nums[i]]++;
        }
        for (int i = 1; i < freq.length; i++) {
            if(ans[1]==0 && freq[i]==0){
                ans[1] = i;
            }
            else if(ans[0]==0 && freq[i]==2){
                ans[0] = i;
            }
            else if(ans[0]!=0 && ans[1]!=0){
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 1, 5};
        arr = findErrorNums(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}