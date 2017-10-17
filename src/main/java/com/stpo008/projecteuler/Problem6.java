package com.stpo008.projecteuler;

/**
 * @author Stepan Pogosyan
 * @since 16.10.2017.
 * The sum of the squares of the first ten natural numbers is,
 *
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten
 * natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first
 * one hundred natural numbers
 * and the square of the sum.
 */
public class Problem6 {
    public static void main(String[] args) {
        int sumSquare = 0;
        for(int i = 1; i <= 100; i++) {
            sumSquare += i * i;
        }

        int squareSum = 0;
        for(int i = 1; i <= 100; i++) {
            squareSum += i;
        }
        squareSum *= squareSum;
        System.out.println(squareSum - sumSquare);
    }
}
