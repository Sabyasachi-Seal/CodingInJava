class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int ind1=0, ind2=0;
        
        int size = nums1.length + nums2.length;
        
        int c = 0;
        
        ind2 = size/2;
        ind1 = ind2-1;
        
        int ele1 = -1;
        int ele2 = -1;
        
        int i=0, j=0;
        
        while(i<nums1.length && j<nums2.length){
            
            if(nums1[i]<=nums2[j]){
                if(c == ind1) ele1 = nums1[i];
                if(c == ind2) ele2 = nums1[i];
                
                c++;
                i++;
            }
            else{
                if(c == ind1) ele1 = nums2[j];
                if(c == ind2) ele2 = nums2[j];
                
                c++;
                j++;
            }
            
        }
        while(i<nums1.length){

                if(c == ind1) ele1 = nums1[i];
                if(c == ind2) ele2 = nums1[i];
                
                c++;
                i++;
            
        }
        while(j<nums2.length){
            
                if(c == ind1) ele1 = nums2[j];
                if(c == ind2) ele2 = nums2[j];
                
                c++;
                j++;
            
        }
        
        if(size%2 != 0){
            return (double)(ele2);
        } 
        else return ((double)(ele1+ele2))/2;
        
    }
    
}