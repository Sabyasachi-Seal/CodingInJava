/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    
    //  have a hashmap of values and nodes
    
    HashMap<Integer, Node> v = new HashMap<>();
    
    public Node cloneGraph(Node node) {
        
        if(node == null) return null;
        
        return addChild(node, null);
        
        // go to a node.
        // see if that node is added
        // if not then continue
        // add all its children in its list
        // if added then return
        
        
    }
    private Node addChild(Node node, Node parent){
        
        if(v.containsKey(node.val)) return v.get(node.val);
        
        Node newNode = new Node(node.val);
        
        v.put(newNode.val, newNode);
        
        for(Node n: node.neighbors){
            
            newNode.neighbors.add(addChild(n,  node));
            
        }
        
        return newNode;
    }
}