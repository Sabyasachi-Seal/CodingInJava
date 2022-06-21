// https://leetcode.com/problems/merge-strings-alternately/
public class mergestringsalternatively {
    public String mergeAlternately(String word1, String word2) {
        int lindex = 0;
        int rindex = 0;
        StringBuilder ans = new StringBuilder();
        while(lindex<word1.length() && rindex<word2.length()){
            if(ans.length()%2 == 0){
                ans.append(word1.charAt(lindex));
                lindex++;
            }
            else{
                ans.append(word2.charAt(rindex));
                rindex++;
            }
        }   
        while(lindex<word1.length()){
            ans.append(word1.charAt(lindex));
            lindex++;
        }
        while(rindex<word2.length()){
            ans.append(word2.charAt(rindex));
            rindex++;
        }
        return ans.toString();
    }
}
