package services;

import org.junit.jupiter.api.Test;

public class AddBinaryTest {

    @Test
    public void testAddBinary(){

        System.out.println(new AddBinary().addBinary("11", "1"));
        System.out.println(new AddBinary().addBinary("1010", "1011"));
    }
}
