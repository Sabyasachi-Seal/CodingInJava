import java.util.ArrayList;

// https://leetcode.com/problems/count-items-matching-a-rule/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i = 0;
        for (List<String> item: items){
            if(ruleKey.equals("type") && ruleValue.equals(item.get(0))){
                i++;
            }
            else if(ruleKey.equals("color") && ruleValue.equals(item.get(1))){
                i++;
            }
            else if(ruleKey.equals("name") && ruleValue.equals(item.get(2))){
                i++;
            }
        }
        return i;
    }
}