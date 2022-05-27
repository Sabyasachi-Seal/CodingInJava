// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.*;
public class finddisaappearednums {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();   
        for (int i = 1; i <= nums.length; i++) {
            hm.put(nums[i-1], nums[i-1]);
        }

        for (int i = 1; i <= nums.length; i++) {
            if(hm.getOrDefault(i, -1)!=i){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 5, 4};
        List<Integer> ans = new ArrayList<>();
        ans = findDisappearedNumbers(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
