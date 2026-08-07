class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int p : piles){
            max = Math.max(max, p);
        }
       int l = 1, r =  max, k = r;
        while(l <= r){
            int m = (l + r) / 2;
            int sum = 0;
            for(int p : piles){
                sum += (p + m - 1)/ m;
                }
                if(sum <= h){
                    k = m;
                    r = m - 1;
                }
                else{
                    l = m + 1;
                }
            }
        return k;

    }
}
