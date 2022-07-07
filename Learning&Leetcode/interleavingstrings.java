import java.util.Arrays;

public class interleavingstrings {
    public static boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length() != s1.length()+s2.length()) return false; 
        return dfs(s1, s2, s3, 0, 0, new boolean[s1.length()+1][s2.length()+1]);
    }
    public static boolean dfs(String s1, String s2, String s3, int i, int j, boolean dp[][]){
        if(dp[i][j]) return false;
        
        if(i==s1.length() && j==s2.length()) return true;

        boolean valid = (i<s1.length() && s1.charAt(i)==s3.charAt(i+j) && dfs(s1, s2, s3, i+1, j, dp)) || 
                         (j<s2.length() && s2.charAt(j)==s3.charAt(i+j) && dfs(s1, s2, s3, i, j+1, dp));
        
        if(!valid) dp[i][j] = true;
        
        return valid;
    }
    public static void main(String[] args) {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        System.out.println(isInterleave(s1, s2, s3));
    }
}
