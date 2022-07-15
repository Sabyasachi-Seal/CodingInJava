public class mcoloring {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        return mcolouring(graph, new int[n], 0, m);
        
    }
    public boolean mcolouring(boolean graph[][], int[]colours, int node, int m){
        if(node == graph.length){
            return true;
        }
        for (int i=1; i<=m; i++){
            if(issafe(graph, colours, node, i)){
                colours[node] = i;
                if(mcolouring(graph, colours, node+1, m)) return true;
                colours[node] = 0;
            }
        }
        return false;
    }
    public boolean issafe(boolean[][]graph, int[] colours, int node, int selected){
        for(int i=0; i<graph.length; i++){
            if(graph[node][i]){
                if(colours[i] == selected) return false;
            }
        }
        return true;
    }
}
