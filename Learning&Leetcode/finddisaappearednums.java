// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.*;
public class finddisaappearednums {
    // public static List<Integer> findDisappearedNumbers(int[] nums) {
    //     List<Integer> ans = new ArrayList<>();
    //     HashMap<Integer, Integer> hm = new HashMap<>();   
    //     for (int i = 1; i <= nums.length; i++) {
    //         hm.put(nums[i-1], nums[i-1]);
    //     }

    //     for (int i = 1; i <= nums.length; i++) {
    //         if(hm.getOrDefault(i, -1)!=i){
    //             ans.add(i);
    //         }
    //     }
    //     return ans;
    // }
    public static void swap(int arr[], int a, int b) {
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
    public static List<Integer> findDisappearedNumbers(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]!=i+1 && nums[i]!=nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> ans = new ArrayList<>();
        ans = findDisappearedNumbers(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
