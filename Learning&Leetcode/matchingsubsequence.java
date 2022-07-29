import java.util.*;

public class matchingsubsequence {
    public static int numMatchingSubseq(String s, String[] words) {
        HashMap<String, Integer> w = new HashMap<>();
        for(String s1: words){ 
            w.put(s1, w.getOrDefault(s1, 0)+1);
        }
        int ans = 0;
        for(String word: w.keySet()){
            int wstart = 0;
            int sstart= 0;
            while(sstart<s.length() && wstart<word.length()){
                if(s.charAt(sstart) == word.charAt(wstart)){
                    wstart++;
                    sstart++;
                }
                else{
                    sstart++;
                }
                if(wstart == word.length()){
                    ans += w.get(word);
                    break;
                }
            }
        }   
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(numMatchingSubseq("abcde", new String[]{"a","bb","acd","ace"}));
    }
}
