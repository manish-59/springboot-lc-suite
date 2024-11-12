package services;

import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    ValidPalindrome ValidPalindrome = new ValidPalindrome();

    @Test
    public void testIsPalindrome(){

        System.out.println(ValidPalindrome.isPalindrome("0P"));
    }
}
