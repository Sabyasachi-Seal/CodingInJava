import java.util.Arrays;
public class recursivebubble {
    public static void main(String[] args) {
        int []arr = new int[]{2, 5, 1, 2, 4, 1, 6, 9};
        recursivebubble o = new recursivebubble();
        o.bubble(0, 0, arr);
        System.out.println(Arrays.toString(arr));
    }
    private void bubble(int i, int j, int []arr){
        if(i == arr.length){
            return;
        }
        if(j < arr.length-1){
            if(arr[j] > arr[j+1]){
                arr[j] = arr[j] ^ arr[j+1];
                arr[j+1] = arr[j] ^ arr[j+1];
                arr[j] = arr[j] ^ arr[j+1];
            }
            bubble(i, j+1, arr);
        }
        else{
            bubble(i+1, 0, arr);
        }
    }
}
