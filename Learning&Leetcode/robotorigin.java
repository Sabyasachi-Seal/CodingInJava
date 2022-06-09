// https://leetcode.com/problems/robot-return-to-origin/
public class robotorigin {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(char c : moves.toCharArray()){
            if(c=='U') x++;
            else if(c=='D') x--;
            else if(c=='L') y++;
            else if(c=='R') y--;
        }
        return (x==0 && y==0);
    }
}
