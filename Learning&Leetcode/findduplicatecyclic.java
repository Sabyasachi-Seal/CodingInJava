import java.util.*;
public class findduplicatecyclic {
    // public int findDuplicate(int[] nums) {
    //     Set<Integer> ans = new HashSet<Integer>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if(ans.contains(nums[i])) return nums[i];
    //         ans.add(nums[i]);
    //     }
    //     return -1;
    // }  

    // public int findDuplicate(int[] nums) {
    //     HashMap<Integer, Integer> ans = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if(ans.containsKey(nums[i])) return nums[i];
    //         ans.put(nums[i], i);
    //     }
    //     return -1;
    // }  

    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i] != i+1){
                int correct = nums[i] - 1;
                if(nums[i] == nums[correct]){
                    return nums[i];
                }
                else{
                    swap(nums, i, correct);
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    public static void swap(int arr[], int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
}
