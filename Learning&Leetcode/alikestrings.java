// https://leetcode.com/problems/determine-if-string-halves-are-alike/
import java.util.*;
public class alikestrings {
    public static boolean halvesAreAlike(String str) {
        Set<Character> st = new HashSet<>();
        for (Character a: "aeiouAEIOU".toCharArray()) {
            st.add(a);
        }
        int h1=0, h2=0;
        for (int i = 0; i < str.length()/2; i++) {
            if(st.contains(str.charAt(i))){
                h1++;
            }
        }
        for (int i = str.length()/2; i < str.length(); i++) {
            if(st.contains(str.charAt(i))){
                h2++;
            }
        }
        return h1==h2;
    }
}
