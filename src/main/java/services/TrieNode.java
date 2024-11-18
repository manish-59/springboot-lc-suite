package services;

public class TrieNode{
    public boolean isWord;
    public char val;
    public TrieNode[] children = new TrieNode[26];
    public TrieNode(){}
    public TrieNode(char c){
        TrieNode node = new TrieNode();
        node.val = c;
    }
}
