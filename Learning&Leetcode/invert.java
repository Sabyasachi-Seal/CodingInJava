class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image[0].length];
        for (int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                result[i][j] = image[i][image[i].length-j-1] ^ 1;
            }
        }
        return result;
    }
}