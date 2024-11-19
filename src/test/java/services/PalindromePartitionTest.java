package services;

import org.junit.jupiter.api.Test;
import java.util.List;

public class PalindromePartitionTest {

    PalindromePartition pp = new PalindromePartition();

    @Test
    public void testPalindromePartition(){

        List<List<String>> res = pp.partition("aab");
        for(List<String> ls: res){
            for(String s: ls){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
