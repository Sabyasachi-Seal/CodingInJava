// https://leetcode.com/problems/height-checker/
import java.util.*;
public class heightchecker {
    // public int heightChecker(int[] heights) {
    //     int[] temp = new int[heights.length];
    //     for (int i = 0; i < temp.length; i++) {
    //         temp[i] = heights[i];
    //     }
    //     Arrays.sort(temp);
    //     int count = 0;
    //     for (int i = 0; i < temp.length; i++) {
    //         if(temp[i]!=heights[i]) count++;
    //     }
    //     return count;
    // }
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        for (int i = 0; i < heights.length; i++) {
            freq[heights[i]]++;
        }
        int count=0, curr =0;
        for (int i = 0; i < heights.length; i++) {
            while(freq[curr] == 0){
                curr++;
            }
            if(heights[i]!=curr){
                count++;
            }
            freq[curr]--;
        }
        return count;
    }
}
