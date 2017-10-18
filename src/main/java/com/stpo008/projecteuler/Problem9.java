package com.stpo008.projecteuler;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 *  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 *  Find the product abc.
 */
public class Problem9 {
    public static void main(String[] args) {
        System.out.println(getTripletProduct(1000));
    }

    public static double getTripletProduct(double sum) {
        for(int a = 1; a < sum; a++) {
            for(int b = 2; b < sum; b++) {
                for(int c = 3; c < sum; c++) {
                    if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        if(a + b + c == sum) {
                            return a * b * c;
                        }
                    }
                }
            }
        }

        return -1;
    }
}
