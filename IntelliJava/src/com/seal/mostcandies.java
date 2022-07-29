package com.seal;
import java.util.*;
class mostcandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i = 0; i<candies.length; i++){
            max  = Math.max(max, candies[i]);
        }
        for(int i = 0; i<candies.length; i++){
            if(i + extraCandies >= max){
                result.add(true);
            }
        }
        return result;
    }
}