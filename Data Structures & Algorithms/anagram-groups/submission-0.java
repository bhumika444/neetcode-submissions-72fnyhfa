class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sort = new String(c);
            map.putIfAbsent(sort, new ArrayList<>());
            map.get(sort).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
