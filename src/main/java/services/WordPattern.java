package services;

import java.util.*;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        boolean res = false;

        HashMap<Character, String> patternMap = new LinkedHashMap();
        char[] charsPattern = pattern.toCharArray();

        for(int i=0; i< charsPattern.length; i++){
            if(patternMap.containsKey(charsPattern[i])) {
                int finalI = i;
                patternMap.computeIfPresent(charsPattern[i], (key, oldValue) -> oldValue+ finalI);
            }
            else patternMap.put(charsPattern[i], String.valueOf(i));
        }

        HashMap<String, String> sMap = new LinkedHashMap();
        String[] substringsArray = s.split("\\s+");
        for(int i =0; i<substringsArray.length; i++){
            int finalI = i;
            if(sMap.containsKey(substringsArray[i])) sMap.computeIfPresent(substringsArray[i], (key, oldValue) -> oldValue + finalI);
            else sMap.put(substringsArray[i], String.valueOf(i));
        }

        List<String> values1 = new ArrayList<>(patternMap.values());
        List<String> values2 = new ArrayList<>(sMap.values());

        if(values1.equals(values2)) res = true;

        return res;
    }
}
