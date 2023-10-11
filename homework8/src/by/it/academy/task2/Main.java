package by.it.academy.task2;

public class Main {
    public static void main(String[] args) {
        AirlineCompany airlineCompany = new AirlineCompany(10);

        airlineCompany.addAircraft(
                new Airplane(
                "Boeing 747",
                400,
                10000,
                500
                )
        );
        airlineCompany.addAircraft(
                new Helicopter(
                "Eurocopter EC130",
                6,
                500,
                120
                )
        );
        airlineCompany.addAircraft(
                new Quadcopter(
                "DJI Matrice 600",
                0,
                3,
                6
                )
        );

        int totalPassengerCapacity = airlineCompany.getTotalPassengerCapacity();
        double totalCargoCapacity = airlineCompany.getTotalCargoCapacity();

        airlineCompany.sortByRange();


        System.out.println("Общая вместимость: " + totalPassengerCapacity + " пассажиров");
        System.out.println("--------------");
        System.out.println("Общая грузоподъемность: " + totalCargoCapacity + " кг");
        System.out.println("--------------");

        System.out.println("Список летных средств после сортировки по дальности полета:");
        System.out.println();

        for (Aircraft aircraft : airlineCompany.getFleet()) {
            System.out.println("- " + aircraft.getModel() + " - Дальность полета: " + aircraft.getRange() + " км");
            System.out.println("--------------");
        }

        int minRange = 500;
        int maxRange = 2000;

        Aircraft[] aircraftInRange = airlineCompany.findAircraftByRange(minRange, maxRange);

        System.out.println("Летные средства в заданном диапазоне дальности полета (" + minRange + " - "
                + maxRange + " км):");
        System.out.println();

        for (Aircraft aircraft : aircraftInRange) {
            System.out.println("- " + aircraft.getModel() + " - Дальность полета: " + aircraft.getRange() + " км");
        }
    }
}

