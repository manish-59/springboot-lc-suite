package services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CheckReverseStringTest {

    ReverseString reverseString = new ReverseString();

    @Test
    public void testReverseLogic() {

        assertNotNull(reverseString.reverseStr("oracle"));
    }
}