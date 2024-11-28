package services;

public class LengthLastWord {

    //58

    public int lengthOfLastWord(String s) {

        return s.split(" ")[s.split(" ").length-1].length();
    }
}
