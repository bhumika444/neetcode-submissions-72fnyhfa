class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if((nums[i]+nums[j])==target)
        //         {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[0];
        HashMap<Integer, Integer> h=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int n=nums[i];
            int m=target-n;
            if(h.containsKey(m))
            {
                return new int[]{h.get(m),i};
            }
            h.put(n,i);
        }
        return new int[]{};
    }
}
