package by.it.academy.task3;

class Duck extends DomesticAnimal {

    public static final String PRODUCT_NAME = "Яйца";
    public static final String PRODUCT_UNIT = "Штука";

    public Duck() {
        super("Утки", 5);
    }

    public String getProductName() {
        return PRODUCT_NAME;
    }

    public String getProductUnit() {
        return PRODUCT_UNIT;
    }
}

