// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if(max<salary[i]){
                max = salary[i];
            }
            if(min>salary[i]){
                min = salary[i];
            }
            sum += salary[i];
        }
        return (double)(sum-max-min)/(salary.length-2);
    }
}