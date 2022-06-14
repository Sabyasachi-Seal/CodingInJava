// https://leetcode.com/problems/delete-operation-for-two-strings/
class deleteopforstrings {
    public static int minDistance(String word1, String word2) {
        int l = lcs(word1, word2);
        return word1.length() + word2.length() - l - l;
    }
    public static int lcs(String w1, String w2){
        int dp[][] = new int[w1.length()+1][w2.length()+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(w1.charAt(i-1) == w2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[w1.length()][w2.length()];
    }
    public static void main(String[] args) {
        System.out.println(minDistance("leetcode", "etco"));
    }
}