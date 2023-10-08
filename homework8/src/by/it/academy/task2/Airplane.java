package by.it.academy.task2;

public class Airplane extends Aircraft {
    public Airplane(String model, int passengerCapacity, double cargoCapacity, int range) {
        super(model, passengerCapacity, cargoCapacity, range);
    }

    @Override
    public String getType() {
        return "Самолет";
    }
}

