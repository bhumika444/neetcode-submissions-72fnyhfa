class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0,max = 0;
        for(int num : nums){
            // if(map.containsKey(num)){
            //     map.put(num, map.get(num) + 1);
            //     max = Math.max(max, map.get(num));
            // }
            // else{
            //     map.put(num, cnt);
            // }
            map.put(num, map.getOrDefault(num,0) + 1);

            if(map.get(num) > (nums.length / 2)){
                result = num;
            }
        }
        // 5 -> 4
        // 1 -> 3

        // return map.get(4);
        return result;
    }
}