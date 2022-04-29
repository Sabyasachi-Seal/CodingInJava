public class uniqueint {
    public static int[] sumZero(int n) {
        int i;
        int [] arr =  new int[n];
        for(i=0; i<n-1; i+=2){
            arr[i] = i+1;
            arr[i+1] = -(i+1);
        }
        arr[n-1] = ((n&1)==0)?arr[n-1]:0;
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = sumZero(5);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
