package services;

import java.util.Map;

public class Fibonacci {

    //Intro to DP
    //https://www.geeksforgeeks.org/tabulation-vs-memoization/

    public static int fibonacciUsingMemoization(int n, Map<Integer, Integer> cache) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int result;
        if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result = fibonacciUsingMemoization(n - 1, cache) + fibonacciUsingMemoization(n - 2, cache);
        }

        cache.put(n, result);
        return result;
    }

    public static int fibonacciUsingTabulation(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int[] table = new int[n + 1];
            table[0] = 0;
            table[1] = 1;
            for (int i = 2; i <= n; i++) {
                table[i] = table[i - 1] + table[i - 2];
            }
            return table[n];
        }
    }
}
