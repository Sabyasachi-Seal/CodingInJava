import java.util.*;
class longestconsecutive{
    public static int longestConsecutive(int[] nums) {
        Hashtable<Integer, Integer> hm = new Hashtable<>();
        for (int i : nums) {
            hm.put(i, i);
        }
        int max = 0;
        for(int num: hm.keySet()){
            int curr = 1;
            if(!hm.contains(num-1)){
                int next = num + 1;
                while(hm.contains(next)){
                    curr++;
                    next++;
                }
                max = Math.max(max, curr);
            }
        }
        return max;
    }
    // public static int longestConsecutive(int[] nums){
    //     Set<Integer> n = new HashSet<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         n.add(nums[i]);
    //     }
    //     int max = 0;
    //     int curr = 1;
    //     for(int number: n){
    //         if(!n.contains(number-1)){
    //             int next = number + 1;
    //             while(n.contains(next)){
    //                 curr++;
    //                 next++;
    //             }
    //             max = Math.max(max, curr);
    //         }
    //     }
    //     return max;
    // }
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{1, 2, 0, 1}));
    }
}