package task1;

public class Main {
    public static void main(String[] args) {
        Integer integer = 42;
        Animal animal = new Animal();
        Double dbl = 3.14;

        GenericClass<Integer, Animal, Double> generic1 = new GenericClass<>(integer, animal, dbl);
        System.out.println("T: " + generic1.getT());
        System.out.println("V: " + generic1.getV());
        System.out.println("K: " + generic1.getK());
    }
}

