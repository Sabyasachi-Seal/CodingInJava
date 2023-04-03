class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // sort array
        // delete pairs
        
        Arrays.sort(people);
        
        // use binary search to find out if that limit - element exists in the array 
        
        int ans = 0;
        
        boolean v[] = new boolean[people.length];
        
        for(int i=0; i<people.length; i++){
            
            if(v[i]) continue;
            
            int curr = people[i];
            
            // now traverse in reverse to find the best option
            for(int j=people.length-1; j>i; j--){
                
                if(v[j]) continue;
                
                int next = people[j];
                
                if(next + curr <= limit){
                    
                    
                    v[j] = true;
                    v[i] = true;
                    
                    ans++;
                    
                    break;
                }
            }
            
        }
        
        
        // 1 2 4 5
        
        
        for(boolean vi: v){
            if(!vi) ans++;
        }
        return ans;
        
    }
}