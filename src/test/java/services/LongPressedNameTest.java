package services;

import org.junit.jupiter.api.Test;

public class LongPressedNameTest {

    @Test
    public void testLongPressedName(){
        System.out.println(new LongPressedName().isLongPressedName("alex", "aallex"));
        System.out.println(new LongPressedName().isLongPressedName("saeed", "ssaaedd"));
        System.out.println(new LongPressedName().isLongPressedName("apple", "aappplle"));
    }
}
