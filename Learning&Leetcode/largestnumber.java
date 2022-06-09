import java.util.Arrays;

// https://leetcode.com/problems/largest-number/
public class largestnumber {
    public String largestNumber(int[] nums) {
        // StringBuilder ans = new StringBuilder();
        String[] digs = new String[nums.length];
        for (int i = 0; i < digs.length; i++) {
            digs[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(digs, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        return Arrays.stream(digs).reduce((x, y) -> x.equals("0")?y:x+y).get();
    }
}
