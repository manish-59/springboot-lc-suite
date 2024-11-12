package services;

import org.junit.jupiter.api.Test;

public class StudentMarksCounterTest {

    StudentMarksCounter counter = new StudentMarksCounter();

    @Test
    public void testCount() {

        counter.count();
    }
}
