import java.util.*;
public class reshapearray {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length*mat[0].length) == r*c){
            ArrayList<Integer> ans = new ArrayList<Integer>();
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    ans.add(mat[i][j]);
                }
            }
            mat = new int[r][c];
            for (int i = 0; i < r*c; i++) {
                mat[i/c][i%c] = ans.get(i);
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][]arr = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] ans = matrixReshape(arr, r, c);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }
}

