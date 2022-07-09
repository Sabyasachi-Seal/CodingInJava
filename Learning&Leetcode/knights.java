class knights{
    public static void main(String[] args){
        int n = 4;
        backtrack(new boolean[n][n], 0, 0, n);
    }
    public static void backtrack(boolean[][] board, int row, int col, int total){
        if(total == 0){
            display(board);
            System.out.println();
            return;
        }

        if(row==board.length-1 && col==board.length) return;

        if(col == board.length){
            backtrack(board, row+1, 0, total);
            return;
        }

        if(issafe(board, row, col)){
            board[row][col] = true;
            backtrack(board, row, col+1, total-1);
            board[row][col] = false;
        }
        backtrack(board, row, col+1, total);
    }
    public static boolean issafe(boolean[][] board, int row, int col){

        if(isvalidpos(board, row-2, col-1) && board[row-2][col-1]) return false;

        if(isvalidpos(board, row-2, col+1) && board[row-2][col+1]) return false;

        if(isvalidpos(board, row-1, col-2) && board[row-1][col-2]) return false;

        if(isvalidpos(board, row-1, col+2) && board[row-1][col+2]) return false;

        return true;
    }
    public static boolean isvalidpos(boolean[][]board, int row, int col){
        if(row>=0 && col >=0 && row<board.length && col<board[0].length){
            return true;
        }
        return false;
    }
    public static void display(boolean[][] board){
        for (boolean[] bs : board) {
            for (boolean bs2 : bs) {
                if(bs2) System.out.print("K ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }
}