class Solution {
    public int compareVersion(String version1, String version2) {
        
        
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int i=0, j=0;
        
        // System.out.println(Arrays.asList(v1));
        // System.out.println(Arrays.asList(v2));
        
        while(i<v1.length && j<v2.length){
            
            int i1 = Integer.parseInt(v1[i]);
            int i2 = Integer.parseInt(v2[j]);
            
            // System.out.println(i1+" "+i2);
            
            if(i1 > i2) return 1;
            else if (i1 < i2) return -1;
            
            i++;
            j++;
            
        }
        
        while(i<v1.length){
            if(Integer.parseInt(v1[i])>0) return 1;
            i++;
        }
        
        
        while(j<v2.length){
            if(Integer.parseInt(v2[j])>0) return -1;
            j++;
        }
        
        return 0;
        
    }
}