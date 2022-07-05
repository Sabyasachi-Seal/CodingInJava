import java.util.*;
public class permuatations {
    public static void main(String[] args) {
        List<String> ans = permus("", "abc");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        System.out.println(permusc("", "abc"));
    }
    public static List<String> permus(String p, String up, List<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        int i = 0;
        for (i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String r = p.substring(i, p.length());
            permus(f+up.charAt(0)+r, up.substring(1), ans);
        }
        return ans;
    }
    public static List<String> permus(String p, String up){
        if(up.isEmpty()){
            List<String> ret = new ArrayList<>();
            ret.add(p);
            return ret;
        }
        int i = 0;
        List<String> ans = new ArrayList<>();
        for (i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String r = p.substring(i, p.length());
            ans.addAll(permus(f+up.charAt(0)+r, up.substring(1)));
        }
        return ans;
    }
    public static int permusc(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int i = 0;
        int permu = 0;
        for (i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String r = p.substring(i, p.length());
            permu += permusc(f+up.charAt(0)+r, up.substring(1));
        }
        return permu;
    }
}
