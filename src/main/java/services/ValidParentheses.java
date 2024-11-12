package services;

import java.util.Stack;

public class ValidParentheses {

    static {
        // Calling isValid with an array of empty string multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            isValid("");
        }
    }

    public static boolean isValid(String s) {

        Stack<Character> sc = new Stack<>();

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == '(') sc.push(')');
            else if(s.charAt(i) == '{') sc.push('}');
            else if(s.charAt(i) == '[') sc.push(']');
            else if (sc.empty() || (sc.pop()  != s.charAt(i))) return false;

        }
        return sc.empty();
    }
}