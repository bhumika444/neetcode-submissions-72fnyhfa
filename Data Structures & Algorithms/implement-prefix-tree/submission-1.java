class PrefixTree {
    public List<String> words;
    public PrefixTree() {
         words = new ArrayList<>();
    }

    public void insert(String word) {
        words.add(word);
    }

    public boolean search(String word) {
        return words.contains(word);
    }

    public boolean startsWith(String prefix) {
        for(String word : words){
            if(word.startsWith(prefix)){
                return true;
            }
        }
        return false;
    }
}
