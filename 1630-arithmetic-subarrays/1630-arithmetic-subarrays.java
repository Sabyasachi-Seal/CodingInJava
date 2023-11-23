class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> ans = new ArrayList<>();
        
        for(int i=0; i<l.length; i++){
            int[] arr = new int[r[i] - l[i] + 1];
            for(int j=0; j<arr.length; j++){
                arr[j] = nums[l[i] + j];
            }
            ans.add(check(arr));
        }
        return ans;
    }
    private boolean check(int[] arr){
        
        int minE = Integer.MAX_VALUE;
        int maxE = Integer.MIN_VALUE;
        
        HashSet<Integer> arrSet = new HashSet<>();
        
        for(int i: arr){
            minE = Math.min(minE, i);
            maxE = Math.max(maxE, i);
            
            arrSet.add(i);
        }
        
        if((maxE - minE)%(arr.length-1) != 0) return false;
        
        int diff = (maxE - minE)/(arr.length-1);
        
        int curr = minE + diff;
        
        while(curr<maxE){
            if(!arrSet.contains(curr)){
                return false;
            }
            curr += diff;
        }
        
        return true;
    }
}