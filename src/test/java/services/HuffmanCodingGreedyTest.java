package services;

import org.junit.jupiter.api.Test;

public class HuffmanCodingGreedyTest {

    @Test
    public void testHuffmanCodingGreedy(){


        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };

        new HuffmanCodingGreedy().huffman(charArray, charfreq);
    }
}
