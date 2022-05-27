// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class reducetozero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num>0){
            if((num&1)==1){
                num--;
            }
            else{
                num /= 2;
            }
            steps++;
        }
        return steps;
    }
}
