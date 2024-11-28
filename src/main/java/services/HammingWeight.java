package services;

public class HammingWeight {

    StringBuilder binary = new StringBuilder();

    public int hammingWeight(int n) {

        int ctr=0;
        for(Character c: num2Binary(n).toString().toCharArray()){
            if(c == '1') ctr++;
        }

        return ctr;
    }

    public StringBuilder num2Binary(int n){
        while (n > 0) {
            binary.append(n % 2);
            n /= 2;
        }
        return binary;
    }
}
