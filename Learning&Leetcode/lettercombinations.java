import java.util.*;
public class lettercombinations {
    public static void main(String[] args) {
        List<String> ans = lettercombi("", "9", new ArrayList<>());
        System.out.println(ans);
    }
    public static List<String> lettercombi(String p, String up, List<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        int dig = up.charAt(0) - '0';

        if(dig == 1 || dig == 0) return lettercombi(p, up.substring(1), ans);

        else{
            int start = (dig-2)*3;
            int end = (dig-1)*3;
            if(dig == 7){
                end++;
            }
            else if(dig == 8){
                start++;
                end++;
            }
            else if(dig == 9){
                start++;
                end+=2;
            }
            for (int i = start; i < end; i++) {
                lettercombi(p+(char)(i+'a'), up.substring(1), ans);
            }
        }
        return ans;
    }
}
