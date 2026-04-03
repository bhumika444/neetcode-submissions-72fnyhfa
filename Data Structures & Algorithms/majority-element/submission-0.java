class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int m = n /2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            int cnt = 1;
            // 2 2 1
            if(map.containsKey(nums[i])){
                cnt = map.get(nums[i]) + 1;
                // cnt++;
            }
            map.put(nums[i], cnt);
            
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
           // 5 4, 1 3
           int a = entry.getKey();
           int b = entry.getValue();
           if(b > m)
            return a;
        }
        
        return 0;
    }
}