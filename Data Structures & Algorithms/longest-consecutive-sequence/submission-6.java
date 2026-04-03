class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set <Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num : nums){
            int streak = 0, curr = num;
            while(set.contains(curr)){
                streak++; 
                curr++;
            }
            res = Math.max(res,streak);
        }
        return res;
    }
}
