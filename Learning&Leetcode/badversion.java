//https://leetcode.com/problems/first-bad-version/
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0, end = n, mid = 1;
        while(start<end){
            mid = start+(end-start)/2;
            if(isBadVersion(mid)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        if(start==end && isBadVersion(start)){
            return start;
        }
        return -1;
    }
}