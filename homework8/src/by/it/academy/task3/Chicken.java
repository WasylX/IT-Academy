package by.it.academy.task3;

class Chicken extends DomesticAnimal {
    public Chicken() {
        super("Куры", 7);
    }

    public String getProductName() {
        return "Яйца";
    }

    public String getProductUnit() {
        return "штука";
    }
}

