package services;

import java.util.HashMap;
import java.util.HashSet;

public class EqualizeFrequency {

    //2423

    public boolean equalFrequency(String word) {

        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for (char c : freqMap.keySet()) {
            freqMap.put(c, freqMap.get(c) - 1);
            HashSet<Integer> uniqueFreq = new HashSet<>();
            for (int value : freqMap.values()) {
                if (value > 0) {
                    uniqueFreq.add(value);
                }
            }
            if (uniqueFreq.size() == 1) {
                return true;
            }
            freqMap.put(c, freqMap.get(c) + 1);
        }
        return false;
    }
}
