package services;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        boolean res = true;
        char[] c = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){

            if((c[i] >= 65 && c[i] <= 90) || (c[i] >= 97 && c[i] <= 122) || (c[i] >= 48 && c[i] <= 57)){

                str.append(c[i]);
            }
        }
        char[] sec =  str.toString().toLowerCase().toCharArray();

        if(sec.length!=0){
            for(int i=0, j=str.toString().length()-1; i<=(str.toString().length()-1)/2; i++, j--){

                if(sec[i] != sec[j]){
                    res = false;
                    break;
                }
            }
        }
        return res;
    }
}
