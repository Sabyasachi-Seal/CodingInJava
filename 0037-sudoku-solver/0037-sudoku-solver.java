class Solution {
    public void solveSudoku(char[][] board) {
        canPlace(board, 0, 0);
    }
    
    private boolean canPlace(char[][] board, int row, int col){
        
        for(int i=0; i<board.length; i++){
        
            for(int j=0; j<board.length; j++){

                if(board[i][j] != '.') continue;
                
                for(int dig='1'; dig<='9'; dig++){

                    if(isSafe(board, (char)dig, i, j)){

                        board[i][j] = (char)dig;

                        if(canPlace(board, i, j)) {
                            return true;
                        }

                        board[i][j] = '.';
                    }
                }
                
                return false;
            }
        }
        return true;
        
    }
    
    private boolean isSafe(char[][] board, char dig, int row, int col){
        
        for(int i=0; i<board.length; i++){
            if(board[row][i] == dig || board[i][col] == dig){
                return false;
            }
        }
        
        int rowStart = 3*(row/3);
        int colStart = 3*(col/3);
        
        for(int i=rowStart; i<rowStart+3; i++){
            
            for(int j=colStart; j<colStart+3; j++){
                
                if(board[i][j] == dig){
                    return false;
                }
                
            }
        }
        
        return true;
    }
}