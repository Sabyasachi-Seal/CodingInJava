// https://leetcode.com/problems/substring-with-concatenation-of-all-words/
import java.util.*;
public class substringwithsowords {
    public List<Integer> findSubstring(String str, String[] words) {
        if(str == null || str.length() == 0 || words == null || words.length == 0){
            return new ArrayList<>();
        }
        
        HashMap<String, Integer> freq = new HashMap<>();
        
        for(String word: words){
            freq.put(word, freq.getOrDefault(word, 0)+1);
        }
        
        int wordlength = words[0].length();
        int wordnum = words.length;
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<=str.length()-(wordlength*wordnum); i++){
            
            HashMap<String, Integer> seen = new HashMap<>();
            
            for(int j=0; j<wordnum; j++){
                int wordIndex = i + j*wordlength;
                String word = str.substring(wordIndex, wordIndex + wordlength);
                
                if(!freq.containsKey(word)){
                    break;
                }
                
                seen.put(word, seen.getOrDefault(word, 0)+1);
                
                if(seen.get(word) > freq.getOrDefault(word, 0)){
                    break;
                }
                
                if(j+1 == wordnum){
                    ans.add(i);
                } 
            }
        }
        return ans;
    }
}
