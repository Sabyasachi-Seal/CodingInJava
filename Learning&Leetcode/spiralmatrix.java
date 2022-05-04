import java.util.ArrayList;
// https://leetcode.com/problems/spiral-matrix/
public class spiralmatrix {
    public static ArrayList<Integer> spiralOrder(int[][] matrix){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i;
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(left <= right && top <= bottom){
            for(i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            if(left > right || top > bottom) break;
            for(i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(left > right || top > bottom) break;
            for(i=right; i>=left; i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            if(left > right || top > bottom) break;
            for(i=bottom; i>=top; i--){
                ans.add(matrix[i][left]);
            }
            left++;
            if(left > right || top > bottom) break;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};
        // int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(arr));
    }
}
