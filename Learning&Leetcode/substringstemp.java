import java.util.*;
public class substringstemp {
    public static void main(String[] args) {
        List<List<String>> ans = subs("", "aab", new ArrayList<>(), new ArrayList<>());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    public static List<List<String>> subs(String p, String up, List<String> curr, List<List<String>> ans){
        if(up.isEmpty()){
            // curr.add(p);
            ans.add(new ArrayList<>(curr));
            return ans;
        }
        curr.add(p+up.charAt(0));
        subs(p+up.charAt(0), up.substring(1), curr, ans);
        curr.remove(curr.size()-1);
        subs(p, up.substring(1), curr, ans);
        return ans;
    }
}
