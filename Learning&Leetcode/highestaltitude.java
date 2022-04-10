// https://leetcode.com/problems/find-the-highest-altitude/

class highestaltitude {
    public static int largestAltitude(int[] gain) {
        int alt = 0;
        for(int i=1; i<gain.length-1; i++){
            gain[i] = gain[i] + gain[i-1];
            if(gain[i] > alt){
                alt = gain[i];
            }
        }
        if (alt<gain[0]){
            return gain[0];
        }
        return alt;
    }
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}