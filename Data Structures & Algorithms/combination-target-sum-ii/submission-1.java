class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, new ArrayList<>(), 0);
        return res;
    }
    public void backtrack(int[] candidates, int target, List<Integer> temp, int start){
        // if(res.contains(temp)) return;
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0)
            return;
        for(int i = start; i < candidates.length; i++){
            if(i > start && candidates[i] == candidates[i - 1])
                continue;
            if(candidates[i] > target)
                return;
            temp.add(candidates[i]);
            backtrack(candidates, target - candidates[i], temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
