package services;
import org.junit.jupiter.api.Test;

public class PermutationsTest {

    @Test
    public void testPermute(){

        Permutations permutations = new Permutations();

        System.out.println(permutations.permute(new int[]{1, 2, 3}));
    }
}
