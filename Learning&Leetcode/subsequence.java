import java.util.ArrayList;

public class subsequence {
    int ans = 0;
    ArrayList<String> subs = new ArrayList<>();
    public static void main(String[] args) {
        String s = "dyyonfvzsretqxucmavxegvlnnjubqnwrhwikmnnrpzdovjxqdsatwzpdjdsneyqvtvorlwbkb";
        subsequence s1 = new subsequence();
        s1.longestIdealString(s, 7);

        //"dyyonfvzsretqxucmavxegvlnnjubqnwrhwikmnnrpzdovjxqdsatwzpdjdsneyqvtvorlwbkb"
        //7
    }
    public int longestIdealString(String s, int k) {
        int max = 0;
        subseq(s, "");
        for(int i=0; i<subs.size(); i++){
            String curr = subs.get(i);
            boolean flag = true;
            if(curr.length() > max){
                for (int j = 0; j < curr.length()-1; j++) {
                    if(Math.abs(curr.charAt(j)-curr.charAt(j+1)) > k){
                        flag = false;
                        break;
                    }
                }
                if(flag) max = curr.length();

            }
        }
        return max;
    }
    public void subseq(String up, String p){
        if(up.isEmpty()){
            subs.add(p);
            return;
        }
        subseq(up.substring(1), p+up.charAt(0));
        subseq(up.substring(1), p);
    }
}
