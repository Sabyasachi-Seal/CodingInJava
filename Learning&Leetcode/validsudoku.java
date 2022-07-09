public class validsudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j] != '.'){
                    if(!isvalid(board, i, j, board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isvalid(char[][] board, int row, int col, char num){
        for(int i=0; i<board.length; i++){
            if(i!=col && board[row][i] == num) return false;
            
            if(i!=row && board[i][col] == num) return false;
            
            if(isvalidpos(i, row, col) && board[3*(row/3)+i/3][3*(col/3)+i%3] == num) return false;
        }
        return true;
    }
    public boolean isvalidpos(int i, int row, int col){
        if(row == 3*(row/3)+i/3 && col == 3*(col/3)+i%3) return false;
        return true;
    }
}