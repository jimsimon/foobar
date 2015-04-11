package com.google.challenges;

import java.util.*;

public class StringCleaning {
    public static String answer(String chunk, String word) {

        if (chunk.equals("") || chunk.equals(word)) {
            return "";
        }

        WordComparator wordComparator = new WordComparator();
        String smallestPossibleOriginal = chunk;

        Set<String> chunkCache = new HashSet<String>();
        Deque<String> chunksToCheck = new ArrayDeque<String>();
        chunksToCheck.push(chunk);
        while(!chunksToCheck.isEmpty()) {
            String chunkToCheck = chunksToCheck.pop();
            int index = 0;
            while (true) {
                index = chunkToCheck.indexOf(word, index);
                if (index == -1) {
                    break;
                }

                String possibleOriginal = chunkToCheck.substring(0, index) + chunkToCheck.substring(index + word.length(), chunkToCheck.length());
                if (!chunkCache.contains(possibleOriginal)) {
                    if (wordComparator.compare(possibleOriginal, smallestPossibleOriginal) < 0) {
                        smallestPossibleOriginal = possibleOriginal;
                    }
                    chunksToCheck.push(possibleOriginal);
                    chunkCache.add(possibleOriginal);
                }
                index++;
            }
        }
        return smallestPossibleOriginal;
    }

    private static class WordComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() < o2.length()) {
                return -1;
            } else if (o1.length() > o2.length()) {
                return 1;
            } else {
                return o1.compareTo(o2);
            }
        }
    }
}
