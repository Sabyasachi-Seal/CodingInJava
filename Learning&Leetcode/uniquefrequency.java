//https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/
import java.util.*;
public class uniquefrequency {
    // find unique chars
    // therefore the unique lenghts must be 1+2+3+4...
    // no of dels = size - sum
    public static int minDeletions(String s) {
        int arr[] = new int[26];
        int ans = 0;
        for(char c:s.toCharArray()){
            arr[c-'a']++;//storing freq
        }
        Set<Integer> usedfreq = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            int freq = arr[i];
            while(freq>0){
                if(!usedfreq.contains(freq)){
                    usedfreq.add(freq);
                    break;
                }
                freq--;
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(minDeletions("bbcebab"));
    }
}
