import java.util.*;
public class maxareacake {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxver = 0;
        int maxhei = 0;
        maxver = Math.max(verticalCuts[0], (w-verticalCuts[verticalCuts.length-1]));
        maxhei = Math.max(horizontalCuts[0], (h-horizontalCuts[horizontalCuts.length-1]));
        for (int i = 0; i < verticalCuts.length-1; i++) {
            if(verticalCuts[i+1]-verticalCuts[i] > maxver){
                maxver = verticalCuts[i+1]-verticalCuts[i];
            }
        }
        for (int i = 0; i < horizontalCuts.length-1; i++) {
            if(horizontalCuts[i+1]-horizontalCuts[i] > maxhei){
                maxhei = horizontalCuts[i+1]-horizontalCuts[i];
            }
        }
        return (int)((long)maxhei * maxver % 1000000007);
    }
}
