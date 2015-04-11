package com.google.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BooleansPassword {
    public static int[] answer(int[][] minions) {

        List<Minion> minionList = new ArrayList<Minion>();

        for(int i=0; i<minions.length; i++) {
            float probability = (float)minions[i][1]/(float)minions[i][2];
            Minion minion = new Minion(i, minions[i][0], probability);
            minionList.add(minion);
        }

        Collections.sort(minionList);

        int[] optimalOrder = new int[minionList.size()];
        for(int i=0; i<minionList.size(); i++) {
            optimalOrder[i] = minionList.get(i).getIndex();
        }
        return optimalOrder;

    }

    private static class Minion implements Comparable<Minion> {
        private int index;
        private float difficultyToInterrogate;

        public Minion(int index, int time, float probability) {
            this.index = index;
            difficultyToInterrogate = time*(1/probability);
        }

        public int getIndex() {
            return index;
        }

        public float getDifficultyToInterrogate() {
            return difficultyToInterrogate;
        }

        @Override
        public int compareTo(Minion otherMinion) {
            if (getDifficultyToInterrogate() < otherMinion.getDifficultyToInterrogate()) {
                return -1;
            } else if (getDifficultyToInterrogate() > otherMinion.getDifficultyToInterrogate()) {
                return 1;
            } else if (getIndex() < otherMinion.getIndex()) {
                return -1;
            }
            return 1;
        }
    }
}
