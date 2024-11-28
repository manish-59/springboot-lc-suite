package services;

import org.junit.jupiter.api.Test;

public class EqualizeFrequencyTest {

    @Test
    public void testEqualizeFrequency(){

        System.out.println(new EqualizeFrequency().equalFrequency("abcc"));
        System.out.println(new EqualizeFrequency().equalFrequency("aazz"));
        System.out.println(new EqualizeFrequency().equalFrequency("bac"));
    }
}
