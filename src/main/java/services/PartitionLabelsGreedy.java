package services;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabelsGreedy {

    //763

    public List<Integer> partitionLabels(String s) {

        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        List<Integer> output = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);

            if (i == end) {
                output.add(end - start + 1);
                start = i + 1;
            }
        }

        return output;
    }
}
