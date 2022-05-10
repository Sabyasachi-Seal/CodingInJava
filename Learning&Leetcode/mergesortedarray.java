import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/
public class mergesortedarray {
    // public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //     if(nums2.length==0) return;
    //     n-=1;
    //     for(int i=nums1.length-1; i>=0; i--){
    //         if(nums1[i]==0 && n>=0){
    //             nums1[i] = nums2[n--];
    //         }
    //     }   
    //     Arrays.sort(nums1);
    // }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int last = m+n-1;
        while(m>0 && n>0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[last] = nums1[m-1];
                m--; 
            }
            else{
                nums1[last] = nums2[n-1];
                n--;
            }
            last--;
        }
        while(n>0){
            nums1[last] = nums2[n-1];
            n--;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 0, 0, 0};
        int[] a2 = {4, 5, 6};
        merge(a1, 3, a2, 3);
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]+" ");
        }
    }
}
