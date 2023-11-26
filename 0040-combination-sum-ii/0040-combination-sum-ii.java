class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        ans = new ArrayList<>();
        getCombi2(arr, target, 0, new ArrayList<>());
        return ans;
    }
    private void getCombi2(int[]arr, int t, int ind, ArrayList<Integer> curr){
        
        if(t==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        // if(t < 0 || ind == arr.length) return;
        
        for(int i=ind; i<arr.length; i++){
            
            if(i>ind && arr[i]==arr[i-1]) continue;
            
            if(arr[i] > t) break; 
            
            curr.add(arr[i]);
            
            getCombi2(arr, t-arr[i], i+1, curr);
            
            curr.remove(curr.size()-1);
            
        }
    }
}