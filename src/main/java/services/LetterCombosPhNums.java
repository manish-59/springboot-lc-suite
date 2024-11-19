package services;

import java.util.ArrayList;
import java.util.List;

public class LetterCombosPhNums {

    String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;

        bckTrk(0, digits, new StringBuilder());

        return res;
    }

    private void bckTrk(int idx, String digits, StringBuilder temp){
        if(idx == digits.length()){
            res.add(temp.toString());
            return;
        }

        char ch = digits.charAt(idx);
        String str = map[ch - '0'];

        for(char c: str.toCharArray()){
            temp.append(c);
            bckTrk(idx+1, digits, temp);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
