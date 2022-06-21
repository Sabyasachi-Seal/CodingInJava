// https://leetcode.com/problems/reverse-prefix-of-word/
public class reverseprefix {
    public static String reversePrefix(String word, char ch) {
        int ind = searchit(word, ch);
        if(ind > -1){
            StringBuilder ans = new StringBuilder();
            ans.append(word.substring(0, ind));
            ans.reverse();
            ans.append(word.substring(ind, word.length()));
            return ans.toString();
        }
        return word;
    }
    public static int searchit(String s, char c){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                return i+1;
            }
        }
        return -1;
    }
}
