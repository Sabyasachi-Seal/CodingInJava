class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int ans[] = new int[spells.length];
        
        Arrays.sort(potions);
        
        int maxPotion = potions[potions.length-1];
        
        for(int i=0; i<ans.length; i++){
            
            long minPotion = (long) Math.ceil((1.0 * success) / spells[i]);
            
            if(minPotion > maxPotion){
                ans[i] = 0;
                continue;
            }
            
            ans[i] = potions.length - bs(potions, (int) minPotion);
        }
        
        return ans;
        
    }
    
    private int bs(int arr[], int target){
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        
        return start;
        
    }
    
}