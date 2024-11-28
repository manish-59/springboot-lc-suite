package services;

import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix(){

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog", "car", "racecar"}));
    }
}
