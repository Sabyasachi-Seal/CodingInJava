/* https://leetcode.com/problems/richest-customer-wealth/ */
class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest=0, current;
        for(int i = 0; i<accounts.length; i++){
            current = 0;
            for(int j=0; j<accounts[i].length; j++){
                current = current + accounts[i][j];
            }
            if (current > richest){
                richest = current;
            }
        }
        return richest;
    }
}