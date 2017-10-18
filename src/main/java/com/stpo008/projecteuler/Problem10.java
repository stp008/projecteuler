package com.stpo008.projecteuler;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * @author Stepan Pogosyan
 * @since 18.10.2017.
 */
public class Problem10 {
    public static void main(String[] args) {
        System.out.println(getSum(2000000));
    }

    private static long getSum(int primeThreshold) {
        long sum = 0;
        for(int i = 0; i < primeThreshold; i++) {
            if(checkPrime(i))
                sum += i;
        }
        return sum;
    }

    private static boolean checkPrime(long n) {
        if (n < 2)
            return false;

        if (n == 2)
            return true;

        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
