import java.util.*;
public class longestnicesubstring {
    public String longestNiceSubstring(String s) {
        // StringBuilder sb = new StringBuilder();
        int maxstart=0, maxend=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(isnice(s, i, j)){
                    if(j-i > maxend-maxstart){
                        maxstart = i;
                        maxend = j;
                    }
                }
            }
        }
        if(maxstart==-1 || maxend == -1) return "";
        return s.substring(maxstart, maxend);
    }
    public boolean isnice(String s, int start, int end){
        // use sets
        HashSet<Character> check = new HashSet<>();
        for (int i = start; i <= end; i++) {
            check.add(s.charAt(i));
        }
        for (char c : check) {
            if(c<97){// isuppercase
                if(!check.contains((char)(c+('a'-'A')))){
                    return false;
                }
            }
            else{
                if(!check.contains((char)(c-('a'-'A')))){
                    return false;
                }
            }
        }
        return true;
    }
}
