class SmallestInfiniteSet {

    PriorityQueue<Integer> q;
    int minnum;
    
    public SmallestInfiniteSet() {
        q = new PriorityQueue<>();
        minnum = 1;
    }
    
    public int popSmallest() {
        
        if(!q.isEmpty()){
            
            return q.poll();
            
        }
        return minnum++;
    }
    
    public void addBack(int num) {
        if(num<minnum && !q.contains(num)) q.offer(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */