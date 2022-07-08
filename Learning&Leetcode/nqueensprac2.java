import java.util.*;
public class nqueensprac2 {
    public static void main(String[] args) {
        int n  = 10;
        List<List<String>>  ans = nqueen(new boolean[n][n], 0, new ArrayList<>());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    public static List<List<String>> nqueen(boolean[][] board, int row, List<List<String>> ans){
        if(row==board.length){
            ans.add(addans(board));
            System.out.println();
            return ans;
        }
        for (int col = 0; col < board.length; col++) {
            if(issafe(board, row, col)){
                board[row][col] = true;
                nqueen(board, row+1, ans);
                board[row][col] = false;
            }
        }
        return ans;
    }
    public static boolean issafe(boolean[][] board, int row, int col){
        //check top
        for (int i = 0; i < row; i++) {
            if(board[i][col]) return false;
        }

        //check upper left diagonal
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j]) return false;
        }

        //check upper right diagonal
        for (int i = row-1, j=col+1; i >=0 && j<board[0].length; i--, j++) {
            if(board[i][j]) return false;
        }
        return true;
    }
    public static List<String> addans(boolean[][] board){
        StringBuilder sb = new StringBuilder();
        List<String> a = new ArrayList<>();
        for (boolean[] i1 : board) {
            for (boolean i2 : i1) {
                if(i2) sb.append('Q');
                else sb.append('.');
                System.out.print(sb.charAt(sb.length()-1)+" ");
            }
            System.out.println();
            a.add(sb.toString());
            sb.delete(0, sb.length());
        }
        return a;
    }
}
