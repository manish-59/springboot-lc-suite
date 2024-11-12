package services;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> res = new ArrayList<>();

        for(int i=0; i<n; i++){
            int f = i+1;
            if(f%3==0 && f%5==0)res.add("FizzBuzz");
            else if(f%3==0)res.add("Fizz");
            else if(f%5==0)res.add("Buzz");
            else res.add(String.valueOf(f));
        }

        return res;
    }
}
