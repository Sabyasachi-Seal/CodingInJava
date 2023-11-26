class Solution {
    public List<List<String>> partition(String s) {
        return func(s, 0, new ArrayList<>(), new ArrayList<>());
    }
    private List<List<String>> func(String s, int ind, ArrayList<String> curr, List<List<String>> ans){
        if(ind == s.length()){
            ans.add(new ArrayList<>(curr));
            return ans;
        }
        
        for(int i=ind; i<s.length(); i++){
            if(isPalindrome(s, ind, i)){
                
                curr.add(s.substring(ind, i+1));
                func(s, i+1, curr, ans);
                curr.remove(curr.size()-1);
                
            }
        }
        
        return ans;
        
    }
    private boolean isPalindrome(String s, int start, int end){
        
        while(start<end){
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }
            else return false;
        }
        return true;
        
    }
}