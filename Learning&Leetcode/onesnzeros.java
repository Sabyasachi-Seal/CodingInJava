// https://leetcode.com/problems/ones-and-zeroes/
public class onesnzeros {
    // public static int findMaxForm(String[] strs, int m, int n) {
    //     int count = 0;    
    //     int max = 0;
    //     int[] zeros = new int[strs.length];
    //     int[] ones = new int[strs.length];  
        
    //     int temp = 0;
    //     while(temp<strs[0].length()){
    //         if(strs[0].charAt(temp) == '0'){
    //             zeros[0]++;
    //         }
    //         temp++;
    //     }
    //     ones[0] += (strs[0].length()-zeros[0]);
    //     if(zeros[0]<m && ones[0]<n){
    //         count++;
    //     }
    //     else if(zeros[0]==m || ones[0]==n){
    //         zeros[0] = 0;
    //         ones[0] = 0; 
    //         max = 1;
    //         count = 0;
    //     }


    //     for (int i = 1; i<strs.length; i++) {
    //         temp =  0;
    //         while(temp<strs[i].length()){
    //             if(strs[i].charAt(temp) == '0'){
    //                 zeros[i]++;
    //             }
    //             temp++;
    //         }
    //         ones[i] += (strs[i].length()-zeros[i]);
    //         if(zeros[i]+zeros[i-1]>m || ones[i]+ones[i-1]>n){
    //             zeros[i] = zeros[i-1];
    //             ones[i] = ones[i-1];
    //             continue;
    //         }
    //         if((zeros[i]+zeros[i-1]==m || ones[i]+ones[i-1]==n) && strs[i].length()>1){
    //             max = count+1;
    //             zeros[i] = zeros[i-1];
    //             ones[i] = ones[i-1];
    //             count = 0;
    //         }
    //         else if(zeros[i]+zeros[i-1]==m && strs[i].length()==1){
    //             count++;
    //             continue;
    //         }
    //         else if(ones[i]+ones[i-1]==n && strs[i].length()==1){
    //             count++;
    //             continue;
    //         }
    //         count++;
    //         if(count>max){
    //             max = count;
    //         }
    //     }
    //     return max;
    // }
    public static int findMaxForm(String[] strs, int m, int n){
        int[][] dp = new int[m+1][n+1];
        for(String str: strs){
            int zeros =0, ones=0;
            for(char c: str.toCharArray()){
                if (c=='0'){
                    zeros++;
                }
                else{
                    ones++;
                }
            }
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-zeros][j-ones] + 1);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        // String[] strs = {"10","0001","111001","1","0"};
        // String[] strs = {"00", "000"};
        String[] strs = {"10", "0", "1"};
        // String[] strs = {"0", "0", "1", "1"};
        int m = 1;
        int n = 1;
        int ans = findMaxForm(strs, m, n);
        System.out.println(ans);
    }
}
