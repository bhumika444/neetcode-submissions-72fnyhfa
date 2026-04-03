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
        HashMap<Integer, Integer> prev=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int dif=target-num;
            if(prev.containsKey(dif))
            {
                return new int[]{prev.get(dif),i};
            }
            prev.put(num,i);
        }
        return new int[]{};
    }
}
