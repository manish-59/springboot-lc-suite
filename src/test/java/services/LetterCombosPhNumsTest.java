package services;

import org.junit.jupiter.api.Test;
import java.util.List;

public class LetterCombosPhNumsTest {

    LetterCombosPhNums lcph = new LetterCombosPhNums();

    @Test
    public void testLetterCombosPhNums(){

        List<String> res = lcph.letterCombinations("23");
        for(String s: res){
            System.out.println(s);
        }

    }
}
