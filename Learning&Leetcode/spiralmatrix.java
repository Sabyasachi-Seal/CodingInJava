import java.util.ArrayList;
// https://leetcode.com/problems/spiral-matrix/
public class spiralmatrix {
    public static ArrayList<Integer> spiralOrder(int[][] matrix){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = cols-1;
        int left = 0;
        int right = rows-1;
        while(ans.size() <= rows*cols){
            for(i=left; i<right; i++){
                ans.add(matrix[top][i]);
            }
            for(i=top+1; i<= bottom; i--){
                ans.add(matrix[i][right]);
            }
            if(left != right){
                for(i=right+1; i>=left; i--){
                    ans.add(matrix[bottom][i]);
                }
            }
            if(top == bottom){
                for(i=bottom+1; i>=top; i++){
                    ans.add(matrix[i][left]);
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(arr));
    }
}
