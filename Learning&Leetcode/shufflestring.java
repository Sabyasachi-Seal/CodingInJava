// https://leetcode.com/problems/shuffle-string/
public class shufflestring {
    public static String restoreString(String str, int[] indices) {
        StringBuilder ans = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            ans.setCharAt(indices[i], str.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] ind = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, ind));
    }
}
