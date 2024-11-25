package services;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

    //131

    public List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();

        backtrack(s, 0, new ArrayList<>(), res);

        return res;
    }

    public void backtrack(String s, int start, List<String> path, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (isPalindrome(s, start, end - 1)) {
                path.add(s.substring(start, end));
                backtrack(s, end, path, result);
                path.removeLast();
            }
        }
    }

    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
