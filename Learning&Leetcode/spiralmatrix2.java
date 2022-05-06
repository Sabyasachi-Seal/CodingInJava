import java.util.Arrays;

// https://leetcode.com/problems/spiral-matrix-ii/
public class spiralmatrix2 {
    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top =0;
        int bottom = n-1;
        int left =0;
        int right=n-1;
        int i;
        int count =1;
        while(left<=right && top<=bottom){
            for(i = left; i<=right; i++){
                ans[top][i] = count;
                count++;
            }
            top++;
            // if(top>=bottom || left >= right) break;
            for(i=top; i<=bottom; i++){
                ans[i][right] = count;
                count++;
            }
            right--;
            // if(top>=bottom || left >= right) break;
            for(i=right; i>=left; i--){
                ans[bottom][i] = count;
                count++;
            }
            bottom--;
            // if(top>=bottom || left >= right) break;
            for(i=bottom; i>= top; i--){
                ans[i][left] = count;
                count++;
            }
            left++;
            // if(top>=bottom || left >= right) break;
        }
        return ans;
    }
    public static void main(String[] args) {
        // int[][] arr = {{1,2,3}, {4, 5, 6}, {7, 8, 9}}
        // int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] ans = generateMatrix(2);
        for(int[] i: ans){
            System.out.println(Arrays.toString(i));
        }
    }
}
