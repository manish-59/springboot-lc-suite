package services;

public class LatestTime {

    //3114

    public String findLatestTime(String s) {

        char[] t = s.toCharArray();
        if (t[0] == '?') {
            if (t[1] >= '2' && t[1] <= '9') {
                t[0] = '0';
            } else {
                t[0] = '1';
            }
        }
        if (t[1] == '?'){
            if (t[0] == '0') {
                t[1] = '9';
            } else {
                t[1] = '1';
            }
        }
        if (t[3] == '?') {
            t[3] = '5';
        }
        if (t[4] == '?') {
            t[4] = '9';
        }
        return new String(t);
    }
}
