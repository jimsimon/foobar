package com.google.challenges;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class LineUpTheCaptives {
    private static Map<String, BigInteger> cache = new HashMap<String, BigInteger>();

    public static String answer(int x, int y, int n) {
        return lineup(n - 1, x + y - 2).multiply(choose(x + y - 2, x - 1)).toString();
    }

    private static BigInteger lineup(int n,  int k) {
        if (moreRabbitsVisibleThanExists(n, k)) {
            return BigInteger.ZERO;
        }

        if (allRabbitsVisible(n, k)) {
            return BigInteger.ONE;
        }

        if (onlyOneRabbitVisible(k)) {
            return factorial(n - 1);
        }

        if (onlyOneRabbitNotVisible(n, k)) {
            return choose(n, 2);
        }

        BigInteger result = cache.get(n+""+k);
        if (result == null) {
            result = lineup(n - 1, k - 1).add(lineup(n - 1, k).multiply(BigInteger.valueOf(n - 1)));
            cache.put(n+""+k, result);
        }
        return result;
    }

    private static boolean onlyOneRabbitNotVisible(int n, int k) {
        return k == n - 1;
    }

    private static boolean onlyOneRabbitVisible(int k) {
        return k == 1;
    }

    private static boolean allRabbitsVisible(int n, int k) {
        return k == n;
    }

    private static boolean moreRabbitsVisibleThanExists(int n, int k) {
        return k > n;
    }

    private static BigInteger choose(int n, int k) {
        BigInteger denominator = factorial(k).multiply(factorial(n - k));
        return factorial(n).divide(denominator);
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}