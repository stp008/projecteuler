package com.stpo008.projecteuler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    public static void main(String[] args) {
        int target = 0;
        boolean found = false;
        while(!found) {
            ++target;
            for(int i = 1; i <= 20; i++) {
                if(target % i != 0)
                    break;
                if(i == 20)
                    found = true;
            }
        }
        System.out.println(target);
    }
}
