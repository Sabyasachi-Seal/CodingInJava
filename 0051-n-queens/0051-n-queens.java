class Solution {
    private List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
        ans = new ArrayList<>();
        nQueens(n, 0, new ArrayList<>(), new boolean[n][n]);
        return ans;
        
    }
    private List<String> addAns(boolean[][] arr, ArrayList<String> ans){
        
        StringBuilder curr = new StringBuilder();
        
        for(boolean[] row: arr){
            for(boolean q: row){
                if(q) curr.append("Q");
                else curr.append(".");
            }
            ans.add(curr.toString());
            curr.setLength(0);
        }
        
        return ans;
        
    }
    private boolean nQueens(int n, int row, List<String> curr, boolean[][] queens){
        
        if(n==0){
            return true;
        }
        
        for(int j=0; j<queens.length; j++){
            
            if(isSafe(queens, row, j)){
                
                queens[row][j] = true;
                
                if(nQueens(n-1, row+1, curr, queens)){
                    ans.add(addAns(queens, new ArrayList<String>()));
                }
                
                queens[row][j] = false;

            }

        }
        
        return false;
        
    }
    private boolean isSafe(boolean[][] queens, int row, int col){
        
        // check upper left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(queens[i][j]) return false;
        }
        
        // check upper right diagonal
        for(int i=row-1, j=col+1; j<queens.length && i>=0; i--, j++){
            if(queens[i][j]) return false;
        }
        
        // check lower left diagonal
        for(int i=row+1, j=col-1; i<queens.length && j>=0; i++, j--){
            if(queens[i][j]) return false;
        }
        
        // check lower right diagonal
        for(int i=row+1, j=col+1; i<queens.length && j<queens.length; i++, j++){
            if(queens[i][j]) return false;
        }
        
        // down
        for(int i=0; i<queens.length; i++) if(queens[i][col]) return false;
        
        // up
        for(int i=row-1; i>=0; i--) if(queens[i][col]) return false;
        
        // right
        for(int j=col+1; j<queens.length; j++) if(queens[row][j]) return false;
        
        // left
        for(int j=col-1; j>=0; j--) if(queens[row][j]) return false;
        
        return true;
    }
}