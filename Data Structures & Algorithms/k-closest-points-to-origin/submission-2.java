class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int res[][] = new int[k][2];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x,y)->(y[0] * y[0] + y[1] * y[1]) - (x[0] * x[0] + x[1] * x[1]));
        for(int p[] : points){
            maxHeap.offer(p);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        int i = 0; 
        while(!maxHeap.isEmpty()){
            res[i++] = maxHeap.poll();
        }
        return res;
    }
}
