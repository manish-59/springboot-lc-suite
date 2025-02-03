package services;

import java.util.List;

public class Trie {

    //208

    Trie[] children;
    boolean isWordEnd;

    public Trie() {
        children = new Trie[26];
        isWordEnd = false;
    }

    public boolean helper(String str , boolean insert, boolean search){

        Trie curr = this;

        for(int i =0 ; i < str.length(); i++){
            int idx = str.charAt(i) -'a';
            if(curr.children[idx] == null){
                if(insert){
                    curr.children[idx] = new Trie();
                }else{
                    return false;
                }
            }
            curr = curr.children[idx];
        }

        if(insert){
            curr.isWordEnd = true;
        }

        return search ? curr.isWordEnd : true;
    }

    public void insert(String word) {
        helper(word,true,false);
    }

    public boolean search(String word) {
        return helper(word,false,true);
    }

    public boolean startsWith(String prefix) {
        return helper(prefix,false,false);
    }

    public void traverse(Trie node, StringBuilder temp, List<String> output) {
        if (node == null) {
            return;
        }
        if (node.isWordEnd) {
            output.add(temp.toString());
        }
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if (node.containsKey(c)) {
                temp.append(c);
                traverse(node.getNext(c), temp, output);
                temp.deleteCharAt(temp.length() - 1);
            }
        }

    }

    public boolean containsKey(char c) {
        return children[c - 'a'] != null;
    }

    public Trie getNext(char c) {
        return children[c - 'a'];
    }

    public Trie getPrefixNode(String word) {
        Trie curr = this;
        for (char c : word.toCharArray()) {
            if (!curr.containsKey(c)) {
                return new Trie();
            }
            curr = curr.getNext(c);
        }
        return curr;
    }
}