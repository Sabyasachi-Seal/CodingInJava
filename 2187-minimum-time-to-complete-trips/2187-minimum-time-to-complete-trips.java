class Solution {
    
    private long max = 100000000000000L;
    
    public long minimumTime(int[] time, int totalTrips) {
        
        // no of buses = time.length
        
        long start = 1;
        
        long end = max;
        
        while(start <= end){
            
            long mid = start + (end-start)/2;
            
            long currAns = completeTrip(time, mid);
            
            if(currAns >= totalTrips){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            
        }
        return start;
    }
    private long completeTrip(int arr[], long time){
        
        // check the completed trips for a time
        long ans = 0;
        
        for(int i=0; i<arr.length; i++){
            
            ans += time/arr[i];
            
        }
        
        return ans;
    }
}