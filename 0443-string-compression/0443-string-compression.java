class Solution {
    public int compress(char[] chars) {
        // find groups
        // if length 1, add to s
        // also modify the chars array
        
        // finding groups
        int right = 0, left = 0, nextind = 0, prevind = 0, ans = 0;
        
        while(right<chars.length || left!=right){
            
            if(right<chars.length && chars[left] == chars[right]){ // group is same
                right++;
            }
            else{ // diff group.
                ans++;
                //calculate the size of the window
                int size = right-left;
                
                //now check conditions
                
                if(size == 1){
                    chars[prevind] = chars[left];
                    prevind++;
                }
                
                else if(size > 1){
                
                    ans++;
                    
                    chars[prevind] = chars[left];
                    
                    nextind = prevind+1;
                    
                    // if size is more than 10
                    char carr[] = Integer.toString(size).toCharArray();
                    
                    for(int i = 0; i<carr.length-1; i++){
                        chars[nextind] = carr[i];
                        nextind++;
                        ans++;
                    }
                    
                    // while(size > 9){
                    //     chars[nextind] = (char)((size / 10)+'0');
                    //     size %= 10;
                    //     nextind++;
                    //     ans++;
                    // }
                    
                    
                    // place the last digit of the size
                    chars[nextind] = (char)(size%10+'0');
                    prevind = nextind+1;
                    
                }
                
                // reset pointer to the curr posi for new group
                left = right;
            }
            
        }
        return ans;
    }
}