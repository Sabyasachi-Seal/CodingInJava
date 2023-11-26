class Solution {
    public String getPermutation(int n, int k) {
        
        int fact = 1;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=1; i<n; i++){
            arr.add(i);
            fact *= i;
        }
        
        arr.add(n);
        
        StringBuilder ans = new StringBuilder();
        
        k--;
        
        while(true){
            
            ans.append(arr.get(k / fact));
            arr.remove(k/fact);
            
            if(arr.size() == 0) break;
            
            k %= fact;
            fact /= arr.size();
            
        }
        
        return ans.toString();
        
    }
}