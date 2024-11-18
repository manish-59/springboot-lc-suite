package services;

import java.util.*;

public class WordSearchII {

    //212 - trie - hard

    private class TrieNode {
        Map<Character, TrieNode> nextNodes;
        boolean isTerminal;
        String word;

        TrieNode() {
            this.nextNodes = new HashMap<>();
            this.isTerminal = false;
            this.word = "";
        }

        public TrieNode next(char c) {
            return nextNodes.getOrDefault(c, null);
        }

        public boolean isLeaf() {
            return nextNodes.isEmpty();
        }
    }

    private class Trie {
        TrieNode head;

        Trie() {
            this.head = new TrieNode();
        }

        void addWord(String word) {
            TrieNode currentNode = head;
            for(int i = 0; i < word.length(); ++i) {
                char c = word.charAt(i);
                currentNode.nextNodes.putIfAbsent(c, new TrieNode());
                currentNode = currentNode.nextNodes.get(c);
            }
            currentNode.isTerminal = true;
            currentNode.word = word;
        }
    }

    private Trie trie;

    public List<String> findWords(char[][] board, String[] words) {
        this.trie = new Trie();
        for(String word : words) {
            trie.addWord(word);
        }
        Set<String> wordsOnTheBoard = new HashSet<>();
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[0].length; ++j) {
                backtrack(board, i, j, trie.head, wordsOnTheBoard);
            }
        }
        return wordsOnTheBoard.stream().toList();
    }

    private void backtrack(char[][] board, int i, int j, TrieNode node, Set<String> wordsOnTheBoard) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || node == null) {
            return;
        }
        char currentCharacter = board[i][j];
        TrieNode nextNode = node.next(currentCharacter);
        if (nextNode != null && nextNode.isTerminal == true) {
            wordsOnTheBoard.add(nextNode.word);
        }
        board[i][j] = '#';
        backtrack(board, i + 1, j, nextNode, wordsOnTheBoard);
        backtrack(board, i, j + 1, nextNode, wordsOnTheBoard);
        backtrack(board, i - 1, j, nextNode, wordsOnTheBoard);
        backtrack(board, i, j - 1, nextNode, wordsOnTheBoard);
        board[i][j] = currentCharacter;
        if (nextNode != null && nextNode.isLeaf()) {
            node.nextNodes.remove(currentCharacter);
        }
    }
}