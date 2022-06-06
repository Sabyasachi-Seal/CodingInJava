import java.util.ArrayList;

// https://leetcode.com/problems/sorting-the-sentence/
import java.util.*;
public class sortsentence {
    public static String sortSentence(String s) {
        String[] ans = s.split(" ");
        String[] copy = s.split(" ");
        for(String str: copy){
            ans[str.charAt(str.length()-1)-1-48] = str.substring(0, str.length()-1);
        }
        return Arrays.toString(ans).join(" ", ans);
    }
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
}
