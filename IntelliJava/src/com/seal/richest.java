package com.seal;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for(int i=0; i<accounts.length; i++){
            int wealth =0;
            for(int j=0; j<accounts[i].lenght; j++){
                wealth += accounts[i][j];
            }
            if(wealth > richest){
                richest = wealth;
            }
        }
        return richest;
    }
}