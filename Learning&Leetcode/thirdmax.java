import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/third-maximum-number/
public class thirdmax {
    public static int thirdMax(int[] nums) {
        // ArrayList<Integer> ans = new ArrayList<Integer>();
        // Arrays.sort(nums);
        // ans.add(nums[0]);
        // for (int i = 1; i < nums.length; i++) {
        //     if(nums[i]!=nums[i-1]) ans.add(nums[i]);
        // }
        // if(ans.size()<2){
        //     return nums[0];
        // }
        // else if(ans.size()<3){
        //     return (ans.get(0)>ans.get(1))?ans.get(0):ans.get(1);
        // }
        // return ans.get(ans.size()-3);
        
        int i;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(nums[0]);
        for (i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]) ans.add(nums[i]);
        }
        if(ans.size()<2){
            return nums[0];
        }
        else if(ans.size()<3){
            return (ans.get(0)>ans.get(1))?ans.get(0):ans.get(1);
        }
        int m1=Integer.MIN_VALUE, m2=Integer.MIN_VALUE, m3=Integer.MIN_VALUE;
        for (i = 0; i < ans.size(); i++) {
            if(ans.get(i)>m1){
                m1 = ans.get(i);
            }
            else if(ans.get(i)>m2 && ans.get(i)<m1){
                m2 = ans.get(i);
            }
            else if(ans.get(i)>m3 && ans.get(i)<m2){
                m3 = ans.get(i);
            }
        }
        for (i = 0; i < ans.size(); i++) {
            if(ans.get(i)>m2 && ans.get(i)<m1){
                m2 = ans.get(i);
            }
        }
        for (i = 0; i < ans.size(); i++) {
            if(ans.get(i)>m3 && ans.get(i)<m2){
                m3 = ans.get(i);
            }
        }
        if(m3 == Integer.MIN_VALUE && !(ans.contains(m3))){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        return m3;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,4,3,3,3,3};
        System.out.println(thirdMax(arr));
    }
}
