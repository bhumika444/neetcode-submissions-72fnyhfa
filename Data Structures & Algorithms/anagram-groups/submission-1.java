class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] cnt = new int[26];
            for(char c : s.toCharArray()){
                cnt[c - 'a'] ++;
            }
            String sort = Arrays.toString(cnt);
            map.putIfAbsent(sort, new ArrayList<>());
            map.get(sort).add(s);
        }
        return new ArrayList(map.values());
    }
}
