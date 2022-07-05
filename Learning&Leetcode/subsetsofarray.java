public class subsetsofarray {
    public static void main(String[] args) {
        subsets(0, 0, new int[]{1, 2, 3});
    }
    public static void subsets(int i, int j, int arr[]){
        for (int k = 0; k < (1<<arr.length); k++) {
            for (int k2 = 0; k2 < arr.length; k2++) {
                if((k & (1<<k2))>0){
                    System.out.print(arr[k2] + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
