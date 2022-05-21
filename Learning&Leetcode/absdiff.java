// https://leetcode.com/problems/minimum-absolute-difference/
import java.util.*;
public class absdiff {
    public static List<List<Integer>> minimumAbsDifference(int[] copy) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(copy);
        int currdiff = copy[1]-copy[0];
        // List<Integer> innerlist = new ArrayList<>();
        for (int i = 0; i < copy.length-1; i++) {
            if(copy[i+1]-copy[i]< currdiff){
                currdiff = copy[i+1]-copy[i];
                // ans = new ArrayList<>();
                // ans.add(Arrays.asList(copy[i], copy[i+1]));
            }
            // else if(currdiff == copy[i+1]-copy[i]){
            //     ans.add(Arrays.asList(copy[i], copy[i+1]));
            // }
        }
        for (int i = 0; i < copy.length-1; i++) {
            if(copy[i+1]-copy[i] == currdiff){
                ans.add(Arrays.asList(copy[i], copy[i+1]));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(minimumAbsDifference(arr));
    } 
}
