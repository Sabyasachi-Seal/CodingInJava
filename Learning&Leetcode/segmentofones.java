// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
public class segmentofones {
    public static boolean checkOnesSegment(String s) {
        int i = 0;
        boolean foundzero = false;
        while(i<s.length()){
            if(s.charAt(i) != '1'){
                foundzero = true;
            }
            else if(foundzero){
                return false;
            }
            i++;
        }   
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("1001"));
    }
}
