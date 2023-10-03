//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class CompareShit implements Comparator<Item>{
    
    @Override
    public int compare(Item a, Item b){
        
        double B = (double)b.value/(double)b.weight; 
        double A = (double)a.value/(double)a.weight;
        
        if (B >= A) return 1;
        else return -1;
        // else return 0;
    }
    
}

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        
        Arrays.sort(arr, new CompareShit());
        
        // for (Item a: arr) System.out.println(a.value+"-"+a.weight);
        
        double ans = 0.0;
        
        int tempW = W;
        
        for(int i=0; i<arr.length; i++){
            
            Item curr = arr[i];
            
            // System.out.println(tempW);
            
            if(curr.weight<=tempW){
                
                tempW -= curr.weight;
                
                ans += curr.value;    
            }
            else{
                
                double ratio = (double)tempW/(double)curr.weight;
                
                ans += ratio * curr.value;
                
                break;
                
            }
        }
        
        return ans;
    }
}