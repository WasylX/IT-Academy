package by.it.academy.task3;

class Cow extends DomesticAnimal {

    public static final String PRODUCT_NAME = "Молоко";
    public static final String PRODUCT_UNIT = "Литр";

    public Cow() {
        super("Коровы", 7 * 4 * 12);
    }

    public String getProductName() {
        return PRODUCT_NAME;
    }

    public String getProductUnit() {
        return PRODUCT_UNIT;
    }
}

