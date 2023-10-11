package by.it.academy.task3;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm(5);

        farm.addAnimal(new Chicken());
        farm.addAnimal(new Duck());
        farm.addAnimal(new Goose());
        farm.addAnimal(new Cow());
        farm.addAnimal(new Sheep());

        farm.printProducts();
    }
}
