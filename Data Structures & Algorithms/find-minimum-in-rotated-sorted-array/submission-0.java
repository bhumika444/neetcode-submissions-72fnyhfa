class Solution {
    public int findMin(int[] nums) {
        int max = 0;
        for(int num : nums){
            max = Math.max(max,num);
        }
        int l = max;
        for(int num : nums){
            l = Math.min(num, l);
        }
        return l;
    }
}
