package com.stpo008.projecteuler;

/**
 * @author Stepan Pogosyan
 * @since 17.10.2017.
 */
public class Problem7Alternative {
    public static void main(String[] args) {
        int targetPrimeCount = 10001;
        int primeCount = 0;
        long currentNumber = 1;

        while (primeCount < targetPrimeCount) {
            currentNumber++;
            if (checkPrime(currentNumber)) {
                primeCount++;
            }
        }

        System.out.println(currentNumber);
    }

    public static boolean checkPrime(long n) {
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
