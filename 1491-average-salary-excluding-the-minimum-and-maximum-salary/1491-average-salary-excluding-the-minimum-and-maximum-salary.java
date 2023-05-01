class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for(int s: salary){
            sum += s;
            max = Math.max(max,s);
            min = Math.min(min,s);
        }
        return ((sum-max-min)/(salary.length-2));
    }
}