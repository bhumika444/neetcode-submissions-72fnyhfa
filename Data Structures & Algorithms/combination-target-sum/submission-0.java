class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        backtrack(nums, target, sum, 0);
        return res;
    }
    public void backtrack(int[] nums, int target, List<Integer> sum, int i){
        if(target == 0){
            res.add(new ArrayList<>(sum));
            return;
        }
        if(target < 0 || i >= nums.length){
            return;
        }
        sum.add(nums[i]);
        backtrack(nums, target - nums[i], sum, i);
        sum.remove(sum.size() - 1);
        backtrack(nums, target, sum, i + 1);
    }
}
