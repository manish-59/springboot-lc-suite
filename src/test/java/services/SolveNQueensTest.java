package services;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SolveNQueensTest {

    @Test
    public void testSolveNQueens(){

        List<List<String>> res = new NQueens().solveNQueens(4);
        for(List<String> l: res){
            for(String s: l){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
