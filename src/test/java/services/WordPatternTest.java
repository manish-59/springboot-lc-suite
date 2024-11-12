package services;

import org.junit.jupiter.api.Test;

public class WordPatternTest {

    @Test
    public void testWordPattern(){
        WordPattern wordPattern = new WordPattern();

        System.out.println(wordPattern.wordPattern("abba", "dog cat cat fish"));
    }
}
