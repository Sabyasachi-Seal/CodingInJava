public class maxpointscards {
    public static int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for (int i : cardPoints) {
            sum += i;
        }
        return sum-minsub(cardPoints, cardPoints.length-k,sum);
    }
    // private static int minsub(int[] arr, int size){
    //     int min = Integer.MAX_VALUE;
    //     int curr = min;
    //     for (int i = 0; i <= arr.length-size; i++) {
    //         curr = 0;
    //         for (int j = i; j < i+size; j++) {
    //             curr += arr[j];
    //         }
    //         if(curr<min) min = curr;
    //     }
    //     return min;
    // }
    private static int minsub(int[] arr, int size, int sum){
        int curr = 0;
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        while(right < arr.length){
            curr += arr[right];
            if((right - left + 1) == size){
                if(curr<min) min = curr;
                curr -= arr[left];
                left++;
            }
            right ++;
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{9,7,7,9,7,7,9}, 7));
    }
}
