class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // sort array
        // delete pairs
        
        Arrays.sort(people);
        
        int ans = 0;
        
        int left = 0;
        int right = people.length-1;
        
        // 1 2 2 3
        
        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
                right--;   
                ans++;
            }
            else{
                right--;
                ans++;
            }
            
        }
        
        return ans;
        
    }
    
}