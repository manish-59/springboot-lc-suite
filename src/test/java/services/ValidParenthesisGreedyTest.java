package services;

import org.junit.jupiter.api.Test;

public class ValidParenthesisGreedyTest {

    @Test
    public void testValidParenthesisGreedy(){

        System.out.println(new ValidParenthesisGreedy().checkValidString("(*))"));
        System.out.println(new ValidParenthesisGreedy().checkValidString("("));
        System.out.println(new ValidParenthesisGreedy().checkValidString("()"));
        System.out.println(new ValidParenthesisGreedy().checkValidString("(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((("));
        System.out.println(new ValidParenthesisGreedy().checkValidString("(*)"));
    }
}
