class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int p : piles){
            max = Math.max(max, p);
        }
        int l = 1, r = max;
        int min = max;
        while(l <= r){
            int hours = 0;
            int m = l + (r - l) / 2;
            for(int p : piles){
                hours += (p + m - 1)/ m;
            }
            if(hours <= h){
                min = Math.min(min, m);
                r = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return min;
    }
}
