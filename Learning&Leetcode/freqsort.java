import java.util.Arrays;
import java.util.HashMap;
// https://leetcode.com/problems/sort-array-by-increasing-frequency/
public class freqsort {
    public static int[] frequencySort(int[] nums) {
        int freq[] = new int[101];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], freq[nums[i]]);
        }
        int[] ans = new int[nums.length];
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 0 ; i--) {
            int posi = hm.get(nums[i])-(freq[nums[i]]-1);
            while(ans[posi]!=0){
                posi++;
            }
            ans[posi] = nums[i];
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        arr = frequencySort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
