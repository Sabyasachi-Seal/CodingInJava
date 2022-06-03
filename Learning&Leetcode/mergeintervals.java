import java.util.*;
// https://leetcode.com/problems/merge-intervals/
public class mergeintervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        List<List<Integer>> arr = new ArrayList<>();    
        int index = 0;
        for (int i = 0; i < intervals.length; i++) {
            List<Integer> temp = new ArrayList<>();
            if(i+1<intervals.length && intervals[i][1]>=intervals[i+1][0]){
                temp.add(intervals[i][0]);
                temp.add(Math.max(intervals[i+1][1], intervals[i][1]));
                i++;
            }
            else{
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
            }
            arr.add(temp);
        }   
        int ans[][] = new int[arr.size()][2];
        for (int i = 0; i < ans.length; i++) {
            List<Integer> temp = arr.get(i);
            index= 0;
            for(int t: temp){
                ans[i][index++] = t;
            }
        }
        return ans;
    }    
}
