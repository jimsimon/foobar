package com.google.challenges;

public class MinionsBoredGame {

    public static int answer(int t, int n) {
        Runner runner = new Runner(t, n);
        return runner.findAnswer();
    }

    static class Runner {
        private final int t;
        private final int n;

        private int answerCount;

        Runner(int t, int n) {
            this.t = t;
            this.n = n;
        }

        public int findAnswer() {

            if (t < n - 1) {
                return 0;
            }

            if (t == n - 1) {
                return 1;
            }

            if (t == n) {
                return t;
            }

            if (n == 2) {
                return t;
            }

            recurse(0, 1, 0, t - 1);
            recurse(0, 0, 1, t - 1);

            return answerCount;
        }

        private void recurse(int left, int stay, int right, int rollsRemaining) {
            if (left > right) {
                return;
            }

            if (rollsRemaining > 0) {
                if (right - left < n - 1) {
                    recurse(left + 1, stay, right, rollsRemaining - 1);
                    recurse(left, stay, right + 1, rollsRemaining - 1);
                }
                recurse(left, stay + 1, right, rollsRemaining - 1);
            } else {
                if (right - left != n - 1) {
                    return;
                }
                answerCount++;
            }
        }
    }
}
