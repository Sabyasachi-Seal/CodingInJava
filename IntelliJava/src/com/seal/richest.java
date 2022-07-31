package com.seal;
import java.util.*;
class richest {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for(int i=0; i<accounts.length; i++){
            int wealth =0;
            for(int j=0; j<accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            if(wealth > richest){
                richest = wealth;
            }
        }
        return richest;
    }
}