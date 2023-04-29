class UnionFind {
    private int[] group;
    private int[] rank;

    UnionFind(int size) {
        group = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; ++i) {
            group[i] = i;
        }
    }

    public int find(int node) {
        if (group[node] != node) {
            group[node] = find(group[node]);
        }
        return group[node];
    }

    public void join(int node1, int node2) {
        int group1 = find(node1);
        int group2 = find(node2);
        
        // node1 and node2 already belong to same group.
        if (group1 == group2) {
            return;
        }

        if (rank[group1] > rank[group2]) {
            group[group2] = group1;
        } else if (rank[group1] < rank[group2]) {
            group[group1] = group2;
        } else {
            group[group1] = group2;
            rank[group2] += 1;
        }
    }
    
    public boolean areConnected(int node1, int node2) {
        int group1 = find(node1);
        int group2 = find(node2);
        return group1 == group2;
    }
};

class Solution {
    // Sort in increasing order based on the 3rd element of the array.
    private void sort(int[][] array) {
        Arrays.sort(array, new Comparator<int[]>() {
          @Override
          public int compare(int[] a, int[] b) {
            return a[2] - b[2];
          }
        });
    }
    
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        UnionFind uf = new UnionFind(n);
        int queriesCount = queries.length;
        boolean[] answer = new boolean[queriesCount];
        
        // Store original indices with all queries.
        int[][] queriesWithIndex = new int[queriesCount][4];
        for (int i = 0; i < queriesCount; ++i) {
            queriesWithIndex[i][0] = queries[i][0];
            queriesWithIndex[i][1] = queries[i][1];
            queriesWithIndex[i][2] = queries[i][2];
            queriesWithIndex[i][3] = i;
        }
        
        // Sort all edges in increasing order of their edge weights.
        sort(edgeList);
        // Sort all queries in increasing order of the limit of edge allowed.
        sort(queriesWithIndex);
         
        int edgesIndex = 0;
        
        // Iterate on each query one by one.
        for (int queryIndex = 0; queryIndex < queriesCount; queryIndex += 1) {
            int p = queriesWithIndex[queryIndex][0];
            int q = queriesWithIndex[queryIndex][1];
            int limit = queriesWithIndex[queryIndex][2];
            int queryOriginalIndex = queriesWithIndex[queryIndex][3];
            
            // We can attach all edges which satisfy the limit given by the query.
            while (edgesIndex < edgeList.length && edgeList[edgesIndex][2] < limit) {
                int node1 = edgeList[edgesIndex][0];
                int node2 = edgeList[edgesIndex][1];
                uf.join(node1, node2);
                edgesIndex += 1;
            }
            
            // If both nodes belong to the same component, it means we can reach them. 
            answer[queryOriginalIndex] = uf.areConnected(p, q);
        }
        
        return answer;
    }
}