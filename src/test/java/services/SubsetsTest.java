package services;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SubsetsTest {

    @Test
    public void testSubsets(){

        List<List<Integer>> res = new Subsets().subsets(new int[]{1,2,3});

        res.forEach(list -> {
            list.forEach(e -> System.out.print(e + " "));
            System.out.println();
        });
    }
}
