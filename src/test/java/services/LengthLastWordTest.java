package services;

import org.junit.jupiter.api.Test;

public class LengthLastWordTest {

    @Test
    public void testLengthLastWord(){

        System.out.println(new LengthLastWord().lengthOfLastWord("Hello World"));
        System.out.println(new LengthLastWord().lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(new LengthLastWord().lengthOfLastWord("luffy is still joyboy"));
    }
}
