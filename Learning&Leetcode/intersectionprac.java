import java.util.*;
public class intersectionprac {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1=0, n2=0;
        while(n1<nums1.length && n2<nums2.length){
            if(nums1[n1] == nums2[n2] && !(arr.contains(nums1[n1]))){
                arr.add(n1);
                n1++;
                n2++;
            }
            else if(nums1[n1] < nums2[n2]){
                n1++;
            }
            else{
                n2++;
            }
            
        }
        int[] ans = new int[arr.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
