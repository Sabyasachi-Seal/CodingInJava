class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        return getSubsets(nums, 0, new ArrayList<>(), new ArrayList<>(), new HashSet<>());
    }
    
    private List<List<Integer>> getSubsets(int[] arr, int ind, ArrayList<Integer> curr, List<List<Integer>> ans, HashSet<List<Integer>> hs){
        if(ind  == arr.length){
            
            if(!hs.contains(curr)){
                
                ArrayList<Integer> newAns = new ArrayList<>(curr);
                
                ans.add(newAns);
                hs.add(newAns);
            }
            
            return ans;
        }
        
        getSubsets(arr, ind+1, curr, ans, hs);
        
        curr.add(arr[ind]);
        
        getSubsets(arr, ind+1, curr, ans, hs);
        
        curr.remove(curr.size()-1);
        
        return ans;
        
    }
}