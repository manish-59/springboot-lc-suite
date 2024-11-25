package services;

public class WordDictionary {

    //211

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;
    }

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current = root;
        for(char c : word.toCharArray()){
            if(current.children[c - 'a'] == null)
                current.children[c - 'a'] = new TrieNode();
            current = current.children[c - 'a'];
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        return dfs(word.toCharArray(), 0, root);
    }

    private boolean dfs(char[] word, int j, TrieNode temp){
        TrieNode current = temp;
        for(int i = j; i < word.length; i++){
            if(word[i] != '.'){
                if(current.children[word[i] - 'a'] == null)
                    return false;
                current = current.children[word[i] - 'a'];
            } else {
                for(TrieNode node : current.children){
                    if(node != null && dfs(word, i + 1, node))
                        return true;
                }
                return false;
            }
        }
        return current != null && current.isEndOfWord;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */