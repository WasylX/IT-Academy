package by.it.academy.task2;

import java.util.Arrays;
import java.util.Comparator;

class AirlineCompany {
    private Aircraft[] fleet;
    private int size;

    public AirlineCompany(int capacity) {
        fleet = new Aircraft[capacity];
        size = 0;
    }

    public void addAircraft(Aircraft aircraft) {
        if (size < fleet.length) {
            fleet[size] = aircraft;
            size++;
        }
    }

    public int getTotalPassengerCapacity() {
        int totalCapacity = 0;
        for (int i = 0; i < size; i++) {
            totalCapacity += fleet[i].getPassengerCapacity();
        }
        return totalCapacity;
    }

    public double getTotalCargoCapacity() {
        double totalCapacity = 0;
        for (int i = 0; i < size; i++) {
            totalCapacity += fleet[i].getCargoCapacity();
        }
        return totalCapacity;
    }

    public void sortByRange() {
        Arrays.sort(fleet, 0, size, Comparator.comparingInt(Aircraft::getRange));
    }

    public Aircraft[] findAircraftByRange(int minRange, int maxRange) {
        Aircraft[] result = new Aircraft[size];
        int resultSize = 0;
        for (int i = 0; i < size; i++) {
            int range = fleet[i].getRange();
            if (range >= minRange && range <= maxRange) {
                result[resultSize] = fleet[i];
                resultSize++;
            }
        }
        return Arrays.copyOf(result, resultSize);
    }

    public Aircraft[] getFleet() {
        return Arrays.copyOf(fleet, size);
    }
}

