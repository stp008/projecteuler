package com.stpo008.projecteuler;

/**
 *
 * [Problem7] Execution time: 90, Volume: 10000, Result: 104729
 * [Problem7] Execution time: 94, Volume: 10000, Result: 104729
 * [Problem7Alternative] Execution time: 38, Volume: 10000, Result: 104729
 * [Problem7Alternative] Execution time: 36, Volume: 10000, Result: 104729
 *
 *[Problem7] Execution time: 1616, Volume: 100000, Result: 1299709
 *[Problem7] Execution time: 1586, Volume: 100000, Result: 1299709
 *[Problem7Alternative] Execution time: 1138, Volume: 100000, Result: 1299709
 *[Problem7Alternative] Execution time: 1133, Volume: 100000, Result: 1299709
 *
 *[Problem7] Execution time: 25050, Volume: 1000000, Result: 15485863
 *[Problem7] Execution time: 25064, Volume: 1000000, Result: 15485863
 *[Problem7Alternative] Execution time: 35905, Volume: 1000000, Result: 15485863
 *[Problem7Alternative] Execution time: 36176, Volume: 1000000, Result: 15485863
 *
 * @author Stepan Pogosyan
 * @since 18.10.2017.
 */
public class Problem7Comparison {

    public static void main(String[] args) {
        //Small primes
        benchmark(10000);

        //Medium primes
        benchmark(100000);

        //Large primes
        benchmark(1000000);

    }

    private static void benchmark(int targetPrime) {
        long start;
        long finish;
        long result;

        //Warmup
        Problem7.getPrime(targetPrime);
        System.gc();
        Problem7.getPrime(targetPrime);
        System.gc();

        //Benchmark
        start = System.currentTimeMillis();
        result = Problem7.getPrime(targetPrime);
        finish = System.currentTimeMillis();
        System.out.println("[Problem7] Execution time: " + (finish - start) + ", Volume: " + targetPrime + ", Result: " + result);

        start = System.currentTimeMillis();
        result = Problem7.getPrime(targetPrime);
        finish = System.currentTimeMillis();
        System.out.println("[Problem7] Execution time: " + (finish - start) + ", Volume: " + targetPrime + ", Result: " + result);

        //Warmup
        Problem7Alternative.getPrime(targetPrime);
        System.gc();
        Problem7Alternative.getPrime(targetPrime);
        System.gc();

        //Benchmark
        start = System.currentTimeMillis();
        result = Problem7Alternative.getPrime(targetPrime);
        finish = System.currentTimeMillis();
        System.out.println("[Problem7Alternative] Execution time: " + (finish - start) + ", Volume: " + targetPrime + ", Result: " + result);

        start = System.currentTimeMillis();
        result = Problem7Alternative.getPrime(targetPrime);
        finish = System.currentTimeMillis();
        System.out.println("[Problem7Alternative] Execution time: " + (finish - start) + ", Volume: " + targetPrime + ", Result: " + result);
    }

}
