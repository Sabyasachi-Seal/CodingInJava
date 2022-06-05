import java.util.*;
public class nqueens2 {
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        int board[][] = new int[n][n];
        solve(board, 0, ans);
        return ans.size();
    }
    public static List<String> addans(int board[][]){
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String tmpstr = "";
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]==1){
                    tmpstr += "Q";
                }
                else{
                    tmpstr += ".";
                }
            }
            temp.add(tmpstr);
        }
        return temp;
    }
    public static boolean solve(int board[][], int col, List<List<String>> ans){
        if(col == board.length){
            ans.add(addans(board));
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            if(issafe(board, i, col)){
                board[i][col] = 1;
                if(solve(board, col+1, ans)){// if this is false, loop continues
                    return true;
                }
            }
            board[i][col] = 0;
        }
        return false;
    }
    public static boolean issafe(int board[][], int row, int col){
        int i, j;
        for (i = 0; i  < col; i++) {
            if(board[row][i] == 1) return false;
        }
        for(i=row, j=col; i>=0 && j>=0; i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(i=row, j=col; i<board.length && j>=0; i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    } 
}
