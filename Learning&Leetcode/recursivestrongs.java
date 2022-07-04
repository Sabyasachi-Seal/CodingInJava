
import java.util.*;
public class recursivestrongs {
    public static void main(String[] args) {
        ArrayList<String> ans = noa("", "abba", new ArrayList<>());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    public static ArrayList<String> noa(String n, String ori, ArrayList<String> ans){
        if(ori.isEmpty()){ 
            if(!n.isEmpty() && !ans.contains(n))ans.add(n);
            return ans;
        }
        else{
            noa(n, ori.substring(1), ans);
            noa(n+ori.charAt(0), ori.substring(1), ans);
            return ans;
        }
    }
}
