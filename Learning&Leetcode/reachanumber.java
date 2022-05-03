// https://leetcode.com/problems/reach-a-number/submissions/
public class reachanumber {
    public static int reachNumber(int target) {
        target = Math.abs(target);
        int sum =0, count=0;
        while(sum<target){
            count++;
            sum += count;
        }
        return (sum-target)%2==0?count: count%2==0?count+1:count+2;
    }
    public static void main(String[] args) {
        System.out.println(reachNumber(2));
    }
}
