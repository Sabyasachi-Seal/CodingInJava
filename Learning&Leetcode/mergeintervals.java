import java.util.*;
// https://leetcode.com/problems/merge-intervals/
public class mergeintervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        List<int[]> ans = new ArrayList<>();
        int[] currint = intervals[0];
        ans.add(currint);
        for (int[] inter : intervals) {
            if(currint[1] >= inter[0]){
                currint[1] = Math.max(currint[1], inter[1]);
            }
            else{
                currint = inter;
                ans.add(currint);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }    
}
