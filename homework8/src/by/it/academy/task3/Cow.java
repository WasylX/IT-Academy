package by.it.academy.task3;

class Cow extends DomesticAnimal {
    public Cow() {
        super("Коровы", 7 * 4 * 12);
    }

    public String getProductName() {
        return "Молоко";
    }

    public String getProductUnit() {
        return "литр";
    }
}

