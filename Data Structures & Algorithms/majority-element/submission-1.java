class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0, res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > cnt)
            {
                res = num;
                cnt = map.get(num);
            }
        }
        
        return res;
    }
}