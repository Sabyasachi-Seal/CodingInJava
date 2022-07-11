public class gasstation {
    public int canCompleteCircuit(int[] gas, int[] cost){
        int s1 = 0, s2 = 0;
        for(int i=0; i<gas.length; i++){
            s1 += gas[i];
            s2 += cost[i];
        }
        
        if(s1 < s2) return -1;
        
        int tank = 0;
        int ans = 0;
        for(int i=0; i<gas.length; i++){
            if(tank<0){
                ans = i;
                tank = gas[i] - cost[i];
            }
            else{ 
                tank += gas[i] - cost[i];
            }
        }
        return ans;
    }
}
