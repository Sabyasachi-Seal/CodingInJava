public class maximumgold {
    public static int getMaximumGold(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 0) continue;
                max = Math.max(max, maxgold(grid, i, j, 0, new boolean[grid.length][grid[0].length]));
            }
        }
        return max;
    }
    public static int maxgold(int[][] golds, int i, int j, int curr, boolean[][] visited){
        if(i<0 || j<0) return curr;

        if(i==golds.length && j==golds[0].length){
            return curr;
        }

        if(i==golds.length || j==golds[0].length || golds[i][j] == 0 || visited[i][j]) return curr;

        curr += golds[i][j];
        visited[i][j] = true;
        
        int max = 0;

        int m1 = Math.max(maxgold(golds, i+1, j, curr, visited), maxgold(golds, i, j+1, curr, visited));
        int m2 = Math.max(maxgold(golds, i-1, j, curr, visited), maxgold(golds, i, j-1, curr, visited));
        int ans = Math.max(m1, m2);
        
        max = Math.max(ans, max);

        curr -= golds[i][j];
        visited[i][j] = false;

        return max;
    }
    public static void main(String[] args) {
        System.out.println(getMaximumGold(new int[][]{{1, 0, 2}, {4, 5, 0}}));
    }
}
