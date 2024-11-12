package services;

import org.junit.jupiter.api.Test;

public class EvalRevPolishNotationTest {

    EvalRevPolishNotation evalRevPolishNotation = new EvalRevPolishNotation();

    @Test
    public void testEvalRPN(){

        System.out.println(evalRevPolishNotation.evalRPN(new String[]{"2","1","+","3","*"}));
    }
}
