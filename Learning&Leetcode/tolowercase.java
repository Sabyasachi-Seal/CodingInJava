// https://leetcode.com/problems/to-lower-case/
public class tolowercase {
    // public static String toLowerCase(String s) {
    //     StringBuilder str = new StringBuilder();
    //     for(char a: s.toCharArray()){
    //         if(a>=65 && a<=90){
    //             str.append((char)(a+32));
    //         }
    //         else{
    //             str.append((char)(a));
    //         }
    //     }
    //     return str.toString();
    // }
    public static String toLowerCase(String s){
        return s.toLowerCase();
    }
    public static void main(String[] args) {
        String s = "THIS";
        System.out.println(toLowerCase(s));
    }
}
