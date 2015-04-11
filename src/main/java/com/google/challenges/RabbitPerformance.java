package com.google.challenges;

import java.util.Arrays;

public class RabbitPerformance {
    public static int answer(double[] x, double[] y) {
        Arrays.sort(x);
        Arrays.sort(y);

        double maxTime = Math.max(x[0], y[0]);
        double minTime = Math.min(x[0], y[0]);

        double decreaseInTime = maxTime - minTime;
        double percentDecreased = decreaseInTime / maxTime * 100;
        return (int)percentDecreased;
    }
}
