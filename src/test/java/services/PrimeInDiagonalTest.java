package services;

import org.junit.jupiter.api.Test;

public class PrimeInDiagonalTest {

    @Test
    public void testPrimeInDiagonal(){

        System.out.println(new PrimeInDiagonal().diagonalPrime(new int[][]{{1,2,3},{5,6,7},{9,10,11}}));
        System.out.println(new PrimeInDiagonal().diagonalPrime(new int[][]{{1,2,3},{5,17,7},{9,11,10}}));
    }
}
