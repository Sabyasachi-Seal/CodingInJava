import java.util.*;
public class consistentstrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = words.length;
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            s.add(allowed.charAt(i));
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if(!s.contains(words[i].charAt(j))){ 
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}
