public class mergesortedarrayprac {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int end = m+n-1;
        while(m>0 && n>0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[end] = nums1[m-1];
                m--;
            }
            else{
                nums1[end] = nums2[n-1];
                n--;
            }
            end--;
        }
        while(n>0){
            nums1[end] = nums1[n-1];
            n--;
            end--;
        }
    }
}
