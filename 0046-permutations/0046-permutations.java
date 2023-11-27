class Solution {
    private List<List<Integer>> ans;
    private boolean[] taken;
    
    public List<List<Integer>> permute(int[] nums) {
        
        ans = new ArrayList<>();
        taken = new boolean[nums.length+1];
        
        getPermu(nums, 0, new ArrayList<>());
        
        return ans;
    }
    
    private void getPermu(int[] arr, int ind, ArrayList<Integer> curr){
        
        if(curr.size() == arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        // if(ind==arr.length) return ;
        
        for(int i=0; i<arr.length; i++){
    
            if(taken[i]) continue;
            
            taken[i] = true;
            curr.add(arr[i]);
            
            getPermu(arr, i+1, curr);
            
            curr.remove(curr.size()-1);
            taken[i] = false;
            
        }
        
        return;
    }
}