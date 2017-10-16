package com.stpo008.projecteuler;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args) {

        int target = 0;
        for(int i = 999; i >= 100; i--) {
            for(int j = 999; j >= 100; j--) {
                int currentValue = i * j;
                if(isPalindromic(currentValue)) {
                    if(currentValue > target)
                        target = currentValue;
                }
            }
        }
        System.out.println(target);
    }

    private static boolean isPalindromic(long n) {
        String forward = String.valueOf(n);
        String backward = new StringBuilder()
                .append(forward)
                .reverse()
                .toString();
        return forward.equals(backward);
    }
}
