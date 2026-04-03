class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], curr = 0;
        for(int num : nums){
            curr = Math.max(curr + num, num);
            max = Math.max(curr, max);
        }
        return max;
    }
}
