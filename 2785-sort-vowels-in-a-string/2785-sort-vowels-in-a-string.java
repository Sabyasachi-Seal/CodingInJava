class Solution {
    public String sortVowels(String s) {
        
        ArrayList<Character> v = new ArrayList<>();
        
        HashSet<Character> hs = new HashSet<>();
        
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        
        
        for(char c: s.toCharArray()){
            if(hs.contains(c)){
                v.add(c);
            }
        }
        
        // System.out.println(Arrays.asList(v));
        
        Collections.sort(v);
        
        StringBuilder sb = new StringBuilder();
        
        int ind = 0;
        
        for(char c: s.toCharArray()){
            if(hs.contains(c)){
                sb.append(v.get(ind));
                ind++;
            }
            else sb.append(c);
        }
        
        
        return sb.toString();
        
    }
}