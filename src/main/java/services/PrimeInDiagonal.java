package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeInDiagonal {

    //2614
    public int diagonalPrime(int[][] nums) {

        List<Integer> res= new ArrayList<>();

        for(int i=0; i< nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                if(i==j || i+j== nums.length){
                    if(isPrime(nums[i][j])) res.add(nums[i][j]);
                }
            }
        }
        res.sort(Collections.reverseOrder());
        return res.get(0);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
