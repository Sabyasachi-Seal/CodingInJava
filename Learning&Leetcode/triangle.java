// https://leetcode.com/problems/triangle/
import java.util.*;
public class triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int dp[] = new int[triangle.size()+1];
        for (int i = triangle.size()-1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j+1]);
            }
        }
        return dp[0];
    }
    
}
