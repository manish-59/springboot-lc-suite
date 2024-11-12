package services;

import org.junit.jupiter.api.Test;

public class AnagramTest {

    @Test
    public void testFindAnagrams(){

        Anagram anagram = new Anagram();

        System.out.println(anagram.findAnagrams("aaabb", "bb"));
    }
}
