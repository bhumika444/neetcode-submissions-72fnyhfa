class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int p : piles){
            max = Math.max(p, max);
        }
        int l = 1, r = max, k = r;
        while(l <= r){
            int m = l + (r - l) / 2;
            int hrs = 0;
            for(int p : piles){
                hrs += (p + m - 1)/ m;
            }
            if(hrs <= h){
                    k = Math.min(k, m);
                    r = m - 1;
                }
                else{
                    l = m + 1;
                }
        }
        return k;
    }
}
