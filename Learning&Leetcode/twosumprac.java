import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.TagAction;

public class twosumprac {
    // public int[] twoSum(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++) {
    //         int newtarget = target-nums[i];
    //         for (int j = 0; j < nums.length; j++) {
    //             if(nums[j]==newtarget){
    //                 return new int[] {i, j};
    //             }
    //         }
    //     }
    //     return new int[] {-1, -1};
    // }
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int newtarget = target-nums[i];
            if(hm.containsKey(newtarget) && hm.get(newtarget)!=i){
                return new int[] {i, hm.get(newtarget)};
            }
        }
        return new int[] {-1, -1};
    }
}
