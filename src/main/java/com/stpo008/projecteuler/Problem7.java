package com.stpo008.projecteuler;

import java.util.Arrays;
import java.util.List;

/**
 *  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *  What is the 10 001st prime number?
 */
public class Problem7 {
    private static List<Integer> carmichaelNumbers = Arrays.asList(new Integer[] {561, 1105, 1729, 2465, 2821, 6601,
            8911, 10585, 15841, 29341, 41041, 46657, 52633,
            62745, 63973, 75361, 101101, 115921, 126217, 162401,
            172081, 188461, 252601, 278545, 294409, 314821,
            334153, 340561, 399001, 410041, 449065, 488881, 512461});

    private static List<Integer> fermatIntegers = Arrays.asList(new Integer[] {5, 7, 13});

    private static List<Integer> littlePrimes = Arrays.asList(new Integer[] {2, 3, 5, 7, 11, 13});


    public static void main(String[] args) {
        int primeCount = 0;
        int currentNumber = 1;
        int targetPrimeCount = 10001;
        while(primeCount <= 10001) {
            currentNumber++;
            if(checkPrime(currentNumber)) {
                if(!isCarmichaelNumber(currentNumber)) {
                    primeCount++;
                }
            }
            if(primeCount >= targetPrimeCount) {
                System.out.println(currentNumber);
                break;
            }
        }
    }

    private static boolean checkPrime(Integer n) {
        if(littlePrimes.contains(n))
            return true;

        if(n < 13)
            return false;

        for(Integer fermatInteger : fermatIntegers) {
            if((modExp(fermatInteger, n - 1, n) != 1))
                return false;
        }

        return true;
    }

    private static long modExp(long x, long y, long N) {
        if(y == 0)
            return 1;

        long z = modExp(x, Math.abs(y/2), N);

        if(y % 2 == 0)
            return (long) ((Math.pow(z, 2)) % N);
        return (long) ((x * Math.pow(z, 2)) % N);
    }

    private static boolean isCarmichaelNumber(int n) {
        return carmichaelNumbers.contains(n);
    }
}
