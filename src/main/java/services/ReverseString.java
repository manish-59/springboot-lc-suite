package services;

//reverse the ovals in a particular string
//oracle - input
//eraclo - output

public class ReverseString {

    CheckVowel checkVowel = new CheckVowel();

    public char[] reverseStr(String ip){

//        String ip = "oracle";
        int ctr = 0;
        char[] str = ip.toCharArray();
        String vowel = "";

        for(int i = 0; i<str.length; i++){
            if(checkVowel.checkVowel(str[i])){
                ctr++;
                vowel += str[i];
            }
        }

        for(int i = 0; i<str.length; i++){
            if(checkVowel.checkVowel(str[i])){
//                str[i] = vowel.charAt[--ctr];
                str[i] = vowel.charAt(--ctr);
            }
        }

        System.out.println(str);
        return str;
    }
}
