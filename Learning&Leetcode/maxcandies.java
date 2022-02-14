class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int maxcandies = candies[0];
        int i;
        for(i=0; i<candies.length; i++){
            if(candies[i]>maxcandies){
                maxcandies = candies[i];
            }
        }
        for(i = 0; i<candies.length; i++){
            if(candies[i] + extraCandies >= maxcandies){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}