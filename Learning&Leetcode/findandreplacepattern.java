import java.util.*;
public class findandreplacepattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for(String word: words){
            if(match(word, pattern)){
                ans.add(word);
            }
        }
        return ans;
    }
    private static boolean match(String word, String pattern){
        char[] wrtopat = new char[26];
        char[] patttowr = new char[26];
        for(int i=0; i<word.length(); i++){

            if(wrtopat[word.charAt(i)-'a'] == 0) wrtopat[word.charAt(i)-'a'] = pattern.charAt(i);
            if(patttowr[pattern.charAt(i)-'a'] == 0) patttowr[pattern.charAt(i)-'a'] = word.charAt(i);

            if(wrtopat[word.charAt(i)-'a'] != pattern.charAt(i) || patttowr[pattern.charAt(i)-'a']!=word.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
