package com.google.challenges;

import java.math.BigInteger;

public class MinionsBoredGame {

    /*
    var total = 0;
    for (i = 0; i < t-n+1; i++) {
       total += ( d( 2 * i + n ) / d( n ) ) * ( factorial( t + 2 ) / factorial( 2 * i + n + 1 ) );
    }
    return total;
     */

    public static int answer(int t, int n) {
        BigInteger total = BigInteger.ZERO;
        for (int i = 0; i < t - n + 1; i++) {
            BigInteger firstPart = solve(2 * i + n).divide(solve(n));
            BigInteger secondPart = factorial(t + 2).divide(factorial(2 * i + n + 1));
            BigInteger amountToAdd = firstPart.multiply(secondPart);
            total = total.add(amountToAdd);
        }
        return total.mod(BigInteger.valueOf(123454321)).intValue();
    }

    private static BigInteger solve(int x) {
        if (x == 0 || x == -1) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(x).multiply(solve(x-2));
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

//    public static int answer(int t, int n) {
//
//        if (t < n - 1) {
//            return 0;
//        }
//
//        if (t == n-1) {
//            return 1;
//        }
//
//        if (t == n) {
//            return t;
//        }
//
//        if (n == 2) {
//            return t;
//        }
//
////        return answer(t-1, n-1);
//
//        return choose(t, n).intValue();
//    }
//
//    private static int solve(int x) {
//        if (x == 0) {
//            return 0;
//        }
//        return solve(x - 2) + solve(x - 1);
//    }
//
//    private static BigInteger choose(int n, int k) {
//        BigInteger denominator = factorial(k).multiply(factorial(n - k));
//        return factorial(n).divide(denominator);
//    }
//
//    private static BigInteger factorial(int n) {
//        BigInteger result = BigInteger.ONE;
//        for (int i=1; i<=n; i++) {
//            result = result.multiply(BigInteger.valueOf(i));
//        }
//        return result;
//    }
}
