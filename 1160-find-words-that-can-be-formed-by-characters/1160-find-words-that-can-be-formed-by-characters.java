class Solution {
    public int countCharacters(String[] words, String chars) {
        
        HashMap<Character, Integer> mainArr = new HashMap<>();
        
        for(int i=0; i<chars.length(); i++){
            mainArr.put(chars.charAt(i), mainArr.getOrDefault(chars.charAt(i), 0)+1);
        }
        
        int ans = 0;
        
        for(String word: words){
            
            boolean tookWord = true;
            
            HashMap<Character, Integer> currWord = new HashMap<>();
            
            for(int i=0; i<word.length(); i++){
                currWord.put(word.charAt(i), currWord.getOrDefault(word.charAt(i), 0)+1);
            }
            
            for(char key: currWord.keySet()){
                
                if(mainArr.containsKey(key) && mainArr.get(key)>=currWord.get(key)){
                    continue;
                }
                tookWord = false;
                break;
                
            }
            
            if (tookWord) ans+=word.length();
            
        }
        
        return ans;
        
    }
}