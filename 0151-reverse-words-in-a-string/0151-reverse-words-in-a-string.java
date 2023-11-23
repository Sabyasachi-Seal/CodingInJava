class Solution {
    public String reverseWords(String s) {
        
        ArrayList<String> arr = new ArrayList<>();
        
        StringBuilder curr = new StringBuilder();
        
        for(char c: s.toCharArray()){
            if(c == ' '){
                if(curr.length()!=0){
                    arr.add(curr.toString());
                    curr.setLength(0);
                }
                
            }
            else curr.append(c);
        }
        
        if(curr.length()!=0){
            arr.add(curr.toString());
            curr.setLength(0);
        }
        
        // now swap
        
        int left = 0;
        int right = arr.size()-1;
        
        // System.out.println(arr);
        
        while(left<right){
            
            String temp = arr.get(right);
            
            arr.set(right, arr.get(left));
            
            arr.set(left, temp);
            
            left++;
            right--;
            
        }
        
        // System.out.println(arr);
        
        curr.setLength(0);
        
        int i = 0;
        
        for(String str: arr){
            curr.append(str);
            if(i!=arr.size()-1) curr.append(" ");
            i++;
        }
        
        return curr.toString();
        
    }
}