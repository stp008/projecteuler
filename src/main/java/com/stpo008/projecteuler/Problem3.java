package com.stpo008.projecteuler;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */
public class Problem3 {
    public static void main(String[] args) {
        long sourceNumber = 600851475143L;
        for(long i = 2; i < sourceNumber; i++) {
                if(sourceNumber % i == 0) {
                    long candidate = sourceNumber / i;
                    if (checkPrime(candidate)) {
                        System.out.println(candidate);
                        break;
                    }
                }
            }
        }

    private static boolean checkPrime(long p) {
        long a = 2;
        if(p == 2 || p == 3)
            return true;
        if(modExp(a, p - 1, p) == 1)
            return true;
        return false;
    }

    private static long modExp(long x, long y, long N) {
        if(y == 0)
            return 1;

        long z = modExp(x, Math.abs(y/2), N);

        if(y % 2 == 0)
            return (long) ((Math.pow(z, 2)) % N);
        return (long) ((x * Math.pow(z, 2)) % N);
    }
}
