//https://leetcode.com/problems/max-area-of-island/
public class maxislandarea {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i=0; i < grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 0) continue;
                max = Math.max(max, maxarea(grid, i, j, 0));
            }
        }
        return max ;
    }
    private int maxarea(int[][]grid, int row, int col, int area){
        
        if(row<0||col<0||row>=grid.length||col>=grid[0].length) return area;
        
        if(grid[row][col] == 0) return area;
        
        grid[row][col] = 0;
        
        return  1 + maxarea(grid, row-1, col, area) + 
                    maxarea(grid, row, col-1, area) + 
                    maxarea(grid, row+1, col, area) + 
                    maxarea(grid, row, col+1, area);
    }
}
