// https://leetcode.com/problems/create-target-array-in-the-given-order/
class targetarray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] result = createTargetArray(nums, index);
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int arr[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            arr[i] = -1;
        }
        for(int i = 0; i<nums.length; i++){
            if(arr[index[i]] != -1){
                for(int j = i-1; j>=0; j--){
                    if(index[j]>=index[i]){
                        index[j]++;
                    }
                    if(index[j]==index[i]){
                        break;
                    }
                }
            }
            else{
                arr[index[i]] = nums[i];
            }
            for(int i1 = 0; i1<index.length; i1++){
                System.out.print(index[i1] + " ");
            }
            System.out.println();
        }
        // for(int i=index.length-1; i>=0; i--){
        //     for(int j=i-1; j>=0; j--){
        //         if(index[i] == index[j]){
        //             index[j]++;
        //         }
        //     }
        //     for(int i1 = 0; i1<index.length; i1++){
        //         System.out.print(index[i1] + " ");
        //     }
        //     System.out.println();
        // }
        for(int i = 0; i<nums.length; i++){
            arr[index[i]] = nums[i];
        }
        return arr;
    }
}