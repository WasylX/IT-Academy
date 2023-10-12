package by.it.academy.task2;

public abstract class Aircraft {
    private String model;
    private int passengerCapacity;
    private double cargoCapacity;
    private int range;

    protected Aircraft(String model, int passengerCapacity, double cargoCapacity, int range) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
        this.range = range;
    }

    public String getModel() {
        return model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public int getRange() {
        return range;
    }

    public abstract String getType();
}

