import java.util.HashMap;
// https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
public class make2arrayequal {
    public boolean canBeEqual(int[] target, int[] arr) {
        int totals[] = new int [10001];
        if(target.length != arr.length) return false;
        for (int i = 0; i < totals.length; i++) {
            totals[arr[i]]++;
            totals[target[i]]--;
        }
        for (int i = 0; i < totals.length; i++) {
            if(totals[i]!=0) return false;
        }
        return true;
    }
}
