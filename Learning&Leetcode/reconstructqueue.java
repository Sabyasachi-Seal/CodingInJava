import java.util.*;
public class reconstructqueue {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> (a[0]==b[0])?a[1]-b[1]:b[0]-a[0]);
        List<int[]> ans = new ArrayList<>();
        for(int[] i:people){
            ans.add(i[1], i);
        }
        return ans.toArray(new int[people.length][]);
    }
}
