// https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.*;
public class findallduplicates {
    // public List<Integer> findDuplicates(int[] nums) {
    //     List<Integer> ans = new ArrayList<>();   
    //     HashMap<Integer, Integer> hm = new HashMap<>();
    //     Set<Integer> temp = new HashSet<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         if(hm.get(nums[i])>1){
    //             temp.add(nums[i]);
    //         }
    //     }
    //     for(int i: temp){
    //         ans.add(i);
    //     }
    //     return ans;
    // }

    // public List<Integer> findDuplicates(int[] nums) {
    //     List<Integer> ans = new ArrayList<>();   
    //     Set<Integer> temp = new HashSet<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if(temp.contains(nums[i])){
    //             ans.add(nums[i]);
    //         }
    //         else{
    //             temp.add(nums[i]);
    //         }
    //     }
    //     return ans;
    // }

    public static List<Integer> findDuplicates(int[] nums){
        int i = 0;
        List<Integer> ans = new ArrayList<Integer>();
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
                ans.add(nums[i]);
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
        List<Integer> ans = findDuplicates(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)+" ");
        }
    }
}
