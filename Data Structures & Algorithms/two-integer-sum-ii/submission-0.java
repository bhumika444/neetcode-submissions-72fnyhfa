class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 1; i <= numbers.length; i++){
            int b = target - numbers[i - 1];
            if(map.containsKey(b)){
                return new int[]{map.get(b), i};
            }
            map.put(numbers[i - 1], i);
        }
        return new int[]{};
    }
}
