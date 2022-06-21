import java.util.HashMap;

// https://leetcode.com/problems/roman-to-integer/
public class romantoint {
    public int romanToInt(String s) {
        HashMap<Character, Integer> nums = new HashMap<>();
        nums.put('I', 1);
        nums.put('V', 5);
        nums.put('X', 10);
        nums.put('L', 50);
        nums.put('C', 100);
        nums.put('D', 500);
        nums.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(nums.get(s.charAt(i)) < nums.get(s.charAt(i+1))){
                sum -= nums.get(s.charAt(i));
            }
            else{
                sum += nums.get(s.charAt(i));
            }
        }
        sum += nums.get(s.charAt(s.length()-1));
        return sum;
    }
}
