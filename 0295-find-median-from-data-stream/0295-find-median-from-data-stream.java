class MedianFinder {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        
        maxHeap.offer(num);
        
        if(minHeap.size() < maxHeap.size()-1){
            minHeap.offer(maxHeap.poll());    
        }
        
       
        
        if(maxHeap.size()!=0 && minHeap.size()!=0 && maxHeap.peek() > minHeap.peek()){
            minHeap.offer(maxHeap.poll());  
            
        }
        
         if(minHeap.size() -1 > maxHeap.size()){
            maxHeap.offer(minHeap.poll());    
        }
        
    }
    
    public double findMedian() {
        
        if(minHeap.size() == maxHeap.size()){
            
            double sum = minHeap.peek() + maxHeap.peek();
            
            return sum/2.0;
        }
        else if(minHeap.size() > maxHeap.size()){
            return minHeap.peek();
        }
        else{
            return maxHeap.peek();
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */