
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
import java.rmi.registry.RegistryHandler;
import java.util.*;
class longestsubstringnorepeat {
    // public static int lengthOfLongestSubstring(String s) {
    //     int max1 = 0, max2 = 0;
    //     int cur = 0;
    //     Set<Character> ch = new HashSet<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         if(ch.contains(s.charAt(i))){
    //             ch.clear();
    //             cur = 1;
    //         }
    //         else{
    //             cur++;
    //             if(cur>max1) max1 = cur;
    //         }
    //         ch.add(s.charAt(i));
    //     }
    //     ch.clear();
    //     cur = 0;
    //     for (int i = s.length()-1; i >=0; i--) {
    //         if(ch.contains(s.charAt(i))){
    //             ch.clear();
    //             cur = 1;
    //         }
    //         else{
    //             cur++;
    //             if(cur>max2) max2 = cur;
    //         }
    //         ch.add(s.charAt(i));
    //     }
    //     return max1>max2?max1:max2;
    // }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int max = 0;
        int left = 0;
        int right = 0;
        Set<Character> ch = new HashSet<>();
        while(right<s.length()){
            if(ch.contains(s.charAt(right))){
                ch.remove(s.charAt(left));
                left++;
            }
            else{
                ch.add(s.charAt(right));
                right++;
            }
            max = Math.max(max, right-left+1);
        }
        return max-1;
    }
    public static void main(String[] args) {
        // String s = "aab";
        // String s= "abcabcbb";
        // String s = "dvdf";
        String s = "asjrgapa";
        System.out.println(lengthOfLongestSubstring(s));
    }
}