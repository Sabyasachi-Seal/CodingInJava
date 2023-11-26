class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        Arrays.sort(arr);
        return getCombi (arr, target, 0, new ArrayList<>(), new ArrayList<>(), new HashSet<>());
    }
    private List<List<Integer>> getCombi(int[] arr, int t, int ind, ArrayList<Integer> curr, List<List<Integer>> ans, HashSet<List<Integer>> hs){
        
        if(t == 0){
            
            if(!hs.contains(curr)){
                ans.add(new ArrayList<>(curr));
                hs.add(ans.get(ans.size()-1));
            }
            
            return ans;
        }
        
        if (t < 0 || ind == arr.length) return ans;
        
        curr.add(arr[ind]);
        getCombi(arr, t-arr[ind], ind, curr, ans, hs);
        curr.remove(curr.size()-1);
        
        getCombi(arr, t, ind+1, curr, ans, hs);
        
        return ans;
    }
}