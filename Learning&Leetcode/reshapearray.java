public class reshapearray {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length*mat[0].length) == r*c){
            int[][] ans = new int[r][c];
            r = mat[0].length;
            for(int i=0;i<(mat.length*mat[0].length);i++){
                ans[i/c][i%c] = mat[i/r][i%r];
            }
            return ans;
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

