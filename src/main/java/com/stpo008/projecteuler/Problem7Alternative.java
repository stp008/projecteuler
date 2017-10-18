package com.stpo008.projecteuler;

/**
 * @author Stepan Pogosyan
 * @since 17.10.2017.
 */
public class Problem7Alternative {
    public static void main(String[] args) {
        System.out.println(getPrime(10001));
    }

    public static long getPrime(int primeCount) {
        int currentPrimeCount = 0;
        long currentNumber = 1;

        while (currentPrimeCount < primeCount) {
            currentNumber++;
            if (checkPrime(currentNumber)) {
                currentPrimeCount++;
            }
        }

        return currentNumber;
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
