package services;

public class LongestRepeatCharReplace {
    static {
        // Calling maxArea with an array of zeros multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            characterReplacement("", 0);
        }
    }

    public static int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxlen=0;
        int mf=0;
        int [] freq=new int[26];
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;
            mf=Math.max(mf,freq[s.charAt(r)-'A']);
            int cg=(r-l+1)-mf;
            if(cg>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            else{maxlen=Math.max(maxlen,r-l+1);}
            r++;

        }return maxlen;
    }
}
