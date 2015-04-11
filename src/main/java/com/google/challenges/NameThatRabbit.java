package com.google.challenges;

import java.util.Arrays;
import java.util.Comparator;

public class NameThatRabbit {
    public static String[] answer(String[] input) {
        Arrays.sort(input, new NameComparator());
        return input;
    }

    private static class NameComparator implements Comparator<String> {

        private static final String ALPHABET = " abcdefghijklmnopqrstuvwxyz";

        @Override
        public int compare(String first, String second) {
            int firstValue = getValueOfName(first);
            int secondValue = getValueOfName(second);

            if (firstValue > secondValue) {
                return -1;
            } else if (firstValue < secondValue) {
                return 1;
            } else {
                return second.compareTo(first);
            }
        }

        private int getValueOfName(String name) {
            int value = 0;
            for(char character : name.toCharArray()) {
                value += ALPHABET.indexOf(character);
            }
            return value;
        }
    }
}
