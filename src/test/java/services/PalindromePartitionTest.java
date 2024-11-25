package services;

import org.junit.jupiter.api.Test;
import java.util.List;

public class PalindromePartitionTest {

    @Test
    public void testPalindromePartition(){

        List<List<String>> res = new PalindromePartition().partition("aab");
        res.forEach(l -> {
            l.forEach(e -> System.out.print(e + " "));
            System.out.println();
        });
    }
}
