class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0, max = nums[0];
        for(int num : nums){
            curr = Math.max(curr + num, num);
            max = Math.max(curr, max);

        }
        return max;
    }
}
