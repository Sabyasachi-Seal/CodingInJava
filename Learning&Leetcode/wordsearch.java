public class wordsearch {
    public static boolean exist(char[][] board, String word) {
        if (word.equals(board[0][0]+"")) return true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(word.charAt(0) != board[i][j]) continue;
                if(findword(board, word, new StringBuilder(), i, j)) return true;
            }
        }
        return false;
    }
    public static boolean findword(char[][] board, String word, StringBuilder curr, int i, int j){
        if(curr.length() == word.length() && word.charAt(word.length()-1) == curr.charAt(curr.length()-1)){
            return true;
        }
        
        if(word.charAt(curr.length()) != board[i][j]) return false;//important line or TLE
        if(curr.length()==word.length()) return false;
        if(board[i][j] == '.') return false;

        curr.append(board[i][j]);
        board[i][j] = '.';

        boolean ans =   (i<board.length-1 && findword(board, word, curr, i+1, j)) ||
                        (j<board[0].length-1 && findword(board, word, curr, i, j+1)) ||
                        (i>0 && findword(board, word, curr, i-1, j)) ||
                        (j>0 && findword(board, word, curr, i, j-1));

        if(ans) return true;
             
        board[i][j] = curr.charAt(curr.length()-1);
        curr.deleteCharAt(curr.length()-1);

        return false;
    }
    public static void main(String[] args) {
        System.out.println(exist(new char[][]{{'a'},{'b'}}, "ab"));
    }
}
