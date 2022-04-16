// https://leetcode.com/problems/transpose-matrix/
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;

    }
}