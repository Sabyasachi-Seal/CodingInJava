// https://leetcode.com/problems/maximum-population-year/
class maxpopulation {
    public static int maximumPopulation(int[][] logs) {
        int maxpop = 0;
        int currpop = 0;
        int minyear = logs[0][0];
        int flag = 0;
        for(int i=0; i<logs.length; i++){
            if(logs[i][1]>logs[i+1][0]){
                currpop++;
                if(maxpop<currpop && flag==1){
                    flag = 0;
                    maxpop = currpop;
                    minyear = logs[i+1][0];
                }
                else if(maxpop<currpop && flag==0){
                    maxpop = currpop;
                    if(i==0){
                        minyear = logs[i+1][0];
                    }
                }
            }
            else{
                flag = 1;
                currpop = 0;
            }
            System.out.println(currpop);
        }
        return minyear;
    }
    public static void main(String[] args) {
        // int[][] logs = {{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}};
        // int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        // int[][] logs = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(logs));
    }
}