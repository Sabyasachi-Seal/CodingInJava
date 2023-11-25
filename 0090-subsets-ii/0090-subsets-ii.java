class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        return getSubsets(nums, 0, new ArrayList<>(), new ArrayList<>());
    }
    
    private List<List<Integer>> getSubsets(int[] arr, int ind, ArrayList<Integer> curr, List<List<Integer>> ans){
        if(ind  == arr.length){
            
            if(!ans.contains(curr)) ans.add(new ArrayList<>(curr));
            
            return ans;
        }
        
        getSubsets(arr, ind+1, curr, ans);
        
        curr.add(arr[ind]);
        getSubsets(arr, ind+1, curr, ans);
        curr.remove(curr.size()-1);
        
        return ans;
        
    }
}