package services;

import org.junit.jupiter.api.Test;

public class TaskSchedulerTest {

    TaskScheduler ts = new TaskScheduler();

    @Test
    public void testTaskScheduler(){

        System.out.println(ts.leastInterval(new char[]{'A','A','A','B','B','B'}, 2));
    }
}
