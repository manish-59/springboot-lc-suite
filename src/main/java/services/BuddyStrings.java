package services;

public class BuddyStrings {

    //859
        public boolean buddyStrings(String s, String goal) {
            // return false if string lengths are not equal
            if (s.length() != goal.length()) {
                return false;
            }

            // If strings are equal, find number of occurences of similar elements in strings
            int[] charCount = new int[26];
            if (s.equals(goal)) {
                for (char c : s.toCharArray()) {
                    // below line is to find the position of char c - a based on ASCII
                    charCount[c - 'a']++;
                    if(charCount[c-'a']>1) { // duplicate exists so swap possible
                        return true;
                    }
                }
                return false;
            }

            // If strings are not equal, find the unequal elements in strings (atmost 2)
            int first = -1; int second = -1;
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i)!= goal.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else { // more than 2 differences, return false
                        return false;
                    }
                }
            }

            return second!= -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
        }

}
