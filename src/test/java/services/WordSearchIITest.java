package services;

import org.junit.jupiter.api.Test;

public class WordSearchIITest {

    WordSearchII ws2 = new WordSearchII();

    @Test
    public void testWordSearchII(){

        System.out.println(ws2.findWords(new char[][]{{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}}, new String[]{"oath","pea","eat","rain"}));
    }
}
