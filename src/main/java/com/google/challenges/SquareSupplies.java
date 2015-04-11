package com.google.challenges;

public class SquareSupplies {
    public static int answer(int n) {
        double squareRoot = Math.sqrt(n);
        int nearestWhole = (int)Math.floor(squareRoot);
        if (nearestWhole == 0) {
            return 0;
        }
        return answer(n - nearestWhole*nearestWhole) + 1;
    }
}
