// https://leetcode.com/problems/excel-sheet-column-title/
public class coloumnumbers {
    public static String convertToTitle(int col) {
        StringBuilder ans = new StringBuilder();
        while(col>0){
            col--;
            ans.append((char)(col%26 + 65));
            col /= 26;
        }
        ans.reverse();
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
