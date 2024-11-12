package services;

import java.util.Stack;

public class EvalRevPolishNotation {

    static {
        // Calling evalRPN with an array of blank multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            evalRPN(new String[]{"0"});
        }
    }

    public static int evalRPN(String[] tokens) {

        String x ="-1";
        Stack<String> sc = new Stack<>();

        for(int i=0; i<tokens.length;i++){

            if("+".equals(tokens[i])) x = Integer.toString(Integer.parseInt(sc.pop()) + Integer.parseInt(sc.pop()));
            else if("-".equals(tokens[i])){
                String y = sc.pop();
                x = Integer.toString(Integer.parseInt(sc.pop()) - Integer.parseInt(y));
            }
            else if("*".equals(tokens[i])) x = Integer.toString(Integer.parseInt(sc.pop()) * Integer.parseInt(sc.pop()));
            else if("/".equals(tokens[i])){
                String y = sc.pop();
                x = Integer.toString(Integer.parseInt(sc.pop()) / Integer.parseInt(y));
            }
            else x = tokens[i];

            sc.push(x);
        }

        return Integer.parseInt(x);
    }
}
