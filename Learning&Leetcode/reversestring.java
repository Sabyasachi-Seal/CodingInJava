public class reversestring {
    public static void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }
    public static void swap(char[] arr, int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void reverse(char[] arr, int i, int j){
        if(i<=j){
            swap(arr, i, j);
            reverse(arr, ++i, --j);
        }
    }

}
