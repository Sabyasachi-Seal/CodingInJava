// https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/
// https://www.youtube.com/watch?v=MjpAAE3-hYg
public class maximumvalue {
    public int maxValue(int n, int index, int maxSum) {
    //     long r   = n - index - 1;//right index
    //     long l = index;
    //     long start = 1;//for binary search
    //     long end = maxSum;
    //     long ans =0;
    //     while(start<=end){
    //         long mid = start + (end-start)/2;
    //         long sum = mid;
    //         long ls=0;
    //         long rs = 0;
    //         long m=mid-1;
    //         if(r < =m){
    //             rs = m*(m+1)/2 - (m-r ) *(m-r + 1)/2;
    //         }
    //         else{
    //             rs = m*(m+1)/2 - 1*(r - m);
    //         }
    //         if(l<=m){
    //             ls = m*(m+1)/2 - (m-l)*(m-l+1)/2;
    //         }
    //         else{
    //             ls = m*(m+1)/2 - 1*(l-m);
    //         }
    //         sum+=(ls+rs);
    //         if(sum<=maxSum){
    //             ans = mid;
    //             start = mid+1;
    //         }
    //         else{
    //             end = mid -1;
    //         }
    //     }
    //     return (int)ans;
    // }
    long r = n-index-1;
        long l=index;
        
        long hi=maxSum;
        long lo=1;
        
        long res=0;
        
        while(lo<=hi)
        {
            long mid=(hi-lo)/2 + lo;
            long sum=mid;
            long ls=0;//sum on left
            long rs=0;//sum on right
            long m=mid-1;
            
            if(r <= m)
                rs=m*(m+1)/2 - (m-r)*(m-r + 1)/2;
            else
                rs=m*(m+1)/2 + 1*(r - m);
            
            if(l<=m)
                ls=m*(m+1)/2 - (m-l)*(m-l+1)/2;
            else
                ls=m*(m+1)/2 + 1*(l-m);
            
            sum+=ls+rs;
            
            if(sum<=maxSum)
            {
                res=mid;
                lo=mid+1;
            }
            else
            {
                hi=mid-1;
            }
            
        }
        return (int)res;
    }
}
