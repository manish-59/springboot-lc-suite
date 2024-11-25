package services;

import org.junit.jupiter.api.Test;

public class WordSearchTest {

    @Test
    public void testWordSearchII(){

        System.out.println(new WordSearch().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
        System.out.println(new WordSearch().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "SEE"));
        System.out.println(new WordSearch().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCB"));
    }
}
