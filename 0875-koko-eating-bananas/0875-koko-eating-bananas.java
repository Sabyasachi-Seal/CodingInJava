class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // try brute force

        // for every decrementing value of K, see if all the arrays can be minimixed
        // for a index i, see how much is the required hours

        // try binary search for the range of k to piles[end]
        
        int max = 0;
        
        for(int i: piles) max = Math.max(max, i);
        
        int k = 0;
        
        int start = 0;
        int end = max;
        
        if(h > end && piles.length==1) return 1;
        
        int cE = 0;
        while(start <= end){
            
            int midK = (start+end)/2;
            
            if(midK == 0) midK++;
            
            cE = canEat(midK, piles, h);
            
            if(cE >= 0){ // this means the ans is valid, we can decrease the midK
                end = midK - 1;
            }
            else{ // this means we must increase the midK for more bananas
                start = midK+1;
            }
        }

        return start;
    }
    private int canEat(int k, int[] arr, int h){

        int ind = 0;
        
        while(ind<arr.length){
            
            h -= arr[ind]/k;

            if((arr[ind]%k)!=0) h--;

            ind++;
            
        }
        return h;
    }
}