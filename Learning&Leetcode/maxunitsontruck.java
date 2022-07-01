// https://leetcode.com/problems/maximum-units-on-a-truck/
import java.util.*;
public class maxunitsontruck {
    public int maximumUnits(int[][] box, int ts) {
        // sort according to units
        Arrays.sort(box, (a, b) -> a[1]-b[1]);
        for(int x[]: box) System.out.println(x[0] + " " + x[1]);
        int ans = 0;
        int i = box.length-1;
        while(ts>0 && i>=0){
            if(box[i][0] <= ts){
                ans += box[i][0]*box[i][1];
                ts -= box[i][0];
            }
            else if(box[i][0] > ts){
                ans += ts*box[i][1];
                ts -= ts;
            }
            i--;
        }
        return ans;
    }
}
