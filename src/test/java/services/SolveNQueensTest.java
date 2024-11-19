package services;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SolveNQueensTest {

    SolveNQueens snq = new SolveNQueens();

    @Test
    public void testSolveNQueens(){

        List<List<String>> res = snq.solveNQueens(4);
        for(List<String> l: res){
            for(String s: l){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
