package by.it.academy.task3;

class Duck extends DomesticAnimal {
    public Duck() {
        super("Утки", 5);
    }

    public String getProductName() {
        return "Яйца";
    }

    public String getProductUnit() {
        return "штука";
    }
}

