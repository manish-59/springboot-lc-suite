package services;

import org.junit.jupiter.api.Test;

public class WordDictionaryTest {

    WordDictionary wd = new WordDictionary();

    @Test
    public void testWordDictionary(){

        wd.addWord("apple");
        System.out.println(wd.search("apple"));
        System.out.println(wd.search("badss"));
        System.out.println(wd.search("app"));
        System.out.println(wd.search("ple"));
        System.out.println(wd.search("ap..."));
        System.out.println(wd.search("..ple"));
    }
}
