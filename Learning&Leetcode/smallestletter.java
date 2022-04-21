// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class smallestletter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end=letters.length-1, mid=1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(letters[mid]==target){
                start = mid + 1;
            }
            else if(letters[mid]<target){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return letters[start%letters.length];
    }
    public static void main(String[] args){
        // char[] letters = {'c', 'f','j'};
        char [] letters = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        System.out.println(nextGreatestLetter(letters, target));
    }
}
