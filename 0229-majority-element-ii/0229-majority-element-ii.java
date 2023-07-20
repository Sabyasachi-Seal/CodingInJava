class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, e1=Integer.MAX_VALUE, c2 = 0, e2=Integer.MAX_VALUE;
        for(int i: nums){
            if(c1 == 0 && e2 != i){
                e1 = i;
                c1++;
            }
            else if(c2 == 0 && e1 != i){
                e2 = i;
                c2++;
            }
            else if(e1 == i){
                c1++;
            }
            else if(e2 == i){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        int mm = nums.length/3;
        
        c1=0;
        c2=0;
        
        for(int i: nums){
            if(i == e1){
                c1++;
            }    
            if(i == e2){
                c2++;
            } 
        }
        
        
        if(c1>mm) ans.add(e1);
        
        
        if(c2>mm) ans.add(e2);
        
        
        return ans;
    }
}