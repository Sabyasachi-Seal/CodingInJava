class Solution {
    private List<List<Integer>> ans;
    
    public List<List<Integer>> permute(int[] nums) {
        
        ans = new ArrayList<>();
        
        getPermu(nums, 0, new ArrayList<>());
        
        return ans;
    }
    
    private void getPermu(int[] arr, int ind, ArrayList<Integer> curr){
        
        if(curr.size() == arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=0; i<arr.length; i++){
    
            if(arr[i]==-11) continue;
            
            
            int tempVar = arr[i];
            
            curr.add(arr[i]);
            arr[i] = -11;
            
            getPermu(arr, i+1, curr);
            
            curr.remove(curr.size()-1);
            arr[i] = tempVar;
            
        }
        
        return;
    }
}