package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i  <= s.length()-p.length(); i++){

            if(isAnagram(s.substring(i, i + p.length()), p)) res.add(i);
        }
        return res;
    }

    public boolean isAnagram(String ag, String p){

        char[] charArray1 = ag.toCharArray();
        char[] charArray2 = p.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
