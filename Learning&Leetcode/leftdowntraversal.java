public class leftdowntraversal {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int arr[][] = new int[m+1][n+1];
        int x = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                arr[i][j] = x;
                x++;
            }
        }
        int ans = 0;
        for (int i = 1; i < arr[0].length; i++) {
            System.out.print(arr[1][i]+" ");
            ans += arr[1][i];
        }
        for (int i = 2; i < arr.length; i++) {
            ans += arr[i][arr[0].length-1];
        }
        System.out.println(ans);
    }
}
