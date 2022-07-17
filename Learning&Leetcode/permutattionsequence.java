import java.util.*;
public class permutattionsequence {
    // public static String getPermutation(int n, int k) {
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=1; i<=n; i++){
    //         sb.append(i);
    //     }
    //     boolean taken[] = new boolean[n];
    //     ArrayList<String> ans = permuations("", sb.toString(), taken, new ArrayList<>());
    //     Collections.sort(ans);
    //     for (int i = 0; i < ans.size(); i++) {
    //         System.out.println(ans.get(i));
    //     }
    //     return ans.get(k-1);
        
    // }
    // public static ArrayList<String> permuations(String p, String up, boolean[] taken, ArrayList<String> ans){
    //     if(p.length() == up.length()){
    //         ans.add(p);
    //         return ans;
    //     }
    //     for (int i = 0; i < up.length(); i++) {
    //         if(!taken[i]){
    //             taken[i] = true;
    //             p += up.charAt(i);
    //             permuations(p, up, taken, ans);
    //             p = p.substring(0, p.length()-1);
    //             taken[i] = false;
    //         }
    //     }
    //     return ans;
    // }
    static String getPermutation(int n, int k){
        int fact = 1;
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact *= i;
            nums.add(i);
        }
        nums.add(n);
        String ans = "";
        k--;
        while(true){
            ans = ans + nums.get(k/fact);
            nums.remove(k/fact);
            if(nums.size() == 0) break;
            k %= fact;
            fact /= nums.size();
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getPermutation(3, 3));
    }
}
