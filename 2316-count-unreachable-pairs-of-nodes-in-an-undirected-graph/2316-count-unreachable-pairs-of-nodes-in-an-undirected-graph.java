class Solution {
     boolean visited[];
    public long countPairs(int n, int[][] edges) {
        
        // return the conneted components
        
        HashMap<Integer, HashSet<Integer>> nodes = new HashMap<>();
        
        for(int row[]: edges){
            
            int s = row[0];
            int d = row[1];
            
            if(!nodes.containsKey(s)) nodes.put(s, new HashSet<Integer>());
            if(!nodes.containsKey(d)) nodes.put(d, new HashSet<Integer>());
            
            
            nodes.get(s).add(d);
            nodes.get(d).add(s);
        }
        
        System.out.println(Arrays.asList(nodes));
        
        // try to run dfs on the nodes to see if it is connected
        // run a loop and check for every node if some is missing, if it is found, then return true;
        // 
        
        long ans = 0;
        
        visited = new boolean[n];
        
        long connectedNodes = 0;
        
        long remainingNodes = n;
        
        for(int i=0; i<n; i++){
             if(!visited[i]){
                 
                 connectedNodes = dfs(nodes, i);
                 
                 ans += connectedNodes * (remainingNodes - connectedNodes);
                 
                 remainingNodes -= connectedNodes;
                 
             }
        }
        
        return ans;
        
    }
    
    private long dfs(HashMap<Integer, HashSet<Integer>> nodes, int s){
        
        long count = 1;
        
        if(!nodes.containsKey(s)) return count;
        
        visited[s] = true;
        
        for(int node: nodes.get(s)){
                
            if(node != s && !visited[node]){
                
                count += dfs(nodes, node);
            }
            
        }
        
        return count;
        
    }
}