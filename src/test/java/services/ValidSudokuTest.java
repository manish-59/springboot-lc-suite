package services;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ValidSudokuTest {

    ValidSudoku validSudoku =new ValidSudoku();

    @Test
    public void testIsValidSudoku(){

        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(validSudoku.isValidSudoku(board));
    }
}
