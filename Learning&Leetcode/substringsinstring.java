// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
public class substringsinstring {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for(String s: patterns){
            // if(word.lastIndexOf(s)>-1){
            //     ans++;
            // }
            if(word.equals(s) || issubstring(word, s)){
                ans++;
            }
        }
        return ans;
    }
    public static boolean issubstring(String word, String substring){
        for (int i = 0; i <= word.length()-substring.length(); i++) {
            System.out.println(word.substring(i, i+substring.length()));
            if(word.substring(i, i+substring.length()).equals(substring)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(issubstring(s, "bc"));
    }
}
