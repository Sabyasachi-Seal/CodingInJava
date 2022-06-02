import java.io.LineNumberInputStream;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

// https://leetcode.com/problems/transpose-matrix/
public class transposematrix {
    public int[][] transpose(int[][] matrix) {
        int ans[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < ans.length*ans[0].length; i++) {
            System.out.println(i/ans.length);
            System.out.println(i%ans[0].length);
            // ans[i/ans.length][i%ans[0].length] = matrix[i%ans[0].length][i/ans.length];
        }       
        return ans;
    }
}
