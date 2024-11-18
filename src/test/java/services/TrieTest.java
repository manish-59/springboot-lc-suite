package services;

import org.junit.jupiter.api.Test;

public class TrieTest {

    Trie trie = new Trie();

    @Test
    public void testTrie(){

        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.startsWith("al"));
        System.out.println(trie.startsWith("app"));
    }
}
