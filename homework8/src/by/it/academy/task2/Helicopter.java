package by.it.academy.task2;

public class Helicopter extends Aircraft {
    public Helicopter(String model, int passengerCapacity, double cargoCapacity, int range) {
        super(model, passengerCapacity, cargoCapacity, range);
    }

    @Override
    public String getType() {
        return "Вертолет";
    }
}

