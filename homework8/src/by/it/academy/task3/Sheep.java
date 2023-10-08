package by.it.academy.task3;

class Sheep extends DomesticAnimal {
    public Sheep() {
        super("Овцы", 7 * 4);
    }

    public String getProductName() {
        return "Шерсть";
    }

    public String getProductUnit() {
        return "килограмм";
    }
}

