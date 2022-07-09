public class sudokusolver {
    public static boolean sudoku(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == '.'){
                    for (char j2 = '1'; j2 <= '9'; j2++) {
                        if(isvalid(board, i, j, j2)){
                            board[i][j] = j2;
                            if(sudoku(board)){
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;//base case
    }
    public static boolean isvalid(char[][] board, int row, int col, int num){
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num) return false; //check rows
            
            if(board[i][col] == num) return false; //check cols

            if(board[3*(row/3) + i/3][3*(col/3) + i%3] == num) return false; //check square
        }
        return true;
    }
}
