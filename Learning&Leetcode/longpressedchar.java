// https://leetcode.com/problems/long-pressed-name/
public class longpressedchar {
    public static boolean isLongPressedName(String name, String typed) {
        int ori = 0, ty = 0;
        while(ty<typed.length() || ori<name.length()){
            if(ori<name.length() && ty<typed.length() && name.charAt(ori) == typed.charAt(ty)){
                ori++;
                ty++;
            }
            else if(ty>0 && ty<typed.length() && typed.charAt(ty)==typed.charAt(ty-1)){
                ty++;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isLongPressedName("aleex", "aaleeee"));
    }
}
