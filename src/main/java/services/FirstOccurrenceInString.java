package services;

public class FirstOccurrenceInString {

    //28

    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }

    //approach 2
    public int strStr2(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
}
