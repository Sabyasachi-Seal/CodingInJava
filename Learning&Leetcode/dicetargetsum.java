import java.util.*;
public class dicetargetsum {
    public static void main(String[] args) {
        System.out.println(dice("", 5, new ArrayList<>()));
    }
    public static ArrayList<String> dice(String p, int target, ArrayList<String> ans){
        if(target == 0){
            ans.add(p);
            return ans;
        }
        else{
            for (int i = 1; i <= 6 && target>=i; i++) {
                dice(p+i, target-i, ans);
            }
            return ans;
        }
    }
}
