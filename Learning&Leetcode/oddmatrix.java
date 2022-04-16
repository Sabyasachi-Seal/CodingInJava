// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        int i, j;
        for(i=0; i<indices.length; i++){
            for(j=0; j<n; j++){
                ans[indices[i][0]][j]++;
            }
            for(j=0; j<m; j++){
                ans[j][indices[i][1]]++;
            }
        }
        int res =0;
        for(i=0; i<m*n; i++){
            if(ans[i/n][i%n] % 2 != 0){
                res++;
            }
        }
        return res;
     }
}