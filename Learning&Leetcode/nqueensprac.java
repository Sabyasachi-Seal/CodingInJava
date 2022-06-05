public class nqueensprac {
    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }
    public static int totalNQueens(int n){
        int board[][] = new int[n][n];
        int [] ans = new int[1];
        solve(board, 0, 0, ans);
        return ans[0];
    }
    public static boolean issafe(int board[][], int row, int col){
        //check left
        //check lower diagonal
        //check upper diagonal 
        for (int i = 0; i < board.length; i++) {
            if(board[row][i]==1){
                return false;
            }
        }
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row, j=col; i<board.length && j>=0; i++, j--){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public static boolean solve(int board[][], int row, int col, int []ans){
        if(col == board.length){
            ans[0]++;
            return false;
        }
        else{
            for (int i = 0; i < board.length; i++) {
                if(issafe(board, i, col)){
                    board[i][col] = 1;
                    if(solve(board, row, col+1, ans)){
                        return true;
                    }
                }
                board[i][col] = 0;
            }
        }
        return false;
    }
}
