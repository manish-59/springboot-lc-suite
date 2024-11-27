package services;

import java.util.Stack;

public class ValidParenthesisGreedy {

    //678

    public boolean checkValidString(String s) {
        int n = s.length();
        int min = 0, max = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                min += 1;
                max += 1;
            } else if (s.charAt(i) == ')') {
                min -= 1;
                max -= 1;
            } else {
                min -= 1;
                max += 1;
            }
            if (min < 0) {
                min = 0;
            }
            if (max < 0) {
                return false;
            }
        }
        return (min == 0);
    }
}
