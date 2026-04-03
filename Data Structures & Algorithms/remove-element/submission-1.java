class Solution {
    public int removeElement(int[] nums, int val) {
        // List<Integer> temp = new ArrayList<>();
        // for(int num : nums)
        // {
        //     if(num != val)
        //     {
        //         temp.add(num);
        //     }
        // }
        int k = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}