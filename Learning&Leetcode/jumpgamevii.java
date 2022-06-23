import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/jump-game-vii/
public class jumpgamevii {
    public boolean canReach(String s, int minJump, int maxJump) {
        if (s.charAt(s.length()-1)==1) return false;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int farthest = 0;
        while(!queue.isEmpty()){
            int curr = queue.remove();
            if(curr == s.length()-1) return true;
            for (int i = Math.max(curr+minJump, farthest); i <= Math.min(curr+maxJump, s.length()-1); i++) {
                if(s.charAt(i)=='0'){
                    queue.add(i);
                }
            }
            farthest = Math.min(curr+maxJump+1, s.length()-1);
        }
        return false;
    }
}
