class Solution {
    int dp[][];
    public int minPathSum(int[][] grid) {
        
        // seedha dfs laga re 
        
        dp = new int[grid.length][grid[0].length];
        
        for(int[] r: dp) Arrays.fill(r, -1);
        
        return mindfs(grid, 0, 0, 0);   
    }
    private int mindfs(int[][] grid, int i, int j, int currsum){
        
        if(i == grid.length-1 && j==grid[0].length-1){
            return grid[i][j]+currsum;
        }
    
        if(dp[i][j] != -1) return dp[i][j];
        
        int down=Integer.MAX_VALUE, right=down;
        
        if(i+1<grid.length) down = grid[i][j] + mindfs(grid, i+1, j, currsum);
        
        if(j+1<grid[0].length) right = grid[i][j] + mindfs(grid, i, j+1, currsum);
        
        dp[i][j] = Math.min(down, right);
        
        return dp[i][j];

    }
    
}