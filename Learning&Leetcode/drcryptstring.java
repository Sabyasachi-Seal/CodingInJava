// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class drcryptstring {
    public static String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i+=3) {
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                int num  = ((int)s.charAt(i)-48)*10+((int)s.charAt(i+1)-48);
                ans.append((char)(num+87+9));
            }
            else{
                ans.append((char)(((int)s.charAt(i)-48)+96));
                ans.append((char)(((int)s.charAt(i+1)-48)+96));
                i--;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
}
