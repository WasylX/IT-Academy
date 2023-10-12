package by.it.academy.task3;

class Goose extends DomesticAnimal {

    public static final String PRODUCT_NAME = "Яйца";
    public static final String PRODUCT_UNIT = "Штука";
    public Goose() {
        super("Гуси", 3);
    }

    public String getProductName() {
        return PRODUCT_NAME;
    }

    public String getProductUnit() {
        return PRODUCT_UNIT;
    }
}

