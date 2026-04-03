class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }
    public void backtrack(int[] nums, int i, List<Integer> temp, List<List<Integer>> res){
        if(res.contains(temp)) return;
        if(i >= nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        // for(int i = 0, i < nums.length; i++){
            temp.add(nums[i]);
            backtrack(nums, i + 1, temp, res);
            temp.remove(temp.size() - 1);
            backtrack(nums, i + 1, temp, res);
        // }
    }
}
