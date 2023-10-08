package by.it.academy.task2;

public class Quadcopter extends Aircraft {
    public Quadcopter(String model, int passengerCapacity, double cargoCapacity, int range) {
        super(model, passengerCapacity, cargoCapacity, range);
    }

    @Override
    public String getType() {
        return "Квадрокоптер";
    }
}

