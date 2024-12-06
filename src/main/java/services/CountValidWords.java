package services;

public class CountValidWords {

    //2047
    public int countValidWords(String sentence) {
        int start = 0;
        int counter = 0;
        while (start < sentence.length()) {
            int hyphen = -1;
            int punc = -1;
            boolean invalid = false;
            boolean nonEmpty = false;
            int end = start;
            while (end < sentence.length() && sentence.charAt(end) != ' ') {
                char current = sentence.charAt(end);
                nonEmpty = true;
                if (Character.isDigit(current) || (current == '-' && hyphen != -1) ||
                        ((current == '!' || current == '.' || current == ',') && punc != -1)) {
                    while (end < sentence.length() && sentence.charAt(end) != ' ') {
                        end++;
                    }
                    invalid = true;
                } else {
                    if (current == '!' || current == '.' || current == ',') {
                        punc = end;
                    } else if (current == '-') {
                        hyphen = end;
                    }
                    end++;
                }
            }
            if (nonEmpty && !invalid && (punc == end - 1 || punc == -1)
                    && ((hyphen > start && hyphen < end && Character.isLetter(sentence.charAt(hyphen + 1))
                    && Character.isLetter(sentence.charAt(hyphen - 1))) || hyphen == -1)) {
                counter++;
            }
            start = end + 1;
        }
        return counter;
    }
}