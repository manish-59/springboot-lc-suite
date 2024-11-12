package services;

import java.util.Arrays;

public class PermutationInString {

    static {
        // Calling with an array of zeros multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            checkInclusion("", "");
        }
    }

    public static boolean checkInclusion(String s1, String s2) {

        if(s1.equals(s2)) return true;

        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        String sortedS1 = new String(charArray);

        for(int i=0; i<s2.length()-s1.length()+1; i++){

            String strWindow = s2.substring(i, i + s1.length());
            char[] charArrayS2Window = strWindow.toCharArray();
            Arrays.sort(charArrayS2Window);
            String sortedS2Window = new String(charArrayS2Window);

            if(sortedS1.equals(sortedS2Window)) return true;

        }

        return false;
    }
}
