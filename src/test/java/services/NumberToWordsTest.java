package services;

import org.junit.jupiter.api.Test;

public class NumberToWordsTest {

    NumberToWords numberToWords = new NumberToWords();

    @Test
    public void testNumberToWords(){

        System.out.println(numberToWords.numberToWords(2147483647));
    }

}
