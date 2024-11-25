package services;

import org.junit.jupiter.api.Test;

class JumpGameGreedyTest {

    @Test
    public void testJumpGameGreedy() {

        System.out.println(new JumpGameGreedy().canJump(new int[]{2,3,1,1,4}));
    }
}