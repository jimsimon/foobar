package com.google.challenges;

public class RabbitMaximumEquality {

    public static final int MAX_RABBITS_PER_CAR = 1000000;

    public static int answer(int[] x) {
        int cars = x.length;
        int totalRabbits = getTotalNumberOfRabbits(x);
        int remainingRabbits = totalRabbits % cars;
        if (remainingRabbits == 0) { //Equally distributed
            return cars;
        }

        int maxEqualCarsWhenRabbitsEquallyDistributedAndRamainderEquallyDistributed = getMaxEqualCarsWhenRabbitsEquallyDistributedAndRamainderEquallyDistributed(cars, totalRabbits);
        int maxEqualCarsWhenRabbitsEquallyDistributedAndRemainderPutIntoAsFewCarsAsPossible = getMaxEqualCarsWhenRabbitsEquallyDistributedAndRemainderPutIntoAsFewCarsAsPossible(cars, totalRabbits);
        int maxEqualCarsWhenRabbitsPutIntoAsFewCarsAsPossible = getMaxEqualCarsWhenRabbitsPutIntoAsFewCarsAsPossible(cars, totalRabbits);

        return Math.max(Math.max(maxEqualCarsWhenRabbitsEquallyDistributedAndRamainderEquallyDistributed, maxEqualCarsWhenRabbitsEquallyDistributedAndRemainderPutIntoAsFewCarsAsPossible), maxEqualCarsWhenRabbitsPutIntoAsFewCarsAsPossible);
    }

    private static int getTotalNumberOfRabbits(int[] x) {
        int totalNumberOfRabbits = 0;
        for(int numberOfRabbits : x) {
            totalNumberOfRabbits += numberOfRabbits;
        }
        return totalNumberOfRabbits;
    }

    private static int getMaxEqualCarsWhenRabbitsPutIntoAsFewCarsAsPossible(int cars, int totalRabbits) {
        int filledCars = totalRabbits/MAX_RABBITS_PER_CAR;
        int emptyCars = cars - filledCars;
        int unfilledButNotEmptyCars = 0;
        if (totalRabbits % MAX_RABBITS_PER_CAR != 0) {  //Rabbits left after completely filling as many cars as possible
            emptyCars--;
            unfilledButNotEmptyCars = 1;
        }

        return Math.max(Math.max(filledCars, emptyCars), unfilledButNotEmptyCars);
    }

    private static int getMaxEqualCarsWhenRabbitsEquallyDistributedAndRemainderPutIntoAsFewCarsAsPossible(int cars, int totalRabbits) {
        int rabbitsPerCar = totalRabbits/cars;
        int spaceRemainingPerCar = MAX_RABBITS_PER_CAR - rabbitsPerCar;

        int remainingRabbits = totalRabbits % cars;
        int filledCars = remainingRabbits/spaceRemainingPerCar;
        int unfilledButNotEqualCars = 0;
        if (remainingRabbits % spaceRemainingPerCar != 0) {
            unfilledButNotEqualCars = 1;
        }
        return Math.max(Math.max(cars - filledCars - unfilledButNotEqualCars, filledCars), unfilledButNotEqualCars);
    }

    private static int getMaxEqualCarsWhenRabbitsEquallyDistributedAndRamainderEquallyDistributed(int cars, int totalRabbits) {
        int carsWithAnExtraRabbit = totalRabbits % cars;
        int carsWithoutAnExtraRabbit = cars - carsWithAnExtraRabbit;
        return Math.max(carsWithoutAnExtraRabbit, carsWithAnExtraRabbit);
    }

//    35
//    5, 10, 10, 10
//    8, 8, 9, 10
//    8, 9, 9, 9
}
